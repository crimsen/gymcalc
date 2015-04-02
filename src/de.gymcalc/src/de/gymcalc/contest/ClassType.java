/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.contest.ClassType#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.contest.ClassType#getWinner <em>Winner</em>}</li>
 *   <li>{@link de.gymcalc.contest.ClassType#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.ClassType#getCalculationkey <em>Calculationkey</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.contest.ContestPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends EObject {
	/**
	 * Returns the value of the '<em><b>Diszipline</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.DisziplineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diszipline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diszipline</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getClassType_Diszipline()
	 * @model containment="true"
	 * @generated
	 */
	EList<DisziplineType> getDiszipline();

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.WinnerType}.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.WinnerType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winner</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getClassType_Winner()
	 * @see de.gymcalc.contest.WinnerType#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<WinnerType> getWinner();

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
	 * @see de.gymcalc.contest.ContestPackage#getClassType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ClassType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Calculationkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculationkey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculationkey</em>' attribute.
	 * @see #setCalculationkey(String)
	 * @see de.gymcalc.contest.ContestPackage#getClassType_Calculationkey()
	 * @model
	 * @generated
	 */
	String getCalculationkey();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ClassType#getCalculationkey <em>Calculationkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculationkey</em>' attribute.
	 * @see #getCalculationkey()
	 * @generated
	 */
	void setCalculationkey(String value);

} // ClassType