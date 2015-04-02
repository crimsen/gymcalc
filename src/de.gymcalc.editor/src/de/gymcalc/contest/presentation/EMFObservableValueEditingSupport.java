package de.gymcalc.contest.presentation;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ViewerCell;

public abstract class EMFObservableValueEditingSupport extends ObservableValueEditingSupport {
	
	private EMFDataBindingContext dbc;
	
	public EMFObservableValueEditingSupport(ColumnViewer viewer, 
			EMFDataBindingContext dbc) {
		super(viewer, dbc);
		this.dbc = dbc;
	}

	public static EditingSupport create(ColumnViewer viewer,
			EMFDataBindingContext dbc, final CellEditor cellEditor,
			final IValueProperty cellEditorProperty,
			final IValueProperty elementProperty) {
		return new EMFObservableValueEditingSupport(viewer, dbc) {
			protected IObservableValue doCreateCellEditorObservable(
					CellEditor cellEditor) {
				return cellEditorProperty.observe(cellEditor);
			}

			protected IObservableValue doCreateElementObservable(
					Object element, ViewerCell cell) {
				return elementProperty.observe(element);
			}

			protected CellEditor getCellEditor(Object element) {
				return cellEditor;
			}
		};
	}
	
	protected Binding createBinding(IObservableValue target,
			IObservableValue model) {
		return dbc.bindValue(target, model, new EMFUpdateValueStrategy(
				UpdateValueStrategy.POLICY_CONVERT), null);
	}
}

