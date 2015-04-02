package de.gymcalc.contest.ui.handler;

import java.util.EventObject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.presentation.ApplicationContext;
import de.gymcalc.contest.presentation.ExportContactsDialog;

public class ExportContactsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
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
			SavePoint sp = new SavePoint( editingDomain.getCommandStack() );

			ExportContactsDialog dialog = new ExportContactsDialog
				( shell, editingDomain );
			if (dialog.open() == IDialogConstants.OK_ID) {
				sp.commit();
			} else {
				sp.rollback();
			}
			return null;
		}
		return null;
	}
	class SavePoint implements CommandStackListener {

		public SavePoint( CommandStack stack ) {
			changes = 0;
			this.stack = stack;
			stack.addCommandStackListener( this );
		}
		public void rollback( ) {
			stack.removeCommandStackListener( this );
			while( 0 != changes ) {
				stack.undo();
				--changes;
			}
		}
		public void commit( ) {
			changes = 0;
			stack.removeCommandStackListener( this );
		}
		/* (non-Javadoc)
		 * @see org.eclipse.emf.common.command.CommandStackListener#commandStackChanged(java.util.EventObject)
		 */
		@Override
		public void commandStackChanged(EventObject event) {
			if( changes > -1 ) {
				++changes;
			}
		}
		
		private int changes = 0;
		private final CommandStack stack;
	}
}
