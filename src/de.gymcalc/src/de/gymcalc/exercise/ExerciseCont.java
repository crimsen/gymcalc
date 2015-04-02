/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.ExerciseCont#getExercises <em>Exercises</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getExerciseCont()
 * @model
 * @generated
 */
public interface ExerciseCont extends EObject {
	/**
	 * Returns the value of the '<em><b>Exercises</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.Exercise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exercises</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exercises</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getExerciseCont_Exercises()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exercise> getExercises();

} // ExerciseCont
