/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;

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
 * An implementation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.ResultTypeImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ResultTypeImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.ResultTypeImpl#getJuriresult <em>Juriresult</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultTypeImpl extends EObjectImpl implements ResultType {
	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final double POINTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected double points = POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJuriresult() <em>Juriresult</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuriresult()
	 * @generated
	 * @ordered
	 */
	protected EList<JuriResultType> juriresult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.RESULT_TYPE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(double newPoints) {
		double oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.RESULT_TYPE__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JuriResultType> getJuriresult() {
		if (juriresult == null) {
			juriresult = new EObjectContainmentEList<JuriResultType>(JuriResultType.class, this, ContestPackage.RESULT_TYPE__JURIRESULT);
		}
		return juriresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContestPackage.RESULT_TYPE__JURIRESULT:
				return ((InternalEList<?>)getJuriresult()).basicRemove(otherEnd, msgs);
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
			case ContestPackage.RESULT_TYPE__RANK:
				return getRank();
			case ContestPackage.RESULT_TYPE__POINTS:
				return getPoints();
			case ContestPackage.RESULT_TYPE__JURIRESULT:
				return getJuriresult();
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
			case ContestPackage.RESULT_TYPE__RANK:
				setRank((Integer)newValue);
				return;
			case ContestPackage.RESULT_TYPE__POINTS:
				setPoints((Double)newValue);
				return;
			case ContestPackage.RESULT_TYPE__JURIRESULT:
				getJuriresult().clear();
				getJuriresult().addAll((Collection<? extends JuriResultType>)newValue);
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
			case ContestPackage.RESULT_TYPE__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case ContestPackage.RESULT_TYPE__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case ContestPackage.RESULT_TYPE__JURIRESULT:
				getJuriresult().clear();
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
			case ContestPackage.RESULT_TYPE__RANK:
				return rank != RANK_EDEFAULT;
			case ContestPackage.RESULT_TYPE__POINTS:
				return points != POINTS_EDEFAULT;
			case ContestPackage.RESULT_TYPE__JURIRESULT:
				return juriresult != null && !juriresult.isEmpty();
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
		result.append(" (rank: ");
		result.append(rank);
		result.append(", points: ");
		result.append(points);
		result.append(')');
		return result.toString();
	}

} //ResultTypeImpl