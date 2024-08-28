/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see imm.util.ImmResourceImpl
 * @generated
 */
public class ImmResourceFactoryImpl extends ResourceFactoryImpl {

    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImmResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public Resource createResource(URI uri) {
        XMLResource result = new ImmResourceImpl(uri);
        result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

        result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

        result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
        result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

        result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
    
        //tell the loading parser(probably Xerxes) to ignore the Schema
        //TODO:Check if we really need all these options
        Map parserFeatures = new HashMap ();
        parserFeatures.put("http://xml.org/sax/features/validation",Boolean.FALSE);
        parserFeatures.put("http://xml.org/sax/features/external-parameter-entities",Boolean.FALSE);
        parserFeatures.put("http://xml.org/sax/features/namespaces",Boolean.FALSE);
        parserFeatures.put("http://apache.org/xml/features/validation/schema",Boolean.FALSE);    
        parserFeatures.put("http://apache.org/xml/features/validation/schema-full-checking",Boolean.FALSE);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);

        return result;
    }

} //ImmResourceFactoryImpl
