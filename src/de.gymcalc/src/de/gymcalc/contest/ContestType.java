/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.gymcalc.addressbook.AddressBookType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contest Type is the representation of a contest in gymnastics.
 * It is intended to cover all data that is needed for the calculation of the contest.
 * It is the root and container for other data that is related to the contest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.ContestType#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getDate <em>Date</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getChain <em>Chain</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getJuri <em>Juri</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getStation <em>Station</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getAddressbook <em>Addressbook</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getLookuptables <em>Lookuptables</em>}</li>
 *   <li>{@link de.gymcalc.contest.ContestType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getContestType()
 * @model
 * @generated
 */
public interface ContestType extends EObject {
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
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ContestType#getId <em>Id</em>}' attribute.
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
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ContestType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ContestType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassType> getClass_();

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.ChainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Chain()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChainType> getChain();

	/**
	 * Returns the value of the '<em><b>Juri</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.JuriType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juri</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Juri()
	 * @model containment="true"
	 * @generated
	 */
	EList<JuriType> getJuri();

	/**
	 * Returns the value of the '<em><b>Station</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.StationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Station</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Station()
	 * @model containment="true"
	 * @generated
	 */
	EList<StationType> getStation();

	/**
	 * Returns the value of the '<em><b>Addressbook</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addressbook</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addressbook</em>' containment reference.
	 * @see #setAddressbook(AddressBookType)
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Addressbook()
	 * @model containment="true"
	 * @generated
	 */
	AddressBookType getAddressbook();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ContestType#getAddressbook <em>Addressbook</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressbook</em>' containment reference.
	 * @see #getAddressbook()
	 * @generated
	 */
	void setAddressbook(AddressBookType value);

	/**
	 * Returns the value of the '<em><b>Lookuptables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lookuptables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookuptables</em>' containment reference.
	 * @see #setLookuptables(LookupTablesType)
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Lookuptables()
	 * @model containment="true"
	 * @generated
	 */
	LookupTablesType getLookuptables();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ContestType#getLookuptables <em>Lookuptables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookuptables</em>' containment reference.
	 * @see #getLookuptables()
	 * @generated
	 */
	void setLookuptables(LookupTablesType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see de.gymcalc.contest.ContestPackage#getContestType_Version()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ContestType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // ContestType