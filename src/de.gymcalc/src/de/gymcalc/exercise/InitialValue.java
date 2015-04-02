/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.InitialValue#getExcercise <em>Excercise</em>}</li>
 *   <li>{@link de.gymcalc.exercise.InitialValue#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getInitialValue()
 * @model
 * @generated
 */
public interface InitialValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Excercise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excercise</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excercise</em>' reference.
	 * @see #setExcercise(Exercise)
	 * @see de.gymcalc.exercise.ExercisePackage#getInitialValue_Excercise()
	 * @model required="true"
	 * @generated
	 */
	Exercise getExcercise();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.InitialValue#getExcercise <em>Excercise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excercise</em>' reference.
	 * @see #getExcercise()
	 * @generated
	 */
	void setExcercise(Exercise value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset</em>' reference.
	 * @see #setRuleset(Ruleset)
	 * @see de.gymcalc.exercise.ExercisePackage#getInitialValue_Ruleset()
	 * @model required="true"
	 * @generated
	 */
	Ruleset getRuleset();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.InitialValue#getRuleset <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Ruleset value);

} // InitialValue
