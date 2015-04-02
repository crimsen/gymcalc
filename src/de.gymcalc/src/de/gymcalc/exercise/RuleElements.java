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
 * A representation of the model object '<em><b>Rule Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.RuleElements#getMinDifficulty <em>Min Difficulty</em>}</li>
 *   <li>{@link de.gymcalc.exercise.RuleElements#getCountOfElements <em>Count Of Elements</em>}</li>
 *   <li>{@link de.gymcalc.exercise.RuleElements#getDifficultyValueMap <em>Difficulty Value Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getRuleElements()
 * @model
 * @generated
 */
public interface RuleElements extends Rule {
	/**
	 * Returns the value of the '<em><b>Min Difficulty</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gymcalc.exercise.Difficulty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Difficulty</em>' attribute.
	 * @see de.gymcalc.exercise.Difficulty
	 * @see #setMinDifficulty(Difficulty)
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleElements_MinDifficulty()
	 * @model required="true"
	 * @generated
	 */
	Difficulty getMinDifficulty();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.RuleElements#getMinDifficulty <em>Min Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Difficulty</em>' attribute.
	 * @see de.gymcalc.exercise.Difficulty
	 * @see #getMinDifficulty()
	 * @generated
	 */
	void setMinDifficulty(Difficulty value);

	/**
	 * Returns the value of the '<em><b>Count Of Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Of Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Of Elements</em>' attribute.
	 * @see #setCountOfElements(int)
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleElements_CountOfElements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCountOfElements();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.RuleElements#getCountOfElements <em>Count Of Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Of Elements</em>' attribute.
	 * @see #getCountOfElements()
	 * @generated
	 */
	void setCountOfElements(int value);

	/**
	 * Returns the value of the '<em><b>Difficulty Value Map</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.DifficultyValueEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty Value Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Value Map</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleElements_DifficultyValueMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifficultyValueEntry> getDifficultyValueMap();

} // RuleElements
