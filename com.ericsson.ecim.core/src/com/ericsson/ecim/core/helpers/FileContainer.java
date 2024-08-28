package com.ericsson.ecim.core.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

/**
 * Wraps a java.io.File and org.eclipse.core.resources.IFile so that either one works with the rest of the code.
 * 
 * 
 */
public class FileContainer {

    private File file;
    private IFile iFile;

    public FileContainer(File file) {
        this.file = file;
    }

    public FileContainer(IFile iFile) {
        this.iFile = iFile;
    }

    public InputStream getInputStream() throws IOException {
        if (iFile != null) {
            try {
                return iFile.getContents();
            } catch (CoreException e) {
                throw new IOException(e.getMessage(), e);
            }
        } else
            return new FileInputStream(file);
    }

    public File getFile() {
        if (iFile != null)
            return iFile.getLocation().toFile();
        else
            return file;
    }

    @Override
    public String toString() {
        File instance = getFile();
        if (instance == null)
            return super.toString();
        return instance.toString();
    }
}
