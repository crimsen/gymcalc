/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.exercise.Difficulty;
import de.gymcalc.exercise.DifficultyValueEntry;
import de.gymcalc.exercise.Element;
import de.gymcalc.exercise.ElementEvent;
import de.gymcalc.exercise.ElementGroup;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.ElementReferenceGroup;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExerciseCont;
import de.gymcalc.exercise.ExerciseEvent;
import de.gymcalc.exercise.ExerciseFactory;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.ExerciseRuleCont;
import de.gymcalc.exercise.Gadget;
import de.gymcalc.exercise.IElement;
import de.gymcalc.exercise.InitialValue;
import de.gymcalc.exercise.Rule;
import de.gymcalc.exercise.RuleElements;
import de.gymcalc.exercise.RuleFinalElement;
import de.gymcalc.exercise.RuleGroup;
import de.gymcalc.exercise.RuleSpecialGroup;
import de.gymcalc.exercise.Ruleset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExercisePackageImpl extends EPackageImpl implements ExercisePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exerciseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSpecialGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleFinalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementReferenceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gadgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exerciseRuleContEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exerciseContEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass difficultyValueEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exerciseEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum difficultyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.gymcalc.exercise.ExercisePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExercisePackageImpl() {
		super(eNS_URI, ExerciseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExercisePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExercisePackage init() {
		if (isInited) return (ExercisePackage)EPackage.Registry.INSTANCE.getEPackage(ExercisePackage.eNS_URI);

		// Obtain or create and register package
		ExercisePackageImpl theExercisePackage = (ExercisePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExercisePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExercisePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ContestPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExercisePackage.createPackageContents();

		// Initialize created meta-data
		theExercisePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExercisePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExercisePackage.eNS_URI, theExercisePackage);
		return theExercisePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExercise() {
		return exerciseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Elements() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Finalelement() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Ruleset() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Athlet() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Diszipline() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExercise_InitialValue() {
		return (EAttribute)exerciseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExercise_VideoRef() {
		return (EAttribute)exerciseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Events() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIElement() {
		return iElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Group() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Difficulty() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementInstance() {
		return elementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementInstance_Element() {
		return (EReference)elementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleset() {
		return rulesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleset_Rules() {
		return (EReference)rulesetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleset_Name() {
		return (EAttribute)rulesetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleElements() {
		return ruleElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleElements_MinDifficulty() {
		return (EAttribute)ruleElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleElements_CountOfElements() {
		return (EAttribute)ruleElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleElements_DifficultyValueMap() {
		return (EReference)ruleElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleGroup() {
		return ruleGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleGroup_CountOfGroups() {
		return (EAttribute)ruleGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleGroup_MinDifficulty() {
		return (EAttribute)ruleGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleSpecialGroup() {
		return ruleSpecialGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleSpecialGroup_Groups() {
		return (EReference)ruleSpecialGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleFinalElement() {
		return ruleFinalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFinalElement_DifficultyValueMap() {
		return (EReference)ruleFinalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialValue() {
		return initialValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialValue_Excercise() {
		return (EReference)initialValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialValue_Ruleset() {
		return (EReference)initialValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementGroup() {
		return elementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_Elements() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroup_Name() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroup_Number() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementReferenceGroup() {
		return elementReferenceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementReferenceGroup_Name() {
		return (EAttribute)elementReferenceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementReferenceGroup_Elements() {
		return (EReference)elementReferenceGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGadget() {
		return gadgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGadget_Groups() {
		return (EReference)gadgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGadget_Name() {
		return (EAttribute)gadgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGadget_ReferenceGroups() {
		return (EReference)gadgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExerciseRuleCont() {
		return exerciseRuleContEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseRuleCont_Gadgets() {
		return (EReference)exerciseRuleContEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseRuleCont_Rulesets() {
		return (EReference)exerciseRuleContEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseRuleCont_Rules() {
		return (EReference)exerciseRuleContEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExerciseCont() {
		return exerciseContEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseCont_Exercises() {
		return (EReference)exerciseContEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifficultyValueEntry() {
		return difficultyValueEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifficultyValueEntry_Difficulty() {
		return (EAttribute)difficultyValueEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifficultyValueEntry_Value() {
		return (EAttribute)difficultyValueEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExerciseEvent() {
		return exerciseEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExerciseEvent_StartTime() {
		return (EAttribute)exerciseEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExerciseEvent_DurationTime() {
		return (EAttribute)exerciseEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementEvent() {
		return elementEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementEvent_Element() {
		return (EReference)elementEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDifficulty() {
		return difficultyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseFactory getExerciseFactory() {
		return (ExerciseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		exerciseEClass = createEClass(EXERCISE);
		createEReference(exerciseEClass, EXERCISE__ELEMENTS);
		createEReference(exerciseEClass, EXERCISE__FINALELEMENT);
		createEReference(exerciseEClass, EXERCISE__RULESET);
		createEReference(exerciseEClass, EXERCISE__ATHLET);
		createEReference(exerciseEClass, EXERCISE__DISZIPLINE);
		createEAttribute(exerciseEClass, EXERCISE__INITIAL_VALUE);
		createEAttribute(exerciseEClass, EXERCISE__VIDEO_REF);
		createEReference(exerciseEClass, EXERCISE__EVENTS);

		iElementEClass = createEClass(IELEMENT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__GROUP);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__DIFFICULTY);
		createEAttribute(elementEClass, ELEMENT__ID);

		elementInstanceEClass = createEClass(ELEMENT_INSTANCE);
		createEReference(elementInstanceEClass, ELEMENT_INSTANCE__ELEMENT);

		rulesetEClass = createEClass(RULESET);
		createEReference(rulesetEClass, RULESET__RULES);
		createEAttribute(rulesetEClass, RULESET__NAME);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);

		ruleElementsEClass = createEClass(RULE_ELEMENTS);
		createEAttribute(ruleElementsEClass, RULE_ELEMENTS__MIN_DIFFICULTY);
		createEAttribute(ruleElementsEClass, RULE_ELEMENTS__COUNT_OF_ELEMENTS);
		createEReference(ruleElementsEClass, RULE_ELEMENTS__DIFFICULTY_VALUE_MAP);

		ruleGroupEClass = createEClass(RULE_GROUP);
		createEAttribute(ruleGroupEClass, RULE_GROUP__COUNT_OF_GROUPS);
		createEAttribute(ruleGroupEClass, RULE_GROUP__MIN_DIFFICULTY);

		ruleSpecialGroupEClass = createEClass(RULE_SPECIAL_GROUP);
		createEReference(ruleSpecialGroupEClass, RULE_SPECIAL_GROUP__GROUPS);

		ruleFinalElementEClass = createEClass(RULE_FINAL_ELEMENT);
		createEReference(ruleFinalElementEClass, RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP);

		initialValueEClass = createEClass(INITIAL_VALUE);
		createEReference(initialValueEClass, INITIAL_VALUE__EXCERCISE);
		createEReference(initialValueEClass, INITIAL_VALUE__RULESET);

		elementGroupEClass = createEClass(ELEMENT_GROUP);
		createEReference(elementGroupEClass, ELEMENT_GROUP__ELEMENTS);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__NAME);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__NUMBER);

		elementReferenceGroupEClass = createEClass(ELEMENT_REFERENCE_GROUP);
		createEAttribute(elementReferenceGroupEClass, ELEMENT_REFERENCE_GROUP__NAME);
		createEReference(elementReferenceGroupEClass, ELEMENT_REFERENCE_GROUP__ELEMENTS);

		gadgetEClass = createEClass(GADGET);
		createEReference(gadgetEClass, GADGET__GROUPS);
		createEAttribute(gadgetEClass, GADGET__NAME);
		createEReference(gadgetEClass, GADGET__REFERENCE_GROUPS);

		exerciseRuleContEClass = createEClass(EXERCISE_RULE_CONT);
		createEReference(exerciseRuleContEClass, EXERCISE_RULE_CONT__GADGETS);
		createEReference(exerciseRuleContEClass, EXERCISE_RULE_CONT__RULESETS);
		createEReference(exerciseRuleContEClass, EXERCISE_RULE_CONT__RULES);

		exerciseContEClass = createEClass(EXERCISE_CONT);
		createEReference(exerciseContEClass, EXERCISE_CONT__EXERCISES);

		difficultyValueEntryEClass = createEClass(DIFFICULTY_VALUE_ENTRY);
		createEAttribute(difficultyValueEntryEClass, DIFFICULTY_VALUE_ENTRY__DIFFICULTY);
		createEAttribute(difficultyValueEntryEClass, DIFFICULTY_VALUE_ENTRY__VALUE);

		exerciseEventEClass = createEClass(EXERCISE_EVENT);
		createEAttribute(exerciseEventEClass, EXERCISE_EVENT__START_TIME);
		createEAttribute(exerciseEventEClass, EXERCISE_EVENT__DURATION_TIME);

		elementEventEClass = createEClass(ELEMENT_EVENT);
		createEReference(elementEventEClass, ELEMENT_EVENT__ELEMENT);

		// Create enums
		difficultyEEnum = createEEnum(DIFFICULTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContestPackage theContestPackage = (ContestPackage)EPackage.Registry.INSTANCE.getEPackage(ContestPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(this.getIElement());
		elementInstanceEClass.getESuperTypes().add(this.getIElement());
		ruleElementsEClass.getESuperTypes().add(this.getRule());
		ruleGroupEClass.getESuperTypes().add(this.getRule());
		ruleSpecialGroupEClass.getESuperTypes().add(this.getRuleGroup());
		ruleFinalElementEClass.getESuperTypes().add(this.getRule());
		elementEventEClass.getESuperTypes().add(this.getExerciseEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(exerciseEClass, Exercise.class, "Exercise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExercise_Elements(), this.getElementInstance(), null, "elements", null, 0, -1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExercise_Finalelement(), this.getElementInstance(), null, "finalelement", null, 0, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercise_Ruleset(), this.getRuleset(), null, "ruleset", null, 1, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercise_Athlet(), theContestPackage.getAthletType(), null, "athlet", null, 1, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercise_Diszipline(), theContestPackage.getDisziplineType(), null, "diszipline", null, 1, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExercise_InitialValue(), theXMLTypePackage.getDouble(), "initialValue", "0.0", 1, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExercise_VideoRef(), theXMLTypePackage.getAnyURI(), "videoRef", null, 0, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercise_Events(), this.getExerciseEvent(), null, "events", null, 0, -1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iElementEClass, IElement.class, "IElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iElementEClass, this.getElementGroup(), "getGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iElementEClass, theXMLTypePackage.getString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iElementEClass, this.getDifficulty(), "getDifficulty", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Group(), this.getElementGroup(), this.getElementGroup_Elements(), "group", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Difficulty(), this.getDifficulty(), "difficulty", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementInstanceEClass, ElementInstance.class, "ElementInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementInstance_Element(), this.getElement(), null, "element", null, 1, 1, ElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulesetEClass, Ruleset.class, "Ruleset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleset_Rules(), this.getRule(), null, "rules", null, 0, -1, Ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleset_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(rulesetEClass, ecorePackage.getEDouble(), "getPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExercise(), "exercise", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ruleEClass, ecorePackage.getEDouble(), "getPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExercise(), "exercise", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleElementsEClass, RuleElements.class, "RuleElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleElements_MinDifficulty(), this.getDifficulty(), "minDifficulty", null, 1, 1, RuleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleElements_CountOfElements(), theXMLTypePackage.getInt(), "countOfElements", null, 1, 1, RuleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleElements_DifficultyValueMap(), this.getDifficultyValueEntry(), null, "difficultyValueMap", null, 0, -1, RuleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleGroupEClass, RuleGroup.class, "RuleGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleGroup_CountOfGroups(), theXMLTypePackage.getInt(), "countOfGroups", null, 1, 1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleGroup_MinDifficulty(), this.getDifficulty(), "minDifficulty", null, 1, 1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleSpecialGroupEClass, RuleSpecialGroup.class, "RuleSpecialGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleSpecialGroup_Groups(), this.getElementReferenceGroup(), null, "groups", null, 0, -1, RuleSpecialGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleFinalElementEClass, RuleFinalElement.class, "RuleFinalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleFinalElement_DifficultyValueMap(), this.getDifficultyValueEntry(), null, "difficultyValueMap", null, 0, -1, RuleFinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialValueEClass, InitialValue.class, "InitialValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialValue_Excercise(), this.getExercise(), null, "excercise", null, 1, 1, InitialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialValue_Ruleset(), this.getRuleset(), null, "ruleset", null, 1, 1, InitialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementGroupEClass, ElementGroup.class, "ElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementGroup_Elements(), this.getElement(), this.getElement_Group(), "elements", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementGroup_Number(), theXMLTypePackage.getInt(), "number", null, 0, 1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementReferenceGroupEClass, ElementReferenceGroup.class, "ElementReferenceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementReferenceGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ElementReferenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementReferenceGroup_Elements(), this.getElement(), null, "elements", null, 0, -1, ElementReferenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gadgetEClass, Gadget.class, "Gadget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGadget_Groups(), this.getElementGroup(), null, "groups", null, 0, -1, Gadget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGadget_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, Gadget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGadget_ReferenceGroups(), this.getElementReferenceGroup(), null, "referenceGroups", null, 0, -1, Gadget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exerciseRuleContEClass, ExerciseRuleCont.class, "ExerciseRuleCont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExerciseRuleCont_Gadgets(), this.getGadget(), null, "gadgets", null, 0, -1, ExerciseRuleCont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExerciseRuleCont_Rulesets(), this.getRuleset(), null, "rulesets", null, 0, -1, ExerciseRuleCont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExerciseRuleCont_Rules(), this.getRule(), null, "rules", null, 0, -1, ExerciseRuleCont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exerciseContEClass, ExerciseCont.class, "ExerciseCont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExerciseCont_Exercises(), this.getExercise(), null, "exercises", null, 0, -1, ExerciseCont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(difficultyValueEntryEClass, DifficultyValueEntry.class, "DifficultyValueEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifficultyValueEntry_Difficulty(), this.getDifficulty(), "difficulty", null, 1, 1, DifficultyValueEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifficultyValueEntry_Value(), theXMLTypePackage.getDouble(), "value", null, 1, 1, DifficultyValueEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exerciseEventEClass, ExerciseEvent.class, "ExerciseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExerciseEvent_StartTime(), ecorePackage.getEDouble(), "startTime", null, 0, 1, ExerciseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExerciseEvent_DurationTime(), ecorePackage.getEDouble(), "durationTime", null, 0, 1, ExerciseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEventEClass, ElementEvent.class, "ElementEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementEvent_Element(), this.getElementInstance(), null, "element", null, 1, 1, ElementEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(difficultyEEnum, Difficulty.class, "Difficulty");
		addEEnumLiteral(difficultyEEnum, Difficulty.TE);
		addEEnumLiteral(difficultyEEnum, Difficulty.NE);
		addEEnumLiteral(difficultyEEnum, Difficulty.A);
		addEEnumLiteral(difficultyEEnum, Difficulty.B);
		addEEnumLiteral(difficultyEEnum, Difficulty.C);
		addEEnumLiteral(difficultyEEnum, Difficulty.D);
		addEEnumLiteral(difficultyEEnum, Difficulty.E);
		addEEnumLiteral(difficultyEEnum, Difficulty.F);

		// Create resource
		createResource(eNS_URI);
	}

} //ExercisePackageImpl
