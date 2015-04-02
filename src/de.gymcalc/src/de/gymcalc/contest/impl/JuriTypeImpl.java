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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Juri Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.contest.impl.JuriTypeImpl#getJurist <em>Jurist</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuriTypeImpl#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.contest.impl.JuriTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JuriTypeImpl extends EObjectImpl implements JuriType {
	/**
	 * The cached value of the '{@link #getJurist() <em>Jurist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurist()
	 * @generated
	 * @ordered
	 */
	protected EList<JuristType> jurist;

	/**
	 * The cached value of the '{@link #getDiszipline() <em>Diszipline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiszipline()
	 * @generated
	 * @ordered
	 */
	protected EList<DisziplineType> diszipline;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuriTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContestPackage.Literals.JURI_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JuristType> getJurist() {
		if (jurist == null) {
			jurist = new EObjectContainmentWithInverseEList<JuristType>(JuristType.class, this, ContestPackage.JURI_TYPE__JURIST, ContestPackage.JURIST_TYPE__JURI);
		}
		return jurist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisziplineType> getDiszipline() {
		if (diszipline == null) {
			diszipline = new EObjectResolvingEList<DisziplineType>(DisziplineType.class, this, ContestPackage.JURI_TYPE__DISZIPLINE);
		}
		return diszipline;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContestPackage.JURI_TYPE__NAME, oldName, name));
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
			case ContestPackage.JURI_TYPE__JURIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJurist()).basicAdd(otherEnd, msgs);
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
			case ContestPackage.JURI_TYPE__JURIST:
				return ((InternalEList<?>)getJurist()).basicRemove(otherEnd, msgs);
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
			case ContestPackage.JURI_TYPE__JURIST:
				return getJurist();
			case ContestPackage.JURI_TYPE__DISZIPLINE:
				return getDiszipline();
			case ContestPackage.JURI_TYPE__NAME:
				return getName();
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
			case ContestPackage.JURI_TYPE__JURIST:
				getJurist().clear();
				getJurist().addAll((Collection<? extends JuristType>)newValue);
				return;
			case ContestPackage.JURI_TYPE__DISZIPLINE:
				getDiszipline().clear();
				getDiszipline().addAll((Collection<? extends DisziplineType>)newValue);
				return;
			case ContestPackage.JURI_TYPE__NAME:
				setName((String)newValue);
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
			case ContestPackage.JURI_TYPE__JURIST:
				getJurist().clear();
				return;
			case ContestPackage.JURI_TYPE__DISZIPLINE:
				getDiszipline().clear();
				return;
			case ContestPackage.JURI_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case ContestPackage.JURI_TYPE__JURIST:
				return jurist != null && !jurist.isEmpty();
			case ContestPackage.JURI_TYPE__DISZIPLINE:
				return diszipline != null && !diszipline.isEmpty();
			case ContestPackage.JURI_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //JuriTypeImpl