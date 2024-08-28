package com.ericsson.ecim.launcher.adg.internal;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import com.ericsson.ecim.core.exceptions.EcimException;

public class FilterGenerator extends GeneratorBase {
    private String filterType;
    private String[] subtreeFilter;

    public FilterGenerator() throws IOException, URISyntaxException {
        super();
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setSubtreeFilter(String[] subtreeFilter) {
        this.subtreeFilter = subtreeFilter;
    }

    @Override
    public void runScript(String[] mpXmlPaths, IProgressMonitor monitor) throws EcimException {
        List<String> cmdList = prepareCommandList();
        cmdList.add(adgScriptPath);
        cmdList.add("genfilter");
        cmdList.add(filterType);
        if (filterType.contains("sub"))
            for (int i=0;i<subtreeFilter.length; i++)
                cmdList.add(subtreeFilter[i]);
        
        cmdList.add("-i");
        for(String mpXmlPath : mpXmlPaths) {
            cmdList.add(mpXmlPath);
        }

        runForkProcess(cmdList, monitor);
    }

}