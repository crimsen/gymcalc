package de.gymcalc.print;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.gymcalc.contest.calcprovider.ContestClassItemProviderAdapterFactory;

public class RegistrationTableExportWizard extends Wizard implements org.eclipse.ui.IExportWizard {
    private IStructuredSelection selection;

	public class ExportWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ExportWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			if (super.validatePage()) {
				// Make sure the file ends in ".contest".
				//
				String requiredExt = "txt";
				String enteredExt = new Path(getFileName()).getFileExtension();
				if (enteredExt == null || !enteredExt.equals(requiredExt)) {
					setErrorMessage(requiredExt);
					return false;
				}
				else {
					return true;
				}
			}
			else {
				return false;
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
		 */
		@Override
		protected InputStream getInitialContents() {
			List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
			factories.add(new ResourceItemProviderAdapterFactory());
			factories.add(new ContestClassItemProviderAdapterFactory());
			ComposedAdapterFactory adapter = new ComposedAdapterFactory(factories);
			CreateRegistrationTableHtml creator = new CreateRegistrationTableHtml (adapter);
			StringWriter writer = new StringWriter ();
			Iterator<?> i = selection.iterator ();
			while (i.hasNext ()) {
				Object object = i.next ();
				creator.createReport (object, writer);
			}
			return new StringBufferInputStream (writer.getBuffer ().toString ());
		}
		
	}
	
	ExportWizardNewFileCreationPage newFileCreationPage;

	@Override
	public boolean performFinish() {
		newFileCreationPage.createNewFile ();
        return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        this.selection = currentSelection;
/*
        List selectedResources = IDE.computeSelectedResources(currentSelection);
        if (!selectedResources.isEmpty()) {
            this.selection = new StructuredSelection(selectedResources);
        }
*/
        // look it up if current selection (after resource adapting) is empty
        if (selection.isEmpty() && workbench.getActiveWorkbenchWindow() != null) {
            IWorkbenchPage page = workbench.getActiveWorkbenchWindow()
                    .getActivePage();
            if (page != null) {
                IEditorPart currentEditor = page.getActiveEditor();
                if (currentEditor != null) {
                    Object selectedResource = currentEditor.getEditorInput();
                    if (selectedResource != null) {
                        selection = new StructuredSelection(selectedResource);
                    }
                }
            }
        }

	}

	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ExportWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle("Registrierung Text Tabelle");
		newFileCreationPage.setDescription("Registrierung Text Tabelle");
		newFileCreationPage.setFileName("register" + ".txt");
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = "register";
					String defaultModelFilenameExtension = "txt";
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
	}

}
