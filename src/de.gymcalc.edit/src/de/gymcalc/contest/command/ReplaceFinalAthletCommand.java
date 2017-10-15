/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
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
public class ReplaceFinalAthletCommand extends ContestCompoundCommand {


	public static ReplaceFinalAthletCommand create (EditingDomain domain, Collection<?> collection) {
		ReplaceFinalAthletCommand retVal = new ReplaceFinalAthletCommand( domain, collection );
		return retVal;
	}

	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public ReplaceFinalAthletCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
	}

	@Override
	public void execute() {
		for( Object o: this.collection ) {
			if( o instanceof AthletType ) {
				AthletType athlet = ( AthletType ) o;
				if( athlet.eContainer() instanceof FinalClassType &&
						null != athlet.getChain() ) {
					markDisabled(athlet);
					FinalClassType finalClass = ( FinalClassType ) athlet.eContainer();
					ArrayList< AthletType > newAthlets = findNextAthlets( finalClass, athlet );
					if( 0 < newAthlets.size( ) ) {
						ChainType chain = athlet.getChain();
						appendAndExecute(ReplaceCommand.create(getDomain(), chain, ContestPackage.Literals.CHAIN_TYPE__ATHLET, athlet, newAthlets));
						for( AthletType newAthlet: newAthlets ) {
							markStarting( newAthlet );
						}
					}
				}
			}
		}
	}
	
	private void markStarting(AthletType athlet) {
		setDisableString( athlet, "" );
	}

	private void markDisabled(AthletType athlet) {
		setDisableString( athlet, "Disabled" );
	}

	private void setDisableString(AthletType athlet, String disableString) {
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
	ArrayList< AthletType > findNextAthlets( FinalClassType finalClass, AthletType origAthlet ) {
		ArrayList< AthletType > retVal = new ArrayList< AthletType >( );
		ArrayList< AthletType > athletCont = new ArrayList< AthletType >( );
		for( WinnerType winner : finalClass.getWinner( ) ) {
			if( winner != origAthlet ) {
				if( winner.getDisable().isEmpty() ){
					athletCont.add( ( AthletType ) winner );
				} else if( winner.getDisable().contains(ContestEditPlugin.INSTANCE.getString("_UI_Reserve"))){
					AthletType winnerToAdd = null;
					AthletType athlet = (AthletType)winner;
					/* rule 1: only the best */
					if( mWinners  > retVal.size() ) {
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
					}
					if( null != winnerToAdd ) {
						retVal.add( winnerToAdd );
						athletCont.add( winnerToAdd );
					}
				}
			}
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
			if( o instanceof AthletType &&
					((AthletType) o).eContainer() instanceof FinalClassType &&
					null != ((AthletType) o).getChain() ) {
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
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_ReplaceFinalAthletCommand_label");
	
	/**
	 * This caches the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_ReplaceFinalAthletCommand_description");

	private static final int mWinners = 1;
	private static final int mOrganizationCount = 2;
	private static final String mOrganizationMatch = "^[^\\(]*\\(([^\\)]*)\\).*$";

}
