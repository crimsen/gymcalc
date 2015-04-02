/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.gymcalc.exercise.Element;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.ElementReferenceGroup;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.RuleSpecialGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Special Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.RuleSpecialGroupImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleSpecialGroupImpl extends RuleGroupImpl implements RuleSpecialGroup {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementReferenceGroup> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleSpecialGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.RULE_SPECIAL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementReferenceGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<ElementReferenceGroup>(ElementReferenceGroup.class, this, ExercisePackage.RULE_SPECIAL_GROUP__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.RULE_SPECIAL_GROUP__GROUPS:
				return getGroups();
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
			case ExercisePackage.RULE_SPECIAL_GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ElementReferenceGroup>)newValue);
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
			case ExercisePackage.RULE_SPECIAL_GROUP__GROUPS:
				getGroups().clear();
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
			case ExercisePackage.RULE_SPECIAL_GROUP__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.gymcalc.exercise.impl.RuleGroupImpl#getPoints(de.gymcalc.exercise.Exercise)
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
		EList<ElementReferenceGroup> groups = this.getGroups();
		HashSet<ElementReferenceGroup> executedGroups = new HashSet<ElementReferenceGroup>( );
		{
			Iterator<Element> j = elements.iterator();
			while( j.hasNext() ){
				Element element = j.next();
				Iterator<ElementReferenceGroup> k = groups.iterator();
				while( k.hasNext() ) {
					ElementReferenceGroup group = k.next();
					EList< Element > groupElements = group.getElements();
					if( groupElements.contains( element) ) {
						executedGroups.add( group );
						break;
					}
				}
			}
		}
		Iterator<ElementReferenceGroup> i = executedGroups.iterator();
		int count = this.getCountOfGroups();
		while( count > 0 && i.hasNext() ) {
			i.next();
			retVal += 0.5;
		}
		return retVal;
	}

} //RuleSpecialGroupImpl
