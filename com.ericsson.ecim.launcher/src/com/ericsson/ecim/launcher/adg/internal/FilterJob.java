package com.ericsson.ecim.launcher.adg.internal;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.ericsson.ecim.launcher.LauncherActivator;

public class FilterJob extends Job {

    private IResource mpResource;
    private String filterType;
    private String[] subtreeFilter;

    public FilterJob(String name, IResource mpResource, String filterType, String[] subtreeFilter) {
        super(name);
        this.mpResource = mpResource;
        this.filterType = filterType;
        this.subtreeFilter = subtreeFilter;
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        try {
            monitor.beginTask("Generate filter for " + mpResource.getName(), 8);
            FilterGenerator fdg = new FilterGenerator();
            fdg.setFilterType(filterType);
            fdg.setSubtreeFilter(subtreeFilter);
            monitor.worked(4);
            fdg.runScript(new String[] { mpResource.getRawLocation().toFile().getAbsolutePath() }, monitor);
            monitor.worked(4);
            mpResource.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
            monitor.done();
        } catch (Exception e) {
            return new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        }

        return Status.OK_STATUS;
    }

}
