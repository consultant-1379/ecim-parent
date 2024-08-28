package com.ericsson.ecim.mmas.cmpojo.launcher.transformation;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ericsson.ecim.mmas.cmpojo.CmPojoActivator;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.Transformation;

/**
 * @deprecated
 */
@Deprecated
public class JavaCmTransformation extends Transformation {

    @Override
    public IStatus run(IProgressMonitor monitor) {
        try{
            checkResources();
        }
        catch(EcimTransformationException e){
            return new Status(IStatus.ERROR, CmPojoActivator.PLUGIN_ID, "Error while executing MMAS CM POJO Transformation: "+e.getMessage(), e);
        }
        return Status.OK_STATUS;
    }
    
    /**
     * Returns the plugin versions used by this transformation.
     * @return
     */
    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        sb.append(" mmas.cmpojo = " + com.ericsson.ecim.mmas.cmpojo.CmPojoActivator.getVersion() + "\n");

        return sb.toString();
    }
}