package de.gymcalc.contest.calcprovider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;

public class ColumnMapItemProvider
	extends DelegatingWrapperItemProvider
	implements ITableItemLabelProvider, ICellModifier
{

	public ColumnMapItemProvider(Object value, Object owner, EStructuralFeature feature,
			int index, AdapterFactory adapterFactory) {
		super(value, owner, feature, index, adapterFactory);
	}

	public Object getColumnImage(Object object, int columnIndex) {
	    return delegateItemProvider instanceof ITableItemLabelProvider ?
	    	     ((ITableItemLabelProvider)delegateItemProvider).getColumnImage(getDelegateValue(), getMappedIdx (columnIndex)) :
	    	      null;
	}

	public String getColumnText(Object object, int columnIndex) {
	    return delegateItemProvider instanceof ITableItemLabelProvider ?
	    	     ((ITableItemLabelProvider)delegateItemProvider).getColumnText(getDelegateValue(), getMappedIdx (columnIndex)) :
	    	      null;
	}

	public boolean canModify(Object element, String property) {
		boolean RetVal = false;
		if (delegateItemProvider instanceof ICellModifier) {
			int mappedIdx = getMappedIdx (Integer.parseInt (property));
	    	RetVal = ((ICellModifier)delegateItemProvider).canModify(getDelegateValue(), Integer.toString(mappedIdx));
		}
		return RetVal;
	}

	public Object getValue(Object element, String property) {
		Object RetVal = null;
		if (delegateItemProvider instanceof ICellModifier) {
			int mappedIdx = getMappedIdx (Integer.parseInt (property));
	    	RetVal = ((ICellModifier)delegateItemProvider).getValue
	    	     (getDelegateValue(), Integer.toString(mappedIdx));
		}
		return RetVal;
	}

	public void modify(Object element, String property, Object value) {
		if (delegateItemProvider instanceof ICellModifier) {
			int mappedIdx = getMappedIdx (Integer.parseInt (property));
	    	((ICellModifier)delegateItemProvider).modify
	    		(getDelegateValue(), Integer.toString(mappedIdx), value);
	    }
	}

	private int getMappedIdx (int idx) {
		int RetVal = idx;
		Object parent = adapterFactory.adapt(getOwner (), ITableItemLabelProvider.class);
		if (parent instanceof IColumnMap) {
			RetVal = (Integer)((IColumnMap)parent).getColumnMap(getOwner (), value).get(idx);
		}
		return RetVal;
	}
}

