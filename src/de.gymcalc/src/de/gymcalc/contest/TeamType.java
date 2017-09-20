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
 * A representation of the model object '<em><b>Team Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.TeamType#getAthlet <em>Athlet</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getTeamType()
 * @model
 * @generated
 */
public interface TeamType extends WinnerType {
	/**
	 * Returns the value of the '<em><b>Athlet</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.AthletType}.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.AthletType#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Athlet</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Athlet</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getTeamType_Athlet()
	 * @see de.gymcalc.contest.AthletType#getTeam
	 * @model opposite="team" resolveProxies="false" required="true"
	 * @generated
	 */
	EList<AthletType> getAthlet();

} // TeamType