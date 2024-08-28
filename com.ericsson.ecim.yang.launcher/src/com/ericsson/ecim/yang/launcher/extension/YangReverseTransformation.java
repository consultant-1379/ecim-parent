package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.util.List;

import com.ericsson.ecim.launcher.reverse.ReverseTransformation;
import com.ericsson.ecim.launcher.reverse.ReverseTransformationJob;

public class YangReverseTransformation implements ReverseTransformation {

    @Override
    public String getReverseTransformationId() {
        return "reyang";
    }

    @Override
    public ReverseTransformationJob createReverseJob(List<File> sourceFiles) {
        return new YangReTransformationJob("YANG to UML Transformation", sourceFiles);
    }

}
