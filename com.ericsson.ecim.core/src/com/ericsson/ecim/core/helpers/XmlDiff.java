package com.ericsson.ecim.core.helpers;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * This class compares two xml documents without taking into account comments and order of the elements.
 * 
 * @author erajaik
 * 
 */
public class XmlDiff {

    private static final Logger LOGGER = Logger.getLogger(XmlDiff.class);

    Document xmlA;
    Document xmlB;
    File fileA;
    File fileB;

    List<String> ignoreAttributes;

    public XmlDiff(String a, String b) throws XmlDiffException {
        this(new File(a), new File(b));
    }

    public XmlDiff(IFile fileA, IFile fileB) throws XmlDiffException {
        this(fileA.getLocation().toFile(), fileB.getLocation().toFile());
    }

    public XmlDiff(File fileA, File fileB) throws XmlDiffException {
        xmlA = getDocument(fileA);
        xmlB = getDocument(fileB);
        this.fileA = fileA;
        this.fileB = fileB;
    }

    public void compare(List<String> ignoreAttributes) throws XmlDiffException {
        this.ignoreAttributes = ignoreAttributes;

        try {
            NodeList nodesA = getAllElementNodes(xmlA);
            NodeList nodesB = getAllElementNodes(xmlB);

            for (int i = 0; i < nodesB.getLength(); i++) {
                checkElementNodeExists(nodesB.item(i), nodesA);
            }
            for (int i = 0; i < nodesA.getLength(); i++) {
                checkElementNodeExists(nodesA.item(i), nodesB);
            }
        } catch (XPathExpressionException e) {
            throw new XmlDiffException(e.getMessage(), e);
        }

    }

    public void compare() throws XmlDiffException {
        compare(new ArrayList<String>());
    }

    private String getTextFromElementNode(Node node) {
        NodeList nodes = node.getChildNodes();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node currentNode = nodes.item(i);
            if (currentNode.getNodeType() == Node.TEXT_NODE) {
                String s = currentNode.getNodeValue().trim();
                sb.append(s);
            }
        }
        NamedNodeMap attributes = node.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node aAttr = attributes.item(i);
            if ("name".equalsIgnoreCase(aAttr.getNodeName()))
                sb.append(aAttr.getNodeValue());
        }

        return sb.toString();
    }

    private boolean isEqualElementNode(Node a, Node b, boolean checkParent) throws XmlDiffException {

        if (a == null && b == null)
            return true;

        if (a.getNodeType() != Node.ELEMENT_NODE) {
            return isEqualElementNode(a.getParentNode(), b.getParentNode(), checkParent);
        }

        if (a.getNodeType() != b.getNodeType())
            return false;

        return isEqualInElement(a, b, checkParent);
    }

    private boolean isEqualInElement(Node a, Node b, boolean checkParent) throws XmlDiffException {
        if (!a.getNodeName().equals(b.getNodeName()))
            return false;

        if (!getTextFromElementNode(a).equals(getTextFromElementNode(b)))
            return false;

        if (checkParent) {
            return isEqualElementNode(a.getParentNode(), b.getParentNode(), true);
        }
        
        return isEqualInAttributes(a, b);
    }

    private boolean isEqualInAttributes(Node a, Node b) {
        NamedNodeMap aAttrs = a.getAttributes();
        NamedNodeMap bAttrs = b.getAttributes();

        if (aAttrs.getLength() != bAttrs.getLength())
            return false;

        int noOfMatchingAttributes = countMatchingAttributes(aAttrs, bAttrs);

        if (aAttrs.getLength() != noOfMatchingAttributes)
            return false;

        return true;
    }

    private int countMatchingAttributes(NamedNodeMap aAttrs, NamedNodeMap bAttrs) {
        int noOfMatchingAttributes = 0;
        for (int i = 0; i < aAttrs.getLength(); i++) {
            Node aAttr = aAttrs.item(i);
            for (int j = 0; j < aAttrs.getLength(); j++) {
                Node bAttr = bAttrs.item(j);
                String attrNodeName = aAttr.getNodeName();
                if (ignoreAttributes.contains(attrNodeName) && attrNodeName.equals(bAttr.getNodeName())) {
                    // only attribute names must match
                    noOfMatchingAttributes++;
                } else if (aAttr.isEqualNode(bAttr)) {
                    // attribute values must match
                    noOfMatchingAttributes++;
                }
            }
        }
        return noOfMatchingAttributes;
    }

    private void checkElementNodeExists(Node golden, NodeList nodes) throws XmlDiffException {
        golden.normalize();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node prospect = nodes.item(i);
            prospect.normalize();
            if (isEqualElementNode(golden, prospect, true)) {
                return;
            }
        }
        // Ugly code start here: Dependency to mp.dtd tags
        if (!checkNodeName(golden.getNodeName())) {
            // No match!
            throw new XmlDiffException("No match found for node '" + golden.getNodeName() + "' containing text '" + getTextFromElementNode(golden)
                    + "' in file " + fileB.getPath());
        } else {
            LOGGER.warn("XmlDiff Warning: " + "No match found for node '" + golden.getNodeName() + "' in file " + fileA.getName());
        }
    }

    private boolean checkNodeName(String nodeName) {
        return nodeName.contains("description") || nodeName.contains("condition") || nodeName.contains("statusInformation")
                || nodeName.contains("nonPersistent");
    }

    private NodeList getAllElementNodes(Document doc) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//*");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        return (NodeList) result;
    }

    private Document getDocument(File f) throws XmlDiffException {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();

        domFactory.setNamespaceAware(true); // never forget this!
        domFactory.setIgnoringElementContentWhitespace(true);
        domFactory.isIgnoringElementContentWhitespace();
        domFactory.setIgnoringComments(true);
        domFactory.setValidating(false);
        try {
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            builder.setEntityResolver(new EmptyEnitityResolver());
            return builder.parse(f);
        } catch (Exception e) {
            throw new XmlDiffException(e.getMessage(), e);
        }
    }

    class EmptyEnitityResolver implements EntityResolver {
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
