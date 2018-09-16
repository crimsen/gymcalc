package de.gymcalc.contest.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.services.ISourceProviderService;

import de.gymcalc.contest.presentation.ApplicationContext;


public class OpenAthletsEditorHandler extends AbstractHandler {

	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor( event );
		if( editor instanceof IEditingDomainProvider ) {
		    IEvaluationContext ctx = (IEvaluationContext)event.getApplicationContext();
		    IWorkbenchPartSite site = editor.getSite();
		    if( !( ctx.getVariable(ApplicationContext.EDITING_DOMAIN) instanceof EditingDomain ) ) {
		    	ISourceProviderService s = (ISourceProviderService)site.getService(ISourceProviderService.class);
		    	ApplicationContext p = (ApplicationContext)s.getSourceProvider(ApplicationContext.EDITING_DOMAIN);
		    	p.setEditingDomain( ((IEditingDomainProvider) editor).getEditingDomain());
		    }
			IWorkbenchPage page = site.getPage();
			IEditorInput input = editor.getEditorInput();
			try {
				page.openEditor( input,
					"de.gymcalc.contest.presentation.AthletEditorID",
					true,
					IWorkbenchPage.MATCH_ID );
			} catch ( PartInitException e ) {
				
			}
			
		}
		return null;
	}

}
