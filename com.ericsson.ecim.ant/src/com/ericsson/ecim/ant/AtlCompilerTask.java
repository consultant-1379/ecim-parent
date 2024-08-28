package com.ericsson.ecim.ant;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.resources.FileResource;
import org.apache.tools.ant.types.resources.FileResourceIterator;
import org.eclipse.m2m.atl.engine.compiler.atl2006.Atl2006Compiler;

public class AtlCompilerTask extends Task {

    private Atl2006Compiler compiler = new Atl2006Compiler();
    
    private List<FileSet> filesets = new ArrayList<FileSet>();

    public AtlCompilerTask() {
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
    }

    public void addFileset(FileSet fileset) {
        filesets.add(fileset);
    }
    
    @Override
    public void execute() {
        try {
            //iterate over all the FileSet(s) passed in from ANT
            for(Iterator<FileSet> itFSets = filesets.iterator(); itFSets.hasNext();) 
            {
                //get a FileSet
                FileSet fs = itFSets.next();
    
                FileResourceIterator iter = (FileResourceIterator)fs.iterator();
                
                //loop over all the files in a given FileSet
                while(iter.hasNext())
                {
                    FileResource fr = iter.nextResource();
                    File file = fr.getFile();
                    
                    //compile each ATL file suffixing it with .asm
                    compiler.compile(new FileInputStream(file),file.getAbsolutePath().replace(".atl", ".asm"));
                }
            } 
        }
        catch (Exception e) {
            throw new BuildException("Exception while calling the ATL compiler task.", e);
        }
    }
}