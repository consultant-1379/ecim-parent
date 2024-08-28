package com.ericsson.ecim.core.helpers;

import java.io.File;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public abstract class ObjectSorter {

    protected Document doc;
    protected FileContainer originalFile;

    protected static int[] initEmptyArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
            array[i] = i;
        return array;
    }

    protected static void writeXML(Document doc, File outFile) throws TransformerException {
        StreamResult out = new StreamResult(outFile);

        DOMSource domSource = new DOMSource(doc);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();

        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        // formatting is not perfect, but I don't know how to fix it
        transformer.transform(domSource, out);
    }

}
