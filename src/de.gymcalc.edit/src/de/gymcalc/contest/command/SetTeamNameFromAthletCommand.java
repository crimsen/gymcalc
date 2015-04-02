/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.TeamType;

/**
 * @author groegert
 *
 */
public class SetTeamNameFromAthletCommand extends AbstractOverrideableCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_SetTeamNameFromAthletCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_SetTeamNameFromAthletCommand_description");

	Collection<?> collection;
	
	public static SetTeamNameFromAthletCommand create (EditingDomain domain, Collection<?> collection) {
		SetTeamNameFromAthletCommand RetVal = null;
		RetVal = new SetTeamNameFromAthletCommand (domain, collection);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public SetTeamNameFromAthletCommand(EditingDomain domain, Collection<?> collection) {
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
			Object o = i.next ();
			if (o instanceof TeamType) {
				TeamType team = (TeamType) o;
				Iterator<?> j = team.getAthlet ().iterator ();
				String newName = "";
				while (j.hasNext()) {
					AthletType athlet = (AthletType) j.next ();
					PersonType person = athlet.getPerson ();
					String name = "";
					if (null != person.getFirstname()) {
						name += person.getFirstname();
					}
					if (null != person.getName ()) {
						if (0 != name.length ()) {
							name += " ";
						}
						name += person.getName ();
					}
					newName += name;
					if (j.hasNext()) {
						newName += " / ";
					}
				}
				Command cmd = SetCommand.create(domain, team, ContestPackage.Literals.WINNER_TYPE__NAME, newName);
				cmd.execute ();
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
			if (o instanceof TeamType) {
				RetVal = true;
				break;
			}
		}
		return RetVal;
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
