/**
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.FinalChainType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.LookupMapType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Chain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.FinalChainTypeImpl#getFinalClass <em>Final Class</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.FinalChainTypeImpl#getOrderMap <em>Order Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalChainTypeImpl extends ChainTypeImpl implements FinalChainType {
	/**
	 * The cached value of the '{@link #getFinalClass() <em>Final Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalClass()
	 * @generated
	 * @ordered
	 */
	protected FinalClassType finalClass;

	/**
	 * The cached value of the '{@link #getOrderMap() <em>Order Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderMap()
	 * @generated
	 * @ordered
	 */
	protected LookupMapType orderMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalChainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.FINAL_CHAIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalClassType getFinalClass() {
		if (finalClass != null && finalClass.eIsProxy()) {
			InternalEObject oldFinalClass = (InternalEObject)finalClass;
			finalClass = (FinalClassType)eResolveProxy(oldFinalClass);
			if (finalClass != oldFinalClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.FINAL_CHAIN_TYPE__FINAL_CLASS, oldFinalClass, finalClass));
			}
		}
		return finalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalClassType basicGetFinalClass() {
		return finalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalClass(FinalClassType newFinalClass) {
		FinalClassType oldFinalClass = finalClass;
		finalClass = newFinalClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.FINAL_CHAIN_TYPE__FINAL_CLASS, oldFinalClass, finalClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMapType getOrderMap() {
		if (orderMap != null && orderMap.eIsProxy()) {
			InternalEObject oldOrderMap = (InternalEObject)orderMap;
			orderMap = (LookupMapType)eResolveProxy(oldOrderMap);
			if (orderMap != oldOrderMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.FINAL_CHAIN_TYPE__ORDER_MAP, oldOrderMap, orderMap));
			}
		}
		return orderMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMapType basicGetOrderMap() {
		return orderMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderMap(LookupMapType newOrderMap) {
		LookupMapType oldOrderMap = orderMap;
		orderMap = newOrderMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.FINAL_CHAIN_TYPE__ORDER_MAP, oldOrderMap, orderMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContestPackage.FINAL_CHAIN_TYPE__FINAL_CLASS:
				if (resolve) return getFinalClass();
				return basicGetFinalClass();
			case ContestPackage.FINAL_CHAIN_TYPE__ORDER_MAP:
				if (resolve) return getOrderMap();
				return basicGetOrderMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContestPackage.FINAL_CHAIN_TYPE__FINAL_CLASS:
				setFinalClass((FinalClassType)newValue);
				return;
			case ContestPackage.FINAL_CHAIN_TYPE__ORDER_MAP:
				setOrderMap((LookupMapType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContestPackage.FINAL_CHAIN_TYPE__FINAL_CLASS:
				setFinalClass((FinalClassType)null);
				return;
			case ContestPackage.FINAL_CHAIN_TYPE__ORDER_MAP:
				setOrderMap((LookupMapType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContestPackage.FINAL_CHAIN_TYPE__FINAL_CLASS:
				return finalClass != null;
			case ContestPackage.FINAL_CHAIN_TYPE__ORDER_MAP:
				return orderMap != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalChainTypeImpl
