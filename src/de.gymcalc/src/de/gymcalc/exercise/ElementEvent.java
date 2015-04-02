/**
 */
package de.gymcalc.exercise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.ElementEvent#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getElementEvent()
 * @model
 * @generated
 */
public interface ElementEvent extends ExerciseEvent {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ElementInstance)
	 * @see de.gymcalc.exercise.ExercisePackage#getElementEvent_Element()
	 * @model required="true"
	 * @generated
	 */
	ElementInstance getElement();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.ElementEvent#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ElementInstance value);

} // ElementEvent
