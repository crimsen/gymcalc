/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.gymcalc.exercise.Difficulty;
import de.gymcalc.exercise.DifficultyValueEntry;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.RuleFinalElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Final Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.RuleFinalElementImpl#getDifficultyValueMap <em>Difficulty Value Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleFinalElementImpl extends RuleImpl implements RuleFinalElement {
	/**
	 * The cached value of the '{@link #getDifficultyValueMap() <em>Difficulty Value Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyValueMap()
	 * @generated
	 * @ordered
	 */
	protected EList<DifficultyValueEntry> difficultyValueMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleFinalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.RULE_FINAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifficultyValueEntry> getDifficultyValueMap() {
		if (difficultyValueMap == null) {
			difficultyValueMap = new EObjectContainmentEList<DifficultyValueEntry>(DifficultyValueEntry.class, this, ExercisePackage.RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP);
		}
		return difficultyValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP:
				return ((InternalEList<?>)getDifficultyValueMap()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP:
				return getDifficultyValueMap();
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
			case ExercisePackage.RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP:
				getDifficultyValueMap().clear();
				getDifficultyValueMap().addAll((Collection<? extends DifficultyValueEntry>)newValue);
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
			case ExercisePackage.RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP:
				getDifficultyValueMap().clear();
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
			case ExercisePackage.RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP:
				return difficultyValueMap != null && !difficultyValueMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.turnen.spremberg.exercise.impl.ruleTypeImpl#getPoints(de.turnen.spremberg.exercise.exerciseType)
	 */
	@Override
	public double getPoints(Exercise exercise) {
		double retVal = 0.0;
		ElementInstance element = exercise.getFinalelement();
		if( null != element ) {
			Difficulty difficulty = element.getDifficulty();
			Iterator<DifficultyValueEntry> i = getDifficultyValueMap().iterator();
			while(i.hasNext()){
				DifficultyValueEntry entry = i.next(); 
				if( 0 == entry.getDifficulty().compareTo(difficulty) ) {
					retVal = entry.getValue();
					break;
				}
			}
		}
		return retVal;
	}

} //RuleFinalElementImpl
