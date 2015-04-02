package de.gymcalc.print;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringWriter;
import java.text.DateFormat;
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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;
import de.gymcalc.contest.calcprovider.ContestClassItemProviderAdapterFactory;
import de.gymcalc.print.preferences.TemplatePreferencesPage;

public class ModelExportWizard extends Wizard implements org.eclipse.ui.IExportWizard {

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
			boolean retVal = super.validatePage();
			if( retVal ) {
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
				}
			}
			return retVal;
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
					CreateJuryTableFormHtml creator = new CreateJuryTableFormHtml (adapter);
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
					Object dataModel = getModel(selection.getFirstElement(), adapter, dialogOptions );
					if( null != dataModel ) {
						String templateFileName = TemplatePreferencesPage.getTemplateDir() + "/" + getDefaultFilename( ) + "." + odtExt;
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
	
	public class ParameterPage extends WizardPage implements Listener  {

		// useEmptyWinnerClasses:Boolean
		// firstNameFirst:Boolean		
		Button fillRankAndPoints;
		Button useOrganization;
		Button provideAdditionalRows;
		Button useEmptyWinnerClasses;
		Button firstNameFirst;
		Text additionalWinnerPerClass;
		Text maximumRank;
		Text additionalWinner;
		Text templateName;
		
		public ParameterPage(String pageName) {
			super(pageName);
		}

		public void createControl(Composite parent) {
	        initializeDialogUnits(parent);
	        Composite topLevel = new Composite(parent, SWT.NONE);
	        topLevel.setLayout(new GridLayout());
	        topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
	                | GridData.HORIZONTAL_ALIGN_FILL));
/*
 * 	        fillRankAndPoints = new Button(topLevel, SWT.CHECK);
 	        fillRankAndPoints.setText( Activator.getString( "fillRankAndPoints" ) );
	        fillRankAndPoints.setSelection(true);
	        useOrganization = new Button(topLevel, SWT.CHECK);
	        useOrganization.setText( Activator.getString( "useOrganization" ) );
	        useOrganization.setSelection(true);
	        this.provideAdditionalRows = new Button(topLevel, SWT.CHECK);
	        this.provideAdditionalRows.setText( Activator.getString( "provideAdditionalRows" ) );
	        this.provideAdditionalRows.setSelection(false);
*/
	        this.useEmptyWinnerClasses = new Button(topLevel, SWT.CHECK);
	        this.useEmptyWinnerClasses.setText( Activator.getString( "useEmptyWinnerClasses" ) );
	        this.useEmptyWinnerClasses.setSelection(false);
	        this.firstNameFirst = new Button(topLevel, SWT.CHECK);
	        this.firstNameFirst.setText( Activator.getString( "firstNameFirst" ) );
	        this.firstNameFirst.setSelection(false);

	        Composite textLevel = new Composite(topLevel, SWT.NONE);
	        textLevel.setLayout( new GridLayout( 2, false) );
	        textLevel.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
	        
	        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "additionalWinner" ) );
	        this.additionalWinner = new Text( textLevel, SWT.SINGLE );
	        this.additionalWinner.setText( "0" );
	        this.additionalWinner.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
	        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "additionalWinnerPerClass" ) );
	        this.additionalWinnerPerClass = new Text( textLevel, SWT.SINGLE );
	        this.additionalWinnerPerClass.setText( "0" );
	        this.additionalWinnerPerClass.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
	        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "maximumRank" ) );
	        this.maximumRank = new Text( textLevel, SWT.SINGLE );
	        this.maximumRank.setText( "-1" );
	        this.maximumRank.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
	        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "templateName" ) );
	        this.templateName = new Text( textLevel, SWT.SINGLE );
	        this.templateName.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

	        this.templateName.addListener(SWT.Modify, this);

	        setControl (topLevel);
	        updatePage( dialogOptions );
		}

		/**
		 * The <code>WizardNewFileCreationPage</code> implementation of this
		 * <code>Listener</code> method handles all events and enablements for
		 * controls on this page. Subclasses may extend.
		 */
		public void handleEvent(Event event) {
			setPageComplete(validatePage());
		}

		public boolean validatePage() {
			boolean retVal = true;
			String odtExt = "odt";
			String templateFileName = TemplatePreferencesPage.getTemplateDir() + "/" + this.templateName.getText() + "." + odtExt;
			File f = new File( templateFileName );
			if( !f.exists() ) {
				String errorMsg = "The template file \"" + templateFileName + "\" does not exist.";
				setErrorMessage( errorMsg );
				retVal = false;
			} else {
				setErrorMessage( null );
			}
			return retVal;
		}

		boolean updateOptions( DialogSettings options )
		{
			boolean retVal = true;
			options.put( "useEmptyWinnerClasses", this.useEmptyWinnerClasses.getSelection() );
			options.put( "firstNameFirst", this.firstNameFirst.getSelection() );
			options.put( "additionalWinner", Integer.valueOf( this.additionalWinner.getText( ) ).intValue() );
			options.put( "additionalWinnerPerClass", Integer.valueOf( this.additionalWinnerPerClass.getText( ) ).intValue() );
			options.put( "maximumRank", Integer.valueOf( this.maximumRank.getText( ) ).intValue() );
			options.put( "templateName", this.templateName.getText() );
			return retVal;
		}
		void updatePage( DialogSettings options )
		{
			this.useEmptyWinnerClasses.setSelection( options.getBoolean( "useEmptyWinnerClasses" ) );
			this.firstNameFirst.setSelection( options.getBoolean( "firstNameFirst" ) );
			this.additionalWinner.setText( Integer.toString( options.getInt( "additionalWinner" ) ) );
			this.additionalWinnerPerClass.setText( Integer.toString( options.getInt( "additionalWinnerPerClass" ) ) );
			this.maximumRank.setText( Integer.toString( options.getInt( "maximumRank" ) ) );
			this.templateName.setText( options.get( "templateName") );
		}
		
	}

	ExportWizardNewFileCreationPage newFileCreationPage;
	protected ParameterPage parameterPage;

	@Override
	public boolean performFinish() {
		this.parameterPage.updateOptions( this.dialogOptions );
		newFileCreationPage.createNewFile ();
        return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        this.selection = currentSelection;

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

		dialogOptions.put( "useEmptyWinnerClasses", false );
		dialogOptions.put( "firstNameFirst", false );
		dialogOptions.put( "additionalWinner", 0 );
		dialogOptions.put( "additionalWinnerPerClass", 0 );
		dialogOptions.put( "maximumRank", -1 );
		dialogOptions.put( "templateName", "" );
	}

	public void addPages() {
		this.parameterPage = new ParameterPage( "Whatever" );
		this.parameterPage.setTitle( Activator.getString( "ParameterPage_Title" ) );
		this.parameterPage.setDescription( Activator.getString( "ParameterPage_Description" ) );
		addPage( this.parameterPage );
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ExportWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle( Activator.getString( "FilePage_Title" ) );
		newFileCreationPage.setDescription( Activator.getString( "FilePage_Description" ) );
		String defaultModelBaseExtension = ".odt";
		String defaultModelBaseFilename = getDefaultFilename( );
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
		newFileCreationPage.setFileName( modelFilename );
		addPage( newFileCreationPage );
	}

	Object getModel( Object src, AdapterFactory factory, DialogSettings options )
	{
		return DataModel.getModel( src, factory, options );
	}
	
	String getDefaultFilename( )
	{
		return this.dialogOptions.get( "templateName" );
	}
	static class DataModel {
		static Object getModel( Object src, AdapterFactory factory,
				DialogSettings options ) {
//					boolean fillRankAndPoints, boolean useOrganization, boolean useFrame, boolean provideAdditionalRows ) {
			/*
			 * taken from calcreportexportwizard
			 * might also be juryformexportwizard
			 * contest
			 * +-class? useEmptyWinnerClasses
			 *   +-name
			 *   +-diszipline[]
			 *   +-winner? .Result.Rank <= maximumRank ? additionalWinner[PerClass]
			 *     +-name ?firstNameFirst : (AthletType)winner.person.{first,}name : winner.name
			 *     +-disable
			 *     +-class
			 *     +-team
			 *     +-organization? useOrganization
			 *     +-rank? fillRankAndPoints
			 *     +-points? fillRankAndPoints
			 *     +-diszipline[]? fillRankAndPoints
			 * +-jury[]
			 *   +-name
			 *   +-jurist[]
			 *     +-name
			 *     +-organization? useOrganization
			 *     
			 */
			Map<String, Map<String, Object>> retVal = null;
			if (src instanceof ContestType) {
				int additionalRows = options.getInt( "additionalWinnerPerClass" );
				int maxRank = options.getInt( "maximumRank" );
				ContestType contestSrc = (ContestType) src;
				retVal = new HashMap<String, Map<String, Object>>();
				Map<String, Object> contest = new HashMap<String, Object>();
				retVal.put("contest", contest);
				contest.put("name", contestSrc.getName());
				String sdate = getDate( contestSrc.getDate() );
				contest.put("date", sdate );
				List<Map<String, Object>> classes = new ArrayList<Map<String, Object>>();
				contest.put("class", classes);
				List<ClassType> teamClasses = getTeamClasses( contestSrc );
				List<ClassType> classesSrc = getAthletClasses( contestSrc );
				classesSrc.addAll( teamClasses );
				
				for (Iterator<ClassType> iClass = classesSrc.iterator( ); iClass.hasNext ();) {
					ClassType classSrc = iClass.next ();
					EList<WinnerType> winnersSrc = classSrc.getWinner ();
					if( options.getBoolean( "useEmptyWinnerClasses" ) ||
							0 != winnersSrc.size( ) ) {
						Map<String, Object> class_ = new HashMap<String, Object>();
						classes.add( class_ );
						String name = classSrc.getName ();
						if( null == name ) {
							name = "";
						}
						class_.put( "name", name );
						List<Object> disziplines = new ArrayList<Object>( );
						class_.put( "diszipline", disziplines );
						Object content = factory.adapt (classSrc, ITreeItemContentProvider.class);
						int maxColumn = 0;
						if (content instanceof ITableItemLabelProvider) {
							ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) content;
							for (int column = 4; ; ++column) {
								String label = labelProvider.getColumnText (classSrc, column);
								if (0 == label.length ()) {
									maxColumn = column;
									break;
								}
								disziplines.add(label);
							}
						}					
						List<Object> winners = new ArrayList<Object>();
						class_.put( "winner", winners );
						for( Iterator<WinnerType> iWinner = winnersSrc.iterator (); iWinner.hasNext (); ){
							WinnerType winnerSrc = iWinner.next ();
							if( 0 <= maxRank && null != winnerSrc.getResult() ) {
								// for diplomas only the first maxWinners have to be printed.
								// maxWinner < 0 is invalid
								int rank = winnerSrc.getResult().getRank();
								if( rank > maxRank ) {
									break;
								}
							}
							Map<String, Object> winner = new HashMap<String, Object>();
							winners.add( winner );
							String disable = winnerSrc.getDisable ();
							if (null == disable) {
								disable = "";
							}
							winner.put( "disable", disable );
							String winnerName = "";
							if( options.getBoolean( "firstNameFirst" ) && 
									winnerSrc instanceof AthletType ) {
								winnerName = ( ( AthletType )winnerSrc ).getPerson().getFirstname() + " " + ( ( AthletType )winnerSrc ).getPerson().getName(); 
							} else {
								winnerName = winnerSrc.getName ();
							}
							winner.put( "name", winnerName );
							if( winnerSrc instanceof AthletType ) {
								winner.put( "date_of_birth", getDate( ( ( AthletType )winnerSrc ).getPerson().getDateofbirth() ) );
							} else {
								winner.put( "date_of_birth", "" );
							}
							String organizationName = "";
							if ( null != winnerSrc.getOrganization()) {
								organizationName = winnerSrc.getOrganization().getName ();
							}
							winner.put( "organization", organizationName );
							winner.put( "team", getTeamName( teamClasses, winnerSrc ) );
							if( null == winnerSrc.getResult() ) {
								winner.put( "rank", "");
								winner.put("points", "" );
								List<String> winnerDiszipline = new ArrayList<String>();
								winner.put("diszipline", winnerDiszipline);
							} else {
								Object elementAdapter = factory.adapt(winnerSrc, ITableItemLabelProvider.class);
								if (elementAdapter instanceof ITableItemLabelProvider) {
									ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) elementAdapter;
									winner.put( "rank", labelProvider.getColumnText(winnerSrc, 2) );
									winner.put( "points", labelProvider.getColumnText(winnerSrc, 3) );
									List<String> winnerDiszipline = new ArrayList<String>();
									winner.put("diszipline", winnerDiszipline);
									for (int column = 4; maxColumn > column; ++column) {
										String label = labelProvider.getColumnText( winnerSrc, column );
										winnerDiszipline.add( label );
									}
								}
							}
						}
						for( int i = 0; additionalRows > i; ++i ){
							Map<String, Object> winner = new HashMap<String, Object>();
							winners.add( winner );
							winner.put( "disable", false );
							winner.put( "name", "" );
							winner.put( "organization", "" );
							winner.put( "rank", "");
							winner.put("points", "" );
							List<String> winnerDiszipline = new ArrayList<String>();
							winner.put("diszipline", winnerDiszipline);
						}
					}
				}
				List<Map<String, Object>> jurys = new ArrayList<Map<String, Object>>();
				contest.put("jury", jurys);
				EList<JuriType> jurysSrc = contestSrc.getJuri();
				for (Iterator<JuriType> iJury = jurysSrc.iterator( ); iJury.hasNext ();) {
					JuriType jurySrc = iJury.next ();
					EList<JuristType> juristsSrc = jurySrc.getJurist ();
					if( 0 != juristsSrc.size( ) ) {
						Map<String, Object> jury = new HashMap<String, Object>();
						jurys.add( jury );
						String name = jurySrc.getName ();
						if( null == name ) {
							name = "";
						}
						jury.put( "name", name );
/*
 * 						List disziplines = new ArrayList( );
 
						jury.put( "diszipline", disziplines );
*/						List<Object> jurists = new ArrayList<Object>();
						jury.put( "jurist", jurists );
						for( Iterator<JuristType> iJurist = juristsSrc.iterator (); iJurist.hasNext (); ){
							JuristType juristSrc = iJurist.next ();
							Map<String, Object> jurist = new HashMap<String, Object>();
							jurists.add( jurist );
							String juristName = juristSrc.getName ();
							jurist.put( "name", juristName );
							String organizationName = "";
							if ( null != juristSrc.getOrganization()) {
								organizationName = juristSrc.getOrganization().getName ();
							}
							jurist.put( "organization", organizationName );
							jurist.put( "jury", name );
						}
					}
				}
			}
			return retVal;
		}
	}
	static List<ClassType> getTeamClasses(ContestType contest) {
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
	static List<ClassType> getAthletClasses(ContestType contest) {
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
	static String getTeamName(List<ClassType> teamClasses, WinnerType winnersrc) {
		String retVal = new String("");
		if( winnersrc instanceof AthletType && 
				null != ( ( AthletType ) winnersrc ).getTeam( ) ) {
			String res = ( ( AthletType )winnersrc ).getTeam( ).getName();
			if( null != res ) {
				retVal = res;
			}
		}
		return retVal;
	}

	static String getDate( Object odate ) {
		String retVal = "";
		if( odate instanceof String ) {
			retVal = ( String ) odate;
		} else if( odate instanceof Date ) {
			DateFormat f = DateFormat.getDateInstance();
			retVal = f.format( (Date) odate );
		} else if( null != odate ) {
			retVal = odate.toString();
		}
		return retVal;
	}

	protected DialogSettings dialogOptions = new DialogSettings( "" );
    private IStructuredSelection selection;

}
