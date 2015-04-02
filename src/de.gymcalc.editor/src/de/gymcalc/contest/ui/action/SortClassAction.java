/**
 * 
 */
package de.gymcalc.contest.ui.action;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;

import de.gymcalc.contest.command.SortClassCommand;

/**
 * @author thomas
 *
 */
public class SortClassAction extends CommandAction {

	/**
	 * 
	 */
	public SortClassAction() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain, java.util.Collection)
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		Command RetVal = SortClassCommand.create(editingDomain, collection);
		return RetVal;
	}
}
