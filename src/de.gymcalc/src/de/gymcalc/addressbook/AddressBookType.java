/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.addressbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.addressbook.AddressBookType#getAddress <em>Address</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.AddressBookType#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.AddressBookType#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.addressbook.AddressBookPackage#getAddressBookType()
 * @model
 * @generated
 */
public interface AddressBookType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.addressbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see de.gymcalc.addressbook.AddressBookPackage#getAddressBookType_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.addressbook.PersonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see de.gymcalc.addressbook.AddressBookPackage#getAddressBookType_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.addressbook.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see de.gymcalc.addressbook.AddressBookPackage#getAddressBookType_Organization()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

} // AddressBookType