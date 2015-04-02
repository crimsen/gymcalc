/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Juri Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.contest.TeamJuriResultType#getJuriResult <em>Juri Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.contest.ContestPackage#getTeamJuriResultType()
 * @model
 * @generated
 */
public interface TeamJuriResultType extends JuriResultType {
	/**
	 * Returns the value of the '<em><b>Juri Result</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.JuriResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juri Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juri Result</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getTeamJuriResultType_JuriResult()
	 * @model required="true"
	 * @generated
	 */
	EList<JuriResultType> getJuriResult();

} // TeamJuriResultType