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
 * A representation of the model object '<em><b>Difficulty Value Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.DifficultyValueEntry#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.gymcalc.exercise.DifficultyValueEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getDifficultyValueEntry()
 * @model
 * @generated
 */
public interface DifficultyValueEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gymcalc.exercise.Difficulty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see de.gymcalc.exercise.Difficulty
	 * @see #setDifficulty(Difficulty)
	 * @see de.gymcalc.exercise.ExercisePackage#getDifficultyValueEntry_Difficulty()
	 * @model required="true"
	 * @generated
	 */
	Difficulty getDifficulty();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.DifficultyValueEntry#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see de.gymcalc.exercise.Difficulty
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(Difficulty value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.gymcalc.exercise.ExercisePackage#getDifficultyValueEntry_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.DifficultyValueEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // DifficultyValueEntry
