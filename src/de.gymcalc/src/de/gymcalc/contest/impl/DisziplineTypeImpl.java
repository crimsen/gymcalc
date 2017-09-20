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
import de.gymcalc.contest.StationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diszipline Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.DisziplineTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.DisziplineTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.DisziplineTypeImpl#getStation <em>Station</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.DisziplineTypeImpl#getLookuptable <em>Lookuptable</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.DisziplineTypeImpl#getCalculationkey <em>Calculationkey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisziplineTypeImpl extends EObjectImpl implements DisziplineType {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected StationType station;

	/**
	 * The cached value of the '{@link #getLookuptable() <em>Lookuptable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookuptable()
	 * @generated
	 * @ordered
	 */
	protected LookupTableType lookuptable;

	/**
	 * The default value of the '{@link #getCalculationkey() <em>Calculationkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationkey()
	 * @generated
	 * @ordered
	 */
	protected static final String CALCULATIONKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalculationkey() <em>Calculationkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationkey()
	 * @generated
	 * @ordered
	 */
	protected String calculationkey = CALCULATIONKEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisziplineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.DISZIPLINE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.DISZIPLINE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.DISZIPLINE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationType getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (StationType)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.DISZIPLINE_TYPE__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationType basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStation(StationType newStation) {
		StationType oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.DISZIPLINE_TYPE__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupTableType getLookuptable() {
		if (lookuptable != null && lookuptable.eIsProxy()) {
			InternalEObject oldLookuptable = (InternalEObject)lookuptable;
			lookuptable = (LookupTableType)eResolveProxy(oldLookuptable);
			if (lookuptable != oldLookuptable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE, oldLookuptable, lookuptable));
			}
		}
		return lookuptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupTableType basicGetLookuptable() {
		return lookuptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookuptable(LookupTableType newLookuptable, NotificationChain msgs) {
		LookupTableType oldLookuptable = lookuptable;
		lookuptable = newLookuptable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE, oldLookuptable, newLookuptable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookuptable(LookupTableType newLookuptable) {
		if (newLookuptable != lookuptable) {
			NotificationChain msgs = null;
			if (lookuptable != null)
				msgs = ((InternalEObject)lookuptable).eInverseRemove(this, ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES, LookupTableType.class, msgs);
			if (newLookuptable != null)
				msgs = ((InternalEObject)newLookuptable).eInverseAdd(this, ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES, LookupTableType.class, msgs);
			msgs = basicSetLookuptable(newLookuptable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE, newLookuptable, newLookuptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalculationkey() {
		return calculationkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationkey(String newCalculationkey) {
		String oldCalculationkey = calculationkey;
		calculationkey = newCalculationkey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.DISZIPLINE_TYPE__CALCULATIONKEY, oldCalculationkey, calculationkey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE:
				if (lookuptable != null)
					msgs = ((InternalEObject)lookuptable).eInverseRemove(this, ContestPackage.LOOKUP_TABLE_TYPE__DISZIPLINES, LookupTableType.class, msgs);
				return basicSetLookuptable((LookupTableType)otherEnd, msgs);
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
			case ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE:
				return basicSetLookuptable(null, msgs);
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
			case ContestPackage.DISZIPLINE_TYPE__ID:
				return getId();
			case ContestPackage.DISZIPLINE_TYPE__NAME:
				return getName();
			case ContestPackage.DISZIPLINE_TYPE__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE:
				if (resolve) return getLookuptable();
				return basicGetLookuptable();
			case ContestPackage.DISZIPLINE_TYPE__CALCULATIONKEY:
				return getCalculationkey();
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
			case ContestPackage.DISZIPLINE_TYPE__ID:
				setId((String)newValue);
				return;
			case ContestPackage.DISZIPLINE_TYPE__NAME:
				setName((String)newValue);
				return;
			case ContestPackage.DISZIPLINE_TYPE__STATION:
				setStation((StationType)newValue);
				return;
			case ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE:
				setLookuptable((LookupTableType)newValue);
				return;
			case ContestPackage.DISZIPLINE_TYPE__CALCULATIONKEY:
				setCalculationkey((String)newValue);
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
			case ContestPackage.DISZIPLINE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ContestPackage.DISZIPLINE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContestPackage.DISZIPLINE_TYPE__STATION:
				setStation((StationType)null);
				return;
			case ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE:
				setLookuptable((LookupTableType)null);
				return;
			case ContestPackage.DISZIPLINE_TYPE__CALCULATIONKEY:
				setCalculationkey(CALCULATIONKEY_EDEFAULT);
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
			case ContestPackage.DISZIPLINE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContestPackage.DISZIPLINE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContestPackage.DISZIPLINE_TYPE__STATION:
				return station != null;
			case ContestPackage.DISZIPLINE_TYPE__LOOKUPTABLE:
				return lookuptable != null;
			case ContestPackage.DISZIPLINE_TYPE__CALCULATIONKEY:
				return CALCULATIONKEY_EDEFAULT == null ? calculationkey != null : !CALCULATIONKEY_EDEFAULT.equals(calculationkey);
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
		result.append(", name: ");
		result.append(name);
		result.append(", calculationkey: ");
		result.append(calculationkey);
		result.append(')');
		return result.toString();
	}

} //DisziplineTypeImpl