/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.Element#getGroup <em>Group</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Element#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Element#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Element#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends IElement {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.exercise.ElementGroup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ElementGroup)
	 * @see de.gymcalc.exercise.ExercisePackage#getElement_Group()
	 * @see de.gymcalc.exercise.ElementGroup#getElements
	 * @model opposite="elements" required="true" transient="false"
	 * @generated
	 */
	ElementGroup getGroup();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Element#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ElementGroup value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.gymcalc.exercise.ExercisePackage#getElement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see de.gymcalc.exercise.ExercisePackage#getElement_Difficulty()
	 * @model
	 * @generated
	 */
	Difficulty getDifficulty();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Element#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see de.gymcalc.exercise.Difficulty
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(Difficulty value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.gymcalc.exercise.ExercisePackage#getElement_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Element
