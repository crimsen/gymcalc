/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.LookupTableType#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.LookupTableType#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link de.gymcalc.contest.LookupTableType#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link de.gymcalc.contest.LookupTableType#getDisziplines <em>Disziplines</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getLookupTableType()
 * @model
 * @generated
 */
public interface LookupTableType extends EObject {
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
	 * @see de.gymcalc.contest.ContestPackage#getLookupTableType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.LookupTableType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' attribute.
	 * @see #setMinVal(double)
	 * @see de.gymcalc.contest.ContestPackage#getLookupTableType_MinVal()
	 * @model required="true"
	 * @generated
	 */
	double getMinVal();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.LookupTableType#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(double value);

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' attribute.
	 * @see #setMaxVal(double)
	 * @see de.gymcalc.contest.ContestPackage#getLookupTableType_MaxVal()
	 * @model required="true"
	 * @generated
	 */
	double getMaxVal();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.LookupTableType#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' attribute.
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(double value);

	/**
	 * Returns the value of the '<em><b>Disziplines</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.DisziplineType}.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.DisziplineType#getLookuptable <em>Lookuptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disziplines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disziplines</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getLookupTableType_Disziplines()
	 * @see de.gymcalc.contest.DisziplineType#getLookuptable
	 * @model opposite="lookuptable" transient="true"
	 * @generated
	 */
	EList<DisziplineType> getDisziplines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 */
	double getValue(double value);

} // LookupTableType