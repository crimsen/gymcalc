package de.gymcalc.contest.presentation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.FinalChainType;

public class SelectFinalsAthletPage extends WizardPage {

	
	public SelectFinalsAthletPage(String pageName, AdapterFactory adapterFactory ) {
		super(pageName);
		this.adapterFactory = adapterFactory;
		setTitle( ContestEditorPlugin.INSTANCE.getString("_UI_ContestSelectFinalsAthletPage") );
		setDescription( ContestEditorPlugin.INSTANCE.getString("_UI_ContestSelectFinalsAthletPage_description") );
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite( parent, SWT.NONE );
		GridLayout layout = GridLayoutFactory.fillDefaults().create();
		setControl( composite );
		table = new FilteredTree(composite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER, new PatternFilter(), true);
		table.getViewer().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		table.getViewer().setLabelProvider(getLabelProvider());
		table.getViewer().setContentProvider(new ITreeContentProvider() {

			@Override
			public Object[] getElements(Object inputElement) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getParent(Object element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean hasChildren(Object element) {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout( layout );

	}

	public AthletType getAthlet( )
	{
		AthletType retVal = null;
		return retVal;
	}
	
	public void setFinalChain( FinalChainType chain ) {
		this.chain = chain;
	}
	public void setContest( ContestType contest ) {
		this.contest = contest;
	}
	
	public ContestType getContest( ) {
		return this.contest;
	}
		
	protected ILabelProvider getLabelProvider( )
	{
		ILabelProvider retVal = adapterFactoryLabelProvider;
		if( null == retVal ) {
			adapterFactoryLabelProvider = new AdapterFactoryLabelProvider( adapterFactory );
			retVal = adapterFactoryLabelProvider;
		}
		return retVal;
	}
	protected ArrayList<AthletType> getSelectableAthlets() {
		ArrayList<AthletType> retVal = new ArrayList<AthletType>();
		retVal.addAll((Collection<? extends AthletType>) chain.getFinalClass().getWinner());
		retVal.removeAll(chain.getAthlet());
		return retVal;
	}
	
	protected FilteredTree table;
	private AdapterFactory adapterFactory;
	private AdapterFactoryLabelProvider adapterFactoryLabelProvider;
	
	private ContestType contest;
	private FinalChainType chain;
	
}
