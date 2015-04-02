package de.gymcalc.print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.jooreports.templates.DocumentTemplate;
import net.sf.jooreports.templates.DocumentTemplateException;
import net.sf.jooreports.templates.DocumentTemplateFactory;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.WinnerType;
import de.gymcalc.print.preferences.TemplatePreferencesPage;

public class JodReportExportWizard extends Wizard implements org.eclipse.ui.IExportWizard {
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
				String requiredExt = "odt";
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
			InputStream retVal = null;
			DocumentTemplateFactory documentTemplateFactory = new DocumentTemplateFactory();
			try {
				Iterator<?> i = selection.iterator ();
				while (i.hasNext ()) {
					Object object = i.next ();
					if( object instanceof ContestType ) {
						DocumentTemplate template;
						String templateFileName = TemplatePreferencesPage.getTemplateDir() + "/registration.odt";
						template = documentTemplateFactory.getTemplate(new FileInputStream(templateFileName));
						ContestType contestsrc = (ContestType) object;
						Map<String, Map<String, Object>> root = new HashMap<String, Map<String, Object>>();
						Map<String, Object> contest = new HashMap<String, Object>();
						root.put("contest", contest);
						contest.put("name", contestsrc.getName());
						List<Map<String, Object>> classes = new ArrayList<Map<String, Object>>();
						contest.put("class", classes);
						EList<ClassType> classessrc = contestsrc.getClass_();
						Iterator<ClassType> iclass = classessrc.iterator();
						while(iclass.hasNext()) {
							ClassType classsrc = iclass.next();
							Map<String, Object> _class = new HashMap<String, Object>();
							classes.add(_class);
							_class.put("name", classsrc.getName());
							List<Map<String, String>> winners = new ArrayList<Map<String, String>>();
							_class.put("winner", winners);
							EList<WinnerType> winnerssrc = classsrc.getWinner();
							Iterator<WinnerType> iwinner = winnerssrc.iterator();
							while( iwinner.hasNext() ) {
								WinnerType winnersrc = iwinner.next();
								Map<String, String> winner = new HashMap<String, String>();
								winners.add(winner);
								winner.put("name", winnersrc.getName());
								OrganizationType organization = winnersrc.getOrganization();
								if( null != organization ) {
									winner.put("organization", organization.getName());
								}
							}
						}
						String tmpFileName = TemplatePreferencesPage.getGenerationDir() + "/tmp.odt";
						template.createDocument(root, new FileOutputStream(tmpFileName));
						retVal = new FileInputStream(tmpFileName);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentTemplateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch ( Exception e ) {
				e.printStackTrace();
			}
			return retVal;
		}
		
		boolean useOrganization;
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
		newFileCreationPage.setTitle("Export Registrierung");
		newFileCreationPage.setDescription("Export Registrierung");
		newFileCreationPage.setFileName("registration" + ".odt");
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
					String defaultModelBaseFilename = Activator.getString( "_UI_ContestEditorFilenameDefaultBase" );
					String defaultModelFilenameExtension = Activator.getString( "_UI_ContestEditorFilenameExtension" );
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
