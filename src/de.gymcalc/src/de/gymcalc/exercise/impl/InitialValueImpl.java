/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.InitialValue;
import de.gymcalc.exercise.Ruleset;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.InitialValueImpl#getExcercise <em>Excercise</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.InitialValueImpl#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitialValueImpl extends EObjectImpl implements InitialValue {
	/**
	 * The cached value of the '{@link #getExcercise() <em>Excercise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcercise()
	 * @generated
	 * @ordered
	 */
	protected Exercise excercise;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Ruleset ruleset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.INITIAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise getExcercise() {
		if (excercise != null && excercise.eIsProxy()) {
			InternalEObject oldExcercise = (InternalEObject)excercise;
			excercise = (Exercise)eResolveProxy(oldExcercise);
			if (excercise != oldExcercise) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.INITIAL_VALUE__EXCERCISE, oldExcercise, excercise));
			}
		}
		return excercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise basicGetExcercise() {
		return excercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcercise(Exercise newExcercise) {
		Exercise oldExcercise = excercise;
		excercise = newExcercise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.INITIAL_VALUE__EXCERCISE, oldExcercise, excercise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruleset getRuleset() {
		if (ruleset != null && ruleset.eIsProxy()) {
			InternalEObject oldRuleset = (InternalEObject)ruleset;
			ruleset = (Ruleset)eResolveProxy(oldRuleset);
			if (ruleset != oldRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.INITIAL_VALUE__RULESET, oldRuleset, ruleset));
			}
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruleset basicGetRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Ruleset newRuleset) {
		Ruleset oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.INITIAL_VALUE__RULESET, oldRuleset, ruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.INITIAL_VALUE__EXCERCISE:
				if (resolve) return getExcercise();
				return basicGetExcercise();
			case ExercisePackage.INITIAL_VALUE__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
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
			case ExercisePackage.INITIAL_VALUE__EXCERCISE:
				setExcercise((Exercise)newValue);
				return;
			case ExercisePackage.INITIAL_VALUE__RULESET:
				setRuleset((Ruleset)newValue);
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
			case ExercisePackage.INITIAL_VALUE__EXCERCISE:
				setExcercise((Exercise)null);
				return;
			case ExercisePackage.INITIAL_VALUE__RULESET:
				setRuleset((Ruleset)null);
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
			case ExercisePackage.INITIAL_VALUE__EXCERCISE:
				return excercise != null;
			case ExercisePackage.INITIAL_VALUE__RULESET:
				return ruleset != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialValueImpl
