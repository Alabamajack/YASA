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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import shootingmachineemfmodel.ShootingmachineemfmodelFactory;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * This is the item provider adapter for a {@link shootingmachineemfmodel.Runnable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunnableItemProvider
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
	public RunnableItemProvider(AdapterFactory adapterFactory) {
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

			addApplicationcodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Applicationcode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationcodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_applicationcode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_applicationcode_feature", "_UI_Runnable_type"),
				 ShootingmachineemfmodelPackage.Literals.RUNNABLE__APPLICATIONCODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS);
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
	 * This returns Runnable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Runnable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((shootingmachineemfmodel.Runnable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Runnable_type") :
			getString("_UI_Runnable_type") + " " + label;
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

		switch (notification.getFeatureID(shootingmachineemfmodel.Runnable.class)) {
			case ShootingmachineemfmodelPackage.RUNNABLE__APPLICATIONCODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS:
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
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createSender()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createClient()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createSendEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createReceiver()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createServer()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createGetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createOSPortIN()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.RUNNABLE__HAS_SW_PORTS,
				 ShootingmachineemfmodelFactory.eINSTANCE.createOSPortOUT()));
	}

}
