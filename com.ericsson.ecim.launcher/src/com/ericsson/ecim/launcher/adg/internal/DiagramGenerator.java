package com.ericsson.ecim.launcher.adg.internal;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import com.ericsson.ecim.core.exceptions.EcimException;

public class DiagramGenerator extends GeneratorBase {

    private String diagramType;
    private String imageFormat;
    private File filterFile;

    public DiagramGenerator() throws IOException, URISyntaxException {
        super();
        this.diagramType = "brief";
        this.imageFormat = "svg";
    }

    public void setDiagramType(String diagramType) {
        this.diagramType = diagramType;
    }

    public void setImageFormat(String diagramFormat) {
        this.imageFormat = diagramFormat;
    }

    public void setFilterFile(File filterFile) {
        this.filterFile = filterFile;
    }

    @Override
    public void runScript(String[] mpXmlPaths, IProgressMonitor monitor) throws EcimException {
        List<String> cmdList = prepareCommandList();
        cmdList.add(adgScriptPath);
        cmdList.add("genpul");
        if(!diagramType.isEmpty()) {
            cmdList.add("-t");
            cmdList.add(diagramType);
        }
        cmdList.add("-g");
        cmdList.add(imageFormat);

        if(filterFile != null && filterFile.isFile()) {
            cmdList.add("-f");
            cmdList.add(filterFile.getAbsolutePath());
        }
        
        cmdList.add("-i");
        for(String mpXmlPath : mpXmlPaths) {
            cmdList.add(mpXmlPath);
        }

        runForkProcess(cmdList, monitor);
    }


}