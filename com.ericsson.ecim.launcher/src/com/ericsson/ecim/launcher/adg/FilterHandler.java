package com.ericsson.ecim.launcher.adg;

import static com.ericsson.ecim.core.uml.helpers.SelectionHelper.getSelectionResource;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ericsson.ecim.launcher.adg.internal.FilterJob;
import com.ericsson.ecim.launcher.adg.internal.FilterOptionsDialog;

public class FilterHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
        
        if (!(selection instanceof IStructuredSelection)) {
            return null;
        }

        try {
            IResource selectedResource = getSelectionResource(selection);
            if (selectedResource != null) {
                Shell shell = HandlerUtil.getActiveShellChecked(event);
                FilterOptionsDialog filterOptionsDlg = new FilterOptionsDialog(shell);
                populateWithValidMocNames(filterOptionsDlg, selectedResource.getRawLocation().toFile());
                int result = filterOptionsDlg.open();
                if (result == IDialogConstants.OK_ID) {
                    FilterJob myjob = new FilterJob("Filter Generator", selectedResource, filterOptionsDlg.getFilterType(), filterOptionsDlg.getSubtreeFilter());
                    myjob.setUser(true);
                    myjob.schedule();
                }
            }
        } catch (Exception e) {
            throw new ExecutionException(e.getMessage(), e);
        }

        return null;
    }

    /**
     * Parses the supplied MP XML file and fills the filter dialog with valid moc and mom names.
     * 
     * @param fod
     * @param mpXmlFile
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws XPathExpressionException
     * @throws Exception
     */
    private void populateWithValidMocNames(FilterOptionsDialog fod, File mpXmlFile) throws ParserConfigurationException, SAXException, IOException,
            XPathExpressionException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(mpXmlFile);
        // optional, but recommended
        // read this -
        // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
        doc.getDocumentElement().normalize();

        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        Object result = xpath.evaluate("/models/mim/class", doc, XPathConstants.NODESET);
        NodeList mocList = (NodeList) result;
        for (int i = 0; i < mocList.getLength(); i++) {
            Node mocNode = mocList.item(i);
            String mocNodeName = mocNode.getAttributes().getNamedItem("name").getTextContent();
            Node mimNode = mocNode.getParentNode();
            String mimNodeName = mimNode.getAttributes().getNamedItem("name").getTextContent();
            fod.getValidMocNames().add(mocNodeName);
            fod.getValidMomNames().add(mimNodeName);
            // Check if moc name already exist in another mim, if so append value instead of replacing
            String existingMimName = fod.getMocName2MomName().get(mocNodeName);
            if (existingMimName != null && !existingMimName.equals(mimNodeName))
                fod.getMocName2MomName().put(mocNodeName, existingMimName + "," + mimNodeName);
            else
                fod.getMocName2MomName().put(mocNodeName, mimNodeName);
        }
    }

}
