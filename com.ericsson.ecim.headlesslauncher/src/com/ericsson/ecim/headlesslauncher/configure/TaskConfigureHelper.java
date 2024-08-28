package com.ericsson.ecim.headlesslauncher.configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ericsson.ecim.core.exceptions.EcimException;

/**
 * This class response for reading configuration file for headless mode.
 * 
 * @author eyuwehu
 */
public class TaskConfigureHelper {

    private static final Logger LOGGER = Logger.getLogger(TaskConfigureHelper.class);

    /*
     * <Tasks> <Task model="<model-path>"> <preUtilities>ID1</preUtilities>
     * <transformations>IMM,MP,MPCPP,MMAS</transformations> <postUtilities>ID2</postUtilities> </Task> <Task
     * model="<model-path>"> <preUtilities>ID1</preUtilities> <transformations>IMM,MP,MPCPP,MMAS</transformations>
     * <decisions> <decision>Mom:TestA</decision> <decision>Mom:TestB</decision> </decisions> </Task> <Task
     * model="<model-path>"> <preUtilities>ID1</preUtilities> <umlUtilities>IMM,MP,MPCPP,MMAS</umlUtilities>
     * <postUtilities>ID2</postUtilities> </Task> </Tasks>
     */

    private Document configureDocument;

    public TaskConfigureHelper(File file) throws EcimException {
        try {
            InputStream fileInputStream = new FileInputStream(file);
            this.configureDocument = loadConfigureStream(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

    public TaskConfigureHelper(InputStream inputStream) throws EcimException {
        try {
            this.configureDocument = loadConfigureStream(inputStream);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

    private Document loadConfigureStream(InputStream configureInputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilder builder = getDocumentBuilder();
        return builder.parse(configureInputStream);
    }

    private DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true);
        domFactory.setIgnoringElementContentWhitespace(true);
        domFactory.setIgnoringComments(true);
        domFactory.setValidating(false);
        return domFactory.newDocumentBuilder();
    }

    private NodeList getTaskNodeList() throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("/Tasks/Task");
        Object result = expr.evaluate(configureDocument, XPathConstants.NODESET);
        return (NodeList) result;
    }

    public List<HeadlessTask> getTaskList() {
        List<HeadlessTask> tasks = new ArrayList<HeadlessTask>();
        try {
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();

            NodeList taskNodes = getTaskNodeList();
            for (int i = 0; i < taskNodes.getLength(); i++) {
                Node taskNode = taskNodes.item(i);
                createTaskList(tasks, xpath, taskNode);
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
        return tasks;
    }

    private void createTaskList(List<HeadlessTask> tasks, XPath xpath, Node taskNode) throws XPathExpressionException {
        Node modelLocation = taskNode.getAttributes().getNamedItem("modelPath");
        Node modelFileNode = taskNode.getAttributes().getNamedItem("modelFile");
        if (modelLocation != null) {
            String modelDirectory = modelLocation.getNodeValue();
            String xpathPrefix = "/Tasks/Task[@modelPath='" + modelDirectory + "']";
            String[] suffixs = new String[] { "uml" };
            if (modelFileNode != null) {
                String modelFileSuffix = modelFileNode.getNodeValue();
                suffixs = modelFileSuffix.split(",");
            }
            HeadlessTask task = initHeadlessTask(modelDirectory, suffixs, xpath, xpathPrefix, taskNode);
            tasks.add(task);
        } else if (modelFileNode != null) {
            String modelFile = modelFileNode.getNodeValue();
            String xpathPrefix = "/Tasks/Task[@modelFile='" + modelFile + "']";
            HeadlessTask task = initHeadlessTask(modelFile, xpath, xpathPrefix, taskNode);
            tasks.add(task);
        }
    }

    private HeadlessTask initHeadlessTask(String modelDirectory, String[] suffix, XPath xpath, String xpathPrefix, Node taskNode)
            throws XPathExpressionException {
        HeadlessTask task = new HeadlessTask(modelDirectory, suffix);
        initTaskProcessSteps(xpath, xpathPrefix, taskNode, task);
        return task;
    }

    private HeadlessTask initHeadlessTask(String modelFile, XPath xpath, String xpathPrefix, Node taskNode) throws XPathExpressionException {
        HeadlessTask task = new HeadlessTask(modelFile);
        initTaskProcessSteps(xpath, xpathPrefix, taskNode, task);
        return task;
    }

    private void initTaskProcessSteps(XPath xpath, String xpathPrefix, Node taskNode, HeadlessTask task) throws XPathExpressionException {
        String[] preProcessUtil = parseStringArray(xpath, xpathPrefix + "/preUtilities", taskNode);
        if (preProcessUtil != null) {
            task.setPreProcessList(preProcessUtil);
        }
        String[] transformations = parseStringArray(xpath, xpathPrefix + "/transformations", taskNode);
        if (transformations != null) {
            task.setTransformationList(transformations);
        }
        String[] umlUtilities = parseStringArray(xpath, xpathPrefix + "/umlUtilities", taskNode);
        if (umlUtilities != null) {
            task.setUmlUtilityList(umlUtilities);
        }
        String[] postProcessUtil = parseStringArray(xpath, xpathPrefix + "/postUtilities", taskNode);
        if (postProcessUtil != null) {
            task.setPostProcessList(postProcessUtil);
        }

        XPathExpression expr = xpath.compile(xpathPrefix + "/decisions/decision");
        Object result = expr.evaluate(taskNode, XPathConstants.NODESET);
        if (result instanceof NodeList) {
            NodeList nodeList = (NodeList) result;
            List<String> decisions = new ArrayList<String>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                String decision = node.getTextContent().toLowerCase();
                decisions.add(decision);
            }
            if (!decisions.isEmpty()) {
                task.setDecisionList(decisions.toArray(new String[decisions.size()]));
            }
        }
    }

    private String[] parseStringArray(XPath xpath, String path, Node parentNode) throws XPathExpressionException {
        XPathExpression expr = xpath.compile(path);
        Object result = expr.evaluate(parentNode, XPathConstants.NODE);
        if (!(result instanceof Node)) {
            return new String[] {};
        }
        Node node = (Node) result;
        String textContent = node.getTextContent().toLowerCase();
        if (textContent != null) {
            return textContent.split(",");
        }
        return new String[] {};
    }

}
