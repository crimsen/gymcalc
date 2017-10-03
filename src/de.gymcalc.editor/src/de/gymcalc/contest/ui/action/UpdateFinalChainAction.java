package de.gymcalc.contest.ui.action;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;

import de.gymcalc.contest.command.UpdateFinalChainCommand;

public class UpdateFinalChainAction extends CommandAction {

	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		Command retVal = UpdateFinalChainCommand.create(editingDomain, collection);
		return retVal;
	}

}
