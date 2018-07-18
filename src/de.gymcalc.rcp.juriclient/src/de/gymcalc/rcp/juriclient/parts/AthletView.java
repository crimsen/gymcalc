package de.gymcalc.rcp.juriclient.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.provider.ContestItemProviderAdapterFactory;
import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;

public class AthletView {

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		tableViewer = new TableViewer(parent);

		AdapterFactory factory = new ContestItemProviderAdapterFactory();
		tableViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));

		tableViewer.addSelectionChangedListener( new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection s = event.getStructuredSelection();
				Object o = s.getFirstElement();
				updateActiveObject( o );
			}
		});
		activeObjectService.addListener( ChainType.class, new IActiveObjectListener() {

			@Override
			public void onActiveObjectChanged(Object type, Object object) {
				updateChainData((ChainType)object);
			}
			
		});
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	protected void updateActiveObject(Object o) {
		if( null != o && ! ( o instanceof AthletType ) ) {
			o = null;
		}
		activeObjectService.setActiveObject(AthletType.class, o);
	}
	protected void updateChainData(ChainType chain) {
		tableViewer.setInput( chain );
	}

	private TableViewer tableViewer;
	@Inject
	private IActiveObjectService activeObjectService;
}