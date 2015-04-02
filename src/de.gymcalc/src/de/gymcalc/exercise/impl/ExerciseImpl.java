/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

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

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExerciseEvent;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.Ruleset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exercise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getFinalelement <em>Finalelement</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getAthlet <em>Athlet</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getVideoRef <em>Video Ref</em>}</li>
 *   <li>{@link de.gymcalc.exercise.impl.ExerciseImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExerciseImpl extends EObjectImpl implements Exercise {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementInstance> elements;

	/**
	 * The cached value of the '{@link #getFinalelement() <em>Finalelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalelement()
	 * @generated
	 * @ordered
	 */
	protected ElementInstance finalelement;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Ruleset ruleset;

	/**
	 * The cached value of the '{@link #getAthlet() <em>Athlet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAthlet()
	 * @generated
	 * @ordered
	 */
	protected AthletType athlet;

	/**
	 * The cached value of the '{@link #getDiszipline() <em>Diszipline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiszipline()
	 * @generated
	 * @ordered
	 */
	protected DisziplineType diszipline;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected double initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoRef() <em>Video Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoRef()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoRef() <em>Video Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoRef()
	 * @generated
	 * @ordered
	 */
	protected String videoRef = VIDEO_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ExerciseEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExerciseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.EXERCISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementInstance> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElementInstance>(ElementInstance.class, this, ExercisePackage.EXERCISE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementInstance getFinalelement() {
		return finalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalelement(ElementInstance newFinalelement, NotificationChain msgs) {
		ElementInstance oldFinalelement = finalelement;
		finalelement = newFinalelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__FINALELEMENT, oldFinalelement, newFinalelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalelement(ElementInstance newFinalelement) {
		if (newFinalelement != finalelement) {
			NotificationChain msgs = null;
			if (finalelement != null)
				msgs = ((InternalEObject)finalelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.EXERCISE__FINALELEMENT, null, msgs);
			if (newFinalelement != null)
				msgs = ((InternalEObject)newFinalelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.EXERCISE__FINALELEMENT, null, msgs);
			msgs = basicSetFinalelement(newFinalelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__FINALELEMENT, newFinalelement, newFinalelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruleset getRuleset() {
		if (ruleset != null && ruleset.eIsProxy()) {
			InternalEObject oldRuleset = (InternalEObject)ruleset;
			ruleset = (Ruleset)eResolveProxy(oldRuleset);
			if (ruleset != oldRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.EXERCISE__RULESET, oldRuleset, ruleset));
			}
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruleset basicGetRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Ruleset newRuleset) {
		Ruleset oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__RULESET, oldRuleset, ruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AthletType getAthlet() {
		if (athlet != null && athlet.eIsProxy()) {
			InternalEObject oldAthlet = (InternalEObject)athlet;
			athlet = (AthletType)eResolveProxy(oldAthlet);
			if (athlet != oldAthlet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.EXERCISE__ATHLET, oldAthlet, athlet));
			}
		}
		return athlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AthletType basicGetAthlet() {
		return athlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAthlet(AthletType newAthlet) {
		AthletType oldAthlet = athlet;
		athlet = newAthlet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__ATHLET, oldAthlet, athlet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType getDiszipline() {
		if (diszipline != null && diszipline.eIsProxy()) {
			InternalEObject oldDiszipline = (InternalEObject)diszipline;
			diszipline = (DisziplineType)eResolveProxy(oldDiszipline);
			if (diszipline != oldDiszipline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.EXERCISE__DISZIPLINE, oldDiszipline, diszipline));
			}
		}
		return diszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType basicGetDiszipline() {
		return diszipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiszipline(DisziplineType newDiszipline) {
		DisziplineType oldDiszipline = diszipline;
		diszipline = newDiszipline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__DISZIPLINE, oldDiszipline, diszipline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(double newInitialValue) {
		double oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoRef() {
		return videoRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoRef(String newVideoRef) {
		String oldVideoRef = videoRef;
		videoRef = newVideoRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE__VIDEO_REF, oldVideoRef, videoRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExerciseEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<ExerciseEvent>(ExerciseEvent.class, this, ExercisePackage.EXERCISE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.EXERCISE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ExercisePackage.EXERCISE__FINALELEMENT:
				return basicSetFinalelement(null, msgs);
			case ExercisePackage.EXERCISE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.EXERCISE__ELEMENTS:
				return getElements();
			case ExercisePackage.EXERCISE__FINALELEMENT:
				return getFinalelement();
			case ExercisePackage.EXERCISE__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case ExercisePackage.EXERCISE__ATHLET:
				if (resolve) return getAthlet();
				return basicGetAthlet();
			case ExercisePackage.EXERCISE__DISZIPLINE:
				if (resolve) return getDiszipline();
				return basicGetDiszipline();
			case ExercisePackage.EXERCISE__INITIAL_VALUE:
				return getInitialValue();
			case ExercisePackage.EXERCISE__VIDEO_REF:
				return getVideoRef();
			case ExercisePackage.EXERCISE__EVENTS:
				return getEvents();
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
			case ExercisePackage.EXERCISE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ElementInstance>)newValue);
				return;
			case ExercisePackage.EXERCISE__FINALELEMENT:
				setFinalelement((ElementInstance)newValue);
				return;
			case ExercisePackage.EXERCISE__RULESET:
				setRuleset((Ruleset)newValue);
				return;
			case ExercisePackage.EXERCISE__ATHLET:
				setAthlet((AthletType)newValue);
				return;
			case ExercisePackage.EXERCISE__DISZIPLINE:
				setDiszipline((DisziplineType)newValue);
				return;
			case ExercisePackage.EXERCISE__INITIAL_VALUE:
				setInitialValue((Double)newValue);
				return;
			case ExercisePackage.EXERCISE__VIDEO_REF:
				setVideoRef((String)newValue);
				return;
			case ExercisePackage.EXERCISE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends ExerciseEvent>)newValue);
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
			case ExercisePackage.EXERCISE__ELEMENTS:
				getElements().clear();
				return;
			case ExercisePackage.EXERCISE__FINALELEMENT:
				setFinalelement((ElementInstance)null);
				return;
			case ExercisePackage.EXERCISE__RULESET:
				setRuleset((Ruleset)null);
				return;
			case ExercisePackage.EXERCISE__ATHLET:
				setAthlet((AthletType)null);
				return;
			case ExercisePackage.EXERCISE__DISZIPLINE:
				setDiszipline((DisziplineType)null);
				return;
			case ExercisePackage.EXERCISE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case ExercisePackage.EXERCISE__VIDEO_REF:
				setVideoRef(VIDEO_REF_EDEFAULT);
				return;
			case ExercisePackage.EXERCISE__EVENTS:
				getEvents().clear();
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
			case ExercisePackage.EXERCISE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ExercisePackage.EXERCISE__FINALELEMENT:
				return finalelement != null;
			case ExercisePackage.EXERCISE__RULESET:
				return ruleset != null;
			case ExercisePackage.EXERCISE__ATHLET:
				return athlet != null;
			case ExercisePackage.EXERCISE__DISZIPLINE:
				return diszipline != null;
			case ExercisePackage.EXERCISE__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
			case ExercisePackage.EXERCISE__VIDEO_REF:
				return VIDEO_REF_EDEFAULT == null ? videoRef != null : !VIDEO_REF_EDEFAULT.equals(videoRef);
			case ExercisePackage.EXERCISE__EVENTS:
				return events != null && !events.isEmpty();
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
		result.append(" (initialValue: ");
		result.append(initialValue);
		result.append(", videoRef: ");
		result.append(videoRef);
		result.append(')');
		return result.toString();
	}

} //ExerciseImpl
