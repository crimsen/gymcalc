/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.gymcalc.exercise.Difficulty;
import de.gymcalc.exercise.Element;
import de.gymcalc.exercise.ElementGroup;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.RuleGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.RuleGroupImpl#getCountOfGroups <em>Count Of Groups</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.RuleGroupImpl#getMinDifficulty <em>Min Difficulty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleGroupImpl extends RuleImpl implements RuleGroup {
	/**
	 * The default value of the '{@link #getCountOfGroups() <em>Count Of Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountOfGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_OF_GROUPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountOfGroups() <em>Count Of Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountOfGroups()
	 * @generated
	 * @ordered
	 */
	protected int countOfGroups = COUNT_OF_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDifficulty() <em>Min Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final Difficulty MIN_DIFFICULTY_EDEFAULT = Difficulty.TE;

	/**
	 * The cached value of the '{@link #getMinDifficulty() <em>Min Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDifficulty()
	 * @generated
	 * @ordered
	 */
	protected Difficulty minDifficulty = MIN_DIFFICULTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.RULE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountOfGroups() {
		return countOfGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountOfGroups(int newCountOfGroups) {
		int oldCountOfGroups = countOfGroups;
		countOfGroups = newCountOfGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.RULE_GROUP__COUNT_OF_GROUPS, oldCountOfGroups, countOfGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Difficulty getMinDifficulty() {
		return minDifficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDifficulty(Difficulty newMinDifficulty) {
		Difficulty oldMinDifficulty = minDifficulty;
		minDifficulty = newMinDifficulty == null ? MIN_DIFFICULTY_EDEFAULT : newMinDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.RULE_GROUP__MIN_DIFFICULTY, oldMinDifficulty, minDifficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.RULE_GROUP__COUNT_OF_GROUPS:
				return getCountOfGroups();
			case ExercisePackage.RULE_GROUP__MIN_DIFFICULTY:
				return getMinDifficulty();
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
			case ExercisePackage.RULE_GROUP__COUNT_OF_GROUPS:
				setCountOfGroups((Integer)newValue);
				return;
			case ExercisePackage.RULE_GROUP__MIN_DIFFICULTY:
				setMinDifficulty((Difficulty)newValue);
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
			case ExercisePackage.RULE_GROUP__COUNT_OF_GROUPS:
				setCountOfGroups(COUNT_OF_GROUPS_EDEFAULT);
				return;
			case ExercisePackage.RULE_GROUP__MIN_DIFFICULTY:
				setMinDifficulty(MIN_DIFFICULTY_EDEFAULT);
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
			case ExercisePackage.RULE_GROUP__COUNT_OF_GROUPS:
				return countOfGroups != COUNT_OF_GROUPS_EDEFAULT;
			case ExercisePackage.RULE_GROUP__MIN_DIFFICULTY:
				return minDifficulty != MIN_DIFFICULTY_EDEFAULT;
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
		result.append(" (countOfGroups: ");
		result.append(countOfGroups);
		result.append(", minDifficulty: ");
		result.append(minDifficulty);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.turnen.spremberg.exercise.impl.ruleTypeImpl#getPoints(de.turnen.spremberg.exercise.exerciseType)
	 */
	@Override
	public double getPoints(Exercise exercise) {
		double retVal = 0.0;
		HashSet<Element> elements = new HashSet<Element>();
		{
			/* unique elements with a difficulty greater equal than
			 * 	minDifficulty
			 */
			Iterator<ElementInstance> j = exercise.getElements().iterator();
			while( j.hasNext() ){
				ElementInstance element = j.next();
				if( 0 >= minDifficulty.compareTo( element.getDifficulty() ) ) {
					elements.add( element.getElement() );
				}
			}
		}
		ElementInstance finalElement = exercise.getFinalelement();
		if( null != finalElement) {
			elements.remove( finalElement.getElement() );
		}
		HashSet<ElementGroup> groups = new HashSet<ElementGroup>( );
		{
			Iterator<Element> j = elements.iterator();
			while( j.hasNext() ){
				Element element = j.next();
				groups.add( element.getGroup() );
			}
		}
		Iterator<ElementGroup> i = groups.iterator();
		int count = this.getCountOfGroups();
		while( count > 0 && i.hasNext() ) {
			i.next();
			retVal += 0.5;
			count -= 1;
		}
		return retVal;
	}

} //RuleGroupImpl
