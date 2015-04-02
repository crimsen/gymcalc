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
import de.spremberg.turnen.contact.DatabaseType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.command.EnterOrganizationCommandParam;

/**
 * @author thomas
 *
 */
public class EnterOrganizationWizard extends Wizard {


	public EnterOrganizationWizard( EditingDomain editingDomain, Collection<?> collection ) {
		super();
		setDialogSettings( new DialogSettings( "organization" ) );
		this.editingDomain = editingDomain; // used to create adapters
		this.collection = collection;
		refreshSettings();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		this.enterOrganizationPage = new EnterOrganizationPage( ContestEditorPlugin.INSTANCE.getString("_UI_ContestEnterOrganizationWizard"), adapterFactory );
		ResourceSet rs = editingDomain.getResourceSet();
		// TODO: absolute uri should be configured any where
		Resource r = rs.getResource(URI.createURI("file:///home/thomas/turnen/xdocs/internal/sge.contactdb"), true );
		EList<EObject> ol = r.getContents();
		if( 0 < ol.size() ) {
			EObject o = ol.get( 0 );
			if( o instanceof DatabaseType ) {
				this.enterOrganizationPage.setDatabase( (DatabaseType) o );
			}
		}
		this.enterOrganizationPage.setContest( (ContestType) rs.getResources().get( 0 ).getContents().get( 0 ) );
		addPage( this.enterOrganizationPage );
		super.addPages();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean retVal = false;
		// TODO: idialogsettings should be used
		this.param.setOrganization( this.enterOrganizationPage.getOrganization( ) );
		retVal = validateParam( param );
		return retVal;
	}

	public EnterOrganizationCommandParam getParam( ){
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
			}
		}
	}
	
	boolean validateParam( EnterOrganizationCommandParam param )
	{
		boolean retVal = false;
		if(	!this.param.getOrganization().isEmpty() ) {
			retVal = true;
		}
		return retVal;
	}
	
	private EditingDomain editingDomain;
	private Collection<?> collection;
	private AdapterFactory adapterFactory;
	private EnterOrganizationPage enterOrganizationPage;
	
	private EnterOrganizationCommandParam param = new EnterOrganizationCommandParam( );
}
