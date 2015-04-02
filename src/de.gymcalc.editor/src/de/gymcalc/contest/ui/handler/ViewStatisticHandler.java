package de.gymcalc.contest.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.presentation.ApplicationContext;
import de.gymcalc.contest.presentation.StatisticDialog;


public class ViewStatisticHandler extends AbstractHandler {

	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor( event );
		if( editor instanceof IEditingDomainProvider ) {
		    IEvaluationContext ctx = (IEvaluationContext)event.getApplicationContext();
		    Shell shell = (Shell)ctx.getVariable(ISources.ACTIVE_WORKBENCH_WINDOW_SHELL_NAME);
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
			StatisticDialog dialog = new StatisticDialog
				( shell, editingDomain );
			dialog.open();
		}
		return null;
	}

}
