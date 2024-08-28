package com.ericsson.ecim.launcher.adg.internal;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.ericsson.ecim.launcher.LauncherActivator;

public class DiagramJob extends Job {

    private IResource mpResource;
    private String diagramType;
    private String imageFormat;
    private File filterFile;

    public DiagramJob(String name, IResource mpResource) {
        this(name, mpResource, "brief", "svg", null);
    }

    public DiagramJob(String name, IResource mpResource, String diagramType, String diagramFormat, File filterFile) {
        super(name);
        this.mpResource = mpResource;
        this.diagramType = diagramType;
        this.imageFormat = diagramFormat;
        this.filterFile = filterFile;
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        try {
            String msg = "Generate diagrams for " + mpResource.getName();
            monitor.beginTask(msg, 8);
            DiagramGenerator dg = new DiagramGenerator();
            dg.setDiagramType(diagramType);
            dg.setImageFormat(imageFormat);
            dg.setFilterFile(filterFile);
            monitor.worked(4);
            dg.runScript(new String[] { mpResource.getRawLocation().toFile().getAbsolutePath() }, monitor);
            monitor.worked(4);
            mpResource.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
            monitor.done();
        } catch (Exception e) {
            return new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        }

        return Status.OK_STATUS;
    }

}
