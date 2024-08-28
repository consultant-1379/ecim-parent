/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.util;

import TspMim.TspMimPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TspMimXMLProcessor extends XMLProcessor {

    /**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TspMimXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, TspMimPackage.eINSTANCE);
	}
    
    /**
	 * Register for "*" and "xml" file extensions the TspMimResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TspMimResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TspMimResourceFactoryImpl());
		}
		return registrations;
	}

} //TspMimXMLProcessor
