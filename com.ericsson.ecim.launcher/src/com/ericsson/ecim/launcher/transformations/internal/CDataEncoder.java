package com.ericsson.ecim.launcher.transformations.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * Fix for bug artf38753 : Dependencies script output with CDATA must not encode < to &lt; etc.
 * 
 * @author erajaik
 * 
 */
public class CDataEncoder {

    Document doc;
    File originalFile;

    /**
     * Input must be a mp xml file that validates.
     * 
     * @param mpXml
     *            Valid MP XML file
     * @throws EcimTransformationException
     */
    public static void go(File mpXml) throws EcimTransformationException {
        try {
            CDataEncoder o = new CDataEncoder(mpXml);
            o.wrapDependenciesScriptNodes();
        } catch (EcimException e) {
            throw new EcimTransformationException("Failed to correct CDATA tag: " + e.getMessage(), e);
        }
    }

    /**
     * Constructor copies file and related document locally
     * 
     * @param file
     *            Valid MP XML file
     * @throws Exception
     */
    private CDataEncoder(File file) throws EcimException {
        originalFile = file;
        try {
            InputStream is = new FileInputStream(file);
            doc = XmlUtil.getDocument(is);
            is.close();
        } catch (IOException e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

    /**
     * Wraps a CData node to each dependenciesScript element.
     */
    private void wrapDependenciesScriptNodes() throws EcimTransformationException {
        NodeList dependenciesScriptNodes = getDepScriptNodes();
        if (dependenciesScriptNodes.getLength() > 0) {
            encodeCData(dependenciesScriptNodes);
            writeXML();
        }
    }

    /**
     * Appends CDATA node(s), with all text in each supplied dependenciesScript node, to the local XML document
     * 
     * @throws EcimTransformationException
     */
    private void encodeCData(NodeList dependenciesScriptNodes) throws EcimTransformationException {
        for (int i = 0; i < dependenciesScriptNodes.getLength(); i++) {
            Node depScriptNode = dependenciesScriptNodes.item(i);
            String text = depScriptNode.getTextContent();

            Node cdata = doc.createCDATASection(text);
            depScriptNode.setTextContent(null);
            depScriptNode.appendChild(cdata);
        }
    }

    /**
     * Writes DOM tree back to the same file.
     * 
     * @throws EcimTransformationException
     */
    private void writeXML() throws EcimTransformationException {
        StreamResult out = new StreamResult(originalFile);

        DOMSource domSource = new DOMSource(doc);
        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "mp.dtd");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.transform(domSource, out);
        } catch (IllegalArgumentException e) {
            throw new EcimTransformationException(e.getMessage(), e);
        } catch (TransformerException e) {
            throw new EcimTransformationException(e.getMessage(), e);
        }
    }

    /**
     * Finds all dependenciesScript tags in the local XML Document.
     * 
     * @return NodeList all dependenciesScript tags in the XML Document
     * @throws EcimTransformationException
     */
    private NodeList getDepScriptNodes() throws EcimTransformationException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        try {
            XPathExpression expr = xpath.compile("//*/dependenciesScript");
            return (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            throw new EcimTransformationException(e.getMessage(), e);
        }
    }

}
