package de.gymcalc.contest.ui.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.contest.command.UpdateFinalChainCommand;

public class UpdateFinalChainHandler extends CommandHandler {

	@Override
	protected Command createCommand(EditingDomain domain, IStructuredSelection selection) {
		return UpdateFinalChainCommand.create( domain, selection.toList() );
	}
}
