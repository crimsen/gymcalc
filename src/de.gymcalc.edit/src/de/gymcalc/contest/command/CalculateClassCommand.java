package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class CalculateClassCommand extends ClassCommand {

	public static Command create(EditingDomain editingDomain,
			Collection<?> collection) {
		return new CalculateClassCommand( editingDomain, collection );
	}

	/**
	 * @param domain
	 */
	public CalculateClassCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, LABEL, DESCRIPTION, collection );
		this.calculateRankCmd = CalculateRankCommand.create( domain, this.collection );
	}

	@Override
	public void doExecute() {
		for( ClassType _class : collection ) {
			EList< WinnerType > winner = _class.getWinner ();
			Iterator<WinnerType> j = winner.iterator ();
			while (j.hasNext ()) {
				EObject o = j.next ();
				if (o instanceof AthletType) {
					Command cmd = new CalculateWinnerCommand (domain, (AthletType) o);
					cmd.execute ();
				} else if (o instanceof TeamType) {
					Command cmd = new CalculateTeamCommand (domain, (TeamType) o);
					cmd.execute ();
				}
			}
		}
		calculateRankCmd.execute();
		
	}

	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CalculateClassCommand_label");
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CalculateClassCommand_description");
	Command calculateRankCmd = null;
	
}
