/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.LookupTableType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.LookupTableTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.LookupTableTypeImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.LookupTableTypeImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.LookupTableTypeImpl#getDisziplines <em>Disziplines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupTableTypeImpl extends EObjectImpl implements LookupTableType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected double minVal = MIN_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected double maxVal = MAX_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisziplines() <em>Disziplines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisziplines()
	 * @generated
	 * @ordered
	 */
	protected EList<DisziplineType> disziplines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.LOOKUP_TABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.LOOKUP_TABLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(double newMinVal) {
		double oldMinVal = minVal;
		minVal = newMinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.LOOKUP_TABLE_TYPE__MIN_VAL, oldMinVal, minVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(double newMaxVal) {
		double oldMaxVal = maxVal;
		maxVal = newMaxVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.LOOKUP_TABLE_TYPE__MAX_VAL, oldMaxVal, maxVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisziplineType> getDisziplines() {
		if (disziplines == null) {
			disziplines = new EObjectWithInverseResolvingEList<DisziplineType>(DisziplineType.class, this, ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES, ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE);
		}
		return disziplines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getValue(double value) {
		double retVal = 0.0;
		if (this.maxVal > this.minVal) {
			retVal = (value - minVal) / (this.maxVal - this.minVal);
		} else if (this.minVal != this.maxVal) {
			retVal = (minVal - value) / (this.minVal - this.maxVal);
		}
		if (retVal < 0) {
			retVal = 0;
		}
		if (retVal > 1) {
			retVal = 1;
		}
		return retVal * 10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisziplines()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES:
				return ((InternalEList<?>)getDisziplines()).basicRemove(otherEnd, msgs);
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
			case ContestPackage.LOOKUP_TABLE_TYPE__ID:
				return getId();
			case ContestPackage.LOOKUP_TABLE_TYPE__MIN_VAL:
				return getMinVal();
			case ContestPackage.LOOKUP_TABLE_TYPE__MAX_VAL:
				return getMaxVal();
			case ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES:
				return getDisziplines();
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
			case ContestPackage.LOOKUP_TABLE_TYPE__ID:
				setId((String)newValue);
				return;
			case ContestPackage.LOOKUP_TABLE_TYPE__MIN_VAL:
				setMinVal((Double)newValue);
				return;
			case ContestPackage.LOOKUP_TABLE_TYPE__MAX_VAL:
				setMaxVal((Double)newValue);
				return;
			case ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES:
				getDisziplines().clear();
				getDisziplines().addAll((Collection<? extends DisziplineType>)newValue);
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
			case ContestPackage.LOOKUP_TABLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ContestPackage.LOOKUP_TABLE_TYPE__MIN_VAL:
				setMinVal(MIN_VAL_EDEFAULT);
				return;
			case ContestPackage.LOOKUP_TABLE_TYPE__MAX_VAL:
				setMaxVal(MAX_VAL_EDEFAULT);
				return;
			case ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES:
				getDisziplines().clear();
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
			case ContestPackage.LOOKUP_TABLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContestPackage.LOOKUP_TABLE_TYPE__MIN_VAL:
				return minVal != MIN_VAL_EDEFAULT;
			case ContestPackage.LOOKUP_TABLE_TYPE__MAX_VAL:
				return maxVal != MAX_VAL_EDEFAULT;
			case ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES:
				return disziplines != null && !disziplines.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", minVal: ");
		result.append(minVal);
		result.append(", maxVal: ");
		result.append(maxVal);
		result.append(')');
		return result.toString();
	}

} //LookupTableTypeImpl