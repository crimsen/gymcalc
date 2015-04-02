/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.TeamResultType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class CreateWinnerJuriResultCommand extends AbstractOverrideableCommand
		implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateResultsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateResultsCommand_description");


	WinnerType winner;
	
	public static CreateWinnerJuriResultCommand create (EditingDomain domain, Collection<?> collection) {
		CreateWinnerJuriResultCommand RetVal = null;
		Iterator<?> i = collection.iterator ();
		while (i.hasNext ()) {
			Object o = i.next ();
			if (o instanceof WinnerType) {
				RetVal = CreateWinnerJuriResultCommand.create (domain, (WinnerType) o);
				break;
			}
		}
		if (null == RetVal) {
			RetVal = new CreateWinnerJuriResultCommand (domain, null);
		}
		return RetVal;
	}

	public static CreateWinnerJuriResultCommand create (EditingDomain domain, WinnerType winner) {
		CreateWinnerJuriResultCommand RetVal = null;
		RetVal = new CreateWinnerJuriResultCommand (domain, winner);
		return RetVal;
	}
	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public CreateWinnerJuriResultCommand(EditingDomain domain, WinnerType winner) {
		super(domain, LABEL, DESCRIPTION);
		this.winner = winner;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		ClassType originClass = (ClassType)winner.eContainer ();
		EList<?> disziplines = originClass.getDiszipline ();
		for (Iterator<?> iDiszipline = disziplines.iterator (); iDiszipline.hasNext ();) {
			DisziplineType diszipline = (DisziplineType) iDiszipline.next (); 
			if (winner instanceof AthletType) {
				AthletType originAthlet = (AthletType) winner;
				ResultType result = winner.getResult ();
				if (null == result) {
					result = createAthletResult (originAthlet);
				}
				JuriResultType juriResult = getJuriResult (result, diszipline.getId ());
				if (null == juriResult) {
					juriResult = createJuriResult (result);
					juriResult.setDiszipline(diszipline);
					juriResult.setValue(0.0);
				}
			} else if (winner instanceof TeamType) {
				ResultType result = winner.getResult ();
				if (null == result) {
					result = createTeamResult (winner);
				}
				JuriResultType juriResult = getJuriResult (result, diszipline.getId ());
				if (null == juriResult) {
					juriResult = createTeamJuriResult (result);
					juriResult.setDiszipline(diszipline);
					juriResult.setValue(0.0);
				}
			}
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
		return winner != null;
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return label;
	}

	public String getToolTipText() {
		return description;
	}

	protected AthletResultType createAthletResult (AthletType athlet) {
		AthletResultType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createAthletResultType ();
		Command cmd = AddCommand.create(getDomain (), athlet, ContestPackage.Literals.ATHLET_RESULT_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected TeamResultType createTeamResult (WinnerType winner) {
		TeamResultType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createTeamResultType ();
		Command cmd = AddCommand.create(getDomain (), winner, ContestPackage.Literals.TEAM_RESULT_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected JuriResultType getJuriResult (ResultType result, String disziplineId) {
		JuriResultType RetVal = null;
		EList<?> juriResults = result.getJuriresult ();
		Iterator<?> iResult = juriResults.iterator ();
		while (iResult.hasNext ()) {
			JuriResultType juriResult = (JuriResultType) iResult.next ();
			DisziplineType diszipline = juriResult.getDiszipline ();
			if (null != diszipline && 
				0 == diszipline.getId ().compareTo(disziplineId)) {
				RetVal = juriResult;
				break;
			}
		}
		return RetVal;
	}

	protected JuriResultType createJuriResult (ResultType result) {
		JuriResultType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createJuriResultType ();
		Command cmd = AddCommand.create(getDomain (), result, ContestPackage.Literals.JURI_RESULT_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected JuriResultType createTeamJuriResult (ResultType result) {
		JuriResultType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createTeamJuriResultType ();
		Command cmd = AddCommand.create(getDomain (), result, ContestPackage.Literals.TEAM_JURI_RESULT_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}
}
