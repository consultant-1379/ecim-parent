package com.ericsson.ecim.core.helpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;

/**
 * Pretty prints an xml document.
 * 
 */
public class XmlPrettyPrinter {
    
    private static final Logger LOGGER = Logger.getLogger(XmlPrettyPrinter.class);

    private XmlPrettyPrinter() {
    }

    public static void printDocument(File file, String dtdName) throws TransformerException {
        FileContainer fc = new FileContainer(file);
        printDocument(fc, dtdName);
    }

    public static void printDocument(IFile file, String dtdName) throws TransformerException {
        FileContainer fc = new FileContainer(file);
        printDocument(fc, dtdName);
    }

    public static void printDocument(FileContainer fc, String dtdName) throws TransformerException {
        FileOutputStream fos = null;
        try {
            Document doc = XmlUtil.getDocument(fc.getInputStream());
            fos = new FileOutputStream(fc.getFile(), false);
            printDocument(doc, fos, dtdName);
        } catch (EcimException e) {
            throw new TransformerException(e.getMessage(), e);
        } catch (IOException e) {
            throw new TransformerException(e.getMessage(), e);
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                LOGGER.warn(e.getMessage(), e);
            }
        }
    }

    public static void printDocument(Document doc, OutputStream out, String dtdName) throws TransformerException {
        try {
            stripWhiteSpace(doc);
        } catch (XPathExpressionException e) {
            throw new TransformerException(e.getMessage(), e);
        }
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            if (dtdName != null)
                transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, dtdName);

            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            transformer.transform(new DOMSource(doc), new StreamResult(new OutputStreamWriter(out, "UTF-8")));
        } catch (IllegalArgumentException e) {
            throw new TransformerException(e.getMessage(), e);
        } catch (UnsupportedEncodingException e) {
            throw new TransformerException(e.getMessage(), e);
        }
    }

    // Remove white space from the XML document for improved readability
    private static void stripWhiteSpace(Document doc) throws XPathExpressionException {
        XPathFactory xpathFactory = XPathFactory.newInstance();
        // XPath to find empty text nodes.
        XPathExpression xpathExp = xpathFactory.newXPath().compile("//text()[normalize-space(.) = '']");
        NodeList emptyTextNodes = (NodeList) xpathExp.evaluate(doc, XPathConstants.NODESET);
        // Remove each empty text node from document.
        for (int i = 0; i < emptyTextNodes.getLength(); i++) {
            Node emptyTextNode = emptyTextNodes.item(i);
            emptyTextNode.getParentNode().removeChild(emptyTextNode);
        }
    }


}
