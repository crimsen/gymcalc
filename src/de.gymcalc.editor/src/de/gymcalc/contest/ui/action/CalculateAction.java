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

import de.gymcalc.contest.command.CalculateCommand;


/**
 * @author thomas
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CalculateAction extends CommandAction {

	/**
	 * 
	 */
	public CalculateAction() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain, java.util.Collection)
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		Command RetVal = CalculateCommand.create(editingDomain, collection);
		return RetVal;
	}

}
