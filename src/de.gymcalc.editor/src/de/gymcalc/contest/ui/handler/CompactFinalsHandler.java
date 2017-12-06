package de.gymcalc.contest.ui.handler;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.command.CompactFinalsCommand;

public class CompactFinalsHandler extends CommandHandler {

	@Override
	protected Command createCommand(EditingDomain domain, Collection<?> selection) {
		return CompactFinalsCommand.create( domain, selection );
	}
}
