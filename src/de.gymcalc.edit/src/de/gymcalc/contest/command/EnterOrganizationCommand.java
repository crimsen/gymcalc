/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.addressbook.AddressBookFactory;
import de.gymcalc.addressbook.AddressBookPackage;
import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.ContestType;

/**
 * @author groegert
 *
 */
public class EnterOrganizationCommand extends AbstractOverrideableCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_EnterOrganizationCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_EnterOrganizationCommand_description");

	Collection<?> collection = null;
	
	public static EnterOrganizationCommand create( EditingDomain domain, Collection<?> collection ) {
		EnterOrganizationCommand retVal = new EnterOrganizationCommand( domain, collection );
		return retVal;
	}

	/**
	 * @param domain
	 */
	public EnterOrganizationCommand( EditingDomain domain, Collection<?> collection ) {
		super( domain, LABEL, DESCRIPTION );
		this.collection = collection;
	}

	public void setParam( EnterOrganizationCommandParam param ) {
		this.param = param;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		if( 1 == this.collection.size() ){
			Object o = this.collection.iterator().next();
			AddressBookType addressBook = getAddressBook( o );
			getOrCreateOrganization( addressBook );
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doRedo()
	 */
	@Override
	public void doRedo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doUndo()
	 */
	@Override
	public void doUndo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanUndo()
	 */
	@Override
	public boolean doCanUndo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanExecute()
	 */
	@Override
	public boolean doCanExecute() {
		boolean retVal = false;
		if( 1 == this.collection.size() ){
			Object o = this.collection.iterator().next();
			if( o instanceof AddressBookType) {
				retVal = true;
			}
		}
		return retVal;
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return label;
	}

	public String getToolTipText() {
		return description;
	}

	protected OrganizationType getOrCreateOrganization (AddressBookType addressbook) {
		OrganizationType retVal = null;
		EList< OrganizationType > list = addressbook.getOrganization();
		Iterator< OrganizationType > i = list.iterator();
		while (i.hasNext ()) {
			OrganizationType organization = i.next();
			if( null != organization.getName( ) ) {
				if( 0 == organization.getName( ).compareTo( param.getOrganization() ) ) {
					retVal = organization;
					break;
				}
			}
			if (null == organization.getName () || 0 == organization.getName ().length()) {
				retVal = organization;
				break;
			}
		}
		if (null == retVal) {
			retVal = AddressBookFactory.eINSTANCE.createOrganizationType();
			retVal.setName( param.getOrganization() );
			String id = "org-" + param.getOrganization();
			id = id.replaceAll("[ \\.]", "-");
			retVal.setId( id );
			Command cmd = AddCommand.create(getDomain (), addressbook, AddressBookPackage.Literals.ORGANIZATION_TYPE, retVal);
			cmd.execute ();
		}
		return retVal;		
	}

	/*
	 * search the parent path of o for getting contest 
	 */
	private ContestType getContest( Object o ) {
		ContestType retVal = null;
		if( o instanceof EObject ) {
			EObject e = ( EObject )o;
			while( null != e ) {
				if( e instanceof ContestType ) {
					retVal = ( ( ContestType )e );
					break;
				}
				e = e.eContainer( );
			}
		}
		return retVal;
	}
/*
	 * search the parent path of o for getting contest->addressbook 
	 */
	private AddressBookType getAddressBook( Object o ) {
		AddressBookType retVal = null;
		ContestType contest = getContest( o );
		if( null != contest ) {
			retVal = contest.getAddressbook( );
		}
		return retVal;
	}

	EnterOrganizationCommandParam param;
}
