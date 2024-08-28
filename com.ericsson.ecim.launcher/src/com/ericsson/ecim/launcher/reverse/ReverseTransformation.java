package com.ericsson.ecim.launcher.reverse;

import java.io.File;
import java.util.List;

public interface ReverseTransformation {
    
    public String getReverseTransformationId();
    
    public ReverseTransformationJob createReverseJob(List<File> sourceFiles);
}
