package de.gymcalc.contest.presentation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.spremberg.turnen.contact.DatabaseType;
import de.gymcalc.contest.ContestType;

public class EnterOrganizationPage extends WizardPage {

	
	protected EnterOrganizationPage(String pageName, AdapterFactory adapterFactory ) {
		super(pageName);
		this.adapterFactory = adapterFactory;
		setTitle( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterOrganizationPage") );
		setDescription( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterOrganizationPage_description") );
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite( parent, SWT.NONE );
		GridLayout layout = new GridLayout( 2, false );
		setControl( composite );

		organization = createText( composite, "organization" );
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
			
		}
		refresh();
	}

	public String getOrganization( )
	{
		return organization.getText( );
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
		refreshText(organization, "organization");
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
	private Text organization;
	
	private ContentProposalAdapter organizationProposal;
}
