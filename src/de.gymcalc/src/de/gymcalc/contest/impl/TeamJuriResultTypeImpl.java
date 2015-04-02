/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.TeamJuriResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Juri Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.TeamJuriResultTypeImpl#getJuriResult <em>Juri Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamJuriResultTypeImpl extends JuriResultTypeImpl implements TeamJuriResultType {
	/**
	 * The cached value of the '{@link #getJuriResult() <em>Juri Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuriResult()
	 * @generated
	 * @ordered
	 */
	protected EList<JuriResultType> juriResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamJuriResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.TEAM_JURI_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JuriResultType> getJuriResult() {
		if (juriResult == null) {
			juriResult = new EObjectResolvingEList<JuriResultType>(JuriResultType.class, this, ContestPackage.TEAM_JURI_RESULT_TYPE__JURI_RESULT);
		}
		return juriResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContestPackage.TEAM_JURI_RESULT_TYPE__JURI_RESULT:
				return getJuriResult();
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
			case ContestPackage.TEAM_JURI_RESULT_TYPE__JURI_RESULT:
				getJuriResult().clear();
				getJuriResult().addAll((Collection<? extends JuriResultType>)newValue);
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
			case ContestPackage.TEAM_JURI_RESULT_TYPE__JURI_RESULT:
				getJuriResult().clear();
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
			case ContestPackage.TEAM_JURI_RESULT_TYPE__JURI_RESULT:
				return juriResult != null && !juriResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TeamJuriResultTypeImpl