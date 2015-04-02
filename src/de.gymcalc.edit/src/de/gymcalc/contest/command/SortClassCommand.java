/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;

/**
 * @author thomas
 *
 */
public class SortClassCommand extends ClassCommand {

	class ResultPointsComperator implements Comparator<WinnerType> {
		public int compare(WinnerType o1, WinnerType o2) {
			int RetVal = 0;
			int disable1 = 0;
			if (null != o1.getDisable () && 0 != o1.getDisable ().length ()) {
				disable1 = 1;
			}
			int disable2 = 0;
			if (null != o2.getDisable () && 0 != o2.getDisable ().length ()) {
				disable2 = 1;
			}
			if (disable1 != disable2) {
				RetVal = Integer.signum (disable1 - disable2);
			} else {
				ResultType r1 = o1.getResult();
				ResultType r2 = o2.getResult();
				double p1 = 0;
				if (null != r1) {
					p1 = r1.getPoints ();
				}
				double p2 = 0;
				if (null != r2) {
					p2 = r2.getPoints ();
				}
				RetVal = Double.compare (p2, p1);
			}
			return RetVal;
		}
	}

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_SortClassCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_SortClassCommand_description");

	/**
	 * This creates a command to add a particular value to the specified feature of the owner.
	 * The feature will often be null because the domain will deduce it.
	 */
	public static Command create(EditingDomain domain, Collection<?> collection)
	{
		return new SortClassCommand(domain, collection);
	}

	/**
	 * @param domain
	 */
	public SortClassCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, LABEL, DESCRIPTION, collection );
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		Iterator<?> i = collection.iterator ();
		while (i.hasNext ()) {
			Object owner = i.next ();
			if (owner instanceof ClassType) {
				ClassType c = (ClassType) owner;
				org.eclipse.emf.common.util.ECollections.sort (c.getWinner (),
					new Comparator<WinnerType> () {
						public int compare (WinnerType w1, WinnerType w2) {
							ResultType r1 = w1.getResult();
							ResultType r2 = w2.getResult();
							double rank1 = Double.MAX_VALUE;
							double rank2 = Double.MAX_VALUE;
							if( null != r1 ) {
								rank1 = r1.getRank();
							}
							if( null != r2 ) {
								rank2 = r2.getRank();
							}
							return Double.compare( rank1, rank2 );
						}
					}
				);
			}
		}
	}

}
