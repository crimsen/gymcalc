/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.LookupMapsType;
import de.gymcalc.contest.LookupTablesType;
import de.gymcalc.contest.StationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getChain <em>Chain</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getJuri <em>Juri</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getStation <em>Station</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getAddressbook <em>Addressbook</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getLookuptables <em>Lookuptables</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getLookupmaps <em>Lookupmaps</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ContestTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContestTypeImpl extends EObjectImpl implements ContestType {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassType> class_;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainType> chain;

	/**
	 * The cached value of the '{@link #getJuri() <em>Juri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuri()
	 * @generated
	 * @ordered
	 */
	protected EList<JuriType> juri;

	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected EList<StationType> station;

	/**
	 * The cached value of the '{@link #getAddressbook() <em>Addressbook</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressbook()
	 * @generated
	 * @ordered
	 */
	protected AddressBookType addressbook;

	/**
	 * The cached value of the '{@link #getLookuptables() <em>Lookuptables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookuptables()
	 * @generated
	 * @ordered
	 */
	protected LookupTablesType lookuptables;

	/**
	 * The cached value of the '{@link #getLookupmaps() <em>Lookupmaps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupmaps()
	 * @generated
	 * @ordered
	 */
	protected LookupMapsType lookupmaps;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.CONTEST_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassType> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<ClassType>(ClassType.class, this, ContestPackage.CONTEST_TYPE__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainType> getChain() {
		if (chain == null) {
			chain = new EObjectContainmentEList<ChainType>(ChainType.class, this, ContestPackage.CONTEST_TYPE__CHAIN);
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JuriType> getJuri() {
		if (juri == null) {
			juri = new EObjectContainmentEList<JuriType>(JuriType.class, this, ContestPackage.CONTEST_TYPE__JURI);
		}
		return juri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StationType> getStation() {
		if (station == null) {
			station = new EObjectContainmentEList<StationType>(StationType.class, this, ContestPackage.CONTEST_TYPE__STATION);
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBookType getAddressbook() {
		return addressbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressbook(AddressBookType newAddressbook, NotificationChain msgs) {
		AddressBookType oldAddressbook = addressbook;
		addressbook = newAddressbook;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__ADDRESSBOOK, oldAddressbook, newAddressbook);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressbook(AddressBookType newAddressbook) {
		if (newAddressbook != addressbook) {
			NotificationChain msgs = null;
			if (addressbook != null)
				msgs = ((InternalEObject)addressbook).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContestPackage.CONTEST_TYPE__ADDRESSBOOK, null, msgs);
			if (newAddressbook != null)
				msgs = ((InternalEObject)newAddressbook).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContestPackage.CONTEST_TYPE__ADDRESSBOOK, null, msgs);
			msgs = basicSetAddressbook(newAddressbook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__ADDRESSBOOK, newAddressbook, newAddressbook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupTablesType getLookuptables() {
		return lookuptables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookuptables(LookupTablesType newLookuptables, NotificationChain msgs) {
		LookupTablesType oldLookuptables = lookuptables;
		lookuptables = newLookuptables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__LOOKUPTABLES, oldLookuptables, newLookuptables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookuptables(LookupTablesType newLookuptables) {
		if (newLookuptables != lookuptables) {
			NotificationChain msgs = null;
			if (lookuptables != null)
				msgs = ((InternalEObject)lookuptables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContestPackage.CONTEST_TYPE__LOOKUPTABLES, null, msgs);
			if (newLookuptables != null)
				msgs = ((InternalEObject)newLookuptables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContestPackage.CONTEST_TYPE__LOOKUPTABLES, null, msgs);
			msgs = basicSetLookuptables(newLookuptables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__LOOKUPTABLES, newLookuptables, newLookuptables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMapsType getLookupmaps() {
		return lookupmaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookupmaps(LookupMapsType newLookupmaps, NotificationChain msgs) {
		LookupMapsType oldLookupmaps = lookupmaps;
		lookupmaps = newLookupmaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__LOOKUPMAPS, oldLookupmaps, newLookupmaps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookupmaps(LookupMapsType newLookupmaps) {
		if (newLookupmaps != lookupmaps) {
			NotificationChain msgs = null;
			if (lookupmaps != null)
				msgs = ((InternalEObject)lookupmaps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContestPackage.CONTEST_TYPE__LOOKUPMAPS, null, msgs);
			if (newLookupmaps != null)
				msgs = ((InternalEObject)newLookupmaps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContestPackage.CONTEST_TYPE__LOOKUPMAPS, null, msgs);
			msgs = basicSetLookupmaps(newLookupmaps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__LOOKUPMAPS, newLookupmaps, newLookupmaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CONTEST_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.CONTEST_TYPE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case ContestPackage.CONTEST_TYPE__CHAIN:
				return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
			case ContestPackage.CONTEST_TYPE__JURI:
				return ((InternalEList<?>)getJuri()).basicRemove(otherEnd, msgs);
			case ContestPackage.CONTEST_TYPE__STATION:
				return ((InternalEList<?>)getStation()).basicRemove(otherEnd, msgs);
			case ContestPackage.CONTEST_TYPE__ADDRESSBOOK:
				return basicSetAddressbook(null, msgs);
			case ContestPackage.CONTEST_TYPE__LOOKUPTABLES:
				return basicSetLookuptables(null, msgs);
			case ContestPackage.CONTEST_TYPE__LOOKUPMAPS:
				return basicSetLookupmaps(null, msgs);
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
			case ContestPackage.CONTEST_TYPE__ID:
				return getId();
			case ContestPackage.CONTEST_TYPE__NAME:
				return getName();
			case ContestPackage.CONTEST_TYPE__DATE:
				return getDate();
			case ContestPackage.CONTEST_TYPE__CLASS:
				return getClass_();
			case ContestPackage.CONTEST_TYPE__CHAIN:
				return getChain();
			case ContestPackage.CONTEST_TYPE__JURI:
				return getJuri();
			case ContestPackage.CONTEST_TYPE__STATION:
				return getStation();
			case ContestPackage.CONTEST_TYPE__ADDRESSBOOK:
				return getAddressbook();
			case ContestPackage.CONTEST_TYPE__LOOKUPTABLES:
				return getLookuptables();
			case ContestPackage.CONTEST_TYPE__LOOKUPMAPS:
				return getLookupmaps();
			case ContestPackage.CONTEST_TYPE__VERSION:
				return getVersion();
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
			case ContestPackage.CONTEST_TYPE__ID:
				setId((String)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__NAME:
				setName((String)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__DATE:
				setDate((Date)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends ClassType>)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__CHAIN:
				getChain().clear();
				getChain().addAll((Collection<? extends ChainType>)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__JURI:
				getJuri().clear();
				getJuri().addAll((Collection<? extends JuriType>)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__STATION:
				getStation().clear();
				getStation().addAll((Collection<? extends StationType>)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__ADDRESSBOOK:
				setAddressbook((AddressBookType)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__LOOKUPTABLES:
				setLookuptables((LookupTablesType)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__LOOKUPMAPS:
				setLookupmaps((LookupMapsType)newValue);
				return;
			case ContestPackage.CONTEST_TYPE__VERSION:
				setVersion((Integer)newValue);
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
			case ContestPackage.CONTEST_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ContestPackage.CONTEST_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContestPackage.CONTEST_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ContestPackage.CONTEST_TYPE__CLASS:
				getClass_().clear();
				return;
			case ContestPackage.CONTEST_TYPE__CHAIN:
				getChain().clear();
				return;
			case ContestPackage.CONTEST_TYPE__JURI:
				getJuri().clear();
				return;
			case ContestPackage.CONTEST_TYPE__STATION:
				getStation().clear();
				return;
			case ContestPackage.CONTEST_TYPE__ADDRESSBOOK:
				setAddressbook((AddressBookType)null);
				return;
			case ContestPackage.CONTEST_TYPE__LOOKUPTABLES:
				setLookuptables((LookupTablesType)null);
				return;
			case ContestPackage.CONTEST_TYPE__LOOKUPMAPS:
				setLookupmaps((LookupMapsType)null);
				return;
			case ContestPackage.CONTEST_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ContestPackage.CONTEST_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContestPackage.CONTEST_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContestPackage.CONTEST_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ContestPackage.CONTEST_TYPE__CLASS:
				return class_ != null && !class_.isEmpty();
			case ContestPackage.CONTEST_TYPE__CHAIN:
				return chain != null && !chain.isEmpty();
			case ContestPackage.CONTEST_TYPE__JURI:
				return juri != null && !juri.isEmpty();
			case ContestPackage.CONTEST_TYPE__STATION:
				return station != null && !station.isEmpty();
			case ContestPackage.CONTEST_TYPE__ADDRESSBOOK:
				return addressbook != null;
			case ContestPackage.CONTEST_TYPE__LOOKUPTABLES:
				return lookuptables != null;
			case ContestPackage.CONTEST_TYPE__LOOKUPMAPS:
				return lookupmaps != null;
			case ContestPackage.CONTEST_TYPE__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(", date: ");
		result.append(date);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ContestTypeImpl