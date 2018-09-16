package de.gymcalc.contest.presentation;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.WinnerType;

public class AthletsDetailsPart extends AbstractFormPart implements IDetailsPage, ISelectionProvider {

	@Override
	public void selectionChanged(IFormPart part, ISelection selection) {
		Object element = null;
		if( selection instanceof ITreeSelection) {
			Object selectedElement = ((ITreeSelection)selection).getFirstElement();
			if( selectedElement instanceof ClassType ||
					selectedElement instanceof ChainType ) {
				element = selectedElement;
			}
		}
		tableViewer.setInput(element);
	}
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionListener.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionListener.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		ISelection retVal = null;
		if( null != tableViewer ) {
			retVal = tableViewer.getSelection();
		}
		return retVal;
	}

	@Override
	public void setSelection(ISelection selection) {
		if( null != tableViewer ) {
			tableViewer.setSelection(selection);
		}
	}

	@Override
	public void createContents(Composite parent) {
		parent.setLayout(new GridLayout());
		FormToolkit toolkit = this.getManagedForm().getToolkit();
		Section section = toolkit.createSection(parent, ExpandableComposite.EXPANDED | ExpandableComposite.TITLE_BAR);
		section.setText("Wettkämpfer");
		Composite composite = toolkit.createComposite(section, SWT.NONE);
		composite.setLayout( new GridLayout());
		toolkit.paintBordersFor(composite);
		section.setClient(composite);

		tableViewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		tableViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new DetailLabelProvider());
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				for( ISelectionChangedListener listener:selectionListener) {
					listener.selectionChanged(event);
				}
			}
		});
	}

	protected class ContentProvider implements IStructuredContentProvider{

		@Override
		public Object[] getElements(Object inputElement) {
			Object[] retVal = null;
			if(inputElement instanceof ClassType) {
				retVal = ((ClassType)inputElement).getWinner().toArray();
			} else if(inputElement instanceof ChainType) {
				retVal = ((ChainType)inputElement).getAthlet().toArray();
			}
			return retVal;
		}
		
	}
	protected class DetailLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnxsIndex) {
			return ((WinnerType)element).getName();
		}

	}
	protected ArrayList<ISelectionChangedListener> selectionListener = new ArrayList<ISelectionChangedListener>();
	protected TableViewer tableViewer;
}
