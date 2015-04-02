package de.gymcalc.contest.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.LabelProvider;

public class FeatureLabelProvider extends LabelProvider {

	public FeatureLabelProvider( EStructuralFeature feature ) {
		m_feature = feature;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		String retVal = null;
		if( element instanceof EObject ) {
			Object f = ( ( EObject ) element ).eGet( this.m_feature );
			if( f instanceof String ) {
				retVal = ( String ) f;
			} else if( f != null ){
				retVal = f.toString();
			}
		} else {
			retVal = super.getText(element);
		}
		return retVal;
	}

	final EStructuralFeature m_feature;
}
