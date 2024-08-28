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
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.ericsson.ecim.core.exceptions.EcimException;

public class DuplicateRelationshipChecker implements DocumentChecker {

    @Override
    public IStatus checkDocument(Document doc) throws EcimException {
        Set<ErrorMessageContainer> errorMessages = new HashSet<ErrorMessageContainer>();
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();

        try {           
        	//get all the containment relationships in the document
            XPathExpression expr = xpath.compile("//relationship[containment]");
            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            checkForDuplicateRelationships((NodeList) result, errorMessages);

        } catch (XPathExpressionException e) {
            throw new EcimValidationException("Detect XPath Compile Exception. ", e);
        }

        if (!errorMessages.isEmpty()) {
            String messages = ErrorMessageContainer.getErrorMessageString(errorMessages);
            return new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, messages);
        }
        return new Status(IStatus.OK, ValidatorActivator.PLUGIN_ID, "Duplicate relationship check pass.");
    }

    /**
     * Checks for duplicate relationships, based on parent & child class names, among the supplied nodes. 
     * Duplicates can happen because of inherited relationships in the UML Design View.
     * It is assumed that the parent and child nodes have a name attribute and this is used for calculating duplicates.
     */
    void checkForDuplicateRelationships(NodeList nodes, Set<ErrorMessageContainer> errorMessages)  throws EcimException {
        Set<String> allNames = new HashSet<String>();
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element)nodes.item(i);
            String relationshipName = element.getAttributes().getNamedItem("name").getNodeValue();
            
            Element containmentElement = (Element)element.getElementsByTagName("containment").item(0);
            
            Element parentElement = (Element) containmentElement.getElementsByTagName("parent").item(0);
            Element parentHasClassElement = (Element) parentElement.getElementsByTagName("hasClass").item(0);         		
            String parentMimName = parentHasClassElement.getElementsByTagName("mimName").item(0).getTextContent();
            String parentName = parentMimName + parentHasClassElement.getAttributes().getNamedItem("name").getNodeValue();
           
            Element childElement = (Element) containmentElement.getElementsByTagName("child").item(0);
            Element childHasClassElement = (Element) childElement.getElementsByTagName("hasClass").item(0);         		
            String childMimName = childHasClassElement.getElementsByTagName("mimName").item(0).getTextContent();
            String childName = childMimName + childHasClassElement.getAttributes().getNamedItem("name").getNodeValue();             

            //the ends are prefixed with the mim name as we are validating the complete model with potentially many mims
            if (allNames.contains(parentName.concat(childName))) {
                // duplicate!! 
                ErrorMessageContainer emc = new ErrorMessageContainer(relationshipName, relationshipName + " relationship occurs several times because of inheritance!");
                errorMessages.add(emc);
            }
            allNames.add(parentName.concat(childName));
        }
    }


}
