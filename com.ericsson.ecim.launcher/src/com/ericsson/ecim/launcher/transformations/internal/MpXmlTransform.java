package com.ericsson.ecim.launcher.transformations.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Model;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ParameterModelHelper;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.core.helpers.XmlPrettyPrinter;
import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.core.helpers.XsltRunner;
import com.ericsson.ecim.core.uml.helpers.ModelUtility;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.edm.EDMActivator;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.m2m.MPATLResources;
import com.ericsson.ecim.validator.ContainmentRelationshipChecker;
import com.ericsson.ecim.validator.DocFirstLineChecker;
import com.ericsson.ecim.validator.DuplicateNameChecker;
import com.ericsson.ecim.validator.DuplicateRelationshipChecker;
import com.ericsson.ecim.validator.ECIMValidator;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.validator.MpXmlValidator;

import Mp.util.MpResourceFactoryImpl;

/**
 * Performs the MP XML transformation.
 * 
 * @author erajaik
 * 
 */
public class MpXmlTransform extends Transformation {

    private static final String MP_DTD = "mp.dtd";

    private static final String LONG_END = "</long>";

    private static final String LONG_START = "<long";

    private static final String ROOT_PATTERN = "^.*Root.*$";

    private static final String MANAGED_ELEMENT = "ManagedElement";

    private static final Logger LOGGER = Logger.getLogger(MpXmlTransform.class);

    public static final String MP_TRANSFORMTION_MP = "mp";

    public static final String MP_TRANSFORMTION_MPDWAXE = "mpDwaxe";

    public static final String MP_TRANSFORMTION_MPCPP = "mpCpp";

    public static final String[] MP_TRANSFORMTIONS = new String[] { MP_TRANSFORMTION_MP, MP_TRANSFORMTION_MPDWAXE, MP_TRANSFORMTION_MPCPP }; // NOSONAR

    private static final Map<String, String[]> VALID_ROOT_NAMES = new HashMap<String, String[]>();

    static {
        VALID_ROOT_NAMES.put(MP_TRANSFORMTION_MP, new String[] { MANAGED_ELEMENT, ROOT_PATTERN });
        VALID_ROOT_NAMES.put(MP_TRANSFORMTION_MPDWAXE, new String[] { MANAGED_ELEMENT, "ManagedObject", ROOT_PATTERN });
        VALID_ROOT_NAMES.put(MP_TRANSFORMTION_MPCPP, new String[] { MANAGED_ELEMENT, "ManagedObject", ROOT_PATTERN });
    }

