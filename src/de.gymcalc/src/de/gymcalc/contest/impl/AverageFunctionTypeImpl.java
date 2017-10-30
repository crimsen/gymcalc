/**
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.AverageFunctionType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Average Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.AverageFunctionTypeImpl#getDisziplines <em>Disziplines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AverageFunctionTypeImpl extends FunctionTypeImpl implements AverageFunctionType {
	/**
	 * The cached value of the '{@link #getDisziplines() <em>Disziplines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisziplines()
	 * @generated
	 * @ordered
	 */
	protected EList<DisziplineType> disziplines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AverageFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.AVERAGE_FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisziplineType> getDisziplines() {
		if (disziplines == null) {
			disziplines = new EObjectResolvingEList<DisziplineType>(DisziplineType.class, this, ContestPackage.AVERAGE_FUNCTION_TYPE__DISZIPLINES);
		}
		return disziplines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContestPackage.AVERAGE_FUNCTION_TYPE__DISZIPLINES:
				return getDisziplines();
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
			case ContestPackage.AVERAGE_FUNCTION_TYPE__DISZIPLINES:
				getDisziplines().clear();
				getDisziplines().addAll((Collection<? extends DisziplineType>)newValue);
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
			case ContestPackage.AVERAGE_FUNCTION_TYPE__DISZIPLINES:
				getDisziplines().clear();
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
			case ContestPackage.AVERAGE_FUNCTION_TYPE__DISZIPLINES:
				return disziplines != null && !disziplines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AverageFunctionTypeImpl
