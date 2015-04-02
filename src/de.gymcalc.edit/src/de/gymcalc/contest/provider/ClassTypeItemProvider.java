/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.gymcalc.addressbook.AddressBookFactory;
import de.gymcalc.addressbook.AddressBookPackage;
import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.spremberg.turnen.contact.ContactType;

/**
 * This is the item provider adapter for a {@link de.gymcalc.contest.ClassType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassTypeItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addCalculationkeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassType_name_feature"),
				 getString("_UI_ClassType_name_description"),
				 ContestPackage.Literals.CLASS_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calculationkey feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalculationkeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassType_calculationkey_feature"),
				 getString("_UI_ClassType_calculationkey_description"),
				 ContestPackage.Literals.CLASS_TYPE__CALCULATIONKEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContestPackage.Literals.CLASS_TYPE__DISZIPLINE);
			childrenFeatures.add(ContestPackage.Literals.CLASS_TYPE__WINNER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.
		EStructuralFeature RetVal = super.getChildFeature(object, child);
		if (null == RetVal && (child instanceof PersonType || child instanceof de.spremberg.turnen.contact.OrganizationType)) {
			RetVal = ContestPackage.Literals.CLASS_TYPE__WINNER;
		}
		return RetVal;
	}

	/**
	 * This returns ClassType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassType_type") :
			getString("_UI_ClassType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ClassType.class)) {
			case ContestPackage.CLASS_TYPE__NAME:
			case ContestPackage.CLASS_TYPE__CALCULATIONKEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContestPackage.CLASS_TYPE__DISZIPLINE:
			case ContestPackage.CLASS_TYPE__WINNER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ContestPackage.Literals.CLASS_TYPE__DISZIPLINE,
				 ContestFactory.eINSTANCE.createDisziplineType()));

		newChildDescriptors.add
			(createChildParameter
				(ContestPackage.Literals.CLASS_TYPE__WINNER,
				 ContestFactory.eINSTANCE.createWinnerType()));

		newChildDescriptors.add
			(createChildParameter
				(ContestPackage.Literals.CLASS_TYPE__WINNER,
				 ContestFactory.eINSTANCE.createAthletType()));

		newChildDescriptors.add
			(createChildParameter
				(ContestPackage.Literals.CLASS_TYPE__WINNER,
				 ContestFactory.eINSTANCE.createTeamType()));
	}

//	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		CompoundCommand RetVal = new CompoundCommand (CompoundCommand.MERGE_COMMAND_ALL);
		Iterator<?> i = collection.iterator ();
		while (i.hasNext()) {
			Object o = i.next ();
			if (o instanceof PersonType) {
				RetVal.append(new AddPersonCommand (domain, owner, feature, (PersonType) o));
			} else {
				Collection<Object> c = new ArrayList<Object> ();
				c.add(o);
				RetVal.append(super.createAddCommand (domain, owner, feature, c, index));
			}
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {
		CompoundCommand retVal = new CompoundCommand (CompoundCommand.MERGE_COMMAND_ALL);
		Iterator< ? > i = collection.iterator ();
		while (i.hasNext()) {
			Object o = i.next ();
			if (o instanceof de.spremberg.turnen.contact.OrganizationType &&
					owner instanceof EObject) {
				retVal.append(new AddContactOrganizationCommand (domain, ( EObject ) owner, (de.spremberg.turnen.contact.OrganizationType) o));
			} else if (o instanceof de.spremberg.turnen.contact.ContactType &&
				owner instanceof EObject) {
				retVal.append(new AddContactCommand (domain, ( EObject ) owner, (de.spremberg.turnen.contact.ContactType) o));
			} else {
				retVal.append( super.createDragAndDropCommand( domain, owner, location, operations,
					operation, collection ) );
			}
		}
		return retVal;
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ContestEditPlugin.INSTANCE;
	}

	class AddPersonCommand extends CompoundCommand {

		public AddPersonCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, PersonType person) {
			super (CompoundCommand.MERGE_COMMAND_ALL);
			AthletType athlet = ContestFactory.eINSTANCE.createAthletType ();
			String name = person.getName();
			if (null != person.getFirstname() && 0 < person.getFirstname().length()) {
				name += ", " + person.getFirstname();
			}
			athlet.setName(name);
			athlet.setPerson(person);
			athlet.setId("athlet-" + person.getId ());
			append (AddCommand.create(domain, owner, ContestPackage.Literals.ATHLET_TYPE, athlet));
		}
	}

	class AddContactOrganizationCommand extends CompoundCommand {

		public AddContactOrganizationCommand(EditingDomain domain, EObject owner, de.spremberg.turnen.contact.OrganizationType organization ) {
			super (CompoundCommand.MERGE_COMMAND_ALL);
			EList<ContactType> contacts = organization.getContacts();
			Iterator<ContactType> icontact = contacts.iterator();
			while( icontact.hasNext() ) {
				ContactType contact = icontact.next();
				PersonType person = AddressBookFactory.eINSTANCE.createPersonType();
				person.setFirstname(contact.getFirstname());
				person.setName(contact.getName());
				person.setDateofbirth(contact.getDate_of_birth());
				person.setId("person-" + contact.getId_contact());
				append( AddCommand.create(domain, ((ContestType) owner.eContainer()).getAddressbook(), AddressBookPackage.Literals.PERSON_TYPE, person));
				AthletType athlet = ContestFactory.eINSTANCE.createAthletType ();
				String name = person.getName();
				if (null != person.getFirstname() && 0 < person.getFirstname().length()) {
					name += ", " + person.getFirstname();
				}
				athlet.setName(name);
				athlet.setPerson(person);
				athlet.setId("athlet-" + person.getId ());
				append (AddCommand.create(domain, owner, ContestPackage.Literals.ATHLET_TYPE, athlet));
			}
		}
	}

	class AddContactCommand extends CompoundCommand {

		public AddContactCommand(EditingDomain domain, EObject owner, de.spremberg.turnen.contact.ContactType contact ) {
			PersonType person = AddressBookFactory.eINSTANCE.createPersonType();
			String contactId = "";
			if( null != contact.getName( ) ) {
				contactId += "-" + contact.getName( );
			}
			if( null != contact.getFirstname( ) ) {
				contactId += "-" + contact.getFirstname( );
			}
			contactId.replaceAll( " ", "-" );
			person.setFirstname(contact.getFirstname());
			person.setName(contact.getName());
			person.setDateofbirth(contact.getDate_of_birth());
			person.setId( "person" + contactId );
			AddressBookType addressbook = ((ContestType) owner.eContainer()).getAddressbook();
			append( AddCommand.create(domain, addressbook, AddressBookPackage.Literals.PERSON_TYPE, person));
			AthletType athlet = ContestFactory.eINSTANCE.createAthletType ();
			String name = person.getName();
			if (null != person.getFirstname() && 0 < person.getFirstname().length()) {
				name += ", " + person.getFirstname();
			}
			athlet.setName(name);
			athlet.setPerson(person);
			athlet.setId("athlet" + contactId );
			de.gymcalc.addressbook.OrganizationType organizationOfAthlet = null;
			EList<de.spremberg.turnen.contact.OrganizationType> organizations = contact.getOrganizations( );
			Iterator< de.spremberg.turnen.contact.OrganizationType > i = organizations.iterator();
			while( i.hasNext() && null == organizationOfAthlet ) {
				de.spremberg.turnen.contact.OrganizationType organization = i.next();
				Iterator< de.gymcalc.addressbook.OrganizationType > j = addressbook.getOrganization().iterator();
				while( j.hasNext() ) {
					de.gymcalc.addressbook.OrganizationType o = j.next();
					if( organization.getName( ).equals( o.getName( ) ) ) {
						organizationOfAthlet = o;
						break;
					}
				}
			}
			if( null != organizationOfAthlet ) {
				athlet.setOrganization( organizationOfAthlet );
			}
			append (AddCommand.create(domain, owner, ContestPackage.Literals.ATHLET_TYPE, athlet));
		}
	}
}
