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
 * A representation of the model object '<em><b>Gadget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.Gadget#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Gadget#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Gadget#getReferenceGroups <em>Reference Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getGadget()
 * @model
 * @generated
 */
public interface Gadget extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.ElementGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getGadget_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.gymcalc.exercise.ExercisePackage#getGadget_Name()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Gadget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.ElementReferenceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Groups</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getGadget_ReferenceGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementReferenceGroup> getReferenceGroups();

} // Gadget
