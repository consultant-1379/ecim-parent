package com.ericsson.ecim.coremw.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.eclipse.core.resources.IFile;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.FileContainer;
import com.ericsson.ecim.core.helpers.ObjectSorter;
import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * Implements feature "artf11471 : IMM Config objects must be sorted"
 * 
 * @author erajaik
 * 
 */
public class ImmXmlSorter extends ObjectSorter {

    /**
     * Input must be a MP instance xml file that validates. Only thing we want to do is to sort the objects according to
     * the dn tag
     * 
     */
    public static boolean sort(IFile immXml) throws EcimTransformationException {
        FileContainer file = new FileContainer(immXml);
        return internalSort(file);
    }

    /**
     * Input must be a imm xml file that validates. Only thing we want to do is to sort the objects according to the dn
     * tag
     * 
     */
    public static boolean sort(File immXml) throws EcimTransformationException {
        FileContainer file = new FileContainer(immXml);
        return internalSort(file);
    }

    protected static boolean internalSort(FileContainer file) throws EcimTransformationException {
        try {
            ImmXmlSorter immXmlSorter = new ImmXmlSorter(file);
            return immXmlSorter.sort();
        } catch (Exception e) {
            throw new EcimTransformationException("IMM object sorting failed.", e);
        }
    }

    private ImmXmlSorter(FileContainer file) throws EcimException {
        originalFile = file;
        try {
            InputStream is = file.getInputStream();
            doc = XmlUtil.getDocument(is);
            is.close();
        } catch (IOException e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

    private boolean sort() throws XPathExpressionException, TransformerException {
        NodeList dnList = XmlUtil.getNodes(doc, "//object/dn/text()");

        if (dnList.getLength() <= 1)
            return false;

        int[] basicIndex = initEmptyArray(dnList.getLength());
        int[] sortIndex = bubbleSort(dnList);

        if (Arrays.equals(basicIndex, sortIndex))
            return false;

        // find the first object tag
        Node firstNode = null;
        NodeList children = doc.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                firstNode = node;
                break;
            }
        }

        // append the nodes in order
        for (int i = 0; i < sortIndex.length; i++) {
            Node dnNode = dnList.item(sortIndex[i]);
            Node objectNode = dnNode.getParentNode().getParentNode();
            firstNode.appendChild(objectNode);
        }

        // clean out the whitespace nodes (not perfect)
        writeXML(doc, originalFile.getFile());
        return true;
    }

    private int[] bubbleSort(NodeList dnList) {
        int[] sortIndex = initEmptyArray(dnList.getLength());

        // bubble sort!
        for (int i = 0; i < dnList.getLength() - 1; i++) {
            for (int j = i + 1; j < dnList.getLength(); j++) {
                if (dnList.item(sortIndex[i]).getTextContent().length() > dnList.item(sortIndex[j]).getTextContent().length()) {
                    int k = sortIndex[i];
                    sortIndex[i] = sortIndex[j];
                    sortIndex[j] = k;
                }
            }
        }
        return sortIndex;
    }

}
