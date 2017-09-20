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
 * A representation of the model object '<em><b>Chain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.ChainType#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.ChainType#getAthlet <em>Athlet</em>}</li>
 *   <li>{@link de.gymcalc.contest.ChainType#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getChainType()
 * @model
 * @generated
 */
public interface ChainType extends EObject {
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
	 * @see de.gymcalc.contest.ContestPackage#getChainType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.ChainType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Athlet</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.AthletType}.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.AthletType#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Athlet</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Athlet</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getChainType_Athlet()
	 * @see de.gymcalc.contest.AthletType#getChain
	 * @model opposite="chain" resolveProxies="false"
	 * @generated
	 */
	EList<AthletType> getAthlet();

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.StationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Station</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getChainType_Station()
	 * @model
	 * @generated
	 */
	EList<StationType> getStation();

} // ChainType