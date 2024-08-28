/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;


import Mp.MpPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see Mp.util.MpResourceImpl
 * @generated
 */
public class MpResourceFactoryImpl extends ResourceFactoryImpl {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ExtendedMetaData extendedMetaData;

    /**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MpResourceFactoryImpl() {
		super();
		extendedMetaData = new BasicExtendedMetaData(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, MpPackage.eINSTANCE);
	}

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public Resource createResource(URI uri) {
        XMLResource result = new MpResourceImpl(uri);
        result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

        //Don't output schema stuff
        //result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

        result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
        result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

        result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
        
        //specify a reference to the DTD in the serialized XML
        result.setDoctypeInfo(null,"mp.dtd");
        
        //serialize the DTD tag to the serialized XML
        result.getDefaultSaveOptions().put(XMLResource.OPTION_SAVE_DOCTYPE, Boolean.TRUE);
        
        //tell the loading parser(probably Xerxes) to ignore the DTD
        Map parserFeatures = new HashMap ();
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd",Boolean.FALSE);    
        result.getDefaultLoadOptions().put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
        
        return result;
    }

} //MpResourceFactoryImpl
