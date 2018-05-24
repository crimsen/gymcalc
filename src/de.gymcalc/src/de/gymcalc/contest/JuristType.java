/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jurist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.JuristType#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuristType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuristType#getJuri <em>Juri</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuristType#getWishApparatus <em>Wish Apparatus</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuristType#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getJuristType()
 * @model
 * @generated
 */
public interface JuristType extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(PersonType)
	 * @see de.gymcalc.contest.ContestPackage#getJuristType_Person()
	 * @model required="true"
	 * @generated
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuristType#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(OrganizationType)
	 * @see de.gymcalc.contest.ContestPackage#getJuristType_Organization()
	 * @model
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuristType#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Juri</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.JuriType#getJurist <em>Jurist</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juri</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juri</em>' container reference.
	 * @see #setJuri(JuriType)
	 * @see de.gymcalc.contest.ContestPackage#getJuristType_Juri()
	 * @see de.gymcalc.contest.JuriType#getJurist
	 * @model opposite="jurist" required="true"
	 * @generated
	 */
	JuriType getJuri();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuristType#getJuri <em>Juri</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Juri</em>' container reference.
	 * @see #getJuri()
	 * @generated
	 */
	void setJuri(JuriType value);

	/**
	 * Returns the value of the '<em><b>Wish Apparatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wish Apparatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wish Apparatus</em>' attribute.
	 * @see #setWishApparatus(String)
	 * @see de.gymcalc.contest.ContestPackage#getJuristType_WishApparatus()
	 * @model
	 * @generated
	 */
	String getWishApparatus();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuristType#getWishApparatus <em>Wish Apparatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wish Apparatus</em>' attribute.
	 * @see #getWishApparatus()
	 * @generated
	 */
	void setWishApparatus(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see de.gymcalc.contest.ContestPackage#getJuristType_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuristType#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getName();

} // JuristType