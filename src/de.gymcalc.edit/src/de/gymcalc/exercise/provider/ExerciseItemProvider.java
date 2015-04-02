/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.gymcalc.exercise.Element;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExerciseFactory;
import de.gymcalc.exercise.ExercisePackage;

/**
 * This is the item provider adapter for a {@link de.gymcalc.exercise.Exercise} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExerciseItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addElementsPropertyDescriptor(object);
			addFinalelementPropertyDescriptor(object);
			addRulesetPropertyDescriptor(object);
			addAthletPropertyDescriptor(object);
			addDisziplinePropertyDescriptor(object);
			addInitialValuePropertyDescriptor(object);
			addVideoRefPropertyDescriptor(object);
			addEventsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_elements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_elements_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__ELEMENTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finalelement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalelementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_finalelement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_finalelement_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__FINALELEMENT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruleset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulesetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_ruleset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_ruleset_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__RULESET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Athlet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAthletPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_athlet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_athlet_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__ATHLET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diszipline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisziplinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_diszipline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_diszipline_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__DISZIPLINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_initialValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_initialValue_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__INITIAL_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Video Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVideoRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_videoRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_videoRef_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__VIDEO_REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exercise_events_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exercise_events_feature", "_UI_Exercise_type"),
				 ExercisePackage.Literals.EXERCISE__EVENTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExercisePackage.Literals.EXERCISE__ELEMENTS);
			childrenFeatures.add(ExercisePackage.Literals.EXERCISE__FINALELEMENT);
			childrenFeatures.add(ExercisePackage.Literals.EXERCISE__EVENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.
		EStructuralFeature retVal = super.getChildFeature(object, child);
		if( null == retVal && ( child instanceof Element ) ) {
			retVal = ExercisePackage.Literals.EXERCISE__ELEMENTS;
		}
		return retVal;
	}

	/**
	 * This returns Exercise.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Exercise"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Exercise exercise = (Exercise)object;
		return getString("_UI_Exercise_type") + " " + exercise.getInitialValue();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Exercise.class)) {
			case ExercisePackage.EXERCISE__INITIAL_VALUE:
			case ExercisePackage.EXERCISE__VIDEO_REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExercisePackage.EXERCISE__ELEMENTS:
			case ExercisePackage.EXERCISE__FINALELEMENT:
			case ExercisePackage.EXERCISE__EVENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExercisePackage.Literals.EXERCISE__ELEMENTS,
				 ExerciseFactory.eINSTANCE.createElementInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ExercisePackage.Literals.EXERCISE__FINALELEMENT,
				 ExerciseFactory.eINSTANCE.createElementInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ExercisePackage.Literals.EXERCISE__EVENTS,
				 ExerciseFactory.eINSTANCE.createExerciseEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ExercisePackage.Literals.EXERCISE__EVENTS,
				 ExerciseFactory.eINSTANCE.createElementEvent()));
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		CompoundCommand retVal = new CompoundCommand (CompoundCommand.MERGE_COMMAND_ALL);
		Iterator<?> i = collection.iterator ();
		while (i.hasNext()) {
			Object o = i.next ();
			if (o instanceof Element) {
				retVal.append(new AddElementCommand (domain, owner, feature, (Element) o));
			} else {
				Collection<Object> c = new ArrayList<Object> ();
				c.add(o);
				retVal.append(super.createAddCommand (domain, owner, feature, c, index));
			}
		}
		return retVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {
		CompoundCommand retVal = new CompoundCommand (CompoundCommand.MERGE_COMMAND_ALL);
		Iterator< ? > i = collection.iterator ();
		while (i.hasNext()) {
			Object o = i.next ();
			if (o instanceof Element &&
				owner instanceof EObject) {
				retVal.append(new AddElementCommand (domain, ( EObject ) owner, ExercisePackage.Literals.EXERCISE__ELEMENTS, (Element) o));
			} else {
				retVal.append( super.createDragAndDropCommand( domain, owner, location, operations,
					operation, collection ) );
			}
		}
		return retVal;
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ExercisePackage.Literals.EXERCISE__ELEMENTS ||
			childFeature == ExercisePackage.Literals.EXERCISE__FINALELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExerciseEditPlugin.INSTANCE;
	}

	class AddElementCommand extends CompoundCommand {

		public AddElementCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Element element) {
			super (CompoundCommand.MERGE_COMMAND_ALL);
			ElementInstance ei = ExerciseFactory.eINSTANCE.createElementInstance ();
			ei.setElement( element );
			append (AddCommand.create(domain, owner, ExercisePackage.Literals.ELEMENT_INSTANCE, ei));
		}
	}

}
