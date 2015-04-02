package de.gymcalc.contest.ui.handler;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.presentation.EnterJuristWizard;
import de.gymcalc.contest.command.EnterJuristCommand;

public class CreateJuristHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor( event );
		if( editor instanceof IEditingDomainProvider ) {
		    IEvaluationContext ctx = (IEvaluationContext)event.getApplicationContext();
		    Shell shell = (Shell)ctx.getVariable(ISources.ACTIVE_WORKBENCH_WINDOW_SHELL_NAME);
		    EditingDomain editingDomain = ((IEditingDomainProvider) editor).getEditingDomain();
		    Collection<?> collection = null;
		    if( editor instanceof ISelectionProvider ) {
		    	ISelection s = ( ( ISelectionProvider ) editor ).getSelection();
		    	if( s instanceof IStructuredSelection ) {
		    		collection = ( ( IStructuredSelection ) s ).toList();
		    	}
		    }
		    if( null == collection ) {
		    	collection = new ArrayList<Object>();
		    }
		    EnterJuristCommand command = EnterJuristCommand.create(editingDomain, collection );
			EnterJuristWizard wizard = new EnterJuristWizard( editingDomain, collection );
			WizardDialog dialog = new WizardDialog( shell, wizard );
		    int result = dialog.open();
		    if (result == Window.OK) {
		       	EnterJuristCommand c = command;
		       	c.setParam( wizard.getParam( ) );
		       	editingDomain.getCommandStack().execute(c);
		    }

		    return null;
		}
		return null;
	}
}
