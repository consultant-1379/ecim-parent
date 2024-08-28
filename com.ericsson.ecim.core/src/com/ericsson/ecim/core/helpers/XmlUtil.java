package com.ericsson.ecim.core.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.ericsson.ecim.core.exceptions.EcimException;

public class XmlUtil {

    private static final Logger LOGGER = Logger.getLogger(XmlUtil.class);

    private XmlUtil() {
    }

    /**
     * Finds nodes by evaluating supplied xpath expression.
     */
    public static NodeList getNodes(Document doc, String xpathExpression) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile(xpathExpression);
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        return (NodeList) result;
    }

    public static Document getDocument(InputStream is) throws EcimException {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true); // never forget this!
        domFactory.setIgnoringElementContentWhitespace(true);
        domFactory.setIgnoringComments(false);
        domFactory.setValidating(false);
        try {
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            builder.setEntityResolver(new EmptyEnitityResolver());
            return builder.parse(is);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
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

    public static void runXsltOnXmlFile(File inputMpXmlFile, InputStream xslStream, boolean compare) throws EcimException {
        File tempOutputFile = new File(inputMpXmlFile.getParentFile(), inputMpXmlFile.getName() + ".out");

        XsltRunner.transform(inputMpXmlFile, tempOutputFile, xslStream, null, prepareOutputProperties(inputMpXmlFile));
        if (compare) {
            XmlDiff differ = new XmlDiff(inputMpXmlFile, tempOutputFile);
            differ.compare();
        }

        inputMpXmlFile.delete();
        try {
            FileUtils.moveFile(tempOutputFile, inputMpXmlFile);
        } catch (IOException e) {
            throw new EcimException("Can't save xslt transform result.", e);
        }
    }

    private static Properties prepareOutputProperties(File originFile) {
        Properties userProperties = new Properties();
        try {
            List<String> cdataSectionContainers = searchCDataContainers(originFile);
            // All founded cdata container elements should be passed into XSLT as output properties
            if (!cdataSectionContainers.isEmpty()) {
                String[] cdataContainerArrays = cdataSectionContainers.toArray(new String[cdataSectionContainers.size()]);
                String value = Arrays.toString(cdataContainerArrays).replaceAll(",", " ").replaceAll("[\\[|\\]]", "");
                userProperties.put(OutputKeys.CDATA_SECTION_ELEMENTS, value);
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
        return userProperties;
    }

    private static List<String> searchCDataContainers(File originFile) throws XPathExpressionException, EcimException, FileNotFoundException {
        XPathFactory xpathFactory = XPathFactory.newInstance();
        // Search all elements which contains CDATA
        XPathExpression xpathExp = xpathFactory.newXPath().compile("//*[not(*)]");
        Document doc = getDocument(new FileInputStream(originFile));
        NodeList leafNodes = (NodeList) xpathExp.evaluate(doc, XPathConstants.NODESET);
        List<String> cdataSectionContainers = new ArrayList<String>();
        for (int i = 0; i < leafNodes.getLength(); i++) {
            Node leaf = leafNodes.item(i);
            if (leaf.getFirstChild() != null && leaf.getFirstChild().getNodeType() == Node.CDATA_SECTION_NODE) {
                if (cdataSectionContainers.contains(leaf.getNodeName())) {
                    continue;
                }
                cdataSectionContainers.add(leaf.getNodeName());
            }
        }
        return cdataSectionContainers;
    }

}
