/**
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.FinalClassType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.FinalClassTypeImpl#getOriginatingDiszipline <em>Originating Diszipline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalClassTypeImpl extends ClassTypeImpl implements FinalClassType {
	/**
	 * The cached value of the '{@link #getOriginatingDiszipline() <em>Originating Diszipline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingDiszipline()
	 * @generated
	 * @ordered
	 */
	protected DisziplineType originatingDiszipline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.FINAL_CLASS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType getOriginatingDiszipline() {
		if (originatingDiszipline != null && originatingDiszipline.eIsProxy()) {
			InternalEObject oldOriginatingDiszipline = (InternalEObject)originatingDiszipline;
			originatingDiszipline = (DisziplineType)eResolveProxy(oldOriginatingDiszipline);
			if (originatingDiszipline != oldOriginatingDiszipline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE, oldOriginatingDiszipline, originatingDiszipline));
			}
		}
		return originatingDiszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType basicGetOriginatingDiszipline() {
		return originatingDiszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingDiszipline(DisziplineType newOriginatingDiszipline) {
		DisziplineType oldOriginatingDiszipline = originatingDiszipline;
		originatingDiszipline = newOriginatingDiszipline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE, oldOriginatingDiszipline, originatingDiszipline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContestPackage.FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE:
				if (resolve) return getOriginatingDiszipline();
				return basicGetOriginatingDiszipline();
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
			case ContestPackage.FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE:
				setOriginatingDiszipline((DisziplineType)newValue);
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
			case ContestPackage.FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE:
				setOriginatingDiszipline((DisziplineType)null);
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
			case ContestPackage.FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE:
				return originatingDiszipline != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalClassTypeImpl
