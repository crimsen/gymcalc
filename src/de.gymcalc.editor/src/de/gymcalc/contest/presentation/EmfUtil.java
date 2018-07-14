package de.gymcalc.contest.presentation;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.cdo.ui.CDOEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ide.ResourceUtil;

public abstract class EmfUtil {

	public static URI getEmfResourceUriFromEditorInput( IEditorInput editorInput ) {
		URI retVal = null;
		if( ! ( editorInput instanceof CDOEditorInput ) ) {
			IResource platformResource = ResourceUtil.getResource(editorInput);
			String resourceString = platformResource.getFullPath().toString();
			retVal = URI.createPlatformResourceURI( resourceString, true );
		} else {
			CDOEditorInput cdoEditorInput = (CDOEditorInput)editorInput;
			retVal = cdoEditorInput.getView().createResourceURI(cdoEditorInput.getResourcePath());
		}
		if( null == retVal ) {
			ContestEditorPlugin.INSTANCE.log("could not convert editor input \"" + editorInput.getName() + "\" to an uri");
		}
		return retVal;
	}
}
