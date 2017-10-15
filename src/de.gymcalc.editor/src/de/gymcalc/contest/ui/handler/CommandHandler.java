package de.gymcalc.contest.ui.handler;

import java.util.ArrayList;
import java.util.Collection;

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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.command.CreateFinalsCommand;
import de.gymcalc.contest.presentation.ApplicationContext;

public abstract class CommandHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		EditingDomain domain = getEditingDomain( event );
		if( null != domain ) {
		    Command command = getCommand( domain, event );
	       	domain.getCommandStack().execute( command );
		}
		return null;
	}

	protected abstract Command createCommand( EditingDomain domain, Collection<?> selection );

	protected EditingDomain getEditingDomain( Object context ) {
		EditingDomain retVal = null;
		IEditorPart editor = getEditor( context );
		if( editor instanceof IEditingDomainProvider ) {
			retVal = ((IEditingDomainProvider) editor).getEditingDomain();
		}
		return retVal;
	}
	protected Collection<?> getSelection( Object context ) {
		Collection<?> retVal = null;
		IEditorPart editor = getEditor( context );
	    if( editor instanceof ISelectionProvider ) {
	    	ISelection s = ( ( ISelectionProvider ) editor ).getSelection();
	    	if( s instanceof IStructuredSelection ) {
	    		retVal = ( ( IStructuredSelection ) s ).toList();
	    	}
	    }
	    if( null == retVal ) {
	    	retVal = new ArrayList<Object>();
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
			Collection<?> collection = getSelection( context );
			retVal = createCommand( domain, collection );
		}
		return retVal;
	}
	protected Command getCommand( EditingDomain domain, Object context ) {
		Command retVal = null;
		Collection<?> collection = getSelection( context );
		retVal = createCommand( domain, collection );
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

}
