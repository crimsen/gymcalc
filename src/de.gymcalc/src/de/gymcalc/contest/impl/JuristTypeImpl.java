/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jurist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getJuri <em>Juri</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getWishApparatus <em>Wish Apparatus</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JuristTypeImpl extends EObjectImpl implements JuristType {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected PersonType person;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected OrganizationType organization;

	/**
	 * The default value of the '{@link #getWishApparatus() <em>Wish Apparatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWishApparatus()
	 * @generated
	 * @ordered
	 */
	protected static final String WISH_APPARATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWishApparatus() <em>Wish Apparatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWishApparatus()
	 * @generated
	 * @ordered
	 */
	protected String wishApparatus = WISH_APPARATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuristTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.JURIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (PersonType)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.JURIST_TYPE__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(PersonType newPerson) {
		PersonType oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURIST_TYPE__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (OrganizationType)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.JURIST_TYPE__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(OrganizationType newOrganization) {
		OrganizationType oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURIST_TYPE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuriType getJuri() {
		if (eContainerFeatureID() != ContestPackage.JURIST_TYPE__JURI) return null;
		return (JuriType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJuri(JuriType newJuri, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJuri, ContestPackage.JURIST_TYPE__JURI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJuri(JuriType newJuri) {
		if (newJuri != eInternalContainer() || (eContainerFeatureID() != ContestPackage.JURIST_TYPE__JURI && newJuri != null)) {
			if (EcoreUtil.isAncestor(this, newJuri))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJuri != null)
				msgs = ((InternalEObject)newJuri).eInverseAdd(this, ContestPackage.JURI_TYPE__JURIST, JuriType.class, msgs);
			msgs = basicSetJuri(newJuri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURIST_TYPE__JURI, newJuri, newJuri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWishApparatus() {
		return wishApparatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWishApparatus(String newWishApparatus) {
		String oldWishApparatus = wishApparatus;
		wishApparatus = newWishApparatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURIST_TYPE__WISH_APPARATUS, oldWishApparatus, wishApparatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURIST_TYPE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		String RetVal = getPerson().getName ();
		RetVal += ", ";
		RetVal += getPerson().getFirstname ();
		return RetVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.JURIST_TYPE__JURI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJuri((JuriType)otherEnd, msgs);
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
			case ContestPackage.JURIST_TYPE__JURI:
				return basicSetJuri(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContestPackage.JURIST_TYPE__JURI:
				return eInternalContainer().eInverseRemove(this, ContestPackage.JURI_TYPE__JURIST, JuriType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContestPackage.JURIST_TYPE__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case ContestPackage.JURIST_TYPE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ContestPackage.JURIST_TYPE__JURI:
				return getJuri();
			case ContestPackage.JURIST_TYPE__WISH_APPARATUS:
				return getWishApparatus();
			case ContestPackage.JURIST_TYPE__LICENSE:
				return getLicense();
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
			case ContestPackage.JURIST_TYPE__PERSON:
				setPerson((PersonType)newValue);
				return;
			case ContestPackage.JURIST_TYPE__ORGANIZATION:
				setOrganization((OrganizationType)newValue);
				return;
			case ContestPackage.JURIST_TYPE__JURI:
				setJuri((JuriType)newValue);
				return;
			case ContestPackage.JURIST_TYPE__WISH_APPARATUS:
				setWishApparatus((String)newValue);
				return;
			case ContestPackage.JURIST_TYPE__LICENSE:
				setLicense((String)newValue);
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
			case ContestPackage.JURIST_TYPE__PERSON:
				setPerson((PersonType)null);
				return;
			case ContestPackage.JURIST_TYPE__ORGANIZATION:
				setOrganization((OrganizationType)null);
				return;
			case ContestPackage.JURIST_TYPE__JURI:
				setJuri((JuriType)null);
				return;
			case ContestPackage.JURIST_TYPE__WISH_APPARATUS:
				setWishApparatus(WISH_APPARATUS_EDEFAULT);
				return;
			case ContestPackage.JURIST_TYPE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
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
			case ContestPackage.JURIST_TYPE__PERSON:
				return person != null;
			case ContestPackage.JURIST_TYPE__ORGANIZATION:
				return organization != null;
			case ContestPackage.JURIST_TYPE__JURI:
				return getJuri() != null;
			case ContestPackage.JURIST_TYPE__WISH_APPARATUS:
				return WISH_APPARATUS_EDEFAULT == null ? wishApparatus != null : !WISH_APPARATUS_EDEFAULT.equals(wishApparatus);
			case ContestPackage.JURIST_TYPE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
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
		result.append(" (wishApparatus: ");
		result.append(wishApparatus);
		result.append(", license: ");
		result.append(license);
		result.append(')');
		return result.toString();
	}

} //JuristTypeImpl