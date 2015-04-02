package de.gymcalc.contest.presentation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.WinnerType;
import de.spremberg.turnen.contact.ContactFactory;
import de.spremberg.turnen.contact.ContactPackage;
import de.spremberg.turnen.contact.ContactType;
import de.spremberg.turnen.contact.DatabaseType;

public class ExportContactsDialog extends Dialog {


	public ExportContactsDialog( Shell shell, EditingDomain editingDomain ) {
		super( shell );
		this.m_editingDomain = editingDomain;
		ResourceSet rs = editingDomain.getResourceSet();
		String contactUri = PreferencesPage.getContactUri();
		Resource r = rs.getResource(URI.createURI( contactUri ), true );
		EList<EObject> ol = r.getContents();
		if( 0 < ol.size() ) {
			EObject o = ol.get( 0 );
			if( o instanceof DatabaseType ) {
				m_database =  (DatabaseType) o;
			}
		}
		setContest( (ContestType) rs.getResources().get( 0 ).getContents().get( 0 ) );
	}
	
	public void setContest( ContestType contest ) {
		m_contest = contest;
		updateContactList( );
	}
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite retVal = (Composite) super.createDialogArea(parent);
		Layout topLayout = new GridLayout( 2, true );
		new Label( retVal, SWT.NONE ).setText( "Auto Skip");
		this.m_autoSkip = new Button(retVal, SWT.CHECK );
		this.m_autoSkip.setSelection( true );
		new Label( retVal, SWT.NONE ).setText( "Auto Add");
		this.m_autoAdd = new Button(retVal, SWT.CHECK );
		this.m_autoAdd.setSelection( true );
		new Label( retVal, SWT.NONE ).setText( "Kontakt" );
		new Label( retVal, SWT.NONE ).setText( "Vorschläge" );
		Composite leftComposite = new Composite( retVal, SWT.NONE );
		this.m_type = new Text( leftComposite, SWT.READ_ONLY );
		this.m_type.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
		this.m_name = new Text( leftComposite, SWT.READ_ONLY );
		this.m_name.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
		this.m_dateOfBirth = new Text( leftComposite, SWT.READ_ONLY );
		this.m_dateOfBirth.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
		this.m_organization = new Text( leftComposite, SWT.READ_ONLY );
		this.m_organization.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
		Layout leftLayout = new GridLayout( );
		leftComposite.setLayoutData( new GridData( GridData.FILL_BOTH ) );
		leftComposite.setLayout( leftLayout );
		