    @Override
    public IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("Transforming UML Model to MP XML", 6);
        IStatus result = Status.OK_STATUS;
        setGeneratedFiles(new ArrayList<File>());
        try {
            checkResources();
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
            monitor.subTask("Transforming UML to intermediate MP Model " + (!isComMp() ? " (" + getMpFormat() + ")" : ""));

            result = doRunTransform(monitor);
            monitor.done();
        } catch (EcimValidationException e) {
            LOGGER.error(e.getMessage(), e);
            return (e.getStatus() != null) ? e.getStatus() : new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        }
        return result;
    }

    private IStatus doRunTransform(IProgressMonitor monitor) throws IOException, TransformerException, EcimException {
        File mpFile = runMPTransform(monitor, getFlattenedModelFile());

        copyMpDtdToFolder(mpFile.getParentFile());
        File completeMpXmlFile = validateMpFile(mpFile, monitor);

        copyMpDtdToFolder(getOutputFolder());

        if (isDwaxeMp()) {
            processCompleteMpXmlFile(completeMpXmlFile);
            return Status.OK_STATUS;
        }
        if (isCppMp()) {
            mapYang2CorbaTypes(completeMpXmlFile, monitor);
        }

        generateFinalOutputFile(completeMpXmlFile, monitor);
        return Status.OK_STATUS;
    }

    private void generateFinalOutputFile(File completeMpXmlFile, IProgressMonitor monitor) throws IOException, EcimException {
        String mims = getMims(completeMpXmlFile);
        String mibs = getMibs(completeMpXmlFile);
        if (mims != null || mibs != null) {
            File noMibMpFile = copyWithoutMibTags(completeMpXmlFile, monitor);
            File filtedNoMibMpFile = processCompleteMpXmlFile(noMibMpFile);
            File backupNoMibFile = new File(getOutputFolder(), ".intermediate" + File.separator + noMibMpFile.getName());
            FileUtils.copyFile(filtedNoMibMpFile, backupNoMibFile);
            List<File> mimMpXmlFiles = chopUpMimMpXmlFile(backupNoMibFile, mims, monitor);
            getGeneratedFiles().addAll(mimMpXmlFiles);
            List<File> mibMpXmlFiles = chopUpMibMpXmlFile(completeMpXmlFile, mibs, monitor);
            getGeneratedFiles().addAll(mibMpXmlFiles);

            monitor.worked(1);
        } else {
            // We have an empty model
            Uml2ModelHelper umh = new Uml2ModelHelper(getFlattenedModelFile());
            Model theModel = umh.loadModel();
            if (ModelUtility.INSTANCE().countEcimLibraryPackages(theModel) == 0) {
                processCompleteMpXmlFile(completeMpXmlFile);
            }
            umh.unloadModel();
        }
    }

    private File processCompleteMpXmlFile(File completeMpXmlFile) throws IOException, EcimException {
        File targetFile = new File(getOutputFolder(), completeMpXmlFile.getName());
        FileUtils.copyFile(completeMpXmlFile, targetFile);
        getGeneratedFiles().add(targetFile);

        // Like Vidcos, ugly code here in MP transofmation.
        if (hasProfileApplied("IMSUDM")) {
            handleImsUdmDomainExtension(targetFile);
        }
        return targetFile;
    }

    /**
     * Runs the ATL M2M MP transform.
     * 
     * @return
     * @throws EcimTransformationException
     */
    private File runMPTransform(IProgressMonitor monitor, File modelFile) throws EcimTransformationException {
        long start = System.currentTimeMillis();
        MPATLResources atlResources = new MPATLResources();
        // Just in case someone do not want to generate the domain extension for
        // canCreate/canDelete, we support
        // a System Property that is passed on to the ATL MP transformation
        Boolean canCreateCanDeleteAsDomainExtension = System.getProperty("noCanCreateCanDeleteAsDomainExtension") == null;
        String[] params = new String[] { "canCreateCanDeleteAsDomainExtension=" + canCreateCanDeleteAsDomainExtension, "mpFormat=" + getMpFormat(),
                "isDecisionModel=" + getDecisionModelFlag() };
        File transformationParameters = ParameterModelHelper.createParameterModelFile(params);
        atlResources.setParameterFile(transformationParameters);
        File mpFile = M2MLauncher.convert(monitor, modelFile, new File(getWorkFolder(), MP_TRANSFORMTION_MP + File.separator + getModelName()
                + (!isComMp() ? "_" + getMpFormat() : "") + "_mp.mp"), atlResources);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("MP Transform takes: " + (System.currentTimeMillis() - start) + "ms");
        }
        FileUtils.deleteQuietly(transformationParameters);
        return mpFile;
    }

    /**
     * Validates supplied MP xml file and returns a copy of it with xml suffix.
     * 
     * @param mpFile
     * @param monitor
     * @return Copied XML file.
     * @throws IOException
     * @throws TransformerException
     * @throws EcimException
     */
    private File validateMpFile(File mpFile, IProgressMonitor monitor) throws IOException, TransformerException, EcimException {
        ECIMValidator mpValidator = new ECIMValidator(new MpResourceFactoryImpl());
        ECIMValidator xmlValidator = new ECIMValidator();

        mpValidator.validateEcore(mpFile);

        File completeMpXmlFile = new File(mpFile.getParentFile(), mpFile.getName().replaceFirst(".mp$", ".xml"));
        FileUtils.copyFile(mpFile, completeMpXmlFile);

        Bundle bundleEDM = EDMActivator.getDefault().getBundle();
        monitor.subTask("Validating MP XML file against mp.dtd");
        xmlValidator.validateAgainstDTD(new FileInputStream(completeMpXmlFile), bundleEDM.getEntry("model/mp.dtd").openStream());

        monitor.worked(1);
        monitor.subTask("Validating MP XML file against custom rules");

        InputStream is = new FileInputStream(completeMpXmlFile);
        MpXmlValidator mpXmlValidator = MpXmlValidator.instance(is);
        IStatus status = mpXmlValidator.validate(new DuplicateNameChecker());
        checkValidateStatus(completeMpXmlFile, status);

        status = mpXmlValidator.validate(new DuplicateRelationshipChecker());
        checkValidateStatus(completeMpXmlFile, status);
        
        if (runContainmentCheck()) {
            String[] validRootNames = VALID_ROOT_NAMES.get(getTransformationId());
            status = mpXmlValidator.validate(new ContainmentRelationshipChecker(validRootNames));
            checkValidateStatus(completeMpXmlFile, status);
        }

        // Check that description tags have a first sentence that is not more
        // than 100 characters.
        // Only log warning, we do not destroy the transformation
        status = mpXmlValidator.validate(new DocFirstLineChecker());
        if (!status.isOK()) {
            LauncherActivator.getDefault().getLog().log(status);
        }

        // CDataEncoder.go(completeMpXmlFile); NOW DONE BY XSLT!
        // SurplusIntermimTagRemover.go(completeMpXmlFile); MUST NOT BE CALLED
        // ON FILE WITH SEVERAL MIMS!
        // MibObjectSorter.sort(completeMpXmlFile); DOES NOT WORK ON FILES WITH
        // SEVERAL MIBS!!!
        XmlPrettyPrinter.printDocument(completeMpXmlFile, MP_DTD);
        xmlValidator.validateAgainstDTD(new FileInputStream(completeMpXmlFile), bundleEDM.getEntry("model/mp.dtd").openStream());

        return completeMpXmlFile;
    }

    private void checkValidateStatus(File completeMpXmlFile, IStatus status) throws EcimValidationException {
        if (!status.isOK()) {
            FileUtils.deleteQuietly(completeMpXmlFile);
            if (status.getException() != null) {
                throw new EcimValidationException(status.getMessage(), status.getException());
            }
            throw new EcimValidationException(status.getMessage());
        }
    }

    /**
     * Determines if containment check must run or not
     * 
     * @return
     */
    private boolean runContainmentCheck() {
        if ("false".equalsIgnoreCase(System.getProperty(ContainmentRelationshipChecker.ENABLE_CONTAINMENT_CHECKER, "false"))) {
            return false;
        }
        // Ugly dependency to VDicosProfile name here, but can't be helped.
        // It is only a string, that will *never* change.
        return !hasProfileApplied("VDicosProfile");
    }

    private boolean hasProfileApplied(String profileName) {
        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(getFlattenedModelFile());
            Model model = umh.loadModel();
            return model.getAppliedProfile(profileName) != null;
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return false;
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
    }

    /**
     * Map from the mp.dtd yang types to corba types.
     * 
     * @param completeMpXmlFile
     * @return
     * @throws IOException
     */
    private void mapYang2CorbaTypes(File completeMpXmlFile, IProgressMonitor monitor) throws IOException {
        monitor.subTask("Mapping from the mp.dtd yang types to corba types.");
        String content = FileUtils.readFileToString(completeMpXmlFile);
        //@formatter:off
        content = content.
                replaceAll("<u?int8", LONG_START).
                replaceAll("</u?int8>", LONG_END).
                replaceAll("<u?int16", LONG_START).
                replaceAll("</u?int16>", LONG_END).
                replaceAll("<u?int32", LONG_START).
                replaceAll("</u?int32>", LONG_END).
                replaceAll("<u?int64", "<longlong").
                replaceAll("</u?int64>", "</longlong>");
        //@formatter:on
        FileUtils.writeStringToFile(completeMpXmlFile, content);
    }

    /**
     * Copies complete MP XML file with mib tags removed. Done to stay BC with previous output, but question is who is
     * using this file?
     * 
     * @param completeMpXmlFile
     * @return
     * @throws IOException
     */
    private File copyWithoutMibTags(File completeMpXmlFile, IProgressMonitor monitor) throws IOException, EcimException {
        // Handle the mims
        monitor.subTask("Copying complete MP XML file without mib elements.");

        File tempFile = File.createTempFile("tempMp", ".noMib");
        InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/copyWithoutMibElements.xsl").openStream();
        XsltRunner.transform(completeMpXmlFile, tempFile, xslStream, null);
        // Put no mib mp into temp. folder
        File noMibMpFile = new File(tempFile.getParentFile(), completeMpXmlFile.getName());
        if (noMibMpFile.exists()) {
            noMibMpFile.delete();
        }
        FileUtils.moveFile(tempFile, noMibMpFile);

        noMibMpFile.deleteOnExit();
        return noMibMpFile;
    }

    /**
     * Takes complete MP xml file as input and splits it up in several xml files, one for each mim.
     * 
     * @param completeMpXmlFile
     * @return
     * @throws Exception
     */
    private List<File> chopUpMimMpXmlFile(File inputMpXmlFile, String mims, IProgressMonitor monitor) throws IOException, EcimException {
        List<File> result = new ArrayList<File>();
        copyMpDtdToFolder(inputMpXmlFile.getParentFile());
        // Handle the mims
        monitor.subTask("Splitting up MP XML file into several ones containing one mim each.");

        if (mims != null && mims.trim().length() > 0) {
            for (String mimPackageName : mims.split(" ")) {
                File mimXmlFile = new File(getOutputFolder(), mimPackageName + (isCppMp() ? "_" + getMpFormat() : "") + "_mp" + ".xml");
                InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/createMimMpXml.xsl").openStream();
                XsltRunner.transform(inputMpXmlFile, mimXmlFile, xslStream, new String[] { "mimName:" + mimPackageName });
                result.add(mimXmlFile);
            }
        }
        File mpFile = new File(inputMpXmlFile.getParentFile(), MP_DTD);
        mpFile.deleteOnExit();
        return result;
    }

    /**
     * Takes complete MP xml file as input and splits it up in several xml files, one for each mib.
     * 
     * @param completeMpXmlFile
     * @return
     * @throws Exception
     */
    private List<File> chopUpMibMpXmlFile(File inputMpXmlFile, String mibs, IProgressMonitor monitor) throws IOException, EcimException {
        List<File> result = new ArrayList<File>();

        // Handle the mibs
        monitor.subTask("Splitting up MP XML file into several ones containing one mib each.");

        if (mibs != null && mibs.trim().length() > 0) {
            for (String mibPackageName : mibs.trim().split(" ")) {
                File mibXmlFile = new File(getOutputFolder(), mibPackageName + (isCppMp() ? "_" + getMpFormat() : "") + "_mp" + ".xml");
                InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/createMibMpXml.xsl").openStream();
                XsltRunner.transform(inputMpXmlFile, mibXmlFile, xslStream, new String[] { "mibName:" + mibPackageName });
                result.add(mibXmlFile);
            }
        }

        return result;
    }

    /**
     * Returns all mib names separated by a space or null if no one present.
     * 
     * @param completeMpXmlFile
     * @return
     * @throws IOException
     * @throws EcimException
     */
    private String getMibs(File completeMpXmlFile) throws IOException, EcimException {
        InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/getMibs.xsl").openStream();
        String mibs = XsltRunner.transformAndReturnStringResult(completeMpXmlFile, xslStream);

        if (mibs.trim().length() == 0)
            mibs = null;
        return mibs;
    }

    /**
     * Returns all mim names separated by a space or null if no one present.
     * 
     * @param completeMpXmlFile
     * @return
     * @throws IOException
     * @throws EcimException
     */
    private String getMims(File completeMpXmlFile) throws IOException, EcimException {
        InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/getMims.xsl").openStream();
        String mims = XsltRunner.transformAndReturnStringResult(completeMpXmlFile, xslStream);

        if (mims.trim().length() == 0)
            mims = null;
        return mims;
    }

    /**
     * Copies the mp.dtd file to output directory. The mp.dtd is needed by the xslt scripts.
     * 
     * @throws IOException
     */
    private void copyMpDtdToFolder(File folder) throws IOException {
        ResourceHelper.copyResource2File(EDMActivator.getDefault().getBundle(), "/model/mp.dtd", new File(folder, MP_DTD));
    }

    private void handleImsUdmDomainExtension(File mpXmlFile) throws IOException, EcimException {
        // Copy current mpXmlFile to keep imsudm domain and rename it to have imsudm in its name
        String suffix = isDwaxeMp() ? "DWAXE_mp.xml" : "mp.xml";
        String replacement = isDwaxeMp() ? "IMSUDM_DWAXE_mp.xml" : "IMSUDM_mp.xml";
        File imsUdmMpFile = new File(mpXmlFile.getAbsolutePath().replace(suffix, replacement));
        FileUtils.copyFile(mpXmlFile, imsUdmMpFile);
        getGeneratedFiles().add(imsUdmMpFile);

        // Remove the domain extension from mp xml file
        InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/copyWithoutImsUdmExtension.xsl").openStream();
        XmlUtil.runXsltOnXmlFile(mpXmlFile, xslStream, false);
    }

    /**
     * Returns the plugin versions used by this transformation.
     * 
     * @return
     */
    @Override
    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ecim.m2m  = " + com.ericsson.ecim.m2m.M2MActivator.getVersion() + "\n");
        sb.append(" ecim.dsl  = " + com.ericsson.ecim.dsl.DSLActivator.getVersion() + "\n");
        return sb.toString();
    }

    private boolean isComMp() {
        return MP_TRANSFORMTION_MP.equals(getTransformationId());
    }

    private boolean isCppMp() {
        return MP_TRANSFORMTION_MPCPP.equals(getTransformationId());
    }

    private boolean isDwaxeMp() {
        return MP_TRANSFORMTION_MPDWAXE.equals(getTransformationId());
    }

    private String getMpFormat() {
        String mpFormat = null;
        if (isComMp())
            mpFormat = "COM";
        if (isCppMp())
            mpFormat = "CPP";
        if (isDwaxeMp())
            mpFormat = "DWAXE";
        return mpFormat;
    }
}
