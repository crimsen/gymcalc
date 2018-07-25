package de.gymcalc.contest.ui.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.net4j.util.io.IORuntimeException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.gymcalc.contest.presentation.ApplicationContext;

public class SaveCopyHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor( event );
		if( editor instanceof IEditingDomainProvider ) {
		    IEvaluationContext ctx = (IEvaluationContext)event.getApplicationContext();
		    Shell shell = (Shell)ctx.getVariable(ISources.ACTIVE_WORKBENCH_WINDOW_SHELL_NAME);
		    editor.getSite();
		    ctx.getVariable(ApplicationContext.EDITING_DOMAIN);
		    EditingDomain editingDomain = null;
	    	editingDomain = ((IEditingDomainProvider) editor).getEditingDomain();
	    	Resource resource = editingDomain.getResourceSet().getResources().get(0);
	        List<EObject> sourceContents = new ArrayList<EObject>(resource.getContents());
		    URI targetUri = getTargetUri(shell);
	        
	        exportObjects(sourceContents, targetUri);
	        return null;
		}
		return null;
	}

	protected void exportObjects(List<EObject> sourceContents, URI targetUri) {
	    // Target Resource
	    ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	    XMIResource resource = (XMIResource)resourceSet.createResource(targetUri);
	    resource.setEncoding("UTF-8");

	    Collection<EObject> copiedRoots = EcoreUtil.copyAll(sourceContents);
	    resource.getContents().addAll(copiedRoots);

	    try
	    {
	      resource.save(null);
	    }
	    catch (IOException ex)
	    {
	      throw new IORuntimeException(ex);
	    }

	}

	protected URI getTargetUri(Shell shell) {
		URI retVal = null;
		ResourceDialog dialog = new ResourceDialog(shell, "Save Copy", SWT.SAVE);
		if (dialog.open() == ResourceDialog.OK) {
			List<URI> uris = dialog.getURIs();
			if (uris.size() == 1) {
				retVal = uris.get(0);
			} else {
				MessageDialog.openError(shell, "Save Copy", "no single uri selected");
			}
		} 
		return retVal;
	}
}
