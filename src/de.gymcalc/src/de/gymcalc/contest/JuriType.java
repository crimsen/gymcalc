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
 * A representation of the model object '<em><b>Juri Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.contest.JuriType#getJurist <em>Jurist</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuriType#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuriType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.contest.ContestPackage#getJuriType()
 * @model
 * @generated
 */
public interface JuriType extends EObject {
	/**
	 * Returns the value of the '<em><b>Jurist</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.JuristType}.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.JuristType#getJuri <em>Juri</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurist</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getJuriType_Jurist()
	 * @see de.gymcalc.contest.JuristType#getJuri
	 * @model opposite="juri" containment="true"
	 * @generated
	 */
	EList<JuristType> getJurist();

	/**
	 * Returns the value of the '<em><b>Diszipline</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.DisziplineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diszipline</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diszipline</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getJuriType_Diszipline()
	 * @model
	 * @generated
	 */
	EList<DisziplineType> getDiszipline();

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
	 * @see de.gymcalc.contest.ContestPackage#getJuriType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuriType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // JuriType