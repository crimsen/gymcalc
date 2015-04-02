/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import de.gymcalc.addressbook.OrganizationType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Winner Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.contest.WinnerType#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.WinnerType#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.WinnerType#getResult <em>Result</em>}</li>
 *   <li>{@link de.gymcalc.contest.WinnerType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.gymcalc.contest.WinnerType#getDisable <em>Disable</em>}</li>
 *   <li>{@link de.gymcalc.contest.WinnerType#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.contest.ContestPackage#getWinnerType()
 * @model
 * @generated
 */
public interface WinnerType extends EObject {
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
	 * @see de.gymcalc.contest.ContestPackage#getWinnerType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.WinnerType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.gymcalc.contest.ContestPackage#getWinnerType_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.WinnerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(ResultType)
	 * @see de.gymcalc.contest.ContestPackage#getWinnerType_Result()
	 * @model containment="true"
	 * @generated
	 */
	ResultType getResult();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.WinnerType#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ResultType value);

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
	 * @see de.gymcalc.contest.ContestPackage#getWinnerType_Organization()
	 * @model
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.WinnerType#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(String)
	 * @see de.gymcalc.contest.ContestPackage#getWinnerType_Disable()
	 * @model
	 * @generated
	 */
	String getDisable();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.WinnerType#getDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #getDisable()
	 * @generated
	 */
	void setDisable(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.ClassType#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(ClassType)
	 * @see de.gymcalc.contest.ContestPackage#getWinnerType_Class()
	 * @see de.gymcalc.contest.ClassType#getWinner
	 * @model opposite="winner" required="true"
	 * @generated
	 */
	ClassType getClass_();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.WinnerType#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ClassType value);

} // WinnerType