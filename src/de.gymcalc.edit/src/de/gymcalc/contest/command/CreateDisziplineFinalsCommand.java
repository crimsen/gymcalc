/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.provider.ContestEditPlugin;

/**
 * @author groegert
 *
 * just creates the classes for finals of a diszipline
 */
public class CreateDisziplineFinalsCommand extends ContestCompoundCommand {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_description");


	public static CreateDisziplineFinalsCommand create (EditingDomain domain, Collection<?> collection) {
		CreateDisziplineFinalsCommand RetVal = null;
		RetVal = new CreateDisziplineFinalsCommand (domain, collection);
		return RetVal;
	}
	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public CreateDisziplineFinalsCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
		resultIndex = MERGE_COMMAND_ALL;
	}

	@Override
	public void execute() {
		for( Object o: this.collection ) {
			if( o instanceof DisziplineType ) {
				DisziplineType diszipline = (DisziplineType)o;

				ClassType originClass = (ClassType)diszipline.eContainer (); 
				String finalsName = ContestEditPlugin.INSTANCE.getString("_UI_Finals");
				finalsName += " " + originClass.getName () + " " + diszipline.getName ();
				ContestType contest = (ContestType)diszipline.eContainer ().eContainer ();
				FinalClassType finalsClass = getFinalClass (contest, finalsName);
				if( null == finalsClass ) {
					finalsClass = createFinalClass( finalsName );
					finalsClass.setCalculationkey ("finals");
					finalsClass.setOriginatingDiszipline(diszipline);
					EList<DisziplineType> finalsDisziplines = finalsClass.getDiszipline();
					String disziplineId = "allaround-" + diszipline.getId ();
					DisziplineType finalsDiszipline = createDiszipline (disziplineId);
					finalsDisziplines.add(finalsDiszipline);
					finalsDiszipline.setName (ContestEditPlugin.INSTANCE.getString("_UI_AllAround") + " " + diszipline.getName());
					finalsDiszipline.setCalculationkey("generated;skip;");
					disziplineId = "allaround-Aa-" + diszipline.getId ();
					DisziplineType aaDiszipline = createDiszipline (disziplineId);
					finalsDisziplines.add(aaDiszipline);
					aaDiszipline.setName (ContestEditPlugin.INSTANCE.getString("_UI_AllAround"));
					aaDiszipline.setCalculationkey("generated;skip;");
					String tdisziplineId = "finals-" + diszipline.getId ();
					DisziplineType tfinalsDiszipline = createDiszipline (tdisziplineId);
					tfinalsDiszipline.setName (ContestEditPlugin.INSTANCE.getString("_UI_Finals"));
					tfinalsDiszipline.setStation(diszipline.getStation ());
					finalsDisziplines.add(tfinalsDiszipline);
					appendAndExecute(AddCommand.create( getDomain(), contest, ContestPackage.Literals.FINAL_CLASS_TYPE, finalsClass));
				}
			}
		}
	}

	@Override
	public boolean prepare() {
		boolean retVal = false;
		for( Object o:this.collection) {
			if( o instanceof DisziplineType) {
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

}
