/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.addressbook;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.addressbook.PersonType#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.PersonType#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.PersonType#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.PersonType#getDateofbirth <em>Dateofbirth</em>}</li>
 *   <li>{@link de.gymcalc.addressbook.PersonType#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.addressbook.AddressBookPackage#getPersonType()
 * @model
 * @generated
 */
public interface PersonType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.gymcalc.addressbook.AddressBookPackage#getPersonType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.gymcalc.addressbook.PersonType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.gymcalc.addressbook.AddressBookPackage#getPersonType_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.addressbook.PersonType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see de.gymcalc.addressbook.AddressBookPackage#getPersonType_Firstname()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link de.gymcalc.addressbook.PersonType#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Dateofbirth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dateofbirth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dateofbirth</em>' attribute.
	 * @see #setDateofbirth(Date)
	 * @see de.gymcalc.addressbook.AddressBookPackage#getPersonType_Dateofbirth()
	 * @model
	 * @generated
	 */
	Date getDateofbirth();

	/**
	 * Sets the value of the '{@link de.gymcalc.addressbook.PersonType#getDateofbirth <em>Dateofbirth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateofbirth</em>' attribute.
	 * @see #getDateofbirth()
	 * @generated
	 */
	void setDateofbirth(Date value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(AddressType)
	 * @see de.gymcalc.addressbook.AddressBookPackage#getPersonType_Address()
	 * @model
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link de.gymcalc.addressbook.PersonType#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

} // PersonType