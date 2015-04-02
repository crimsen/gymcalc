package de.gymcalc.print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringWriter;
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
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.calcprovider.ContestClassItemProviderAdapterFactory;
import de.gymcalc.print.preferences.TemplatePreferencesPage;

public class JuryFormExportWizard extends Wizard implements org.eclipse.ui.IExportWizard {
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
				String htmlExt = "html";
				String odtExt = "odt";
				String enteredExt = new Path(getFileName()).getFileExtension();
				if (enteredExt == null || (
						!enteredExt.equals(htmlExt) &&
						!enteredExt.equals(odtExt) ) ) {
					setErrorMessage(htmlExt);
					return false;
				} else {
					return true;
				}
			} else {
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
			List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
			factories.add(new ResourceItemProviderAdapterFactory());
			factories.add(new ContestClassItemProviderAdapterFactory());
			ComposedAdapterFactory adapter = new ComposedAdapterFactory(factories);
			String htmlExt = "html";
			String odtExt = "odt";
			String enteredExt = new Path(getFileName()).getFileExtension();
			if (enteredExt != null ) {
				if ( enteredExt.equals(htmlExt)) {
					CreateJuryFormHtml creator = new CreateJuryFormHtml (adapter);
					StringWriter writer = new StringWriter ();
					writer.write("<html>");
					Iterator<?> i = selection.iterator ();
					while (i.hasNext ()) {
						Object object = i.next ();
						creator.createReport (object, writer);
					}
					writer.write ("</html>");
					retVal = new StringBufferInputStream (writer.getBuffer ().toString ());
				} else if ( enteredExt.equals(odtExt)) {
					Object dataModel = JuryFormDataModel.getModel(selection.getFirstElement());
					if( null != dataModel ) {
						String templateFileName = TemplatePreferencesPage.getTemplateDir() + "/juryform.odt";
						DocumentTemplateFactory documentTemplateFactory = new DocumentTemplateFactory();
						DocumentTemplate template;
						try {
							template = documentTemplateFactory.getTemplate(new FileInputStream(templateFileName));
							String tmpFileName = TemplatePreferencesPage.getGenerationDir() + "/tmp.odt";
							template.createDocument(dataModel, new FileOutputStream(tmpFileName));
							retVal = new FileInputStream(tmpFileName);
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
					}

				}
			}

			return retVal;
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
		newFileCreationPage.setTitle( Activator.getString( "JuryFormFilePage_Title" ) );
		newFileCreationPage.setDescription( Activator.getString( "JuryFormFilePage_Description" ) );
		String defaultModelBaseExtension = ".odt";
		String defaultModelBaseFilename = "juryform";
		String modelFilename = defaultModelBaseFilename + defaultModelBaseExtension;

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			Object element = null;
			if( selection instanceof ITreeSelection ) {
				ITreeSelection treeSelection = ( ITreeSelection ) selection;
				
				TreePath[] paths = treeSelection.getPaths( );
				for( int i = 0; i < paths.length; ++i ) {
					TreePath path = paths[i];
					int segmentSize = path.getSegmentCount( ) - 1;
					for( int j = segmentSize; j >= 0; --j) {
						Object o = path.getSegment(j);
						if( o instanceof IResource) {
							element = o;
							break;
						}
					}
				}
			} else {
				Object selectedElement = selection.iterator().next();
				if (selectedElement instanceof IResource) {
					element = selectedElement;
				}
			}
			if (element instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)element;
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
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + defaultModelBaseExtension;
					}
				}
			}
		}
		newFileCreationPage.setFileName(modelFilename);
		addPage(newFileCreationPage);
	}

	static class JuryFormDataModel {
		static Object getModel( Object src ) {
			/*
			 * contest
			 * +-chain
			 *   +-name
			 *   +-station
			 *   | +-name
			 *   +-winner
			 *     +-name
			 *     +-disable
			 *     +-class
			 *     +-organization
			 *     +-team
			 */
			Map<String, Map<String, Object>> retVal = null;
			if (src instanceof ContestType) {
				ContestType contestSrc = (ContestType) src;
				retVal = new HashMap<String, Map<String, Object>>();
				Map<String, Object> contest = new HashMap<String, Object>();
				retVal.put("contest", contest);
				contest.put("name", contestSrc.getName());
				List<Map<String, Object>> chains = new ArrayList<Map<String, Object>>();
				contest.put("chain", chains);
				EList<ChainType> chainsSrc = contestSrc.getChain();
				for (Iterator<ChainType> iChain = chainsSrc.iterator( ); iChain.hasNext ();) {
					ChainType chainSrc = iChain.next ();
					Map<String, Object> chain = new HashMap<String, Object>();
					chains.add( chain );
					chain.put( "name", chainSrc.getName ());
					EList<StationType> stationsSrc = chainSrc.getStation ();
					List<Map<String, String>> stations = new ArrayList<Map<String, String>>();
					chain.put( "station", stations );
					for (Iterator<StationType> iStation = stationsSrc.iterator (); iStation.hasNext ();) {
						StationType stationSrc = iStation.next ();
						Map<String, String> station = new HashMap<String, String>();
						stations.add(station);
						station.put( "name", stationSrc.getName () );
					}
					EList<AthletType> winnersSrc = chainSrc.getAthlet ();
					List<Map<String, String>> winners = new ArrayList<Map<String, String>>();
					chain.put( "winner", winners );
					for( Iterator<AthletType> iWinner = winnersSrc.iterator (); iWinner.hasNext (); ){
						AthletType winnerSrc = iWinner.next ();
						Map<String, String> winner = new HashMap<String, String>();
						winners.add( winner );
						String disable = winnerSrc.getDisable ();
						if (null == disable) {
							disable = "";
						}
						winner.put( "disable", disable );
						String className = "";
						if (winnerSrc.eContainer() instanceof ClassType) {
							className = ((ClassType)winnerSrc.eContainer()).getName();
						}
						winner.put( "class", className );
						winner.put( "name", winnerSrc.getName () );
						String organizationName = "";
						if (null != winnerSrc.getOrganization()) {
							organizationName = winnerSrc.getOrganization().getName ();
						}
						winner.put( "organization", organizationName );
						String teamName = "";
						if (null != winnerSrc.getTeam()) {
							teamName = winnerSrc.getTeam().getName ();
						}
						winner.put( "team", teamName );
					}
				}
			}
			return retVal;
		}
	}

}
