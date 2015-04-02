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
 * A representation of the model object '<em><b>Rule Final Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.RuleFinalElement#getDifficultyValueMap <em>Difficulty Value Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getRuleFinalElement()
 * @model
 * @generated
 */
public interface RuleFinalElement extends Rule {
	/**
	 * Returns the value of the '<em><b>Difficulty Value Map</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.DifficultyValueEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty Value Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Value Map</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleFinalElement_DifficultyValueMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifficultyValueEntry> getDifficultyValueMap();

} // RuleFinalElement
