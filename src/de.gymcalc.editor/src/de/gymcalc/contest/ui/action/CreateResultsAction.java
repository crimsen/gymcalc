/**
 * 
 */
package de.gymcalc.contest.ui.action;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;

import de.gymcalc.contest.command.CreateJuriResultCommand;

/**
 * @author groegert
 *
 */
public class CreateResultsAction extends CommandAction {

	/**
	 * 
	 */
	public CreateResultsAction() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain, java.util.Collection)
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		Command RetVal = CreateJuriResultCommand.create(editingDomain, collection);
		return RetVal;
	}


}
