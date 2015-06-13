/**
 */
package shootingmachineemfmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.ShootingmachineemfmodelFactory;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * This is the item provider adapter for a {@link shootingmachineemfmodel.Brick} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BrickItemProvider
	extends StandardclassItemProvider
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
	public BrickItemProvider(AdapterFactory adapterFactory) {
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

			addHasInterBrickInBrickPropertyDescriptor(object);
			addHasInterBrickOutBrickPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Inter Brick In Brick feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInterBrickInBrickPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Brick_hasInterBrickInBrick_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Brick_hasInterBrickInBrick_feature", "_UI_Brick_type"),
				 ShootingmachineemfmodelPackage.Literals.BRICK__HAS_INTER_BRICK_IN_BRICK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Inter Brick Out Brick feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInterBrickOutBrickPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Brick_hasInterBrickOutBrick_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Brick_hasInterBrickOutBrick_feature", "_UI_Brick_type"),
				 ShootingmachineemfmodelPackage.Literals.BRICK__HAS_INTER_BRICK_OUT_BRICK,
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
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_TASK_BRICK);
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_EVENT_BRICK);
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_ALARM_BRICK);
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_HW_PORTS_BRICK);
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
	 * This returns Brick.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Brick"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Brick)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Brick_type") :
			getString("_UI_Brick_type") + " " + label;
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

		switch (notification.getFeatureID(Brick.class)) {
			case ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK:
			case ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK:
			case ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK:
			case ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK:
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
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_TASK_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_EVENT_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_ALARM_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_HW_PORTS_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createHWIntern()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_HW_PORTS_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createHWExtern()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_HW_PORTS_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createMotor()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.BRICK__HAS_HW_PORTS_BRICK,
				 ShootingmachineemfmodelFactory.eINSTANCE.createDisplay()));
	}

}
