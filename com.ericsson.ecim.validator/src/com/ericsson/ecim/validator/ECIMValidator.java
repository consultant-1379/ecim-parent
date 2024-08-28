package com.ericsson.ecim.validator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Element;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.ericsson.ecim.core.uml.helpers.ModelCleanup;

/**
 * The ECIM validator supports xml, ecore and uml validation
 * 
 * @author qmahsha
 * 
 */
public class ECIMValidator {

    private static final Logger LOGGER = Logger.getLogger(ECIMValidator.class);

    private ResourceSet resourceSet;

    /**
     * Create/setup an ECIM Validator
     */
    public ECIMValidator() {
        this.resourceSet = new ResourceSetImpl();
    }

    /**
     * Create/setup an ECIM Validator
     * 
     * @param factory
     *            the factory that was implemented to create specialized type of resource
     */
    public ECIMValidator(Resource.Factory factory) {
        this.resourceSet = new ResourceSetImpl();
        Map<String, Object> options = this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
        options.put(Resource.Factory.Registry.DEFAULT_EXTENSION, factory);
    }

    private void validateAgainstXML(InputStream inputStream, Map<String, Boolean> features, Map<String, Object> properties, EntityResolver resolver)
            throws EcimValidationException {
        XMLReader reader = null;
        SAXErrorHandler testErrorHandler = new SAXErrorHandler();
        try {
            reader = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
            reader.setErrorHandler(testErrorHandler);
            if (resolver != null) {
                reader.setEntityResolver(resolver);
            }
            for (Map.Entry<String, Boolean> entry : features.entrySet()) {
                reader.setFeature(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                reader.setProperty(entry.getKey(), entry.getValue());
            }
            reader.parse(new InputSource(inputStream));
        } catch (Exception e) {
            MultiStatus errors = (MultiStatus) testErrorHandler.getStatus();
            Status errorStatus = new Status(Status.ERROR, ValidatorActivator.PLUGIN_ID, "Failed to properly parse XML resource" + "\n" + e.getMessage(), e);
            errors.add(errorStatus);
            throw new EcimValidationException("XML model did not parse properly", errorStatus);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) { // NO SONAR
                LOGGER.warn(e.getMessage(), e); // NO SONAR
            }
        }
        if (testErrorHandler.getError()) {
            MultiStatus errors = (MultiStatus) testErrorHandler.getStatus();
            Status errorStatus = new Status(Status.ERROR, ValidatorActivator.PLUGIN_ID, "Failed to successfully validate XML resource", null);
            errors.add(errorStatus);
            throw new EcimValidationException("XML model did not Validate", errors);
        }
    }

    /**
     * validate XML against XSD
     * 
     * @param ifile
     *            the xml file.
     * @param schemaID
     *            ID of the schema file.
     * @param schemaLocation
     *            location of the schema file.
     * @throws EcimValidationException
     *             when xml file fails to validate successfully.
     */
    public void validateAgainstXSD(File file, String schemaID, URL schemaLocation) throws EcimValidationException {
        Map<String, Boolean> features = new HashMap<String, Boolean>();
        Map<String, Object> properties = new HashMap<String, Object>();
        features.put("http://xml.org/sax/features/validation", true);
        features.put("http://xml.org/sax/features/namespaces", true);
        features.put("http://xml.org/sax/features/namespace-prefixes", true);
        features.put("http://apache.org/xml/features/validation/schema", true);
        properties.put("http://apache.org/xml/properties/schema/external-schemaLocation", schemaID + " " + schemaLocation.toString());
        try {
            validateAgainstXML(new FileInputStream(file), features, properties, null);
        } catch (FileNotFoundException e) {
            throw new EcimValidationException(e);
        }
    }

    /**
     * validate XML against DTD
     * 
     * @param ifile
     *            the XML file.
     * @param inputSource
     *            explicitly pointing to the DTD. Can be null.
     * @throws EcimValidationException
     *             when xml file fails to validate successfully.
     */
    public void validateAgainstDTD(InputStream xmlInputStream, InputStream dtdInputSource) throws EcimValidationException {
        Map<String, Boolean> features = new HashMap<String, Boolean>();
        Map<String, Object> properties = new HashMap<String, Object>();
        features.put("http://xml.org/sax/features/validation", true);
        features.put("http://xml.org/sax/features/namespaces", true);
        validateAgainstXML(xmlInputStream, features, properties, new DTDResolver(dtdInputSource));
    }

