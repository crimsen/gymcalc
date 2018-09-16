package de.gymcalc.contest.presentation;

import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.cdo.ui.CDOEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
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

	/** returns the first object of type class1 within the selection
	 * @param class1
	 * @param selection
	 * @return
	 */
	public static <T> T findTypeInSelection(Class<T> class1, IStructuredSelection selection) {
		T retVal = null;
		if( selection instanceof ITreeSelection ) {
			ITreeSelection s = (ITreeSelection) selection;
			for( TreePath p:s.getPaths()) {
				for( int iter = 0; iter < p.getSegmentCount(); ++iter) {
					Object segment = p.getSegment(iter);
					if( class1.isAssignableFrom(segment.getClass())) {
						retVal = (T) segment;
						break;
					}
				}
				if( null != retVal) {
					break;
				}
			}
		} else {
			Object o = null;
			for( Iterator<?> iter = selection.iterator(); iter.hasNext(); o = iter.next()) {
				if( class1.isAssignableFrom(o.getClass())) {
					retVal = (T) o;
					break;
				}
			}
		}
		return retVal;
	}
}
