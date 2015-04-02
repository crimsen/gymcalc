/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import de.gymcalc.exercise.ElementGroup;
import de.gymcalc.exercise.ElementReferenceGroup;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.Gadget;

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
 * An implementation of the model object '<em><b>Gadget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.GadgetImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.GadgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.GadgetImpl#getReferenceGroups <em>Reference Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GadgetImpl extends EObjectImpl implements Gadget {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementGroup> groups;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getReferenceGroups() <em>Reference Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementReferenceGroup> referenceGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GadgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.GADGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<ElementGroup>(ElementGroup.class, this, ExercisePackage.GADGET__GROUPS);
		}
		return groups;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.GADGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementReferenceGroup> getReferenceGroups() {
		if (referenceGroups == null) {
			referenceGroups = new EObjectContainmentEList<ElementReferenceGroup>(ElementReferenceGroup.class, this, ExercisePackage.GADGET__REFERENCE_GROUPS);
		}
		return referenceGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.GADGET__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case ExercisePackage.GADGET__REFERENCE_GROUPS:
				return ((InternalEList<?>)getReferenceGroups()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.GADGET__GROUPS:
				return getGroups();
			case ExercisePackage.GADGET__NAME:
				return getName();
			case ExercisePackage.GADGET__REFERENCE_GROUPS:
				return getReferenceGroups();
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
			case ExercisePackage.GADGET__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ElementGroup>)newValue);
				return;
			case ExercisePackage.GADGET__NAME:
				setName((String)newValue);
				return;
			case ExercisePackage.GADGET__REFERENCE_GROUPS:
				getReferenceGroups().clear();
				getReferenceGroups().addAll((Collection<? extends ElementReferenceGroup>)newValue);
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
			case ExercisePackage.GADGET__GROUPS:
				getGroups().clear();
				return;
			case ExercisePackage.GADGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExercisePackage.GADGET__REFERENCE_GROUPS:
				getReferenceGroups().clear();
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
			case ExercisePackage.GADGET__GROUPS:
				return groups != null && !groups.isEmpty();
			case ExercisePackage.GADGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExercisePackage.GADGET__REFERENCE_GROUPS:
				return referenceGroups != null && !referenceGroups.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GadgetImpl
