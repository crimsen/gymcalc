/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.JuriResultDetailType;
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
public class UpdateFinalAthletsCommand extends ContestCompoundCommand {

	protected class CompareWinner implements Comparator<WinnerType> {
		private DisziplineType disziplineId;
		CompareWinner (DisziplineType disziplineId) {
			this.disziplineId = disziplineId; 
		}
		public int compare (WinnerType w1, WinnerType w2) {
			int RetVal = Double.compare (getJuriResultValue (w2, this.disziplineId), 
				getJuriResultValue (w1, this.disziplineId));
			if (0 == RetVal) {
				JuriResultType r2 = getJuriResult (w2, this.disziplineId);
				JuriResultType r1 = getJuriResult (w1, this.disziplineId);
				double d1 = getExecutionValue(r1);
				double d2 = getExecutionValue(r2);
				RetVal = Double.compare(d2,d1);
				if( 0 == RetVal ) {
					// get the all around execution value
					d1 = getAaExecutionValue( w1 );
					d2 = getAaExecutionValue( w2 );
					RetVal = Double.compare(d2,d1);
				}
			}
			return RetVal;
		}
		private double getExecutionValue( JuriResultType juriResult ) {
			double retVal = 0.0;
			if( null != juriResult &&
				null != juriResult.getJuriResultDetail() &&
				juriResult.getJuriResultDetail().size() >= 2 ) {
				retVal = juriResult.getJuriResultDetail().get(1).getValue();
			}
			return retVal;
		}
		private double getAaExecutionValue( WinnerType winner ) {
			double retVal = 0.0;
			if( null != winner.getResult() ) {
				retVal = winner.getResult().getPoints();
			}
			return retVal;
		}
	}


	public static UpdateFinalAthletsCommand create (EditingDomain domain, Collection<?> collection) {
		UpdateFinalAthletsCommand retVal = new UpdateFinalAthletsCommand( domain, collection );
		return retVal;
	}
	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public UpdateFinalAthletsCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
	}

	@Override
	public void execute() {
		for( Object o: this.collection ) {
			if( o instanceof FinalClassType ) {
				ClassType finalsClass = (ClassType)o;
				{
					EList<WinnerType> winners = finalsClass.getWinner();
					this.appendAndExecute(DeleteCommand.create( getDomain(), winners));
				}
				DisziplineType diszipline = ( ( FinalClassType ) o ).getOriginatingDiszipline();
				if( null != diszipline ) {
					ClassType originClass = (ClassType)diszipline.eContainer (); 
					WinnerType winners[] = (WinnerType[]) originClass.getWinner ().toArray ();
					Arrays.sort(winners, new CompareWinner (diszipline));
					ArrayList<AthletType> newWinners = new ArrayList<AthletType>();
					for (WinnerType winner:winners) {
						if (winner instanceof AthletType) {
							AthletType originAthlet = (AthletType) winner;
							/* apply the rule what happens if maximum number of athlets are in
							 * the finals and athlets do have the same value.
							 */
							String athletId = winner.getId() + "-" + diszipline.getId ();
							AthletType finalsAthlet = createFinalsAthlet (athletId);
							finalsAthlet.setPerson (originAthlet.getPerson ());
							finalsAthlet.setName(originAthlet.getName());
							finalsAthlet.setOrganization(originAthlet.getOrganization ());
							// by default everybody is in reserve
							finalsAthlet.setDisable(ContestEditPlugin.INSTANCE.getString("_UI_Reserve"));

							ResultType result = createFinalsResult (finalsAthlet);
							finalsAthlet.setResult(result);
							EList<JuriResultType> juriResults = result.getJuriresult();
							JuriResultType juriResult = createFinalsJuriResult ();
							juriResult.setDiszipline(finalsClass.getDiszipline().get(0));
							deepCopy(juriResult, getJuriResult(originAthlet, diszipline));
							juriResults.add(juriResult);
							JuriResultType aaJuriResult = createFinalsJuriResult ();
							aaJuriResult.setDiszipline(finalsClass.getDiszipline().get(1));
							aaJuriResult.setValue(originAthlet.getResult().getPoints());
							juriResults.add(aaJuriResult);
							newWinners.add(finalsAthlet);
						}
					}
					this.appendAndExecute(AddCommand.create(getDomain(), finalsClass, ContestPackage.Literals.ATHLET_TYPE, newWinners));
				}
			}
		}
	}

	@Override
	public boolean prepare() {
		boolean retVal = false;
		for( Object o:this.collection) {
			if( o instanceof FinalClassType) {
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
	
	protected AthletType createFinalsAthlet (String Id) {
		AthletType retVal = ContestFactory.eINSTANCE.createAthletType ();
		retVal.setId(Id);
		return retVal;
	}

	protected AthletResultType createFinalsResult (AthletType athlet) {
		AthletResultType retVal = ContestFactory.eINSTANCE.createAthletResultType ();
		return retVal;
	}

	protected JuriResultType createFinalsJuriResult () {
		JuriResultType retVal = ContestFactory.eINSTANCE.createJuriResultType ();
		return retVal;
	}

	private double getJuriResultValue (WinnerType w, DisziplineType disziplineId) {
		double retVal = 0.0;
		JuriResultType result = getJuriResult(w, disziplineId);
		if (null != result) {
			retVal = result.getValue ();
		}
		return retVal;
	}
	private JuriResultType getJuriResult (WinnerType w, DisziplineType disziplineId) {
		JuriResultType retVal = null;
		ResultType result = w.getResult ();
		if (null != result) {
			for( JuriResultType juriResult:result.getJuriresult ()) {
				DisziplineType diszipline = juriResult.getDiszipline (); 
				if ( diszipline.equals(disziplineId)) {
					retVal = juriResult;
					break;
				}
			}
		}
		return retVal;
	}
	private void deepCopy( JuriResultType dest, JuriResultType src ) {
		dest.setValue(src.getValue());
		EList<JuriResultDetailType> destDetails = dest.getJuriResultDetail();
		for(JuriResultDetailType srcDetail:src.getJuriResultDetail()) {
			JuriResultDetailType detail = createJuriResultDetail();
			detail.setKey( srcDetail.getKey() );
			detail.setValue( srcDetail.getValue() );
			destDetails.add(detail);
		}
	}

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_UpdateFinalAthletsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_UpdateFinalAthletsCommand_description");
}
