package de.gymcalc.print;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IActionDelegate2;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.gymcalc.contest.calcprovider.ContestClassItemProviderAdapterFactory;

public class CreateCalcReport implements IObjectActionDelegate, IActionDelegate2 {

	private ISelection selection;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IResource resource = null;
				if (element instanceof IResource) {
					resource = (IResource) element;
				} else if (element instanceof IAdaptable) {
					resource = (IResource) ((IAdaptable) element)
							.getAdapter(IResource.class);
				}
				if (resource != null) {
					createCalcReport(resource);
				}
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public void dispose() {
	}

	public void init(IAction action) {
	}

	public void runWithEvent(IAction action, Event event) {
		run (action);
	}

	private void createCalcReport(IResource resource) {
		IProject project = resource.getProject();
		IFolder reports = project.getFolder("reports");
		if (!reports.exists()) {
			try {
				reports.create(false, true, null);
			} catch (Exception e) {
			}
		}
		String ReportName = resource.getName ().replaceFirst("\\.contest", ".calcreport");
		IFile report = reports.getFile(ReportName);
		if (!report.exists()) {
			try {
				report.create (new StringBufferInputStream (""), false, null);
			} catch (Exception e){
			}
		}
		List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ContestClassItemProviderAdapterFactory());
		ComposedAdapterFactory adapter = new ComposedAdapterFactory(factories);
		ITreeContentProvider contentProvider = new AdapterFactoryContentProvider(adapter); 
		new AdapterFactoryLabelProvider(adapter);
		contentProvider.getElements(resource);
	}
}
