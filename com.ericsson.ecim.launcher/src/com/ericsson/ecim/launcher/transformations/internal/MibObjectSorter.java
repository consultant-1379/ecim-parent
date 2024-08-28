package com.ericsson.ecim.launcher.transformations.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.FileContainer;
import com.ericsson.ecim.core.helpers.ObjectSorter;
import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * Implements feature "artf11471 : IMM Config objects must be sorted" for MP instances xml.
 * 
 * @author erajaik
 * 
 */
public class MibObjectSorter extends ObjectSorter {

    private MibObjectSorter(FileContainer file) throws EcimException {
        originalFile = file;
        try {
            InputStream is = file.getInputStream();
            doc = XmlUtil.getDocument(is);
            is.close();
        } catch (IOException e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

    protected static boolean internalSort(FileContainer file) throws EcimTransformationException {
        try {
            MibObjectSorter mibObjectSorter = new MibObjectSorter(file);
            return mibObjectSorter.sort();
        } catch (Exception e) {
            throw new EcimTransformationException("MIB object sorting failed.", e);
        }
    }

    private boolean sort() throws XPathExpressionException, TransformerException {
        NodeList objectList = XmlUtil.getNodes(doc, "//*/object");

        if (objectList.getLength() <= 1)
            return false;

        int[] sortIndex = bubbleSort(objectList);
        int[] basicIndex = initEmptyArray(objectList.getLength());

        if (Arrays.equals(basicIndex, sortIndex))
            return false;

        // firstNode is the mib node
        Node firstNode = objectList.item(0).getParentNode();

        // append the nodes in order
        for (int i = 0; i < sortIndex.length; i++) {
            Node dnNode = objectList.item(sortIndex[i]);
            firstNode.appendChild(dnNode);
        }

        writeXML(doc, originalFile.getFile());
        return true;
    }

    private int[] bubbleSort(NodeList dnList) {
        int[] sortIndex = initEmptyArray(dnList.getLength());

        // bubble sort!
        for (int i = 0; i < dnList.getLength() - 1; i++) {
            for (int j = i + 1; j < dnList.getLength(); j++) {
                String dnI = dnList.item(sortIndex[i]).getAttributes().getNamedItem("parentDn").getTextContent();
                String dnJ = dnList.item(sortIndex[j]).getAttributes().getNamedItem("parentDn").getTextContent();

                if (dnI.length() > dnJ.length()) {
                    int k = sortIndex[i];
                    sortIndex[i] = sortIndex[j];
                    sortIndex[j] = k;
                }
            }
        }
        return sortIndex;
    }

}
