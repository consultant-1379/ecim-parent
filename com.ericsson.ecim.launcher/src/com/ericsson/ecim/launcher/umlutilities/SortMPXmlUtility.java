package com.ericsson.ecim.launcher.umlutilities;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;

import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.MenuPropertyTester;
import com.ericsson.ecim.umlmod.IPostUtil;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class SortMPXmlUtility extends UmlUtilBase implements IPostUtil {

    private File resultLocation;
    private List<File> mpFiles;

    public SortMPXmlUtility() {

    }

    @Override
    public void run() throws Exception {
        mpFiles = new ArrayList<File>();
        recursiveMpXmlFiles(resultLocation, mpFiles);

        for (File file : mpFiles) {
            performTransform(file);
        }
    }

    private void performTransform(File mpFile) throws ExecutionException {
        try {
            InputStream xslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/sortMpXml.xsl").openStream();
            XmlUtil.runXsltOnXmlFile(mpFile, xslStream, true);
        } catch (Exception e) {
            throw new ExecutionException(e.getMessage(), e);
        }
    }

    @Override
    public File getInputResultLocation() {
        return resultLocation;
    }

    @Override
    public void setInputResultLocation(File resultLocation) {
        this.resultLocation = resultLocation;
    }

    @Override
    public boolean isApplicable() {
        if (resultLocation != null) {
            List<File> files = new ArrayList<File>();
            recursiveMpXmlFiles(resultLocation, files);
            return !files.isEmpty();
        }
        return false;
    }

    private void recursiveMpXmlFiles(File location, List<File> mpFiles) {
        File[] files = location.listFiles();
        for (File file : files) {
            if (file.getAbsolutePath().contains(".intermediate")) {
                continue;
            }
            if (file.isDirectory()) {
                recursiveMpXmlFiles(file, mpFiles);
                continue;
            }
            MenuPropertyTester tester = new MenuPropertyTester();
            if (!tester.test(file, "isMpXmlFile", null, null)) {
                continue;
            }
            if (!mpFiles.contains(file)) {
                mpFiles.add(file);
            }
        }
    }
}
