package com.ericsson.ecim.validator;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.ericsson.ecim.core.exceptions.EcimException;

/**
 * Checks all classes in each mim either is named "ManagedElement", "Root" or is taking part in a containment
 * relationship.
 * 
 * @author erajaik, eyuwehu
 * 
 */
public class MpXmlValidator {

    private static final Logger LOGGER = Logger.getLogger(MpXmlValidator.class);
    private static MpXmlValidator INSTANCE;

    private Document mpXmlDocument = null;

    private MpXmlValidator() {
    }

    /**
     * Input must be a mp xml file that validates.
     * 
     * @param mpXmlInputStream
     * @throws Exception
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws Exception
     */
    public static MpXmlValidator instance(InputStream targetXmlInputStream) throws EcimException {
        if (INSTANCE == null) {
            INSTANCE = new MpXmlValidator();
        }
        try {
            INSTANCE.mpXmlDocument = getDocument(targetXmlInputStream);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
        return INSTANCE;
    }

    public IStatus validate(DocumentChecker checker) {
        long start = System.currentTimeMillis();
        try {
            return checker.checkDocument(mpXmlDocument);
        } catch (Exception e) {
            return new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, e.getMessage(), e);
        } finally {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(checker.getClass().getSimpleName() + " takes " + (System.currentTimeMillis() - start) + "ms");
            }
        }
    }

    private static Document getDocument(InputStream is) throws ParserConfigurationException, SAXException, IOException, CoreException {
        try {
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setNamespaceAware(true); // never forget this!
            domFactory.setIgnoringElementContentWhitespace(true);
            domFactory.isIgnoringElementContentWhitespace();
            domFactory.setIgnoringComments(false);
            domFactory.setValidating(false);
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            builder.setEntityResolver(new EmptyEnitityResolver());
            return builder.parse(is);
        } finally {
            is.close();
        }
    }

    static class EmptyEnitityResolver implements EntityResolver {
        @Override
        public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
            if (systemId.contains(".dtd")) {
                return new InputSource(new StringReader(""));
            } else {
                return null;
            }
        }
    }

}
