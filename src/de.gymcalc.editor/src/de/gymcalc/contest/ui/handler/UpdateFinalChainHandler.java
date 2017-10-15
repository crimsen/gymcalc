package de.gymcalc.contest.ui.handler;

import java.util.Collection;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.command.ReplaceFinalAthletCommand;
import de.gymcalc.contest.command.UpdateFinalChainCommand;

public class UpdateFinalChainHandler extends CommandHandler {

	@Override
	protected Command createCommand(EditingDomain domain, Collection<?> selection) {
		return UpdateFinalChainCommand.create( domain, selection );
	}
}
