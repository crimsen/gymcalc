package de.gymcalc.contest.ui.handler;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.command.CreateFinalsCommand;

public class CreateFinalsHandler extends CommandHandler {

	@Override
	protected Command createCommand(EditingDomain domain, Collection<?> selection) {
		return CreateFinalsCommand.create( domain, selection );
	}
}
