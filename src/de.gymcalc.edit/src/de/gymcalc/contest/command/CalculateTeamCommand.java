/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamType;

/**
 * @author groegert
 *
 */
public class CalculateTeamCommand extends CalculateWinnerCommand
{
	/**
	 * @param domain
	 */
	public CalculateTeamCommand(EditingDomain domain, TeamType winner) {
		super(domain, winner);
	}

	@Override
	public void doExecute() {
		ResultType result = winner.getResult ();
		if( null != result ) {
			Iterator<?> i = result.getJuriresult ().iterator ();
			while (i.hasNext ()){
				JuriResultType r = (JuriResultType) i.next ();
				if (r instanceof TeamJuriResultType) {
					Command cmd = new CalculateTeamJuriResultCommand (domain, (TeamJuriResultType) r);
					cmd.execute ();
				}
			}
		}
		super.doExecute ();
	}

}
