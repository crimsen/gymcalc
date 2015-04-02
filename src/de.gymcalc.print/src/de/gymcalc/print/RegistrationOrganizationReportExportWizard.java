package de.gymcalc.print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;
import de.gymcalc.print.preferences.TemplatePreferencesPage;

public class RegistrationOrganizationReportExportWizard extends Wizard implements org.eclipse.ui.IExportWizard {
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
						String templateFileName = TemplatePreferencesPage.getTemplateDir() + "/registration-organization.odt";
						template = documentTemplateFactory.getTemplate(new FileInputStream(templateFileName));
						ContestType contestsrc = (ContestType) object;
						List<ClassType> teamClasses = getTeamClasses(contestsrc);
						List<ClassType> classessrc = getAthletClasses(contestsrc);						
						Map<String, Map<String, List<Map<String, Object>>>> root = new HashMap<String, Map<String, List<Map<String, Object>>>>();
						Map<String, List<Map<String, Object>>> contest = new HashMap<String, List<Map<String, Object>>>();
						root.put("contest", contest);
						List<Map<String, Object>> organizations = new ArrayList<Map<String, Object>>();
						contest.put("organization", organizations);
						EList<OrganizationType> organizationssrc = contestsrc.getAddressbook().getOrganization();
						Iterator<OrganizationType> iorganization = organizationssrc.iterator();
						while(iorganization.hasNext()) {
							OrganizationType organizationsrc = iorganization.next();
							Map<String, Object> organization = new HashMap<String, Object>();
							organizations.add(organization);
							organization.put("name", organizationsrc.getName());
							List<Map<String, String>> winners = new ArrayList<Map<String, String>>();
							organization.put("winner", winners);
							Iterator<ClassType> iclass = classessrc.iterator();
							while( iclass.hasNext() ) {
								ClassType classsrc = iclass.next();
								String className = classsrc.getName();
								EList<WinnerType> winnerssrc = classsrc.getWinner();
								Iterator<WinnerType> iwinner = winnerssrc.iterator();
								while( iwinner.hasNext() ) {
									WinnerType winnersrc = iwinner.next();
									if( organizationsrc == winnersrc.getOrganization() ) {
										Map<String, String> winner = new HashMap<String, String>();
										winners.add(winner);
										winner.put("name", winnersrc.getName());
										winner.put("class", className);
										winner.put("team", getTeamName(teamClasses, winnersrc));
										if( winnersrc instanceof AthletType ) {
											Date d = ( (( AthletType )winnersrc).getPerson().getDateofbirth() );
											SimpleDateFormat f = new SimpleDateFormat( "dd.MM.yyyy" );
											String date = f.format( d );
											winner.put("date_of_birth", date );
										}
									}
								}
							}
							List<Map<String, String>> jurists = new ArrayList<Map<String, String>>();
							organization.put("jurist", jurists);
							Iterator<JuriType> iJury = contestsrc.getJuri().iterator();
							while( iJury.hasNext() ) {
								JuriType jurySrc = iJury.next();
								String juryName = jurySrc.getName();
								EList<JuristType> juristsSrc = jurySrc.getJurist();
								Iterator<JuristType> iJurist = juristsSrc.iterator();
								while( iJurist.hasNext() ) {
									JuristType juristSrc = iJurist.next();
									if( organizationsrc == juristSrc.getOrganization() ) {
										Map<String, String> jurist = new HashMap<String, String>();
										jurists.add(jurist);
										jurist.put("name", juristSrc.getName());
										jurist.put("jury", juryName);
									}
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
		newFileCreationPage.setTitle( Activator.getString( "RegistrationOrganizationFilePage_Title" ) );
		newFileCreationPage.setDescription( Activator.getString( "RegistrationOrganizationFilePage_Description" ) );
		newFileCreationPage.setFileName("registration-organization" + ".odt");
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
					String defaultModelBaseFilename = "registration";
					String defaultModelFilenameExtension = "odt";
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
	}
	
	List<ClassType> getTeamClasses(ContestType contest) {
		List<ClassType> retVal = new ArrayList<ClassType>();
		EList<ClassType> classes = contest.getClass_();
		Iterator<ClassType> iclass = classes.iterator();
		while( iclass.hasNext() ) {
			ClassType class_ = iclass.next();
			EList<WinnerType> winners = class_.getWinner();
			Iterator<WinnerType> iWinner = winners.iterator();
			if( iWinner.hasNext() ) {
				WinnerType winner = iWinner.next();
				if( winner instanceof TeamType ) {
					retVal.add(class_);
				}
			}
		}
		return retVal;
	}
	List<ClassType> getAthletClasses(ContestType contest) {
		List<ClassType> retVal = new ArrayList<ClassType>();
		EList<ClassType> classes = contest.getClass_();
		Iterator<ClassType> iclass = classes.iterator();
		while( iclass.hasNext() ) {
			ClassType class_ = iclass.next();
			EList<WinnerType> winners = class_.getWinner();
			Iterator<WinnerType> iWinner = winners.iterator();
			if( iWinner.hasNext() ) {
				WinnerType winner = iWinner.next();
				if( winner instanceof AthletType ) {
					retVal.add(class_);
				}
			}
		}
		return retVal;
	}
	String getTeamName(List<ClassType> teamClasses, WinnerType winnersrc) {
		String retVal = new String("");
		OrganizationType organization = winnersrc.getOrganization();
		Iterator<ClassType> iClass = teamClasses.iterator();
		while(iClass.hasNext() && retVal.isEmpty()) {
			ClassType class_ = iClass.next();
			EList<WinnerType> winners = class_.getWinner();
			Iterator<WinnerType> iWinner = winners.iterator();
			while( iWinner.hasNext() ) {
				WinnerType winner = iWinner.next();
				if( winner instanceof TeamType ) {
					TeamType team = (TeamType) winner;
					if( team.getOrganization() == organization ) {
						EList<AthletType> athlets = team.getAthlet();
						if( athlets.contains( winnersrc ) ) {
							retVal = team.getName();
							break;
						}
					}
				}
			}
		}
		return retVal;
	}
}
