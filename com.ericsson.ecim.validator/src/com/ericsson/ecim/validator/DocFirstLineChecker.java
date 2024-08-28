package com.ericsson.ecim.validator;

import java.util.HashSet;
import java.util.Set;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;

/**
 * Checks that there all documentation tags that are filled in consists of at
 * least one first sentence ending in a period that is maximum 100 characters.
 * 
 * @author erajaik
 * 
 */
public class DocFirstLineChecker implements DocumentChecker {

    private static final int MAX_LENGTH = 110;

    @Override
    public IStatus checkDocument(Document doc) throws EcimException {
        Set<String> errorMessages = new HashSet<String>();
        try {
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();

            XPathExpression expr = xpath.compile("//description/text()");
            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            NodeList dns = (NodeList) result;

            checkDescriptionText(dns, errorMessages);

            boolean allOK = errorMessages.isEmpty();
            if (!allOK) {
                //  Not recommend to generate error message, it's time cost action.
                return new Status(IStatus.WARNING, ValidatorActivator.PLUGIN_ID,
                        "Documentation is not according to ECIM recommendations. First line must end in period and be max 100 characters long.");
            }

            return new Status(IStatus.OK, ValidatorActivator.PLUGIN_ID, "All documentation is fine!");

        } catch (Exception e) {
            return new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, e.getMessage(), e);
        }
    }

    private void checkDescriptionText(NodeList dns, Set<String> errorMessages) {
        for (int i = 0; i < dns.getLength(); i++) {
            Node node = dns.item(i);
            String fullText = node.getNodeValue();
            String dn = fullText.substring(0, fullText.length() > MAX_LENGTH ? MAX_LENGTH : fullText.length());
            if (dn.length() > 0 && (dn.indexOf(".") > 99 || dn.indexOf(".") == -1)) {
                String message = dn + (dn.length() < fullText.length() ? "..." : "");
                errorMessages.add(message);
            }
        }
    }

}
