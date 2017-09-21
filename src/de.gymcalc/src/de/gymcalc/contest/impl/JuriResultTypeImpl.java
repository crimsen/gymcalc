/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultDetailType;
import de.gymcalc.contest.JuriResultType;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Juri Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.JuriResultTypeImpl#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuriResultTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuriResultTypeImpl#getJuriResultDetail <em>Juri Result Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JuriResultTypeImpl extends EObjectImpl implements JuriResultType {
	/**
	 * The cached value of the '{@link #getDiszipline() <em>Diszipline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiszipline()
	 * @generated
	 * @ordered
	 */
	protected DisziplineType diszipline;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJuriResultDetail() <em>Juri Result Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuriResultDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<JuriResultDetailType> juriResultDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuriResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.JURI_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType getDiszipline() {
		if (diszipline != null && diszipline.eIsProxy()) {
			InternalEObject oldDiszipline = (InternalEObject)diszipline;
			diszipline = (DisziplineType)eResolveProxy(oldDiszipline);
			if (diszipline != oldDiszipline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.JURI_RESULT_TYPE__DISZIPLINE, oldDiszipline, diszipline));
			}
		}
		return diszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType basicGetDiszipline() {
		return diszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiszipline(DisziplineType newDiszipline) {
		DisziplineType oldDiszipline = diszipline;
		diszipline = newDiszipline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURI_RESULT_TYPE__DISZIPLINE, oldDiszipline, diszipline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURI_RESULT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JuriResultDetailType> getJuriResultDetail() {
		if (juriResultDetail == null) {
			juriResultDetail = new EObjectContainmentEList<JuriResultDetailType>(JuriResultDetailType.class, this, ContestPackage.JURI_RESULT_TYPE__JURI_RESULT_DETAIL);
		}
		return juriResultDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.JURI_RESULT_TYPE__JURI_RESULT_DETAIL:
				return ((InternalEList<?>)getJuriResultDetail()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContestPackage.JURI_RESULT_TYPE__DISZIPLINE:
				if (resolve) return getDiszipline();
				return basicGetDiszipline();
			case ContestPackage.JURI_RESULT_TYPE__VALUE:
				return getValue();
			case ContestPackage.JURI_RESULT_TYPE__JURI_RESULT_DETAIL:
				return getJuriResultDetail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContestPackage.JURI_RESULT_TYPE__DISZIPLINE:
				setDiszipline((DisziplineType)newValue);
				return;
			case ContestPackage.JURI_RESULT_TYPE__VALUE:
				setValue((Double)newValue);
				return;
			case ContestPackage.JURI_RESULT_TYPE__JURI_RESULT_DETAIL:
				getJuriResultDetail().clear();
				getJuriResultDetail().addAll((Collection<? extends JuriResultDetailType>)newValue);
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
			case ContestPackage.JURI_RESULT_TYPE__DISZIPLINE:
				setDiszipline((DisziplineType)null);
				return;
			case ContestPackage.JURI_RESULT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ContestPackage.JURI_RESULT_TYPE__JURI_RESULT_DETAIL:
				getJuriResultDetail().clear();
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
			case ContestPackage.JURI_RESULT_TYPE__DISZIPLINE:
				return diszipline != null;
			case ContestPackage.JURI_RESULT_TYPE__VALUE:
				return value != VALUE_EDEFAULT;
			case ContestPackage.JURI_RESULT_TYPE__JURI_RESULT_DETAIL:
				return juriResultDetail != null && !juriResultDetail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //JuriResultTypeImpl