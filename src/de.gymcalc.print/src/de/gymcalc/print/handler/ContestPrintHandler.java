/**
 * 
 */
package de.gymcalc.print.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISources;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.print.OoPrinter;
import de.spremberg.turnen.contact.print.Activator;

/**
 * @author thomas
 *
 */
public class ContestPrintHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	    IEvaluationContext ctx = (IEvaluationContext)event.getApplicationContext();
	    Shell shell = (Shell)ctx.getVariable(ISources.ACTIVE_WORKBENCH_WINDOW_SHELL_NAME);
	    Object editor = ctx.getVariable(ISources.ACTIVE_EDITOR_NAME);
	    if( editor instanceof IEditingDomainProvider ) {
	    	IEditingDomainProvider modelProvider = ( IEditingDomainProvider ) editor;
	    	ContestPrintWizard wizard = new ContestPrintWizard(modelProvider.getEditingDomain() );
			wizard.init(PlatformUI.getWorkbench(), getSelectionToUse(event));
	    	WizardDialog dlg = new WizardDialog( shell, wizard );
	    	if( Dialog.OK ==  dlg.open() ) {
	    		StringBuffer s = new StringBuffer("file:///");
	    		s.append(wizard.getFileName());
	    		OoPrinter.print(s.toString(), null, null);
	    	}
	    } else {
	    	MessageDialog.openError( shell, Activator.getString( "Err_NoTemplateModelProvider_title" ),
	    			Activator.getString( "Err_NoTemplateModelProvider_message" ) );
	    }
		return null;
	}

	/**
	 * Returns a structured selection based on the event to initialize the
	 * wizard with.
	 * @param event the event object containing information about the current state of the application
	 * @return the current structured selection of the application
	 */
	protected IStructuredSelection getSelectionToUse(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		return StructuredSelection.EMPTY;
	}

}
