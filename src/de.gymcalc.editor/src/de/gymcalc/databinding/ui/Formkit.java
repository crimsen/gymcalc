package de.gymcalc.databinding.ui;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.CellEditorProperties;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;

import de.gymcalc.contest.presentation.ContestEditorPlugin;
import de.gymcalc.contest.presentation.EMFObservableValueEditingSupport;
import de.gymcalc.contest.presentation.GenericMapCellLabelProvider;
import de.gymcalc.contest.presentation.SingleReferenceTableCell;
import de.spremberg.turnen.databinding.UpdateStrategyFactory;

public class Formkit {

	/**
	 * @param editingDomain is the editing domain
	 * @param viewer is the parent of the celleditor
	 * @param ctx is the databinding context
	 * @param os is the set that contains the elements for the rows
	 * @param columnIndex is the index of the column counted from left it is used to indicate
	 *  the column while sorting
	 * @param feature is the feature of the elements in os that has to be modified
	 * @param attribute is the attribute that is uses as label for choosing the feature
	 * @param validValues ocl condition that describes values that can be set to an elements feature
	 */
	static public SingleReferenceTableCell createColumnWithComboEditor( EditingDomain editingDomain, TableViewer viewer, EMFDataBindingContext ctx,
			IObservableSet os, EReference feature, EAttribute attribute, int columnIndex,
			IStructuredContentProvider validValues ) {
		SingleReferenceTableCell retVal = new SingleReferenceTableCell(viewer, editingDomain, ctx, os,
				feature, attribute, validValues, null);
	    retVal.getColumn().getColumn().addSelectionListener(new SortingAdapter( viewer, columnIndex ) );
	    return retVal;
	}

	static public void createColumnWithTextEditor( EditingDomain editingDomain, TableViewer viewer, int columnIndex,
			EMFDataBindingContext ctx,	IObservableSet os, EStructuralFeature... featurePath  ) {
    	IValueProperty property = EMFEditProperties.value(
    			editingDomain,
    	        FeaturePath.fromList(featurePath)
    	        );
    	IObservableMap attributeMap = property.observeDetail( os );
    	TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
    	column.getColumn().setText( ContestEditorPlugin.INSTANCE.getString( featurePath[featurePath.length - 1].getName() ) );
    	column.getColumn().setWidth( 150 );
    	column.setLabelProvider(new GenericMapCellLabelProvider("{0}", attributeMap));
    	// make column editable
    	column.setEditingSupport(EMFObservableValueEditingSupport
    			.create(viewer, 
    					ctx, // EMFDataBindingContext
    					new TextCellEditor(viewer.getTable()), 
    					CellEditorProperties.control().value(WidgetProperties.text(SWT.Modify)), 
    					property));
	    column.getColumn().addSelectionListener(new SortingAdapter( viewer, columnIndex));
	}
	static public void createColumnWithDate( EditingDomain editingDomain, TableViewer viewer, int columnIndex, EMFDataBindingContext ctx,
			IObservableSet os, EStructuralFeature... featurePath ) {
    	IValueProperty property = EMFEditProperties.value(
    	        editingDomain,
    	        FeaturePath.fromList( featurePath )
    	        	);
    	IObservableMap attributeMap = property.observeDetail( os );
    	TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
    	column.getColumn().setText( ContestEditorPlugin.INSTANCE.getString( featurePath[ featurePath.length - 1 ].getName() ) );
    	column.getColumn().setWidth(100);
    	column.setLabelProvider(new GenericMapCellLabelProvider("{0,date,yyyy-MM-dd}", attributeMap));
	    column.getColumn().addSelectionListener(new SortingAdapter(viewer, columnIndex));
	}

	static public void createTextField( FormToolkit toolkit, EditingDomain editingDomain, Composite composite, EMFDataBindingContext ctx,
			IObservableValue master, EAttribute attribute ) {
    	IValueProperty property = EMFEditProperties.value(
    			editingDomain, attribute );
    	IObservableValue attributeValue = property.observeDetail( master );
    	toolkit.createLabel( composite, ContestEditorPlugin.INSTANCE.getString( attribute.getName() ) );
    	Text text = toolkit.createText( composite, "" );
        text.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false, 2, 1));
    	ctx.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, text), attributeValue);
	}

	static public void createDateField( FormToolkit toolkit, EditingDomain editingDomain, Composite composite, EMFDataBindingContext ctx,
			IObservableValue master, EAttribute attribute ) {
    	IValueProperty property = EMFEditProperties.value(
    			editingDomain, attribute );
    	IObservableValue attributeValue = property.observeDetail( master );
    	toolkit.createLabel( composite, ContestEditorPlugin.INSTANCE.getString( attribute.getName() ) );
    	Text text = toolkit.createText( composite, "" );
        text.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false, 2, 1));
    	ctx.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, text), attributeValue,
    			UpdateStrategyFactory.stringToDateNotNull(
                /* TODO: */ "NLSMessages.ProjectAdminViewPart_StartDateNotParseable",
                "Datum muss gesetzt werden"), UpdateStrategyFactory.dateToString());

	}
	
	static public void createLink( FormToolkit toolkit, Composite composite, EClass clazz, IHyperlinkListener linkNavigator ) {
	    Hyperlink link = toolkit.createHyperlink(composite, 
	    		ContestEditorPlugin.INSTANCE.getString(clazz.getName()), SWT.WRAP);
	    link.setHref( clazz );
	    link.addHyperlinkListener( linkNavigator );
	    link.setLayoutData(new GridData());
	}
}
