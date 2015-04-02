/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.addressbook.impl;

import de.gymcalc.addressbook.AddressBookPackage;
import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.addressbook.AddressType;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.addressbook.impl.AddressBookTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.impl.AddressBookTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.impl.AddressBookTypeImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressBookTypeImpl extends EObjectImpl implements AddressBookType {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressType> address;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> person;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> organization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBookTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressBookPackage.Literals.ADDRESS_BOOK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressType> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<AddressType>(AddressType.class, this, AddressBookPackage.ADDRESS_BOOK_TYPE__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, AddressBookPackage.ADDRESS_BOOK_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, AddressBookPackage.ADDRESS_BOOK_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case AddressBookPackage.ADDRESS_BOOK_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ADDRESS:
				return getAddress();
			case AddressBookPackage.ADDRESS_BOOK_TYPE__PERSON:
				return getPerson();
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ORGANIZATION:
				return getOrganization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case AddressBookPackage.ADDRESS_BOOK_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case AddressBookPackage.ADDRESS_BOOK_TYPE__PERSON:
				getPerson().clear();
				return;
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case AddressBookPackage.ADDRESS_BOOK_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case AddressBookPackage.ADDRESS_BOOK_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddressBookTypeImpl