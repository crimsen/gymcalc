/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import de.gymcalc.addressbook.PersonType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Athlet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.contest.AthletType#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.contest.AthletType#getTeam <em>Team</em>}</li>
 *   <li>{@link de.gymcalc.contest.AthletType#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.contest.ContestPackage#getAthletType()
 * @model
 * @generated
 */
public interface AthletType extends WinnerType {
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
	 * @see de.gymcalc.contest.ContestPackage#getAthletType_Person()
	 * @model required="true"
	 * @generated
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.AthletType#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.TeamType#getAthlet <em>Athlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(TeamType)
	 * @see de.gymcalc.contest.ContestPackage#getAthletType_Team()
	 * @see de.gymcalc.contest.TeamType#getAthlet
	 * @model opposite="athlet" resolveProxies="false" transient="true"
	 * @generated
	 */
	TeamType getTeam();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.AthletType#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(TeamType value);

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.ChainType#getAthlet <em>Athlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' reference.
	 * @see #setChain(ChainType)
	 * @see de.gymcalc.contest.ContestPackage#getAthletType_Chain()
	 * @see de.gymcalc.contest.ChainType#getAthlet
	 * @model opposite="athlet" resolveProxies="false" transient="true"
	 * @generated
	 */
	ChainType getChain();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.AthletType#getChain <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain</em>' reference.
	 * @see #getChain()
	 * @generated
	 */
	void setChain(ChainType value);

} // AthletType