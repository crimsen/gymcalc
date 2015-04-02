/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.RuleGroup#getCountOfGroups <em>Count Of Groups</em>}</li>
 *   <li>{@link de.gymcalc.exercise.RuleGroup#getMinDifficulty <em>Min Difficulty</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getRuleGroup()
 * @model
 * @generated
 */
public interface RuleGroup extends Rule {
	/**
	 * Returns the value of the '<em><b>Count Of Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Of Groups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Of Groups</em>' attribute.
	 * @see #setCountOfGroups(int)
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleGroup_CountOfGroups()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCountOfGroups();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.RuleGroup#getCountOfGroups <em>Count Of Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Of Groups</em>' attribute.
	 * @see #getCountOfGroups()
	 * @generated
	 */
	void setCountOfGroups(int value);

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
	 * @see de.gymcalc.exercise.ExercisePackage#getRuleGroup_MinDifficulty()
	 * @model required="true"
	 * @generated
	 */
	Difficulty getMinDifficulty();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.RuleGroup#getMinDifficulty <em>Min Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Difficulty</em>' attribute.
	 * @see de.gymcalc.exercise.Difficulty
	 * @see #getMinDifficulty()
	 * @generated
	 */
	void setMinDifficulty(Difficulty value);

} // RuleGroup
