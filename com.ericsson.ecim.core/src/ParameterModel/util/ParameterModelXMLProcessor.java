/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ParameterModel.util;

import ParameterModel.ParameterModelPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterModelXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterModelXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        ParameterModelPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the ParameterModelResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new ParameterModelResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new ParameterModelResourceFactoryImpl());
        }
        return registrations;
    }

} //ParameterModelXMLProcessor
