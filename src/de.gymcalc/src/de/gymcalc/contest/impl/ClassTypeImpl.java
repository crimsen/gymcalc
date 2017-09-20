/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.WinnerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.ClassTypeImpl#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ClassTypeImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ClassTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ClassTypeImpl#getCalculationkey <em>Calculationkey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassTypeImpl extends EObjectImpl implements ClassType {
	/**
	 * The cached value of the '{@link #getDiszipline() <em>Diszipline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiszipline()
	 * @generated
	 * @ordered
	 */
	protected EList<DisziplineType> diszipline;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected EList<WinnerType> winner;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getCalculationkey() <em>Calculationkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationkey()
	 * @generated
	 * @ordered
	 */
	protected static final String CALCULATIONKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalculationkey() <em>Calculationkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationkey()
	 * @generated
	 * @ordered
	 */
	protected String calculationkey = CALCULATIONKEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.CLASS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisziplineType> getDiszipline() {
		if (diszipline == null) {
			diszipline = new EObjectContainmentEList<DisziplineType>(DisziplineType.class, this, ContestPackage.CLASS_TYPE__DISZIPLINE);
		}
		return diszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WinnerType> getWinner() {
		if (winner == null) {
			winner = new EObjectContainmentWithInverseEList<WinnerType>(WinnerType.class, this, ContestPackage.CLASS_TYPE__WINNER, ContestPackage.WINNER_TYPE__CLASS);
		}
		return winner;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CLASS_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalculationkey() {
		return calculationkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationkey(String newCalculationkey) {
		String oldCalculationkey = calculationkey;
		calculationkey = newCalculationkey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.CLASS_TYPE__CALCULATIONKEY, oldCalculationkey, calculationkey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.CLASS_TYPE__WINNER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWinner()).basicAdd(otherEnd, msgs);
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
			case ContestPackage.CLASS_TYPE__DISZIPLINE:
				return ((InternalEList<?>)getDiszipline()).basicRemove(otherEnd, msgs);
			case ContestPackage.CLASS_TYPE__WINNER:
				return ((InternalEList<?>)getWinner()).basicRemove(otherEnd, msgs);
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
			case ContestPackage.CLASS_TYPE__DISZIPLINE:
				return getDiszipline();
			case ContestPackage.CLASS_TYPE__WINNER:
				return getWinner();
			case ContestPackage.CLASS_TYPE__NAME:
				return getName();
			case ContestPackage.CLASS_TYPE__CALCULATIONKEY:
				return getCalculationkey();
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
			case ContestPackage.CLASS_TYPE__DISZIPLINE:
				getDiszipline().clear();
				getDiszipline().addAll((Collection<? extends DisziplineType>)newValue);
				return;
			case ContestPackage.CLASS_TYPE__WINNER:
				getWinner().clear();
				getWinner().addAll((Collection<? extends WinnerType>)newValue);
				return;
			case ContestPackage.CLASS_TYPE__NAME:
				setName((String)newValue);
				return;
			case ContestPackage.CLASS_TYPE__CALCULATIONKEY:
				setCalculationkey((String)newValue);
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
			case ContestPackage.CLASS_TYPE__DISZIPLINE:
				getDiszipline().clear();
				return;
			case ContestPackage.CLASS_TYPE__WINNER:
				getWinner().clear();
				return;
			case ContestPackage.CLASS_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContestPackage.CLASS_TYPE__CALCULATIONKEY:
				setCalculationkey(CALCULATIONKEY_EDEFAULT);
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
			case ContestPackage.CLASS_TYPE__DISZIPLINE:
				return diszipline != null && !diszipline.isEmpty();
			case ContestPackage.CLASS_TYPE__WINNER:
				return winner != null && !winner.isEmpty();
			case ContestPackage.CLASS_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContestPackage.CLASS_TYPE__CALCULATIONKEY:
				return CALCULATIONKEY_EDEFAULT == null ? calculationkey != null : !CALCULATIONKEY_EDEFAULT.equals(calculationkey);
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
		result.append(", calculationkey: ");
		result.append(calculationkey);
		result.append(')');
		return result.toString();
	}

} //ClassTypeImpl