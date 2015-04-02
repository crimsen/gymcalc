/**
 */
package de.gymcalc.exercise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.ExerciseEvent#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link de.gymcalc.exercise.ExerciseEvent#getDurationTime <em>Duration Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getExerciseEvent()
 * @model
 * @generated
 */
public interface ExerciseEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(double)
	 * @see de.gymcalc.exercise.ExercisePackage#getExerciseEvent_StartTime()
	 * @model
	 * @generated
	 */
	double getStartTime();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.ExerciseEvent#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(double value);

	/**
	 * Returns the value of the '<em><b>Duration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Time</em>' attribute.
	 * @see #setDurationTime(double)
	 * @see de.gymcalc.exercise.ExercisePackage#getExerciseEvent_DurationTime()
	 * @model
	 * @generated
	 */
	double getDurationTime();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.ExerciseEvent#getDurationTime <em>Duration Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Time</em>' attribute.
	 * @see #getDurationTime()
	 * @generated
	 */
	void setDurationTime(double value);

} // ExerciseEvent
