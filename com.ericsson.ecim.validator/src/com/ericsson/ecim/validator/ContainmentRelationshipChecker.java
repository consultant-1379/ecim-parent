package com.ericsson.ecim.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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

public class ContainmentRelationshipChecker implements DocumentChecker {

    public static final String ENABLE_CONTAINMENT_CHECKER = "enableContainmentChecker";

    private String[] validRootNames;

    public ContainmentRelationshipChecker(String[] allowedRootNames) {
        this.validRootNames = allowedRootNames;
    }

    @Override
    public IStatus checkDocument(Document doc) throws EcimException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();

        if ("false".equalsIgnoreCase(System.getProperty(ENABLE_CONTAINMENT_CHECKER, "false"))) {
            return new Status(IStatus.OK, ValidatorActivator.PLUGIN_ID, "Containment relationship check skipped!");
        }

        try {
            Object result = xpath.evaluate("/models/mim", doc, XPathConstants.NODESET);
            NodeList mimList = (NodeList) result;
            List<String> errorMessage = new ArrayList<String>();
            for (int i = 0; i < mimList.getLength(); i++) {
                Node mimNode = mimList.item(i);
                String mimNodeName = mimNode.getAttributes().getNamedItem("name").getTextContent();
                checkMim(doc, xpath, mimNodeName, errorMessage);
            }
            if (!errorMessage.isEmpty()) {
                StringBuilder assembleMessage = new StringBuilder();
                for (String error : errorMessage) {
                    assembleMessage.append(error).append("\n");
                }
                return new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, assembleMessage.toString().trim()
                        + "\nNote: This constraint can be skipped by not setting the Java System Property: -D" + ENABLE_CONTAINMENT_CHECKER);
            }
        } catch (Exception e) {
            throw new EcimValidationException(e.getMessage(), e);
        }
        return new Status(IStatus.OK, ValidatorActivator.PLUGIN_ID, "Containment relationship check pass!");
    }

    private void checkMim(Document doc, XPath xpath, String mimName, List<String> errorMessage) throws XPathExpressionException {
        Object result;
        XPathExpression expr = xpath.compile("/models/mim[@name='" + mimName + "']/class");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        if (result == null || !(result instanceof NodeList)) {
            // No class found, nothing to check.
            return;
        }

        NodeList classNodeList = (NodeList) result;
        for (int i = 0; i < classNodeList.getLength(); i++) {
            Node classNode = classNodeList.item(i);
            Node nameAttribute = classNode.getAttributes().getNamedItem("name");
            String className = nameAttribute.getTextContent();
            if (!isRootElementName(className)) {
                result = evaluateXPath(doc, xpath, mimName, className);
                if (result == null || !(result instanceof Node)) {
                    // No containment child found for current class
                    errorMessage.add("No containment relationship found for class '" + mimName + ":" + className + "'!");
                }
            }
        }
    }

    private Object evaluateXPath(Document doc, XPath xpath, String mimName, String className) throws XPathExpressionException {
        XPathExpression expr;
        String[] containExpres = new String[] {
                "/models/mim[@name='" + mimName + "']/relationship/containment/child/hasClass[@name='" + className + "']",
                "/models/interMim/relationship/containment/child/hasClass[@name='" + className + "']" };
        // Check containment relation
        for (String expression : containExpres) {
            expr = xpath.compile(expression);
            Object result = expr.evaluate(doc, XPathConstants.NODE);
            if (result != null && (result instanceof Node)) {
                return result;
            }
        }
        return null;
    }

    private boolean isRootElementName(String className) {
        boolean valid = false;
        for (String validName : validRootNames) {
            valid |= Pattern.matches(validName, className);
            if (valid) {
                break;
            }
        }
        return valid;
    }

}
