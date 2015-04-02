package de.gymcalc.contest.presentation;

import java.util.ArrayList;
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
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;

public class EnterJuristPage extends WizardPage {

	
	protected EnterJuristPage(String pageName, AdapterFactory adapterFactory ) {
		super(pageName);
		this.adapterFactory = adapterFactory;
		setTitle( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterJuristPage") );
		setDescription( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterJuristPage_description") );
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite( parent, SWT.NONE );
		GridLayout layout = new GridLayout( 2, false );
		setControl( composite );

		organization = createText( composite, "organization" );
		firstname = createText( composite, "firstname" );
		name = createText( composite, "name" );
		juri = createText( composite, "juri" );
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

			String[] juris = getJuris( );
			SimpleContentProposalProvider juriProvider = 
				new SimpleContentProposalProvider( juris );
			juriProvider.setFiltering( true );
			ContentProposalAdapter juriProposal = 
				new ContentProposalAdapter( this.juri, new TextContentAdapter( ),
						juriProvider, null, null );
			juriProposal.setProposalAcceptanceStyle( ContentProposalAdapter.PROPOSAL_REPLACE );

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
	public String getOrganization( )
	{
		return organization.getText( );
	}
	public String getJuri() {
		return juri.getText( );
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
		refreshText(juri, "juri");
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
	
	protected String[] getJuris( )
	{
		ArrayList<String> retVal = new ArrayList<String>();
		if( null != this.contest ) {
			EList< JuriType > juris = this.contest.getJuri();
			Iterator< JuriType > iJuris = juris.iterator();
			while( iJuris.hasNext( ) ) {
				JuriType juri = iJuris.next();
				retVal.add( juri.getName() );
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
	private Text organization;
	private Text juri;
	
	private ContentProposalAdapter organizationProposal;
}
