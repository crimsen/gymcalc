package de.gymcalc.contest.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class CommandHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.event = event;
		EditingDomain domain = getEditingDomain( event );
		if( null != domain ) {
		    Command command = getCommand( domain, event );
	       	domain.getCommandStack().execute( command );
		}
		this.event = null;
		return null;
	}

	protected abstract Command createCommand( EditingDomain domain, IStructuredSelection selection );

	protected EditingDomain getEditingDomain( Object context ) {
		EditingDomain retVal = null;
		IEditorPart editor = getEditor( context );
		if( editor instanceof IEditingDomainProvider ) {
			retVal = ((IEditingDomainProvider) editor).getEditingDomain();
		}
		return retVal;
	}
	protected IStructuredSelection getSelection( Object context ) {
		IStructuredSelection retVal = null;
		IEditorPart editor = getEditor( context );
	    if( editor instanceof ISelectionProvider ) {
	    	ISelection s = ( ( ISelectionProvider ) editor ).getSelection();
	    	if( s instanceof IStructuredSelection ) {
	    		retVal = ( ( IStructuredSelection ) s );
	    	}
	    }
	    if( null == retVal ) {
	    	retVal = StructuredSelection.EMPTY;
	    }
		return retVal;
	}
	protected IEditorPart getEditor( Object object ) {
		IEditorPart retVal = null;
		if( object instanceof ExecutionEvent ) {
			retVal = HandlerUtil.getActiveEditor( ( ExecutionEvent ) object );
		} else if ( object instanceof IEvaluationContext ) {
			Object editor = ( ( IEvaluationContext ) object ).getVariable(ISources.ACTIVE_EDITOR_NAME);
			if( editor instanceof IEditorPart ) {
				retVal = ( IEditorPart ) editor;
			}
		}
		return retVal;
	}
	protected Command getCommand( Object context ) {
		Command retVal = null;
		EditingDomain domain = getEditingDomain( context );
		if( null != domain ) {
			IStructuredSelection selection = getSelection( context );
			retVal = createCommand( domain, selection );
		}
		return retVal;
	}
	protected Command getCommand( EditingDomain domain, Object context ) {
		Command retVal = null;
		IStructuredSelection selection = getSelection( context );
		retVal = createCommand( domain, selection );
		return retVal;
	}
	@Override
	public void setEnabled( Object context ) {
		boolean enabled = false;
		Command cmd = getCommand( context );
		if( null != cmd ) {
			enabled = cmd.canExecute();
		}
		setBaseEnabled( enabled );
	}
	protected ExecutionEvent event;

}
