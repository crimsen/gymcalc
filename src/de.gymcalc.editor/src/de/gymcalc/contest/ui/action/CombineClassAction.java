/**
 * 
 */
package de.gymcalc.contest.ui.action;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;

import de.gymcalc.contest.command.CombineClassCommand;

/**
 * @author groegert
 *
 */
public class CombineClassAction extends CommandAction {

	/**
	 * 
	 */
	public CombineClassAction() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain, java.util.Collection)
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		Command RetVal = CombineClassCommand.create(editingDomain, collection);
		return RetVal;
	}


}
