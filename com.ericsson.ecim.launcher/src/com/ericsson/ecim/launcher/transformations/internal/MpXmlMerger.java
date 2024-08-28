package com.ericsson.ecim.launcher.transformations.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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

import org.eclipse.core.runtime.CoreException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.FileContainer;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * Implements feature "artf16831 : Merge mp xml files into one as an additional output"
 * 
 * @author erajaik
 * @deprecated
 * 
 */
@Deprecated
class MpXmlMerger {

    private FileContainer mergedFile;
    private Document mergedDoc;
    private List<FileContainer> filesToMerge = new ArrayList<FileContainer>();
    private List<Document> docsToMerge = new ArrayList<Document>();

    private MpXmlMerger(File mergedFile, List<File> filesToMerge) {
        this.mergedFile = new FileContainer(mergedFile);
        for (File file : filesToMerge) {
            this.filesToMerge.add(new FileContainer(file));
        }
    }

    /**
     * 
     */
    private static File merge(String modelName, List<File> mpXmlFiles) throws EcimTransformationException {
        File mergedFile = new File(mpXmlFiles.get(0).getParentFile(), modelName + "_mp.xml");
        try {
            MpXmlMerger o = new MpXmlMerger(mergedFile, mpXmlFiles);
            return o.merge();
        } catch (Exception e) {
            throw new EcimTransformationException("Merging failed. " + e, e);
        }
    }

    private File merge() throws EcimException {
        try {
            for (FileContainer file : filesToMerge) {
                docsToMerge.add(getDocument(file.getInputStream()));
            }

            mergedDoc = docsToMerge.get(0);
            docsToMerge.remove(0);

            Node modelNode = getModelNode(mergedDoc);
            for (Document mergee : docsToMerge) {
                NodeList interMims = getInterMimNodes(mergee);
                for (int i = 0; i < interMims.getLength(); i++) {
                    Node interMim = interMims.item(i);
                    Node interMimDup = mergedDoc.importNode(interMim, true);
                    modelNode.appendChild(interMimDup);
                }
                NodeList mims = getMimNodes(mergee);
                for (int i = 0; i < mims.getLength(); i++) {
                    Node mim = mims.item(i);
                    Node mimDup = mergedDoc.importNode(mim, true);
                    modelNode.appendChild(mimDup);
                }
            }

            writeXML();
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }

        return mergedFile.getFile();
    }

    private void writeXML() throws TransformerException {
        StreamResult out = new StreamResult(mergedFile.getFile());

        DOMSource domSource = new DOMSource(mergedDoc);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();

        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "mp.dtd");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        transformer.transform(domSource, out);
    }

    /**
     * Finds all mims (there will be only one but lets play it safe)
     */
    private NodeList getMimNodes(Document doc) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//models/mim");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        return (NodeList) result;
    }

    /**
     * Finds the model node
     */
    private Node getModelNode(Document doc) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//models");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        return nodes.item(0);
    }

    /**
     * Finds all interMims
     */
    private NodeList getInterMimNodes(Document doc) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//models/interMim");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        return (NodeList) result;
    }

    private Document getDocument(InputStream is) throws ParserConfigurationException, SAXException, IOException, CoreException {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();

        domFactory.setNamespaceAware(true); // never forget this!
        domFactory.setIgnoringElementContentWhitespace(false);
        domFactory.setIgnoringComments(false);
        domFactory.setValidating(false);
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        builder.setEntityResolver(new EmptyEnitityResolver());
        return builder.parse(is);
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
