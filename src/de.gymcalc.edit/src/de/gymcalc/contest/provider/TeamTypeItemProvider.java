/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.provider;


import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.gymcalc.contest.TeamType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamTypeItemProvider
	extends WinnerTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAthletPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_TeamType_athlet_feature"),
				 getString("_UI_TeamType_athlet_description"),
				 ContestPackage.Literals.TEAM_TYPE__ATHLET,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(ContestPackage.Literals.TEAM_TYPE__ATHLET);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TeamType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TeamType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TeamType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TeamType_type") :
			getString("_UI_TeamType_type") + " " + label;
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

		switch (notification.getFeatureID(TeamType.class)) {
			case ContestPackage.TEAM_TYPE__ATHLET:
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
	}

	class AthletPropertyDescriptor extends ItemPropertyDescriptor 
	{
		public AthletPropertyDescriptor () {
			super(((ComposeableAdapterFactory)getAdapterFactory ()).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_TeamType_athlet_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_TeamType_athlet_feature", "_UI_TeamType_type"),
					 ContestPackage.Literals.TEAM_TYPE__ATHLET,
					 true,
					 false,
					 true,
					 null,
					 null,
					 null);
			}
		public Collection<EObject> getChoiceOfValues(Object object)
		{
			ArrayList <EObject> RetVal = new ArrayList <EObject> ();
			TeamJuriResultType o = (TeamJuriResultType) object;
			EList<?> athlets = ((TeamType) o.eContainer ().eContainer ()).getAthlet ();
			String disziplineName = o.getDiszipline ().getName (); 
			for (Iterator<?> i = athlets.iterator (); i.hasNext ();) {
				AthletType athlet = (AthletType) i.next ();
				for (Iterator<?> j = athlet.getResult ().getJuriresult ().iterator ();
					j.hasNext ();) {
					JuriResultType juriResult = (JuriResultType) j.next ();
					if (0 == juriResult.getDiszipline ().getName ().compareTo (disziplineName)) {
						RetVal.add (juriResult);
						break;
					}
				}
			}
			return RetVal;
		}
	}
}
