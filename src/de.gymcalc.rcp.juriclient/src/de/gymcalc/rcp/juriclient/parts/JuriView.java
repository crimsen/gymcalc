package de.gymcalc.rcp.juriclient.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.provider.ContestItemProviderAdapterFactory;
import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;
import de.gymcalc.rcp.IContestService;

public class JuriView {

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		tableViewer = new TableViewer(parent);

		AdapterFactory factory = new ContestItemProviderAdapterFactory();
		tableViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		tableViewer.setInput(createInitialDataModel());
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		activeObjectService.addListener( ContestType.class, new IActiveObjectListener() {

			@Override
			public void onActiveObjectChanged(Object type, Object object) {
				updateContestData((ContestType)object);
			}
			
		});
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	public void dispose() {
		contestService.closeConnection();
	}
	
	protected void updateContestData(ContestType contest) {
		tableViewer.setInput( contest );
	}
	private Object createInitialDataModel() {
		ContestType retVal = null;
		contestService.openConnection();
		retVal = contestService.getContest();
		activeObjectService.setActiveObject(ContestType.class, retVal);
		return retVal;
	}

	private TableViewer tableViewer;
	@Inject
	private IContestService contestService;
	@Inject
	private IActiveObjectService activeObjectService;
}