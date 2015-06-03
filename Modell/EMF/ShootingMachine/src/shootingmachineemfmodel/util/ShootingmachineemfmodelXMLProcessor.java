/**
 */
package shootingmachineemfmodel.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShootingmachineemfmodelXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShootingmachineemfmodelXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ShootingmachineemfmodelPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ShootingmachineemfmodelResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ShootingmachineemfmodelResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ShootingmachineemfmodelResourceFactoryImpl());
		}
		return registrations;
	}

} //ShootingmachineemfmodelXMLProcessor
