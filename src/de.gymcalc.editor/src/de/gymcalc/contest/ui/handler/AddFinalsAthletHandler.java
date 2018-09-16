package de.gymcalc.contest.ui.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.command.AddFinalsAthletCommand;
import de.gymcalc.contest.presentation.SelectFinalsAthletWizard;

public class AddFinalsAthletHandler extends CommandHandler {

	@Override
	protected Command createCommand(EditingDomain domain, IStructuredSelection selection) {
		Command retVal = null;
		if( null != event ) {
			Shell shell = HandlerUtil.getActiveShell(event);
			SelectFinalsAthletWizard wizard = new SelectFinalsAthletWizard( domain, selection );
			WizardDialog dialog = new WizardDialog( shell, wizard );
		    int result = dialog.open();
		    if (result == Window.OK) {
		       	AddFinalsAthletCommand c = AddFinalsAthletCommand.create(domain, selection.toList());
		       	c.setParam( wizard.getParam( ) );
		       	retVal = c;
		    }
		} else {
	       	AddFinalsAthletCommand c = AddFinalsAthletCommand.create(domain, selection.toList());
	       	retVal = c;			
		}
	    return retVal;
	}

}
