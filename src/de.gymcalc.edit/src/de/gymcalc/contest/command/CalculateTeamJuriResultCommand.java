/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Comparator;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.TeamJuriResultType;

/**
 * @author groegert
 *
 */
public class CalculateTeamJuriResultCommand extends AbstractOverrideableCommand
{

	protected TeamJuriResultType result = null;
	/**
	 * @param domain
	 */
	public CalculateTeamJuriResultCommand(EditingDomain domain, TeamJuriResultType result) {
		super(domain);
		this.result = result;
	}

	@Override
	public void doExecute() {
		JuriResultType results[] = (JuriResultType[]) result.getJuriResult().toArray ();
		if( 0 != results.length ){
			// calculate only if there are some references to athlet-results
			// by default take all results
			double count = results.length;
			double sum = 0.0;
			java.util.Arrays.sort (results, new Comparator<JuriResultType> () {
				public int compare (JuriResultType r1, JuriResultType r2) {
					return Double.compare(r2.getValue (), r1.getValue ());
				}
			});
			String calculationKey =((ClassType) result.eContainer ().eContainer ().eContainer ()).getCalculationkey (); 
			if (null != calculationKey) {
				java.util.regex.Pattern p = java.util.regex.Pattern.compile("bestofteam\\(([0-9]+)\\)");
				java.util.regex.Matcher m = p.matcher(calculationKey);
				if(m.matches()){
					String s = m.group(1);
					count = Integer.parseInt(s);
				}
			}
			for (int i = 0; i < count && i < results.length; ++i) {
				double points = results[i].getValue();
				sum += points;
			}
			double round = Math.round(sum * 10000);
			result.setValue(round / 10000);
		}
	}

	@Override
	public void doRedo() {
	}

	@Override
	public void doUndo() {
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanUndo()
	 */
	@Override
	public boolean doCanUndo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanExecute()
	 */
	@Override
	public boolean doCanExecute() {
		return result != null;
	}

}
