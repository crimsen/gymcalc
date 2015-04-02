/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Iterator;

import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.JuriResultType;

/**
 * @author groegert
 *
 */
public class CaclulateAthletCommand extends AbstractOverrideableCommand
{

	AthletType athlet = null;
	/**
	 * @param domain
	 */
	public CaclulateAthletCommand(EditingDomain domain, AthletType athlet) {
		super(domain);
		this.athlet = athlet;
	}

	@Override
	public void doExecute() {
		AthletResultType result = (AthletResultType) (athlet).getResult();
		String calculationKey =((ClassType) athlet.eContainer ()).getCalculationkey (); 
		double sum = 0.0;
		/* in finals the allaround does not count */
		boolean finals = false;
		if (null != calculationKey && (0 == calculationKey.compareTo("finals"))) {
			finals = true;
		}
		Iterator<?> i = result.getJuriresult().iterator();
		while (i.hasNext()) {
			JuriResultType juriresult = (JuriResultType)i.next();
			String id = juriresult.getDiszipline ().getId ();
			if (!finals || id.contains ("finals")) {
				double points = juriresult.getValue();
				sum += points;
			}
		}
		result.setPoints(sum);
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
		return athlet != null;
	}

}
