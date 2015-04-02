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
 * A representation of the model object '<em><b>Lookup Tables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.contest.LookupTablesType#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.contest.ContestPackage#getLookupTablesType()
 * @model
 * @generated
 */
public interface LookupTablesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.contest.LookupTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see de.gymcalc.contest.ContestPackage#getLookupTablesType_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<LookupTableType> getTable();

} // LookupTablesType