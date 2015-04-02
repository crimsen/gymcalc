/*
 * Created on 10.11.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.calcprovider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.swt.widgets.Widget;

import de.gymcalc.contest.provider.ClassTypeItemProvider;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.DisziplineType;

/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ClassTableItemProvider extends ClassTypeItemProvider
		implements ITableItemLabelProvider {

	/**
	 * @param adapterFactory
	 */
	public ClassTableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ITableItemLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Object getColumnImage(Object object, int columnIndex) {
		Object RetVal = null;
		String Name = getColumnText (object, columnIndex);
		if (null != Name) {
			if (0 == Name.compareTo("Boden")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/boden"));
			} else if (0 == Name.compareTo("Sprung")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/sprung"));
			} else if (0 == Name.compareTo("Balken")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/balken"));
			} else if (0 == Name.compareTo("Stuba")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/stuba"));
			} else if (0 == Name.compareTo("Pferd")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/pferd"));
			} else if (0 == Name.compareTo("Ringe")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/ringe"));
			} else if (0 == Name.compareTo("Barren")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/barren"));
			} else if (0 == Name.compareTo("Reck")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/reck"));
			}
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ITableItemLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object object, int columnIndex) {
		String RetVal = "";
		switch (columnIndex) {
		case 0:	
			RetVal = ((ClassType)object).getName();
			break;
		case 1:	
			RetVal = getString ("_UI_WinnerType_organization_feature");
			break;
		case 2:
			RetVal = getString ("_UI_ResultType_rank_feature");
			break;
		case 3:
			RetVal =  getString ("_UI_ResultType_points_feature");
			break;
		default:
			DisziplineType diszipline = getDiszipline (object, columnIndex - 4, GETMODE.get);
			if (null != diszipline) {
				RetVal = diszipline.getName ();
			}
			break;
		}
		return RetVal;
	}

	enum GETMODE {
		get,
		create,
	}
	
	DisziplineType getDiszipline (Object object, int columnIndex, GETMODE mode) {
		DisziplineType RetVal = null;
		EObject eObject = getEobject (object);
		EList<?> disziplines = ((ClassType)eObject).getDiszipline ();
		if (disziplines.size () > columnIndex) {
			RetVal = (DisziplineType)disziplines.get (columnIndex);
		}
		return RetVal;
	}

	EObject getEobject (Object object) {
		EObject RetVal = null;
		if (object instanceof Widget) {
			RetVal = (EObject) ((Widget) object).getData ();
		} else {
			RetVal = (EObject) object;
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		ClassType classType = (ClassType)getEobject(object);
		return classType.getWinner();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getElements(java.lang.Object)
	 */
	@Override
	public Collection<?> getElements(Object object) {
		ClassType classType = (ClassType)getEobject(object);
		return classType.getWinner();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object object) {
		ClassType classType = (ClassType)getEobject(object);
		return !classType.getWinner().isEmpty();
	}

}
