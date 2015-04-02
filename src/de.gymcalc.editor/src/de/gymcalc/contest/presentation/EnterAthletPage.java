	package de.gymcalc.contest.presentation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.spremberg.turnen.contact.ContactType;
import de.spremberg.turnen.contact.DatabaseType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class EnterAthletPage extends WizardPage {

	
	protected EnterAthletPage(String pageName, AdapterFactory adapterFactory ) {
		super(pageName);
		this.adapterFactory = adapterFactory;
		setTitle( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterAthletPage") );
		setDescription( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterAthletPage_description") );
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite( parent, SWT.NONE );
		GridLayout layout = new GridLayout( 2, false );
		setControl( composite );

		organization = createText( composite, "organization" );
		firstname = createText( composite, "firstname" );
		name = createText( composite, "name" );
		dateOfBirth = createText( composite, "date_of_birth" );
		class_ = createText( composite, "class" );
		team = createText( composite, "team" );
		composite.setLayout( layout );

		/* the proposals */
		DatabaseType database = getDatabase( );
		if( null != database ) {
			OrganizationContentProposalProvider proposalProvider = 
				new OrganizationContentProposalProvider( database, 10 );
			organizationProposal = new ContentProposalAdapter( organization,
				new TextContentAdapter( ), proposalProvider, null, null );
			organizationProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE);
			organizationProposal.addContentProposalListener( new OrganizationProposalListener() );
			
			ContactContentProposalProvider contactNameProvider = 
				new ContactContentProposalProvider( database, 10, ContactContentProposalProvider.TYPE.name, organization );
			ContentProposalAdapter contactNameProposal = 
				new ContentProposalAdapter( this.name, new TextContentAdapter( ),
						contactNameProvider, null, null );
			contactNameProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE );
			contactNameProposal.addContentProposalListener( new ContactProposalListener() );

			ContactContentProposalProvider contactFirstnameProvider = 
				new ContactContentProposalProvider( database, 10, ContactContentProposalProvider.TYPE.firstname, organization );
			ContentProposalAdapter contactFirstnameProposal = 
				new ContentProposalAdapter( this.firstname, new TextContentAdapter( ),
						contactFirstnameProvider, null, null );
			contactFirstnameProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE );
			contactFirstnameProposal.addContentProposalListener( new ContactProposalListener() );

			ContactContentProposalProvider contactDateOfBirthProvider = 
				new ContactContentProposalProvider( database, 10, ContactContentProposalProvider.TYPE.dateOfBirth, organization );
			ContentProposalAdapter contactDateOfBirthProposal = 
				new ContentProposalAdapter( this.dateOfBirth, new TextContentAdapter( ),
						contactDateOfBirthProvider, null, null );
			contactDateOfBirthProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE );
			contactDateOfBirthProposal.addContentProposalListener( new ContactProposalListener() );

			String[] classes = getClasses( );
			SimpleContentProposalProvider classProvider = 
				new SimpleContentProposalProvider( classes );
			classProvider.setFiltering( true );
			ContentProposalAdapter classProposal = 
				new ContentProposalAdapter( this.class_, new TextContentAdapter( ),
						classProvider, null, null );
			classProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE );

			String[] teames = getTeames( );
			SimpleContentProposalProvider teamProvider = 
				new SimpleContentProposalProvider( teames );
			teamProvider.setFiltering( true );
			ContentProposalAdapter teamProposal = 
				new ContentProposalAdapter( this.team, new TextContentAdapter( ),
						teamProvider, null, null );
			teamProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE );
		}
		refresh();
	}

	public String getFirstname( )
	{
		return firstname.getText( );
	}
	public String getName( )
	{
		return name.getText( );
	}
	public Date getDateOfBirth( )
	{
		return getDate( dateOfBirth.getText( ) );
	}
	public String getOrganization( )
	{
		return organization.getText( );
	}
	public String getClass_() {
		return class_.getText( );
	}
	public String getTeam() {
		return team.getText( );
	}

	public void setDatabase(DatabaseType database) {
		this.database = database;
	}

	public DatabaseType getDatabase() {
		return database;
	}

	public void setContest( ContestType contest ) {
		this.contest = contest;
	}
	
	public ContestType getContest( ) {
		return this.contest;
	}
	
	public void refresh() {
		refreshText(firstname, "firstname");
		refreshText(name, "name");
		refreshText(organization, "organization");
		refreshText(class_, "class");
		refreshText(team, "team");
		refreshDate(dateOfBirth, "date_of_birth");
	}
	
	public void refreshText(Text text, String key) {
		IDialogSettings settings = getDialogSettings();
		String val = settings.get( key );
		if( null != val ) { 
			// do not update field if text is identical
			// this might popup content proposal again
			String oldText = text.getText();
			if( 0 != oldText.compareTo( val ) ) {
				text.setText( val );
			}
		}
	}

	public void refreshDate(Text text, String key) {
		IDialogSettings settings = getDialogSettings();
		String val = settings.get( key );
		if( val != null ) {
			Date date = getDate( val );
			if( null == date ) {
				val = "0001-01-01";
			}
		} else {
			val = "0001-01-01";
		}
		text.setText( val );
	}

	protected Date getDate( String sDate )
	{
		Date retVal = null;
		try {
			retVal = DateFormat.getDateInstance().parse( sDate );
		} catch ( ParseException e ) {
			SimpleDateFormat simpleDate = new SimpleDateFormat( "yyyy-MM-dd" );
			try {
				retVal = simpleDate.parse( sDate );
			} catch ( ParseException e1 ) {
				System.err.print( sDate + " can not be converted to an date" );
			}
		}
		return retVal;
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
	
	protected Text createText( Composite composite, String name  )
	{
		Text retVal = null;
		String uiName = ContestEditorPlugin.INSTANCE.getString( name );
		new Label( composite, SWT.NONE ).setText( uiName );
		retVal = new Text( composite, SWT.NONE );
		retVal.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
		return retVal;
	}
	
	protected String[] getClasses( )
	{
		ArrayList<String> retVal = new ArrayList<String>();
		if( null != this.contest ) {
			EList< ClassType > classes = this.contest.getClass_();
			Iterator< ClassType > iClasses = classes.iterator();
			while( iClasses.hasNext( ) ) {
				ClassType class_ = iClasses.next();
				EList< WinnerType > winners = class_.getWinner();
				if( 0 == winners.size() ||
					winners.get( 0 ) instanceof AthletType ) {
					String className = class_.getName();
					if( null == className ) {
						className = "";
					}
					retVal.add( className );
				}
			}
		}
		return retVal.toArray( new String[0] );
	}
	
	protected String[] getTeames( )
	{
		ArrayList<String> retVal = new ArrayList<String>();
		if( null != this.contest ) {
			EList< ClassType > classes = this.contest.getClass_();
			Iterator< ClassType > iClasses = classes.iterator();
			while( iClasses.hasNext( ) ) {
				ClassType class_ = iClasses.next();
				EList< WinnerType > winners = class_.getWinner();
				Iterator< WinnerType > iWinner = winners.iterator();
				while( iWinner.hasNext() ) {
					WinnerType w = iWinner.next();
					if( w instanceof TeamType ) {
						retVal.add( w.getName() );
					}
				}
			}
		}
		return retVal.toArray( new String[0] );
	}
	
	protected class ContactProposalListener implements IContentProposalListener
	{

		public void proposalAccepted(IContentProposal proposal) {
			if( proposal instanceof ContactProposal ) {
				ContactType c = ( ( ContactProposal ) proposal ).getContact( ); 
				IDialogSettings settings = getDialogSettings();
				settings.put( "name", c.getName( ) );
				settings.put( "firstname", c.getFirstname() );
				Date d = c.getDate_of_birth();
				if( null != d ) {
					settings.put( "date_of_birth", d.toString() );
				}
				refresh();
			}
			
		}
		
	}

	protected class OrganizationProposalListener implements IContentProposalListener
	{

		public void proposalAccepted(IContentProposal proposal) {
			IDialogSettings settings = getDialogSettings();
			settings.put( "organization", proposal.getContent() );
			refresh();
		}
		
	}

	private AdapterFactory adapterFactory;
	private AdapterFactoryLabelProvider adapterFactoryLabelProvider;
	
	private DatabaseType database;
	private ContestType contest;
	private Text firstname;
	private Text name;
	private Text dateOfBirth;
	private Text organization;
	private Text class_;
	private Text team;
	
	private ContentProposalAdapter organizationProposal;
}
