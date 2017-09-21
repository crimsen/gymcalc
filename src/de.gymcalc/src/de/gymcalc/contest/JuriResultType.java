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
 * A representation of the model object '<em><b>Juri Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.JuriResultType#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuriResultType#getValue <em>Value</em>}</li>
 *   <li>{@link de.gymcalc.contest.JuriResultType#getJuriResultDetail <em>Juri Result Detail</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getJuriResultType()
 * @model
 * @generated
 */
public interface JuriResultType extends EObject {
	/**
	 * Returns the value of the '<em><b>Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diszipline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diszipline</em>' reference.
	 * @see #setDiszipline(DisziplineType)
	 * @see de.gymcalc.contest.ContestPackage#getJuriResultType_Diszipline()
	 * @model required="true"
	 * @generated
	 */
	DisziplineType getDiszipline();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuriResultType#getDiszipline <em>Diszipline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diszipline</em>' reference.
	 * @see #getDiszipline()
	 * @generated
	 */
	void setDiszipline(DisziplineType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.gymcalc.contest.ContestPackage#getJuriResultType_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.JuriResultType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Juri Result Detail</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.JuriResultDetailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juri Result Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juri Result Detail</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getJuriResultType_JuriResultDetail()
	 * @model containment="true"
	 * @generated
	 */
	EList<JuriResultDetailType> getJuriResultDetail();

} // JuriResultType