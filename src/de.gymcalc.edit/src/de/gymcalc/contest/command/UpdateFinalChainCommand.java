/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.FinalChainType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;
import de.gymcalc.contest.provider.ContestEditPlugin;

/**
 * @author groegert
 *
 * creates the list of athlets for the final of a diszipline
 * 
 */
public class UpdateFinalChainCommand extends ContestCompoundCommand {


	public static UpdateFinalChainCommand create (EditingDomain domain, Collection<?> collection) {
		UpdateFinalChainCommand retVal = new UpdateFinalChainCommand( domain, collection );
		return retVal;
	}

	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public UpdateFinalChainCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
	}

	@Override
	public void execute() {
		for( Object o: this.collection ) {
			if( o instanceof FinalChainType ) {
				FinalChainType finalChain = (FinalChainType)o;
				appendAndExecute(RemoveCommand.create(getDomain(), finalChain, ContestPackage.Literals.CHAIN_TYPE__ATHLET, finalChain.getAthlet()));
				ArrayList< AthletType > athletCont = new ArrayList<AthletType>();
				FinalClassType finalClass = finalChain.getFinalClass();
				for( WinnerType winner : finalClass.getWinner( ) ) {
					AthletType winnerToAdd = null;
					{
						AthletType athlet = (AthletType)winner;
						/* rule 1: best six */
						if( mWinners > athletCont.size() ) {
							winnerToAdd = athlet;
						} else {
							/* rule 2: if the result is identical then still add */
							AthletType lastAthlet = null;
							int athletIdx = athletCont.size() - 1;
							if( 0 <= athletIdx  ) {
								lastAthlet = athletCont.get(athletIdx);
							}
							/* check 1 the juriResult */
							if( null != lastAthlet && null != lastAthlet.getResult( ) && null != athlet.getResult( ) ) {
								ResultType lastResult = lastAthlet.getResult( );
								ResultType result = athlet.getResult();
								int juriResultIdx = 0;
								if( 0 == compareJuriResult( lastResult, result, juriResultIdx ) &&
									0 == compareJuriResult( lastResult, result, juriResultIdx + 1 ) ) {
									winnerToAdd = athlet;
								}
							}
						}
						if( null == winnerToAdd ) {
							break;
						}
						winnerToAdd = null;
						// rule 3: do not add when max number of athlet are already added
						int organizationCount = 0;
						OrganizationType organization = athlet.getOrganization();
						for( AthletType a:athletCont ) {
							if( matchOrgainization(a, organization) ) {
								organizationCount++;
								if( mOrganizationCount <= organizationCount ) {
									break;
								}
							}
						}
						if( mOrganizationCount > organizationCount ) {
							winnerToAdd = athlet;
						} else {
							markOrganizationReserve( athlet );
						}
					}
					if( null != winnerToAdd ) {
						athletCont.add( winnerToAdd );
					}
				}
				/* add the athlets in the correct order */
				ArrayList< AthletType > sortedAthlets = new ArrayList< AthletType >( );
				EMap<Integer, Integer> orderMap = null;
				if( null == finalChain.getOrderMap() ) {
					sortedAthlets.addAll(athletCont);
				} else {
					for( int idx = 0; athletCont.size() > idx; idx++ ) {
						sortedAthlets.add( null );
					}
					orderMap = finalChain.getOrderMap().getEntries();
					ArrayList< AthletType > unkAthlets = new ArrayList< AthletType >( );
					int idx = 1;
					for( AthletType a: athletCont  ) {
						try {
							int chainIdx = orderMap.get(Integer.valueOf(idx));
							if( 0 < chainIdx && sortedAthlets.size() >= chainIdx ) {
								sortedAthlets.add( chainIdx - 1, a );
							} else {
								// if there is no valid map entry then append it to the unassigned athlets
								unkAthlets.add( a );
							}
						} catch( NullPointerException e ) {
							unkAthlets.add( a );
						}
						idx++;
					}
					sortedAthlets.addAll( unkAthlets );
					// finally delete all null athlets
	/*				idx = 0;
					while( sortedAthlets.size( ) > idx ) {
						if( null == sortedAthlets.get( idx ) ) {
							sortedAthlets.remove( idx );
						} else {
							idx++;
						}
					} */
					sortedAthlets.removeIf( 
						new Predicate<AthletType>() {
							@Override
							public boolean test(AthletType arg0) {
								return null == arg0;
							}
						} );
				}
				appendAndExecute(AddCommand.create(getDomain(), finalChain, ContestPackage.Literals.CHAIN_TYPE__ATHLET, sortedAthlets ) );
				for( AthletType a:athletCont ) {
					appendAndExecute(SetCommand.create(getDomain(), a, ContestPackage.Literals.WINNER_TYPE__DISABLE, ""));
				}
			}
		}
	}
	
	private void markOrganizationReserve(AthletType athlet) {
		String organizationPart = getOrganizationPart( athlet.getOrganization().getName() );
		String disableString = ContestEditPlugin.INSTANCE.getString("_UI_Reserve") + " (" + organizationPart + ")";
		appendAndExecute(SetCommand.create(getDomain(), athlet, ContestPackage.Literals.WINNER_TYPE__DISABLE, disableString ) );
	}

	private String getOrganizationPart(String name) {
		String retVal = name.replaceAll( mOrganizationMatch, "$1");
		return retVal;
	}

	private boolean matchOrgainization(AthletType a, OrganizationType organization) {
		boolean retVal = false;
		String organizationPart = getOrganizationPart( organization.getName() );
		if( a.getOrganization().getName().contains(organizationPart) ) {
			retVal = true;
		}
		return retVal;
	}
	int compareJuriResult( ResultType lastResult, ResultType result, int juriResultIdx ) {
		int retVal = 1;
		double lastValue = 0.0;
		double value = 0.0;
		if( juriResultIdx < lastResult.getJuriresult().size() ) {
			JuriResultType lastJuriResult = lastResult.getJuriresult().get(juriResultIdx);
			lastValue = lastJuriResult.getValue();
			if( juriResultIdx < result.getJuriresult().size() ) {
				JuriResultType juriResult = result.getJuriresult().get(juriResultIdx);
				value = juriResult.getValue();
				if( value == lastValue ) {
					lastValue = 0.0;
					value = 0.0;
					/* check 2 the execution */
					if( 1 < lastJuriResult.getJuriResultDetail().size()) {
						lastValue = lastJuriResult.getJuriResultDetail().get(1).getValue();
						if( 1 < juriResult.getJuriResultDetail().size()) {
							value = juriResult.getJuriResultDetail().get(1).getValue();
						}
					}
					retVal = Double.compare(lastValue, value);
				}
			}
		}
		return retVal;
	}

	@Override
	public boolean prepare() {
		boolean retVal = false;
		for( Object o:this.collection) {
			if( o instanceof FinalChainType) {
				retVal = true;
				break;
			}
		}
		return retVal;
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return label;
	}

	public String getToolTipText() {
		return description;
	}
	
	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_UpdateFinalChainCommand_label");
	
	/**
	 * This caches the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_UpdateFinalChainCommand_description");

	private static final int mWinners = 6;
	private static final int mOrganizationCount = 2;
	private static final String mOrganizationMatch = "^[^\\(]*\\(([^\\)]*)\\).*$";

}
