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
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.command.ContestCommandParam;
import de.gymcalc.contest.command.EnterJuristCommandParam;

/**
 * @author thomas
 *
 */
public class EnterJuristWizard extends Wizard {


	public EnterJuristWizard( EditingDomain editingDomain, Collection<?> collection ) {
		super();
		setDialogSettings( new DialogSettings( "jurist" ) );
		this.editingDomain = editingDomain; // used to create adapters
		this.collection = collection;
		refreshSettings();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		this.enterJuristPage = new EnterJuristPage( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterJuristWizard"), adapterFactory );
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
					this.enterJuristPage.setDatabase( (DatabaseType) o );
				}
			}
		}
		this.enterJuristPage.setContest( (ContestType) rs.getResources().get( 0 ).getContents().get( 0 ) );
		addPage( this.enterJuristPage );
		super.addPages();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean retVal = false;
		// TODO: idialogsettings should be used
		this.param.setFirstname( this.enterJuristPage.getFirstname( ) );
		this.param.setName( this.enterJuristPage.getName( ) );
		this.param.setOrganization( this.enterJuristPage.getOrganization( ) );
		this.param.setJuri( this.enterJuristPage.getJuri( ) );
		retVal = validateParam( param );
		return retVal;
	}

	public EnterJuristCommandParam getParam( ){
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
			} else if( o instanceof JuriType ) {
				s.put( "juri", ( ( JuriType ) o ).getName());
			} else if( o instanceof PersonType ) {
				s.put( "firstname", ((PersonType) o).getFirstname());
				s.put( "name", ((PersonType) o).getName());
			} else if( o instanceof JuristType ) {
				s.put( "organization", ((JuristType) o).getOrganization().getName() );
				s.put( "juri", ( ( JuriType ) ((JuristType) o).eContainer()).getName() );
			}
		}
	}
	
	boolean validateParam( ContestCommandParam param )
	{
		boolean retVal = false;
		if( !this.param.getFirstname().isEmpty() &&
			!this.param.getName().isEmpty() &&
			!this.param.getOrganization().isEmpty() &&
			!this.param.getJuri().isEmpty()) {
			retVal = true;
		}
		return retVal;
	}
	
	private EditingDomain editingDomain;
	private Collection<?> collection;
	private AdapterFactory adapterFactory;
	private EnterJuristPage enterJuristPage;
	
	private EnterJuristCommandParam param = new EnterJuristCommandParam( );
}
