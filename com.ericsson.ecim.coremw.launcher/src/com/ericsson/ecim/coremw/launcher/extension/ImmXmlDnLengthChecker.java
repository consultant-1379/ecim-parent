package com.ericsson.ecim.coremw.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.FileContainer;
import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * Implements "artf278675 : Raise validation error if Core MW target specific limits are exceeded" and
 * "artf552670 : Long IMM DN and RDN"
 * 
 * @author erajaik
 * 
 */
public class ImmXmlDnLengthChecker {

    private static final int MAX_FULL_DN_LENGTH = 1024;

    private Document doc;

    /**
     * Input must be a imm xml file that validates.
     * 
     */
    public static void isOK(File immXml) throws EcimException {
        try {
            ImmXmlDnLengthChecker o = new ImmXmlDnLengthChecker(new FileContainer(immXml));
            o.checkDnLength();
        } catch (EcimTransformationException ete) {
            throw ete;
        } catch (Exception e) {
            throw new EcimTransformationException("IMM XML check for forbidden names failed.", e);
        }
    }

    private ImmXmlDnLengthChecker(FileContainer file) throws EcimException {
        try {
            InputStream is = file.getInputStream();
            doc = XmlUtil.getDocument(is);
            is.close();
        } catch (IOException e) {
            throw new EcimTransformationException(e.getMessage(), e);
        }
    }

    /**
     * Checks that all dn and rdn are within the length limits.
     * 
     * @throws XPathExpressionException
     * @throws EcimTransformationException
     * @throws Exception
     */
    private void checkDnLength() throws XPathExpressionException, EcimTransformationException {
        NodeList dns = getDnTextNodes(doc);
        for (int i = 0; i < dns.getLength(); i++) {
            Node node = dns.item(i);
            String dn = node.getNodeValue();
            if (dn.length() > MAX_FULL_DN_LENGTH)
                throw new EcimTransformationException("Distinguished name length violation. The dn '" + dn + "' has more than " + MAX_FULL_DN_LENGTH
                        + " characters.");

            // Don't check RDN length, CoreMW 3.4 has lifted the 64 characters length limitation
        }
    }

    /**
     * Finds all distinguished names
     */
    private NodeList getDnTextNodes(Document doc) throws XPathExpressionException {
        return XmlUtil.getNodes(doc, "//object/dn/text()");
    }

}