    private class EcoreDiagnostician extends Diagnostician {
        private ComposedAdapterFactory adapterFactory;

        public EcoreDiagnostician(final ComposedAdapterFactory factory) {
            this.adapterFactory = factory;
        }

        @Override
        public String getObjectLabel(EObject eObject) {
            if (adapterFactory != null && !eObject.eIsProxy()) {
                IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(eObject, IItemLabelProvider.class);

                if (itemLabelProvider != null) {
                    return itemLabelProvider.getText(eObject);
                }
            }
            return super.getObjectLabel(eObject);
        }

    }

    private class EcimDiagnostician extends Diagnostician {

        private ComposedAdapterFactory adapterFactory;

        public EcimDiagnostician(final ComposedAdapterFactory factory) {
            this.adapterFactory = factory;
        }

        @Override
        public String getObjectLabel(EObject eObject) {
            if (adapterFactory != null && !eObject.eIsProxy()) {
                IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(eObject, IItemLabelProvider.class);

                if (itemLabelProvider != null) {
                    return itemLabelProvider.getText(eObject);
                }
            }
            return super.getObjectLabel(eObject);
        }

        protected boolean doValidateStereotypeApplications(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
            List<EObject> stereotypeApplications = eObject instanceof Element ? ((Element) eObject).getStereotypeApplications() : Collections
                    .<EObject> emptyList();

            if (!stereotypeApplications.isEmpty()) {
                Iterator<EObject> i = stereotypeApplications.iterator();
                boolean result = validate(i.next(), diagnostics, context);

                while (i.hasNext() && (result || diagnostics != null)) {

                    result &= validate(i.next(), diagnostics, context);
                }

                return result;
            } else {
                return true;
            }
        }

        @Override
        protected boolean doValidateContents(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
            boolean result = doValidateStereotypeApplications(eObject, diagnostics, context);

            if (result || diagnostics != null) {
                result &= super.doValidateContents(eObject, diagnostics, context);
            }

            return result;
        }

    }

    private void validateResource(File file, Diagnostician diagnostician) throws EcimValidationException {
        Resource resource;
        BasicDiagnostic basicDiagnostic;
        try {
            resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), false);
        }
        CacheAdapter cacheAdapter = new CacheAdapter();
        cacheAdapter.setTarget(resourceSet);
        if (!resource.getErrors().isEmpty()) {
            basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, ValidatorActivator.PLUGIN_ID, 0,
                    "Failed to successfully validate, not well-formed resource: " + file.getName(), new Object[] { null });
            basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
            ModelCleanup.cleanupResourceSet(resourceSet, cacheAdapter);
            throw new EcimValidationException("Model is not well-formed", BasicDiagnostic.toIStatus(basicDiagnostic));
        } else {
            Diagnostic diagnostic = diagnostician.validate(resource.getContents().get(0));
            ModelCleanup.cleanupResourceSet(resourceSet, cacheAdapter);
            if (diagnostic.getSeverity() == Diagnostic.ERROR) {
                basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, ValidatorActivator.PLUGIN_ID, 0, "Failed to successfully validate resource: "
                        + file.getName(), new Object[] { null });
                basicDiagnostic.merge(diagnostic);
                throw new EcimValidationException("Model did not successfully validate", BasicDiagnostic.toIStatus(basicDiagnostic));
            }
        }
    }

    /**
     * validation against UML meta-model.
     * 
     * @param ifile
     *            the UML model.
     * @throws EcimValidationException
     *             when UML model fails to validate successfully.
     */
    public void validateUML(File file) throws EcimValidationException {
        final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        validateResource(file, new EcimDiagnostician(adapterFactory));
        adapterFactory.dispose();
    }

    /**
     * validation against a meta-model defined in an ecore.
     * 
     * @param ifile
     *            the ecore model.
     * @throws EcimValidationException
     *             when ecore model fails to validate successfully.
     */
    public void validateEcore(File file) throws EcimValidationException {
        final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        validateResource(file, new EcoreDiagnostician(adapterFactory));
        adapterFactory.dispose();
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

}
