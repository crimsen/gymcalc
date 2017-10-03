/**
 */
package de.gymcalc.contest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Chain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.FinalChainType#getFinalClass <em>Final Class</em>}</li>
 *   <li>{@link de.gymcalc.contest.FinalChainType#getOrderMap <em>Order Map</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getFinalChainType()
 * @model
 * @generated
 */
public interface FinalChainType extends ChainType {
	/**
	 * Returns the value of the '<em><b>Final Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Class</em>' reference.
	 * @see #setFinalClass(FinalClassType)
	 * @see de.gymcalc.contest.ContestPackage#getFinalChainType_FinalClass()
	 * @model
	 * @generated
	 */
	FinalClassType getFinalClass();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.FinalChainType#getFinalClass <em>Final Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Class</em>' reference.
	 * @see #getFinalClass()
	 * @generated
	 */
	void setFinalClass(FinalClassType value);

	/**
	 * Returns the value of the '<em><b>Order Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Map</em>' reference.
	 * @see #setOrderMap(LookupMapType)
	 * @see de.gymcalc.contest.ContestPackage#getFinalChainType_OrderMap()
	 * @model
	 * @generated
	 */
	LookupMapType getOrderMap();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.FinalChainType#getOrderMap <em>Order Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Map</em>' reference.
	 * @see #getOrderMap()
	 * @generated
	 */
	void setOrderMap(LookupMapType value);

} // FinalChainType
