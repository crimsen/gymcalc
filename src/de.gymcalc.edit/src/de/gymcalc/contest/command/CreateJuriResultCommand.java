/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class CreateJuriResultCommand extends AbstractOverrideableCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateResultsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateResultsCommand_description");

	Collection<?> collection;
	
	public static CreateJuriResultCommand create (EditingDomain domain, Collection<?> collection) {
		CreateJuriResultCommand RetVal = null;
		RetVal = new CreateJuriResultCommand (domain, collection);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public CreateJuriResultCommand(EditingDomain domain, Collection<?> collection) {
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
			if (o instanceof WinnerType) {
				Command cmd = CreateWinnerJuriResultCommand.create (domain, (WinnerType) o);
				cmd.execute ();
			} else if (o instanceof ClassType) {
				Collection<?> col = ((ClassType)o).getWinner ();
				for (Iterator<?> j = col.iterator (); j.hasNext ();) {
					WinnerType w = (WinnerType) j.next ();
					Command cmd = CreateWinnerJuriResultCommand.create (domain, w);
					cmd.execute ();
				}
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
			if (o instanceof WinnerType) {
				RetVal = true;
				break;
			}
			if (o instanceof ClassType) {
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
