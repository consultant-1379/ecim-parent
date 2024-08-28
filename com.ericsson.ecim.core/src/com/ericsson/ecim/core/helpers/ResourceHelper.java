package com.ericsson.ecim.core.helpers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

public final class ResourceHelper {

    private final static Logger LOGGER = Logger.getLogger(ResourceHelper.class);

    private ResourceHelper() {
    }

    public static final void createResource(final IResource resource) throws CoreException {
        if (resource == null || resource.exists())
            return;
        if (!resource.getParent().exists())
            createResource(resource.getParent());
        switch (resource.getType()) {
        case IResource.FILE:
            ((IFile) resource).create(new ByteArrayInputStream(new byte[0]), true, null);
            break;
        case IResource.FOLDER:
            ((IFolder) resource).create(IResource.NONE, true, null);
            break;
        case IResource.PROJECT:
            ((IProject) resource).create(null);
            ((IProject) resource).open(null);
            break;
        default:
            // not needed
        }

    }

    public static final boolean createFile(final File file) throws IOException {
        createResource(file);

        return file.createNewFile();
    }

    public static final boolean createFolder(final File folder) {
        createResource(folder);
        return folder.mkdir();
    }

    private static final void createResource(final File resource) {
        if (resource == null || resource.exists())
            return;
        if (!resource.getParentFile().exists())
            resource.getParentFile().mkdirs();
    }

    public static final void setPermissionsRecursive(IResource resource, Boolean readOnly, Boolean isDerived) throws CoreException {
        setPermissions(resource, readOnly, isDerived, true);
    }

    public static final void setPermissions(IResource resource, Boolean readOnly, Boolean isDerived, boolean recurse) throws CoreException {
        if (resource == null)
            return;
        if (!resource.exists())
            return;
        if (isDerived != null)
            resource.setDerived(isDerived, null);
        ResourceAttributes resourceAttr = resource.getResourceAttributes();
        if (readOnly != null && resourceAttr != null) {
            resourceAttr.setReadOnly(readOnly);
            resource.setResourceAttributes(resourceAttr);
        }

        if (recurse && (resource instanceof IContainer)) {
            IContainer container = (IContainer) resource;
            for (IResource childResource : container.members()) {
                setPermissions(childResource, readOnly, isDerived, recurse);
            }
        }
    }

    public static boolean deleteRecursive(final File resource) {
        if (resource.isDirectory()) {
            for (String child : resource.list()) {
                boolean success = deleteRecursive(new File(resource, child));
                if (!success) {
                    return false;
                }
            }
        }

        // The resource is now empty so delete it
        return resource.delete();
    }

    /**
     * Helper method to convert from a File to a Eclipse Resource
     * 
     * @param file
     * @return
     */
    public static IResource file2IResource(File file) {
        IPath path = Path.fromOSString(file.getAbsolutePath());
        IResource res = null;
        if (file.isFile())
            res = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
        else if (file.isDirectory())
            res = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(path);

        try {
            if (res != null) {
                res.refreshLocal(IResource.DEPTH_ONE, null);
            }
        } catch (CoreException e) {
            LOGGER.warn(e.getMessage(), e);
        }

        return res;
    }

    public static File getOutputFolderForModel(File modelFile, String outputDirectoryName, String modelName) {
        IResource iResource = file2IResource(modelFile);
        if (iResource != null && iResource instanceof IFile && iResource.isAccessible()) {
            return iResource.getProject().getFolder(outputDirectoryName).getFolder(modelName).getLocation().toFile();
        } else {
            return new File(modelFile.getParentFile(), outputDirectoryName + File.separator + modelName);
        }
    }

    /**
     * Copies resource to specified java.io.File
     * 
     * @param bundle
     * @param relativePath
     * @param outFile
     * @throws IOException
     */
    public static void copyResource2File(Bundle bundle, String relativePath, File outFile) throws IOException {
        InputStream is = FileLocator.openStream(bundle, new Path(relativePath), false);
        if (!outFile.getParentFile().exists()) {
            outFile.getParentFile().mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(outFile);
        IOUtils.copy(is, fos);
        fos.close();
    }

}
