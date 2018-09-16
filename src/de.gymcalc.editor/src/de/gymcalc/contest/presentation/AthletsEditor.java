/**
 * 
 */
package de.gymcalc.contest.presentation;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.ManagedForm;

import de.gymcalc.contest.ContestType;

/**
 * @author thomas
 *
 */
public class AthletsEditor extends EmfMultiEditor {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl( parent );
		form = new ManagedForm(parent);
		masterDetail = new AthletsBlock();
		masterDetail.createContent(form, form.getForm().getBody());
		ISelectionChangedListener selectionListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setSelection(event.getSelection());
			}
		};
		masterDetail.addSelectionChangedListener(selectionListener);
		updateInput();
	}

	private void updateInput( )
	{
		try {
			// Load the resource through the editing domain.
			//
			ContestType contest = getRootElement(ContestType.class);
			master.setValue( contest );
			form.setInput( contest );
		    String name = getInputName();
		    name += " (Wettkämpfereinteilung)";
		    this.setPartName( name );
		} catch( Exception e ) {
			e.printStackTrace();
		}
		
	}
	
	EMFDataBindingContext ctx = new EMFDataBindingContext();
	ManagedForm form;
	AthletsBlock masterDetail;
	private final IObservableValue<ContestType> master = new WritableValue<ContestType>();
}
