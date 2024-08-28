package com.ericsson.ecim.cpp.launcher.extension;

import java.io.File;
import java.util.List;

import com.ericsson.ecim.launcher.reverse.ReverseTransformation;
import com.ericsson.ecim.launcher.reverse.ReverseTransformationJob;

public class CppReverseTransformation implements ReverseTransformation {

    @Override
    public String getReverseTransformationId() {
        return "remp";
    }

    @Override
    public ReverseTransformationJob createReverseJob(List<File> sourceFiles) {
        return new CppReTransformationJob("MP XML to UML Transformation", sourceFiles);
    }

}
