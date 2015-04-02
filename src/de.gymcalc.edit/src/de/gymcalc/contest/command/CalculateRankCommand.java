/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;

/**
 * @author thomas
 *
 */
public class CalculateRankCommand extends AbstractOverrideableCommand implements
		CommandActionDelegate {

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
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CalculateRankCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CalculateRankCommand_description");

	/**
	 * This is the owner object upon which the command will act.
	 * It could be null in the case that we are dealing with an {@link org.eclipse.emf.common.util.EList}.
	 */
	protected Collection<?> collection;

	/**
	 * This creates a command to add a particular value to the specified feature of the owner.
	 * The feature will often be null because the domain will deduce it.
	 */
	public static Command create(EditingDomain domain, Collection<?> collection)
	{
		return new CalculateRankCommand(domain, collection);
	}

	/**
	 * @param domain
	 */
	public CalculateRankCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, LABEL, DESCRIPTION);
		this.collection = collection;
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
				WinnerType[] winners = (WinnerType[]) c.getWinner().toArray();
				java.util.Arrays.sort (winners, new ResultPointsComperator ());
				int rank = 0;
				double currentpoints = Double.MAX_VALUE;
				for (int j = 0; winners.length > j; ++j) {
					ResultType result = winners[j].getResult ();
					double points = 0;
					if( null != result ) {
						points = result.getPoints();
					}
					if (points < currentpoints) {
						rank = j + 1;
					}
					currentpoints = points;
					if( null != result ) {
						result.setRank(rank);
					}
				}
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

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doRedo()
	 */
	@Override
	public void doRedo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doUndo()
	 */
	@Override
	public void doUndo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanUndo()
	 */
	@Override
	public boolean doCanUndo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanExecute()
	 */
	@Override
	public boolean doCanExecute() {
		boolean RetVal = false;
		Iterator<?> i = collection.iterator ();
		while (i.hasNext ()) {
			Object o = i.next ();
			if (o instanceof ClassType) {
				RetVal = true;
				break;
			}
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getImage()
	 */
	public Object getImage() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getText()
	 */
	public String getText() {
		return LABEL;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getToolTipText()
	 */
	public String getToolTipText() {
		return DESCRIPTION;
	}

}
