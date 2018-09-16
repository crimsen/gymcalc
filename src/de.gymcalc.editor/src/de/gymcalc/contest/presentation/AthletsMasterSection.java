package de.gymcalc.contest.presentation;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;

public class AthletsMasterSection extends SectionPart implements ISelectionProvider {

	public AthletsMasterSection(Composite parent, FormToolkit toolkit, int style) {
		super(parent, toolkit, style);
		Section section = getSection();
		section.setText("Empty Master Section");
		Composite composite = toolkit.createComposite(section, SWT.NONE);
		composite.setLayout( new GridLayout());
		toolkit.paintBordersFor(composite);
		section.setClient(composite);
		tree = new FilteredTree(composite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER, new PatternFilter(), true);
		tree.getViewer().setContentProvider(new MasterContentProvider());
		tree.getViewer().setLabelProvider(new MasterLabelProvider());
		tree.getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent e) {
				AthletsMasterSection.this.selectionChanged((IStructuredSelection) e.getSelection());
			}
		});
	}

	@Override
	public boolean setFormInput(Object input) {
		if( input instanceof ContestType) {
			contest = (ContestType)input;
		} else {
			contest = null;
		}
		tree.getViewer().setInput(contest);
		return super.setFormInput(input);
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		tree.getViewer().addSelectionChangedListener(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		tree.getViewer().removeSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		return tree.getViewer().getSelection();
	}

	@Override
	public void setSelection(ISelection selection) {
		tree.getViewer().setSelection(selection);
	}
	
	protected void selectionChanged(IStructuredSelection selection) {
		getManagedForm().fireSelectionChanged(this, selection);
	}

	protected class MasterContentProvider implements ITreeContentProvider
	{

		public MasterContentProvider() {
			rootElements.add( new LabelItem("Wettkampfklassen") {
				@Override
				protected Object[] getChildren() {
					return contest.getClass_().toArray();
				}
				@Override
				protected boolean hasChildren() {
					return !contest.getClass_().isEmpty();
				}
			});
			rootElements.add( new LabelItem("Riegen") {
				@Override
				protected Object[] getChildren() {
					return contest.getChain().toArray();
				}
				@Override
				protected boolean hasChildren() {
					return !contest.getChain().isEmpty();
				}
			});
//			rootElements.add( new LabelItem("Mannschaften"));			
		}
		@Override
		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			Object[] retVal = null;
			if( parentElement instanceof ContestType ) {
				retVal = rootElements.toArray();
			} else if( parentElement instanceof LabelItem ) {
				retVal = ((LabelItem)parentElement).getChildren();
			}
			return retVal;
		}

		@Override
		public Object getParent(Object element) {
			Object retVal = null;
			if( element instanceof LabelItem ) {
				retVal = contest;
			} else if( element instanceof ClassType ) {
				retVal = rootElements.get(0);
			} else if( element instanceof ChainType ) {
				retVal = rootElements.get(1);
			}
			return retVal;
		}

		@Override
		public boolean hasChildren(Object element) {
			boolean retVal = false;
			if( element instanceof ContestType ) {
				retVal = true;
			} else if( element instanceof LabelItem ) {
				retVal = ((LabelItem)element).hasChildren();
			}
			return retVal;
		}
		
		protected ArrayList<LabelItem> rootElements = new ArrayList<LabelItem>();
	}
	
	protected class MasterLabelProvider extends LabelProvider
	{

		@Override
		public String getText(Object element) {
			String retVal = "";
			if( element instanceof LabelItem ) {
				retVal = ((LabelItem)element).getLabel();
			} else if( element instanceof ClassType ) {
				retVal = ((ClassType)element).getName();
			} else if( element instanceof ChainType ) {
				retVal = ((ChainType)element).getName();
			}
			return retVal;
		}
	}

	protected class LabelItem
	{
		protected LabelItem( String aLabel ) {
			label = aLabel;
		}
		protected String getLabel() {
			return label;
		}
		protected Object[] getChildren() {
			Object[] retVal = new Object[]{};
			return retVal;
		}
		protected boolean hasChildren() {
			return false;
		}
		protected String label;
	}

	ContestType contest;
	protected FilteredTree tree;
}
