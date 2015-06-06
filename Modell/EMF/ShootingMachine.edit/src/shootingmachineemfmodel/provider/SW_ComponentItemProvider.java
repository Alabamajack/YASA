/**
 */
package shootingmachineemfmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import shootingmachineemfmodel.SW_Component;
import shootingmachineemfmodel.ShootingmachineemfmodelFactory;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * This is the item provider adapter for a {@link shootingmachineemfmodel.SW_Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SW_ComponentItemProvider
	extends ComponentItemProvider
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
	public SW_ComponentItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC);
			childrenFeatures.add(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_RUNNABLE_SWC);
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
	 * This returns SW_Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SW_Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SW_Component_type");
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

		switch (notification.getFeatureID(SW_Component.class)) {
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC:
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_RUNNABLE_SWC:
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
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createSender()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createClient()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createSendEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createReceiver()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createServer()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_PORTS_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createGetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ShootingmachineemfmodelPackage.Literals.SW_COMPONENT__HAS_RUNNABLE_SWC,
				 ShootingmachineemfmodelFactory.eINSTANCE.createRunnable()));
	}

}