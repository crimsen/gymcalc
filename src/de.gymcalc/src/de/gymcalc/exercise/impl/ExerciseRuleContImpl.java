/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.ExerciseRuleCont;
import de.gymcalc.exercise.Gadget;
import de.gymcalc.exercise.Rule;
import de.gymcalc.exercise.Ruleset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Cont</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseRuleContImpl#getGadgets <em>Gadgets</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseRuleContImpl#getRulesets <em>Rulesets</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseRuleContImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExerciseRuleContImpl extends EObjectImpl implements ExerciseRuleCont {
	/**
	 * The cached value of the '{@link #getGadgets() <em>Gadgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGadgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Gadget> gadgets;

	/**
	 * The cached value of the '{@link #getRulesets() <em>Rulesets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesets()
	 * @generated
	 * @ordered
	 */
	protected EList<Ruleset> rulesets;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExerciseRuleContImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.EXERCISE_RULE_CONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gadget> getGadgets() {
		if (gadgets == null) {
			gadgets = new EObjectContainmentEList<Gadget>(Gadget.class, this, ExercisePackage.EXERCISE_RULE_CONT__GADGETS);
		}
		return gadgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruleset> getRulesets() {
		if (rulesets == null) {
			rulesets = new EObjectContainmentEList<Ruleset>(Ruleset.class, this, ExercisePackage.EXERCISE_RULE_CONT__RULESETS);
		}
		return rulesets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, ExercisePackage.EXERCISE_RULE_CONT__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.EXERCISE_RULE_CONT__GADGETS:
				return ((InternalEList<?>)getGadgets()).basicRemove(otherEnd, msgs);
			case ExercisePackage.EXERCISE_RULE_CONT__RULESETS:
				return ((InternalEList<?>)getRulesets()).basicRemove(otherEnd, msgs);
			case ExercisePackage.EXERCISE_RULE_CONT__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.EXERCISE_RULE_CONT__GADGETS:
				return getGadgets();
			case ExercisePackage.EXERCISE_RULE_CONT__RULESETS:
				return getRulesets();
			case ExercisePackage.EXERCISE_RULE_CONT__RULES:
				return getRules();
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
			case ExercisePackage.EXERCISE_RULE_CONT__GADGETS:
				getGadgets().clear();
				getGadgets().addAll((Collection<? extends Gadget>)newValue);
				return;
			case ExercisePackage.EXERCISE_RULE_CONT__RULESETS:
				getRulesets().clear();
				getRulesets().addAll((Collection<? extends Ruleset>)newValue);
				return;
			case ExercisePackage.EXERCISE_RULE_CONT__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case ExercisePackage.EXERCISE_RULE_CONT__GADGETS:
				getGadgets().clear();
				return;
			case ExercisePackage.EXERCISE_RULE_CONT__RULESETS:
				getRulesets().clear();
				return;
			case ExercisePackage.EXERCISE_RULE_CONT__RULES:
				getRules().clear();
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
			case ExercisePackage.EXERCISE_RULE_CONT__GADGETS:
				return gadgets != null && !gadgets.isEmpty();
			case ExercisePackage.EXERCISE_RULE_CONT__RULESETS:
				return rulesets != null && !rulesets.isEmpty();
			case ExercisePackage.EXERCISE_RULE_CONT__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExerciseRuleContImpl
