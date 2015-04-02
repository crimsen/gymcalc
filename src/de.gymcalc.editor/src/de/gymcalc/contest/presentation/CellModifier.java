/*
 * Created on 23.10.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.presentation;

import java.util.HashMap;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.Widget;

/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CellModifier implements ICellModifier {

	  /**
	   * For now we need to keep track of the adapter factory, because we need it to provide a correct label provider.
	   */
	  protected AdapterFactory adapterFactory;

	  HashMap<?, ?> featureMap;
	  
	  /**
	   * This is the structural feature that provides the values for this property.
	   * This is mutually exclusive with {@link #parentReferences}.
	   */
	  protected EStructuralFeature feature;

	/**
	 * 
	 */
	public CellModifier(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
		featureMap = new HashMap<Object, Object> ();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		boolean RetVal = false;
		Object object = getObject (element, property);
		ICellModifier cellModifier = (ICellModifier)adapterFactory.adapt(object, ICellModifier.class);
		if (cellModifier != null) {
			RetVal = cellModifier.canModify(element, property);
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Object RetVal = null;
		Object object = getObject (element, property);
		ICellModifier cellModifier = (ICellModifier)adapterFactory.adapt(object, ICellModifier.class);
		if (cellModifier != null) {
			RetVal = cellModifier.getValue (element, property);
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(Object element, String property, Object value) {
		Object object = getObject (element, property);
		ICellModifier cellModifier = (ICellModifier)adapterFactory.adapt(object, ICellModifier.class);
		if (cellModifier != null) {
			cellModifier.modify(object, property, value);
		}
/*
 	    EditingDomain editingDomain = getEditingDomain (eObject);
        editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, eObject, feature, value));
*/
	}

/*
    public EditingDomain getEditingDomain(EObject eObject)
	  {
	    EditingDomain result = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
	    if (result == null)
	    {
	      if (adapterFactory instanceof IEditingDomainProvider)
	      {
	        result = ((IEditingDomainProvider)adapterFactory).getEditingDomain();
	      }
	
	      if (result == null && adapterFactory instanceof ComposeableAdapterFactory)
	      {
	        AdapterFactory rootAdapterFactory = ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory();
	        if (rootAdapterFactory instanceof IEditingDomainProvider)
	        {
	          result = ((IEditingDomainProvider)rootAdapterFactory).getEditingDomain();
	        }
	      }
	    }
	    return result;
	  }
*/
	/**
     * returns a given element (provided by ICellModifier) to the related Object
     */
    Object getObject (Object element, String property) {
    	Object RetVal = element;
    	if (element instanceof Widget) {
    		RetVal = ((Widget)element).getData();
    	}
    	return RetVal;
    }

    IItemPropertyDescriptor getItemPropertyDescriptor (EObject eObject, String property) {
    	IItemPropertyDescriptor RetVal = null;
		IItemPropertySource itemPropertySource = (IItemPropertySource)adapterFactory.adapt(eObject, IItemPropertySource.class);
		if (null != itemPropertySource) {
			Object feature = featureMap.get (property);
			if (null != feature) {
				RetVal = itemPropertySource.getPropertyDescriptor (eObject, feature);
			}
		}
    	return RetVal;
    }
    
	public HashMap<?, ?> getFeatureMap() {
		return featureMap;
	}
}
