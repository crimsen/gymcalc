package de.gymcalc.rcp.juriclient.parts;

import javax.annotation.PostConstruct;

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
import de.gymcalc.rcp.IModel;

public class JuriView {

	private TableViewer tableViewer;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		tableViewer = new TableViewer(parent);

		AdapterFactory factory = new ContestItemProviderAdapterFactory();
		tableViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		tableViewer.setInput(createInitialDataModel());
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	private Object createInitialDataModel() {
		ContestType contest = IModel.INSTANCE.getContest();
		return contest;
	}
}