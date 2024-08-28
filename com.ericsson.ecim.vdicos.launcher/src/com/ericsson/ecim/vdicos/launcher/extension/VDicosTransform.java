package com.ericsson.ecim.vdicos.launcher.extension;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import TspMim.MimType;
import TspMim.ModelType;
import TspMim.TspMimPackage;
import TspMim.util.TspMimResourceFactoryImpl;
import TspMim.util.TspMimXMLProcessor;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.m2m.ECIMATLResources;
import com.ericsson.ecim.validator.ECIMValidator;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.vdicos.VdicosActivator;
import com.ericsson.ecim.vdicos.launcher.VDicosLauncherActivator;
import com.ericsson.ecim.vdicos.m2m.VDicosATLResources;

public class VDicosTransform extends Transformation {

    private static final Logger LOGGER = Logger.getLogger(VDicosTransform.class);
    private static final String DOCTYPE_SYSTEM = "<!DOCTYPE mim SYSTEM \"tsp_mim.dtd\">";
    private static final String DOCTYPE_INTERNAL = "\n<!DOCTYPE mim SYSTEM \"tsp_mim.dtd\" [\n<!ELEMENT status (#PCDATA)>\n<!ELEMENT category (#PCDATA)>\n<!ELEMENT dependencies (#PCDATA)>\n<!ELEMENT takesEffect (#PCDATA)>\n<!ELEMENT ordered (#PCDATA)>\n<!ELEMENT unique (#PCDATA)>\n<!ELEMENT ecimName (#PCDATA)>\n<!ELEMENT notifiable (#PCDATA)>\n<!ELEMENT isVirtualContainer (#PCDATA)>\n<!ELEMENT singletonKeyValue (#PCDATA)>\n<!ELEMENT ldapServerName (#PCDATA)>\n<!ELEMENT isPassphrase (#PCDATA)>\n]>\n";

    private ECIMValidator ecimValidator = new ECIMValidator();
    private Bundle bundleVDicos = VdicosActivator.getDefault().getBundle();

    @Override
    public IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("Transforming UML Model to TSP/VDicos XML", 4);
        try {
            checkResources();

            File emxModelFile = getOriginalModelFile();
            File outputFolder = getOutputFolder();
            File workFolder = getWorkFolder();
            String modelName = getModelName();

            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;

            File convertedVdicosFile = runVDicosM2M(monitor, emxModelFile, workFolder, modelName);

            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;

            List<File> genFiles = runVDicosM2T(monitor, outputFolder, convertedVdicosFile);
            setGeneratedFiles(genFiles);

            monitor.worked(1);
        } catch (EcimStatusException e) {
            LOGGER.warn(e.getMessage(), e);
            return (e.getStatus() != null) ? e.getStatus() : new Status(IStatus.ERROR, VDicosLauncherActivator.PLUGIN_ID, e.getMessage(), e);
        } catch (Exception e) {
            return new Status(IStatus.ERROR, VDicosLauncherActivator.PLUGIN_ID, e.getMessage(), e);
        } finally {
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    private List<File> runVDicosM2T(IProgressMonitor monitor, File outputFolder, File convertedVdicosFile) throws IOException, EcimException,
            TransformerException, ParserConfigurationException {
        monitor.subTask("Serializing TSP/VDicos Model to TSP MIM XML");

        List<File> xmlFiles = new ArrayList<File>();

        TspMimPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("tspmim", new TspMimResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resourceSet = new ResourceSetImpl();
        // Get the resource
        Resource vdicosResource = resourceSet.getResource(URI.createFileURI(convertedVdicosFile.getAbsolutePath()), true);
        ModelType tspModel = (ModelType) vdicosResource.getContents().get(0);
        MimType[] mimArray = tspModel.getMim().toArray(new MimType[tspModel.getMim().size()]);
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        for (MimType mim : mimArray) {
            File outputFile = new File(outputFolder, mim.getName() + ".xml");
            // create a resource
            XMLResource resource = (XMLResource) resourceSet.createResource(URI.createFileURI(outputFile.getAbsolutePath()));
            Map<Object, Object> saveOptions = resource.getDefaultSaveOptions();
            saveOptions.put(XMLResource.OPTION_SAVE_DOCTYPE, Boolean.TRUE);

            EClassifierExtendedMetaData.Holder holder = (EClassifierExtendedMetaData.Holder) mim.eClass();
            String tspMimTagName = holder.getExtendedMetaData().getName();
            holder.getExtendedMetaData().setName("mim");

            // Get the first model element and cast it to the right type, in my
            // example everything is hierarchical included in this first node
            resource.getContents().add(mim);

            writeToXml(builder, transformerFactory, outputFile, resource, saveOptions);

            monitor.subTask("Validating TSP MIM XML file " + outputFile.getName());
            ecimValidator.validateAgainstDTD(new FileInputStream(outputFile), bundleVDicos.getEntry("model/tsp_mim.dtd").openStream());

            xmlFiles.add(outputFile);

            holder.getExtendedMetaData().setName(tspMimTagName);
        }

        monitor.worked(1);

        return xmlFiles;
    }

    private void writeToXml(DocumentBuilder builder, TransformerFactory transformerFactory, File outputFile, XMLResource resource,
            Map<Object, Object> saveOptions) throws TransformerException {
        // now save the content.
        try {
            Document outputDocument = builder.newDocument();
            TspMimXMLProcessor mimXMLProcessor = new TspMimXMLProcessor();
            mimXMLProcessor.save(outputDocument, resource, null, saveOptions);
            Node mimNode = outputDocument.getFirstChild();
            mimNode.getAttributes().removeNamedItem("xmlns:xmi");
            mimNode.getAttributes().removeNamedItem("xmi:version");

            // write the content into xml file
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "tsp_mim.dtd");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            DOMSource source = new DOMSource(outputDocument);
            StringWriter output = new StringWriter();
            StreamResult result = new StreamResult(output);
            transformer.transform(source, result);

            int start = output.getBuffer().indexOf(DOCTYPE_SYSTEM);
            int end = start + DOCTYPE_SYSTEM.length();
            output.getBuffer().replace(start, end, DOCTYPE_INTERNAL);

            IOUtils.write(output.getBuffer().toString(), new FileOutputStream(outputFile), "UTF-8");
        } catch (IOException e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    private File runVDicosM2M(IProgressMonitor monitor, File emxModelFile, File workFolder, String modelName) throws EcimTransformationException,
            EcimValidationException {
        File convertedVdicosFile;
        ECIMATLResources atlResources = new VDicosATLResources(VDicosATLResources.VDICOS_TSPMIM);
        ECIMValidator ecimValidatorForTspMimEcore = new ECIMValidator(new TspMimResourceFactoryImpl());

        monitor.subTask("Transforming UML to intermediate TSP/VDicos Model");
        convertedVdicosFile = M2MLauncher.convert(monitor, emxModelFile, new File(workFolder, "vdicos_tspmim" + File.separator + modelName + ".tspmim"),
                atlResources);
        monitor.worked(2);

        monitor.subTask("Validating vDicos Model");
        ecimValidatorForTspMimEcore.validateEcore(convertedVdicosFile);
        monitor.worked(1);
        return convertedVdicosFile;
    }

    /**
     * Returns the plugin versions used in this transformation.
     * 
     * @return
     */
    @Override
    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        sb.append(" vdicos.m2m = " + com.ericsson.ecim.vdicos.m2m.Activator.getVersion() + "\n");
        sb.append(" vdicos.dsl = " + com.ericsson.ecim.vdicos.dsl.Activator.getVersion() + "\n");
        return sb.toString();
    }

}
