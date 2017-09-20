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
 * A representation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.ResultType#getRank <em>Rank</em>}</li>
 *   <li>{@link de.gymcalc.contest.ResultType#getPoints <em>Points</em>}</li>
 *   <li>{@link de.gymcalc.contest.ResultType#getJuriresult <em>Juriresult</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getResultType()
 * @model
 * @generated
 */
public interface ResultType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see de.gymcalc.contest.ContestPackage#getResultType_Rank()
	 * @model default="-1" unique="false" required="true"
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ResultType#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(double)
	 * @see de.gymcalc.contest.ContestPackage#getResultType_Points()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getPoints();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ResultType#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(double value);

	/**
	 * Returns the value of the '<em><b>Juriresult</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.JuriResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juriresult</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juriresult</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getResultType_Juriresult()
	 * @model containment="true"
	 * @generated
	 */
	EList<JuriResultType> getJuriresult();

} // ResultType