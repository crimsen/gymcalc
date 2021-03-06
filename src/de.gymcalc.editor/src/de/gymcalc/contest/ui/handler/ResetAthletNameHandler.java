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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.command.ResetAthletNameCommand;
import de.gymcalc.contest.presentation.ApplicationContext;

public class ResetAthletNameHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor( event );
		if( editor instanceof IEditingDomainProvider ) {
		    IEvaluationContext ctx = (IEvaluationContext)event.getApplicationContext();
		    ctx.getVariable(ISources.ACTIVE_WORKBENCH_WINDOW_SHELL_NAME);
		    editor.getSite();
		    ctx.getVariable(ApplicationContext.EDITING_DOMAIN);
		    EditingDomain editingDomain = null;
//		    if( !( unkEditingDomain instanceof EditingDomain ) ) {
//		    	ISourceProviderService s = (ISourceProviderService)site.getService(ISourceProviderService.class);
//		    	ApplicationContext p = (ApplicationContext)s.getSourceProvider(ApplicationContext.EDITING_DOMAIN);
		    	editingDomain = ((IEditingDomainProvider) editor).getEditingDomain();
//		    	p.setEditingDomain( editingDomain );
//		    } else {
//		    	editingDomain = ( EditingDomain ) unkEditingDomain;
//		    }
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
		    ResetAthletNameCommand command = ResetAthletNameCommand.create(editingDomain, collection );
	       	editingDomain.getCommandStack().execute(command);
		}
		return null;
	}
}
