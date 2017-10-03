/**
 */
package de.gymcalc.contest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.LookupMapsType#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getLookupMapsType()
 * @model
 * @generated
 */
public interface LookupMapsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.LookupMapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getLookupMapsType_Map()
	 * @model containment="true"
	 * @generated
	 */
	EList<LookupMapType> getMap();

} // LookupMapsType
