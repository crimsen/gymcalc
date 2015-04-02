/*
 * Created on 03.12.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.ui.action;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;

import de.gymcalc.contest.presentation.EnterAthletWizard;
import de.gymcalc.contest.command.EnterAthletCommand;


/**
 * @author thomas
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class EnterAthletAction extends CommandAction {

	public EnterAthletAction( ) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain, java.util.Collection)
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		Command retVal = EnterAthletCommand.create( editingDomain, collection );
		return retVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		EnterAthletWizard wizard = new EnterAthletWizard( editingDomain, collection );
		WizardDialog dialog = new WizardDialog(  this.workbenchPart.getSite().getShell(), wizard );
        int result = dialog.open();
        if (result == Window.OK) {
        	EnterAthletCommand c = (EnterAthletCommand) this.command;
        	c.setParam( wizard.getParam( ) );
        	super.run(action);
        }
	}

}
