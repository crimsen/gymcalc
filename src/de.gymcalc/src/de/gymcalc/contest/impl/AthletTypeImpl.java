/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.TeamType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Athlet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.AthletTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.AthletTypeImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.AthletTypeImpl#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AthletTypeImpl extends WinnerTypeImpl implements AthletType {
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
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected TeamType team;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected ChainType chain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AthletTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.ATHLET_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContestPackage.ATHLET_TYPE__PERSON, oldPerson, person));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.ATHLET_TYPE__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamType getTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(TeamType newTeam, NotificationChain msgs) {
		TeamType oldTeam = team;
		team = newTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContestPackage.ATHLET_TYPE__TEAM, oldTeam, newTeam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(TeamType newTeam) {
		if (newTeam != team) {
			NotificationChain msgs = null;
			if (team != null)
				msgs = ((InternalEObject)team).eInverseRemove(this, ContestPackage.TEAM_TYPE__ATHLET, TeamType.class, msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, ContestPackage.TEAM_TYPE__ATHLET, TeamType.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.ATHLET_TYPE__TEAM, newTeam, newTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainType getChain() {
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChain(ChainType newChain, NotificationChain msgs) {
		ChainType oldChain = chain;
		chain = newChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContestPackage.ATHLET_TYPE__CHAIN, oldChain, newChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChain(ChainType newChain) {
		if (newChain != chain) {
			NotificationChain msgs = null;
			if (chain != null)
				msgs = ((InternalEObject)chain).eInverseRemove(this, ContestPackage.CHAIN_TYPE__ATHLET, ChainType.class, msgs);
			if (newChain != null)
				msgs = ((InternalEObject)newChain).eInverseAdd(this, ContestPackage.CHAIN_TYPE__ATHLET, ChainType.class, msgs);
			msgs = basicSetChain(newChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.ATHLET_TYPE__CHAIN, newChain, newChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.ATHLET_TYPE__TEAM:
				if (team != null)
					msgs = ((InternalEObject)team).eInverseRemove(this, ContestPackage.TEAM_TYPE__ATHLET, TeamType.class, msgs);
				return basicSetTeam((TeamType)otherEnd, msgs);
			case ContestPackage.ATHLET_TYPE__CHAIN:
				if (chain != null)
					msgs = ((InternalEObject)chain).eInverseRemove(this, ContestPackage.CHAIN_TYPE__ATHLET, ChainType.class, msgs);
				return basicSetChain((ChainType)otherEnd, msgs);
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
			case ContestPackage.ATHLET_TYPE__TEAM:
				return basicSetTeam(null, msgs);
			case ContestPackage.ATHLET_TYPE__CHAIN:
				return basicSetChain(null, msgs);
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
			case ContestPackage.ATHLET_TYPE__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case ContestPackage.ATHLET_TYPE__TEAM:
				return getTeam();
			case ContestPackage.ATHLET_TYPE__CHAIN:
				return getChain();
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
			case ContestPackage.ATHLET_TYPE__PERSON:
				setPerson((PersonType)newValue);
				return;
			case ContestPackage.ATHLET_TYPE__TEAM:
				setTeam((TeamType)newValue);
				return;
			case ContestPackage.ATHLET_TYPE__CHAIN:
				setChain((ChainType)newValue);
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
			case ContestPackage.ATHLET_TYPE__PERSON:
				setPerson((PersonType)null);
				return;
			case ContestPackage.ATHLET_TYPE__TEAM:
				setTeam((TeamType)null);
				return;
			case ContestPackage.ATHLET_TYPE__CHAIN:
				setChain((ChainType)null);
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
			case ContestPackage.ATHLET_TYPE__PERSON:
				return person != null;
			case ContestPackage.ATHLET_TYPE__TEAM:
				return team != null;
			case ContestPackage.ATHLET_TYPE__CHAIN:
				return chain != null;
		}
		return super.eIsSet(featureID);
	}

} //AthletTypeImpl