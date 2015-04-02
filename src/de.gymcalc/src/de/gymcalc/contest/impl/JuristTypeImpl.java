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
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuristTypeImpl#getJuri <em>Juri</em>}</li>
 * </ul>
 * </p>
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
		}
		return super.eIsSet(featureID);
	}

} //JuristTypeImpl