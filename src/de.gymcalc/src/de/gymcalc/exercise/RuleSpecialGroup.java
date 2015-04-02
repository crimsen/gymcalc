/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Special Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.RuleSpecialGroup#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getRuleSpecialGroup()
 * @model
 * @generated
 */
public interface RuleSpecialGroup extends RuleGroup {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.ElementReferenceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleSpecialGroup_Groups()
	 * @model
	 * @generated
	 */
	EList<ElementReferenceGroup> getGroups();

} // RuleSpecialGroup
