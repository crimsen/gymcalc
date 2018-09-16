package de.gymcalc.contest.presentation;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.gymcalc.contest.impl.ChainTypeImpl;
import de.gymcalc.contest.impl.ClassTypeImpl;
import de.gymcalc.contest.impl.FinalChainTypeImpl;
import de.gymcalc.contest.impl.FinalClassTypeImpl;

public class AthletsBlock extends MasterDetailsBlock implements ISelectionProvider {

	private FormToolkit toolkit;

	
	/**
	 * Create the master details block.
	 */
	public AthletsBlock() {
		// Create the master details block
	}
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListener.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListener.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		ISelection retVal = null;
		if( null != detailsPart.getCurrentPage() &&
				detailsPart.getCurrentPage() instanceof ISelectionProvider ) {
			retVal = ((ISelectionProvider)detailsPart.getCurrentPage()).getSelection();
		} else {
			retVal = masterSection.getSelection();
		}
		return retVal;
	}

	@Override
	public void setSelection(ISelection selection) {
		if( null != detailsPart.getCurrentPage() &&
				detailsPart.getCurrentPage() instanceof ISelectionProvider ) {
			((ISelectionProvider)detailsPart.getCurrentPage()).setSelection(selection);
		} else {
			masterSection.setSelection(selection);
		}
	}

	/**
	 * Create contents of the master details block.
	 * @param managedForm
	 * @param parent
	 */
	@Override
	protected void createMasterPart(IManagedForm managedForm, Composite parent) {
		toolkit = managedForm.getToolkit();
		//		
		//Section section = toolkit.createSection(parent, ExpandableComposite.EXPANDED | ExpandableComposite.TITLE_BAR);
		//section.setText("Empty Master Section");
		//
		masterSection = new AthletsMasterSection(parent, toolkit, SWT.NONE);
		managedForm.addPart(masterSection);
	}

	/**
	 * Register the pages.
	 * @param part
	 */
	@Override
	protected void registerPages(DetailsPart part) {
		AthletsDetailsPart athletsDetailsPart = new AthletsDetailsPart();
		part.registerPage(ClassTypeImpl.class, athletsDetailsPart);
		part.registerPage(FinalClassTypeImpl.class, athletsDetailsPart);
		part.registerPage(ChainTypeImpl.class, athletsDetailsPart);
		part.registerPage(FinalChainTypeImpl.class, athletsDetailsPart);
		ISelectionChangedListener selectionListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				for( ISelectionChangedListener listener:selectionChangedListener) {
					listener.selectionChanged(event);
				}
			}
		};
		masterSection.addSelectionChangedListener(selectionListener);
		athletsDetailsPart.addSelectionChangedListener(selectionListener);
	}

	/**
	 * Create the toolbar actions.
	 * @param managedForm
	 */
	@Override
	protected void createToolBarActions(IManagedForm managedForm) {
		// Create the toolbar actions
	}

	protected TreePath selectionPath = TreePath.EMPTY;
	AthletsMasterSection masterSection;
	protected ArrayList<ISelectionChangedListener> selectionChangedListener = new ArrayList<ISelectionChangedListener>();
	
}
