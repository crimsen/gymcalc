package de.gymcalc.rcp.juriclient.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import de.gymcalc.contest.ContestType;
import de.gymcalc.rcp.IActiveObjectService;
import de.gymcalc.rcp.IContestService;

public class ConnectHandler {

	@CanExecute
	public boolean canExecute(IContestService contestService) {
		boolean retVal = false;
		if (contestService != null) {
			retVal = !contestService.isConnected();
		}
		return retVal;
	}

	@Execute
	public void execute(IContestService contestService, IActiveObjectService activeObject) {
		contestService.openConnection();
		ContestType contest = contestService.getContest();
		activeObject.setActiveObject(ContestType.class, contest);
	}
}