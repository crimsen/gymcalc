/**
 * 
 */
package de.gymcalc.contest.presentation;

import java.util.Set;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.set.ComputedSet;
import org.eclipse.core.databinding.observable.set.WritableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.ocl.conditions.BooleanOCLCondition;
import org.eclipse.jface.databinding.viewers.ObservableSetContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;

import de.gymcalc.databinding.ui.Formkit;
import de.gymcalc.databinding.ui.OclContentProvider;
import de.gymcalc.databinding.ui.TableComparator;
import de.gymcalc.addressbook.AddressBookPackage;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;

/**
 * @author thomas
 *
 */
public class RegistrationJuristEditor extends EmfMultiEditor {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl( parent );
		viewer = new TableViewer(parent, SWT.FULL_SELECTION);
	    viewer.getTable().setHeaderVisible(true);
	    viewer.getTable().setLinesVisible(true);
//      ListBuilder listBuilder = new MergedAthletListBuilder( );
//	    MergedListContentProvider cp = new MergedListContentProvider( listBuilder );
    	OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();

		final TableComparator comparator = new TableComparator( );
		viewer.setComparator( comparator );
	    int columnIndex = 0;
	    ComputedSet os = new ComputedSet( AthletType.class ) {
			@SuppressWarnings("rawtypes")
			@Override
			protected Set calculate() {
 	        	WritableSet retVal = WritableSet.withElementType(AthletType.class);
 	        	Object target = master.getValue();
 	        	if( null != target && target instanceof ContestType ) {
 	    			IObservableList l = EMFProperties.list( ContestPackage.Literals.CONTEST_TYPE__JURI ).observe( target );
 	    			for( Object o: l ) {
 	    				if( o instanceof JuriType ) {
 	    					IObservableList la = EMFProperties.list( ContestPackage.Literals.JURI_TYPE__JURIST).observe( o );
 	    					for( Object e : la ) {
    							if( e instanceof JuristType ) {
 	    							retVal.add( e );
    							}
 	    					}
 	    				}
 	    			}
 	    		}
 	    		return retVal;
			}
	    	
	    };
	    {
	    	EObjectCondition validValues;
			try {
				validValues = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					    ocl.getEnvironment(),
					    "true",
					    AddressBookPackage.Literals.ORGANIZATION_TYPE );
				this.organizationEditor = Formkit.createColumnWithComboEditor(editingDomain, viewer, ctx,
		    			os, ContestPackage.Literals.JURIST_TYPE__ORGANIZATION,
		    			AddressBookPackage.Literals.ORGANIZATION_TYPE__NAME, columnIndex, new OclContentProvider( validValues ) );
			} catch (ParserException e) {
				e.printStackTrace();
			}
	    	++columnIndex;
	    }
	    {
	    	Formkit.createColumnWithTextEditor( editingDomain, viewer, columnIndex, ctx, os, ContestPackage.Literals.JURIST_TYPE__PERSON,
	    			AddressBookPackage.Literals.PERSON_TYPE__NAME );
	    	++columnIndex;
 	    }
	    {
			Formkit.createColumnWithTextEditor( editingDomain, viewer, columnIndex, ctx, os, ContestPackage.Literals.JURIST_TYPE__PERSON,
	    			AddressBookPackage.Literals.PERSON_TYPE__FIRSTNAME );
		    ++columnIndex;
 	    }
	    {
	    	EObjectCondition validValues;
			try {
				validValues = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					    ocl.getEnvironment(),
					    "true",
					    ContestPackage.Literals.JURI_TYPE );
				this.juriesEditor = Formkit.createColumnWithComboEditor(editingDomain, viewer, ctx, os, ContestPackage.Literals.JURIST_TYPE__JURI,
		    			ContestPackage.Literals.JURI_TYPE__NAME, columnIndex, new OclContentProvider( validValues ) );
			} catch (ParserException e) {
				e.printStackTrace();
			}	    	
	    	++columnIndex;
	    }
	    viewer.setContentProvider( new ObservableSetContentProvider( ) );
	    viewer.setInput( os );
	    viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				isetSelection( event.getSelection() );
			}
	    });
	    updateInput();
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
	 * Calling this result will notify the listeners.
	 */
	public void setSelection(ISelection selection) {
		viewer.setSelection(selection);
	}

	private void isetSelection(ISelection selection) {
		super.setSelection( selection );
	}

	private void updateInput( )
	{
		IFileEditorInput modelFile = (IFileEditorInput)this.getEditorInput();
		URI resourceURI = URI.createPlatformResourceURI( modelFile.getFile().getFullPath().toString(), true );;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
			ContestType contest = ( ( ContestType ) resource.getContents().get( 0 ) );
			master.setValue( contest );
		    organizationEditor.setInput( contest );
		    juriesEditor.setInput( contest );
		    String name = modelFile.getName();
		    name += " (" + ContestEditorPlugin.INSTANCE.getString("_UI_RegistrationJuristEditor_label") + ")";
		    this.setPartName( name );
		} catch( Exception e ) {
			e.printStackTrace();
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}
		
	}
	
	EMFDataBindingContext ctx = new EMFDataBindingContext();
    private TableViewer viewer = null;
    private final IObservableValue master = new WritableValue();
    private SingleReferenceTableCell organizationEditor = null;
    private SingleReferenceTableCell juriesEditor = null;
}
