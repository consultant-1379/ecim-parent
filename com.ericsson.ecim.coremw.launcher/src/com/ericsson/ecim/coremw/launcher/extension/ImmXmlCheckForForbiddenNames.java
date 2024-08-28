package com.ericsson.ecim.coremw.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.xpath.XPathExpressionException;

import org.eclipse.core.resources.IFile;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.FileContainer;
import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

/**
 * Implements the part of feature "Artifact artf16059 : CoreMW IMM class name mapping" which requires that the generated
 * IMM class names must not match certain pre-defined patterns.
 * 
 * @author erajaik
 * 
 */
public class ImmXmlCheckForForbiddenNames {

    public static final String NON_ALLOWED_NAMES_REGEXP = "(Sa[A-Z][a-z].*)|(Cc[A-Z][a-z].*)|(Open[Ss][Aa][Ff].*)|Rule|Role|Authorization|SecM|FmAlarmType|FmAlarmModel|Fm|Transport|Equipment|SystemFunctions|ManagedElement|Ldap|Filter|Authentication";

    private Document doc;

    /**
     * Input must be a imm xml file that validates.
     * 
     */
    public static void isOK(IFile immXml) throws EcimTransformationException {
        FileContainer file = new FileContainer(immXml);
        isOK2(file);
    }

    /**
     * Input must be a imm xml file that validates.
     * 
     */
    public static void isOK(File immXml) throws EcimTransformationException {
        FileContainer file = new FileContainer(immXml);
        isOK2(file);
    }

    private static void isOK2(FileContainer file) throws EcimTransformationException {
        try {
            ImmXmlCheckForForbiddenNames o = new ImmXmlCheckForForbiddenNames(file);
            o.isOK();
        } catch (EcimTransformationException ete) {
            throw ete;
        } catch (Exception e) {
            throw new EcimTransformationException("IMM XML check for forbidden names failed.", e);
        }
    }

    private ImmXmlCheckForForbiddenNames(FileContainer file) throws EcimException {
        try {
            InputStream is = file.getInputStream();
            doc = XmlUtil.getDocument(is);
            is.close();
        } catch (IOException e) {
            throw new EcimTransformationException(e.getMessage(), e);
        }
    }

    private void isOK() throws XPathExpressionException, EcimTransformationException {
        NodeList names = getClassNames(doc);
        Pattern p = Pattern.compile(NON_ALLOWED_NAMES_REGEXP);
        for (int i = 0; i < names.getLength(); i++) {
            Node node = names.item(i);
            String className = node.getNodeValue();
            Matcher m = p.matcher(className);
            if (m.matches())
                throw new EcimTransformationException("IMM XML check for forbidden names failed. Class name pattern violated for: '" + className + "'.");
        }
    }

    /**
     * Finds all class names
     */
    private NodeList getClassNames(Document doc) throws XPathExpressionException {
        return XmlUtil.getNodes(doc, "//class/@name");
    }

}
