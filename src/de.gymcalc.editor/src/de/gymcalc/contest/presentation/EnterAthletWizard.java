/**
 * 
 */
package de.gymcalc.contest.presentation;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.spremberg.turnen.contact.DatabaseType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.command.EnterAthletCommandParam;

/**
 * @author thomas
 *
 */
public class EnterAthletWizard extends Wizard {


	public EnterAthletWizard( EditingDomain editingDomain, Collection<?> collection ) {
		super();
		setDialogSettings( new DialogSettings( "athlet" ) );
		this.editingDomain = editingDomain; // used to create adapters
		this.collection = collection;
		refreshSettings();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		this.enterAthletPage = new EnterAthletPage( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterAthletWizard"), adapterFactory );
		ResourceSet rs = editingDomain.getResourceSet();
		String contactUri = PreferencesPage.getContactUri();
		Resource r = null;
		try {
			r = rs.getResource(URI.createURI( contactUri ), true );
		} catch ( Exception e ) {
			// contact can not be loaded
		}
		if( null != r ) {
			EList<EObject> ol = r.getContents();
			if( 0 < ol.size() ) {
				EObject o = ol.get( 0 );
				if( o instanceof DatabaseType ) {
					this.enterAthletPage.setDatabase( (DatabaseType) o );
				}
			}
		}
		this.enterAthletPage.setContest( (ContestType) rs.getResources().get( 0 ).getContents().get( 0 ) );
		addPage( this.enterAthletPage );
		super.addPages();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean retVal = false;
		// TODO: idialogsettings should be used
		this.param.setFirstname( this.enterAthletPage.getFirstname( ) );
		this.param.setName( this.enterAthletPage.getName( ) );
		this.param.setDateOfBirth( this.enterAthletPage.getDateOfBirth( ) );
		this.param.setOrganization( this.enterAthletPage.getOrganization( ) );
		this.param.setTeam( this.enterAthletPage.getTeam( ) );
		this.param.setClass_( this.enterAthletPage.getClass_( ) );
		retVal = validateParam( param );
		return retVal;
	}

	public EnterAthletCommandParam getParam( ){
		return param;
	}

	protected void refreshSettings() {
		Iterator<?> i = this.collection.iterator();
		IDialogSettings s = getDialogSettings();
		while( i.hasNext() ) {
			Object o = i.next();
			if( o instanceof OrganizationType ) {
				// TODO: adapter factory should be used
				s.put( "organization", ((OrganizationType) o).getName() );
			} else if( o instanceof ClassType ) {
				s.put( "class", ( ( ClassType ) o ).getName());
			} else if( o instanceof TeamType ) {
				s.put( "team", ( ( TeamType ) o).getName() );
				s.put( "organization", ((AthletType) o).getOrganization().getName() );
				s.put( "class", ( ( ClassType ) ((AthletType) o).eContainer()).getName() );
			} else if( o instanceof PersonType ) {
				s.put( "firstname", ((PersonType) o).getFirstname());
				s.put( "name", ((PersonType) o).getName());
			//	s.put( "date_of_birth", ((PersonType) o).getDateofbirth());
			} else if( o instanceof AthletType ) {
				s.put( "organization", ((AthletType) o).getOrganization().getName() );
				s.put( "class", ( ( ClassType ) ((AthletType) o).eContainer()).getName() );
				TeamType team = ((AthletType) o).getTeam();
				if( null != team && null != team.getName()) {
					s.put( "team", team.getName());
				}
			}
		}
	}
	
	boolean validateParam( EnterAthletCommandParam param )
	{
		boolean retVal = false;
		if( !this.param.getFirstname().isEmpty() &&
			!this.param.getName().isEmpty() &&
			!this.param.getOrganization().isEmpty() &&
			!this.param.getClass_().isEmpty()) {
			retVal = true;
		}
		return retVal;
	}
	
	private EditingDomain editingDomain;
	private Collection<?> collection;
	private AdapterFactory adapterFactory;
	private EnterAthletPage enterAthletPage;
	
	private EnterAthletCommandParam param = new EnterAthletCommandParam( );
}
