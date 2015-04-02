package de.gymcalc.contest.presentation;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.databinding.property.value.SimpleValueProperty;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.internal.databinding.swt.WidgetListener;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Widget;

public class SingleReferenceTableCell {

	public SingleReferenceTableCell( TableViewer viewer, 
			EditingDomain editingDomain,
			EMFDataBindingContext ctx,
			IObservableSet os,
			EReference reference,
			EAttribute referenceAttribute,
			IStructuredContentProvider selectable,
			Object emptyValue
			)
	{
	    	IObservableMap[] attributeMap = new IObservableMap[2];
	    	IValueProperty referenceProperty = null;
	    	{
	    		IValueProperty property = EMFEditProperties.value(editingDomain,
		    		 reference );
	    		attributeMap[0] = property.observeDetail( os );
	    		referenceProperty = property;
	    	}
	    	{
	    		IValueProperty property = EMFEditProperties.value(editingDomain,
		    		 FeaturePath.fromList( reference,
		    		 	referenceAttribute ) );
	    		attributeMap[1] = property.observeDetail( os );
	    	}
	    	m_column = new TableViewerColumn(viewer, SWT.NONE);
	    	m_column.getColumn().setText( ContestEditorPlugin.INSTANCE.getString( reference.getName() ) );
	    	m_column.getColumn().setWidth(300);
	    	m_column.setLabelProvider(new GenericMapCellLabelProvider("{1}", attributeMap));
	    	// make column editable
	    	ComboBoxViewerCellEditor editor =new ComboBoxViewerCellEditor(viewer.getTable(), SWT.READ_ONLY) {
	    		public void activate() {
	    			Object last = this.getValue();
	    			// refresh the content when editor is activated
	    			this.setInput( this.getViewer().getInput( ) );
	    			this.setValue( last );
	    		}
	    	};
	    	editor.setContentProvider( selectable );
	    	editor.setLabelProvider( new FeatureLabelProvider( referenceAttribute ) );
	    	m_editor = editor;
	    	m_column.setEditingSupport(EMFObservableValueEditingSupport
	    			.create(viewer, 
	    					ctx, // EMFDataBindingContext
	    					editor,
	    					new SimpleValueProperty() {

								@Override
								public Object getValueType() {
									// TODO Auto-generated method stub
									return null;
								}

								@Override
								protected Object doGetValue(Object source) {
									Object retVal = ( ( ComboBoxViewerCellEditor ) source ).getValue( );
									if( retVal == m_emptyValue ) {
										retVal = null;
									}
									return retVal;
								}

								@Override
								protected void doSetValue(Object source,
										Object value) {
									( ( ComboBoxViewerCellEditor ) source ).setValue( value );
								}

								@Override
								public INativePropertyListener adaptListener(
										ISimplePropertyListener listener) {
									return new WidgetListener(this, listener, new int[]{SWT.Selection, SWT.DefaultSelection}, new int[]{}) {
										protected void doAddTo(Object source) {
											Widget widget = ((CellEditor) source).getControl();
											super.doAddTo(widget);
										}

										protected void doRemoveFrom(Object source) {
											Widget widget = ((CellEditor) source).getControl();
											super.doRemoveFrom( widget );
										}
									};
								}
	    					},
		      				//CellEditorProperties.control().value( WidgetProperties.singleSelectionIndex() ), 
	    					referenceProperty));
	    	m_emptyValue = emptyValue;

	}
	
	public void setInput( Object input )
	{
		m_editor.setInput( input );
	}

	public TableViewerColumn getColumn( )
	{
		return m_column;
	}
	
	private ComboBoxViewerCellEditor m_editor = null;
	private TableViewerColumn m_column = null;
	private Object m_emptyValue = null;
}

