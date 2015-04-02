/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.gymcalc.exercise.Difficulty;
import de.gymcalc.exercise.DifficultyValueEntry;
import de.gymcalc.exercise.Element;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.RuleElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.RuleElementsImpl#getMinDifficulty <em>Min Difficulty</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.RuleElementsImpl#getCountOfElements <em>Count Of Elements</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.RuleElementsImpl#getDifficultyValueMap <em>Difficulty Value Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleElementsImpl extends RuleImpl implements RuleElements {
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
	 * The default value of the '{@link #getCountOfElements() <em>Count Of Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountOfElements()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_OF_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountOfElements() <em>Count Of Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountOfElements()
	 * @generated
	 * @ordered
	 */
	protected int countOfElements = COUNT_OF_ELEMENTS_EDEFAULT;

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
	protected RuleElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.RULE_ELEMENTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.RULE_ELEMENTS__MIN_DIFFICULTY, oldMinDifficulty, minDifficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountOfElements() {
		return countOfElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountOfElements(int newCountOfElements) {
		int oldCountOfElements = countOfElements;
		countOfElements = newCountOfElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.RULE_ELEMENTS__COUNT_OF_ELEMENTS, oldCountOfElements, countOfElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifficultyValueEntry> getDifficultyValueMap() {
		if (difficultyValueMap == null) {
			difficultyValueMap = new EObjectContainmentEList<DifficultyValueEntry>(DifficultyValueEntry.class, this, ExercisePackage.RULE_ELEMENTS__DIFFICULTY_VALUE_MAP);
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
			case ExercisePackage.RULE_ELEMENTS__DIFFICULTY_VALUE_MAP:
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
			case ExercisePackage.RULE_ELEMENTS__MIN_DIFFICULTY:
				return getMinDifficulty();
			case ExercisePackage.RULE_ELEMENTS__COUNT_OF_ELEMENTS:
				return getCountOfElements();
			case ExercisePackage.RULE_ELEMENTS__DIFFICULTY_VALUE_MAP:
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
			case ExercisePackage.RULE_ELEMENTS__MIN_DIFFICULTY:
				setMinDifficulty((Difficulty)newValue);
				return;
			case ExercisePackage.RULE_ELEMENTS__COUNT_OF_ELEMENTS:
				setCountOfElements((Integer)newValue);
				return;
			case ExercisePackage.RULE_ELEMENTS__DIFFICULTY_VALUE_MAP:
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
			case ExercisePackage.RULE_ELEMENTS__MIN_DIFFICULTY:
				setMinDifficulty(MIN_DIFFICULTY_EDEFAULT);
				return;
			case ExercisePackage.RULE_ELEMENTS__COUNT_OF_ELEMENTS:
				setCountOfElements(COUNT_OF_ELEMENTS_EDEFAULT);
				return;
			case ExercisePackage.RULE_ELEMENTS__DIFFICULTY_VALUE_MAP:
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
			case ExercisePackage.RULE_ELEMENTS__MIN_DIFFICULTY:
				return minDifficulty != MIN_DIFFICULTY_EDEFAULT;
			case ExercisePackage.RULE_ELEMENTS__COUNT_OF_ELEMENTS:
				return countOfElements != COUNT_OF_ELEMENTS_EDEFAULT;
			case ExercisePackage.RULE_ELEMENTS__DIFFICULTY_VALUE_MAP:
				return difficultyValueMap != null && !difficultyValueMap.isEmpty();
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
		result.append(" (minDifficulty: ");
		result.append(minDifficulty);
		result.append(", countOfElements: ");
		result.append(countOfElements);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.turnen.spremberg.exercise.impl.ruleTypeImpl#getPoints(de.turnen.spremberg.exercise.exerciseType)
	 */
	@Override
	public double getPoints(Exercise exercise) {
		double retVal = 0.0;
		ArrayList<Element> elements = new ArrayList<Element>( );
		Iterator<ElementInstance> j = exercise.getElements().iterator();
		while( j.hasNext() ){
			ElementInstance element = j.next();
			if( ! elements.contains( element.getElement()) ) {
				elements.add(element.getElement());
			}
		}
		if( null != exercise.getFinalelement() ){
			retVal += valueOfElement( exercise.getFinalelement().getElement() );
			// elemente duerfen nicht das Abgangselement enthalten.
			elements.remove( exercise.getFinalelement().getElement());
		} else {
			// fehlender Abgang ist ein Punkt weniger
			retVal -= 1;
		}
		Collections.sort(elements, new DifficultyComparator());
		Iterator<Element> i = elements.iterator();
		int count = this.countOfElements;
		while( count > 0 && i.hasNext() ) {
			Element element = i.next();
			retVal += valueOfElement( element );
			count -= 1;
		}
		// fehlende element werden mit -1 gewertet
		retVal -= count;
		return retVal;
	}
	
	private double valueOfElement( Element element ) {
		double retVal = 0.0;
		Difficulty difficulty = element.getDifficulty();
		if( 0 <= difficulty.compareTo(this.minDifficulty) ){
			// Legacy if there are no entries in the value map the we do assume
			// to have the old values specified until endof 2013
			if( 0 == this.difficultyValueMap.size() ) {
				switch( difficulty.getValue() ) {
				case Difficulty.A_VALUE:
					retVal += 0.1;
					break;
				case Difficulty.B_VALUE:
					retVal += 0.2;
					break;
				case Difficulty.C_VALUE:
					retVal += 0.3;
					break;
				case Difficulty.D_VALUE:
					retVal += 0.4;
					break;
				case Difficulty.E_VALUE:
					retVal += 0.5;
					break;
				case Difficulty.F_VALUE:
					retVal += 0.6;
					break;
				case Difficulty.NE_VALUE:
					retVal += 0.1;
					break;
				case Difficulty.TE_VALUE:
					retVal += 0.1;
					break;
				}
			} else {
				for( DifficultyValueEntry d : difficultyValueMap ){
					if( 0 == difficulty.compareTo( d.getDifficulty() ) ) {
						retVal = d.getValue();
						break;
					}
				}
			}
		}
		return retVal;
	}

	public class DifficultyComparator implements Comparator<Element> {
		@Override
		public int compare(Element o1, Element o2) {
			return -o1.getDifficulty().compareTo(o2.getDifficulty());
		}
	}


} //RuleElementsImpl