		m_proposals = new TableViewer( new Table( retVal, SWT.NONE) );
		GridData gd = new GridData( GridData.FILL_BOTH );
		m_proposals.getTable().setLayoutData(gd);
		retVal.setLayout( topLayout );
		m_proposals.setContentProvider( new IStructuredContentProvider(){
			@Override
			public void dispose() {
			}
			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}
			@Override
			public Object[] getElements(Object inputElement) {
				return m_proposalList.toArray();
			}
		});
		m_proposals.setLabelProvider( new LabelProvider() {
			@Override
			public String getText(Object element) {
				String retVal = null;
				if( element instanceof ContactType ) {
					ContactType contact = ( ContactType ) element;
					retVal = contact.getName();
					if( null != contact.getFirstname( ) ) {
						retVal += ", " + contact.getFirstname();
					}
					if( null != contact.getDate_of_birth() ) {
						SimpleDateFormat sd = new SimpleDateFormat( "yyyy-MM-dd" );
						String dateOfBirth = sd.format( contact.getDate_of_birth() );
						retVal += "; " + dateOfBirth;
					}
				} else {
					retVal = super.getText(element); 
				}
				return retVal;
			}
		});
		m_proposals.setInput( m_proposalList );
		return retVal;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		this.m_add = this.createButton(parent, 0 + IDialogConstants.CLIENT_ID, "Hinzufügen", false);
		this.m_add.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleAddButton();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		this.m_commit = this.createButton(parent, 0 + IDialogConstants.CLIENT_ID, "Ersetzen", false);
		this.m_commit.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleCommitButton();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		this.m_skip = this.createButton(parent, 0 + IDialogConstants.CLIENT_ID, "Nächster", false);
		this.m_skip.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleSkipButton();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		super.createButtonsForButtonBar(parent);
		updateProposalAndView();
	}
	private enum UPDATEPROPOSAL {
		exactMatch,
		noMatch,
		conflictMatch
	};
	
	private void handleAddButton(){
		addCurrent();
		updateProposalAndView();
	}
	private void handleCommitButton(){
		PersonType person = getCurrentPerson( );
		ContactType selectedContact = null;
		if( !m_proposals.getSelection().isEmpty() ) {
			if( m_proposals.getSelection() instanceof IStructuredSelection ){
				IStructuredSelection selection = ( IStructuredSelection ) m_proposals.getSelection();
				if( selection.getFirstElement() instanceof ContactType ) {
					CompoundCommand cmd = new CompoundCommand( );
					selectedContact = ( ContactType ) selection.getFirstElement();
					if( !handleReadOnly( selectedContact ) ) {
						cmd.append( SetCommand.create( m_editingDomain, selectedContact, 
								ContactPackage.Literals.CONTACT_TYPE__NAME, person.getName() ) );
						cmd.append( SetCommand.create( m_editingDomain, selectedContact,
								ContactPackage.Literals.CONTACT_TYPE__FIRSTNAME, person.getFirstname( ) ) );
						cmd.append( SetCommand.create( m_editingDomain, selectedContact,
								ContactPackage.Literals.CONTACT_TYPE__DATE_OF_BIRTH, person.getDateofbirth() ) );
						m_editingDomain.getCommandStack().execute( cmd );
						OrganizationType organization = getCurrentOrganization();
						if( null != organization ) {
							addOrganizationToContact( selectedContact, organization );
						}
					}
				}
			}
		}
		updateProposalAndView();
	}
	private void handleSkipButton(){
		while( m_contactIdx < m_contactList.size() ) {
			m_contactIdx++;
			UPDATEPROPOSAL res = updateProposalList();
			if( m_contactIdx == m_contactList.size( ) ) {
				break;
			}
			if( UPDATEPROPOSAL.conflictMatch == res ) {
				break;
			} else if( UPDATEPROPOSAL.noMatch == res ) {
				if( true == m_autoAdd.getSelection() ) {
					addCurrent();
					if( false == m_autoSkip.getSelection() ) {
						break;
					}
				} else {
					break;
				}
			} else if( UPDATEPROPOSAL.exactMatch == res && false == m_autoSkip.getSelection() ) {
				break;
			}
		}
		updateView();
	}
	private void addCurrent() {
		if( !handleReadOnly( m_database ) ) {
			PersonType person = getCurrentPerson( );
			ContactType contact = ContactFactory.eINSTANCE.createContactType();
			contact.setName( person.getName( ) );
			contact.setFirstname( person.getFirstname( ) );
			contact.setDate_of_birth( person.getDateofbirth( ) );
			m_editingDomain.getCommandStack().execute( 
					AddCommand.create( m_editingDomain, m_database, 
							ContactPackage.Literals.DATABASE_TYPE__CONTACTS, contact ) );
			OrganizationType organization = getCurrentOrganization();
			if( null != organization ) {
				addOrganizationToContact( contact, organization );
			}
		}
	}
	private void addOrganizationToContact( ContactType contact, OrganizationType organization ) {
		EList<de.spremberg.turnen.contact.OrganizationType> matchingOrganization = 
				m_database.queryOrganizations( organization.getName(), 10 );
		de.spremberg.turnen.contact.OrganizationType selectedOrganization = null;
		for( de.spremberg.turnen.contact.OrganizationType o : matchingOrganization ) {
			if( 0 == o.getName().compareTo( organization.getName( ) ) ) {
				selectedOrganization = o;
				break;
			}
		}
		if( null != selectedOrganization ){
			EList<de.spremberg.turnen.contact.OrganizationType> organizations = null;
			if( null != contact.getId_contact() ) {
				organizations = contact.getOrganizations();
			}
			if( null == organizations || !organizations.contains( selectedOrganization ) ) {
				m_editingDomain.getCommandStack().execute( 
						AddCommand.create( m_editingDomain, contact, 
								ContactPackage.Literals.CONTACT_TYPE__ORGANIZATIONS,
								selectedOrganization ) );
			}
		}
	}
	private void updateContactList() {
		m_contactList.clear();
		for( ClassType class_ : m_contest.getClass_() ) {
			for( WinnerType winner : class_.getWinner( ) ) {
				if( winner instanceof AthletType ) {
					m_contactList.add( winner );
				}
			}
		}
		for( JuriType jury : m_contest.getJuri( ) ) {
			m_contactList.addAll( jury.getJurist( ) );
		}
		m_contactIdx = 0;
	}
	private UPDATEPROPOSAL updateProposalList( ) {
		UPDATEPROPOSAL retVal = UPDATEPROPOSAL.noMatch;
		m_proposalList.clear();
		PersonType person = getCurrentPerson( );
		if( null != person ) {
			String name = person.getName();
			String firstname = person.getFirstname();
			Date dateOfBirth = person.getDateofbirth();
			SimpleDateFormat sd = new SimpleDateFormat( "yyyy-MM-dd" );
			String date = sd.format( dateOfBirth );
			// first try to find an exact match
			EList< ContactType> res = m_database.queryContactsOfOrganization( null, name, firstname, date, 3 );
			m_proposalList.addAll( res );
			// second do a name only match
			res = m_database.queryContactsOfOrganization( null, name, firstname, null, 3 );
			for( ContactType contact : res ) {
				if( !m_proposalList.contains(contact) ) {
					m_proposalList.add( contact );
				}
			}
			// third do a date of birth match
			res = m_database.queryContactsOfOrganization( null, null, null, date, 3 );
			for( ContactType contact : res ) {
				if( !m_proposalList.contains(contact) ) {
					m_proposalList.add( contact );
				}
			}
			if( 0 < m_proposalList.size( ) ) {
				retVal = UPDATEPROPOSAL.conflictMatch;
				for( ContactType c : m_proposalList ) {
					if( 0 == name.compareTo( c.getName( ) ) &&
						0 == firstname.compareTo( c.getFirstname() ) &&
						null != c.getDate_of_birth( ) &&
						0 == dateOfBirth.compareTo( c.getDate_of_birth( ) ) ) {
						retVal = UPDATEPROPOSAL.exactMatch;
						break;
					}
				}
			}
		}
		return retVal;
	}
	private void updateProposalAndView() {
		updateProposalList();
		updateView();
	}
	private void updateView( ) {
		if( m_contactIdx < m_contactList.size( ) ) {
			Object contact = m_contactList.get( m_contactIdx );
			PersonType person = null;
			OrganizationType organization = null;
			if( contact instanceof AthletType ) {
				AthletType athlet = ( AthletType ) contact;
				person = athlet.getPerson();
				organization = athlet.getOrganization();
				m_type.setText( "Athlet" );
			} else if( contact instanceof JuristType ) {
				JuristType jurist = ( JuristType ) contact;
				person = jurist.getPerson();
				organization = jurist.getOrganization();
				m_type.setText( "Kampfrichter" );
			}
			m_name.setText( person.getName() + ", " + person.getFirstname( ) );
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			m_dateOfBirth.setText( sd.format( person.getDateofbirth() ) );
			if( null != organization &&
				null != organization.getName() ) {
				m_organization.setText( organization.getName( ) );
			} else {
				m_organization.setText( "" );
			}
			m_add.setEnabled( true );
			m_skip.setEnabled( true );
		} else {
			m_type.setText("");
			m_name.setText("");
			m_dateOfBirth.setText( "" );
			m_organization.setText( "" );
			m_add.setEnabled( false );
			m_skip.setEnabled( false );
		}
		m_proposals.refresh();
		if( 0 < m_proposalList.size() ) {
			m_proposals.setSelection( new StructuredSelection( m_proposalList.get( 0 ) ) );
			m_commit.setEnabled( true );
		} else {
			m_commit.setEnabled( false );
		}
	}
	private PersonType getCurrentPerson( ) {
		PersonType retVal = null;
		if( m_contactIdx < m_contactList.size( ) ) {
			Object contact = m_contactList.get( m_contactIdx );
			if( contact instanceof AthletType ) {
				AthletType athlet = ( AthletType ) contact;
				retVal = athlet.getPerson();
			} else if( contact instanceof JuristType ) {
				JuristType jurist = ( JuristType ) contact;
				retVal = jurist.getPerson();
			}
		}
		return retVal;
	}
	private OrganizationType getCurrentOrganization( ) {
		OrganizationType retVal = null;
		if( m_contactIdx < m_contactList.size( ) ) {
			Object contact = m_contactList.get( m_contactIdx );
			if( contact instanceof AthletType ) {
				AthletType athlet = ( AthletType ) contact;
				retVal = athlet.getOrganization();
			} else if( contact instanceof JuristType ) {
				JuristType jurist = ( JuristType ) contact;
				retVal = jurist.getOrganization();
			}
		}
		return retVal;
	}
	private boolean handleReadOnly( EObject o ) {
		boolean retVal = false;
		retVal = m_editingDomain.isReadOnly( o.eResource( ) );
		if( retVal ) {
			ErrorDialog.openError(this.getShell(), "Error", "can not modify the resource", new Status(Status.ERROR, "error", 1, "the resource is read only.", null) );
		}
		return retVal;
	}
	private EditingDomain m_editingDomain;
	private Text m_type;
	private Text m_name;
	private Text m_dateOfBirth;
	private Text m_organization;
	private TableViewer m_proposals;
	private Button m_add;
	private Button m_commit;
	private Button m_skip;
	private Button m_autoSkip;
	private Button m_autoAdd;
	private ContestType m_contest;
	private DatabaseType m_database;
	private int m_contactIdx;
	private ArrayList< Object > m_contactList = new ArrayList< Object >();
	private ArrayList< ContactType > m_proposalList = new ArrayList <ContactType>( );
}
