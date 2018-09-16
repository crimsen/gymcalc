package de.gymcalc.contest.ui.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.contest.command.UpdateFinalAthletsCommand;

public class UpdateFinalAthletsHandler extends CommandHandler {

	@Override
	protected Command createCommand(EditingDomain domain, IStructuredSelection selection) {
		return UpdateFinalAthletsCommand.create( domain, selection.toList() );
	}
}
