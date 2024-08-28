package com.ericsson.ecim.validator;

import java.util.HashSet;
import java.util.Set;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;

public class DuplicateNameChecker implements DocumentChecker {

    @Override
    public IStatus checkDocument(Document doc) throws EcimException {
        Set<ErrorMessageContainer> errorMessages = new HashSet<ErrorMessageContainer>();
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();

        try {
            XPathExpression expr = xpath.compile("//enum");
            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            checkForDuplicateNames((NodeList) result, errorMessages);

            expr = xpath.compile("//struct");
            result = expr.evaluate(doc, XPathConstants.NODESET);
            checkForDuplicateNames((NodeList) result, errorMessages);

            expr = xpath.compile("//derivedDataType");
            result = expr.evaluate(doc, XPathConstants.NODESET);
            checkForDuplicateNames((NodeList) result, errorMessages);

            expr = xpath.compile("//exception");
            result = expr.evaluate(doc, XPathConstants.NODESET);
            checkForDuplicateNames((NodeList) result, errorMessages);
        } catch (XPathExpressionException e) {
            throw new EcimValidationException("Detect XPath Compile Exception. ", e);
        }

        if (!errorMessages.isEmpty()) {
            String messages = ErrorMessageContainer.getErrorMessageString(errorMessages);
            return new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, messages);
        }
        return new Status(IStatus.OK, ValidatorActivator.PLUGIN_ID, "Duplicate name check pass.");
    }

    /**
     * Checks for duplicate names among the supplied nodes. It is assumed that the nodes have a name attribute and that the
     * parent node has a name attribute.
     */
    void checkForDuplicateNames(NodeList nodes, Set<ErrorMessageContainer> errorMessages) {
        Set<String> allNames = new HashSet<String>();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            Node mimNode = node.getParentNode();
            String mimName = mimNode.getNodeName() + "[name='" + mimNode.getAttributes().getNamedItem("name").getNodeValue() + "']";
            String nodeName = node.getNodeName() + "[name='" + node.getAttributes().getNamedItem("name").getNodeValue() + "']";
            String nameToCheckDuplicatesOf = mimName + "/" + nodeName;

            if (allNames.contains(nameToCheckDuplicatesOf)) {
                // duplicate!! 
                ErrorMessageContainer emc = new ErrorMessageContainer(nodeName, nameToCheckDuplicatesOf + " occurs several times!");
                errorMessages.add(emc);
            }
            allNames.add(nameToCheckDuplicatesOf);
        }
    }

}
