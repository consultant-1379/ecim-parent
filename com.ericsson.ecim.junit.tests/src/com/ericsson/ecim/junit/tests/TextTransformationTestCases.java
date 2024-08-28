package com.ericsson.ecim.junit.tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;

public abstract class TextTransformationTestCases extends CommonTestCases {
    
    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();
    
    public TextTransformationTestCases(ModelContainer modelUrlContainer, IPath testModelFolder) throws CoreException, IOException {
        super();
        initialize(modelUrlContainer, testModelFolder);
        
        modelConverter.initialValidation();
        flattenedUmlFile = modelConverter.uml2Uml();
    }
    
    public TextTransformationTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException, IOException {
        super();
        setModelConverter(aModelConverter);
        setModelContainer(aModelContainer);
        setFlattenedUmlFile(flattenedUMLFile);
    }
    
    protected static Object[] initParameters(ModelContainer modelContainer, String localModelPath) throws CoreException, IOException {
        List<URL> sourceURLs = searchSourceURLs(localModelPath);
        modelContainer.initialize(sourceURLs, getInputFolder(localModelPath));
        File outputFolder = getOutputFolder(localModelPath).getLocation().toFile();
        IPath testModelFolder = testProjectFolder.append(GENERAL_TEST_MODEL_PATH + localModelPath);
        ModelConverter modelConverter = new ModelConverter(modelContainer, outputFolder, testModelFolder);
        modelConverter.initialValidation();
        File flattenedFile = modelConverter.uml2Uml();
        return new Object[] { modelContainer, modelConverter, flattenedFile };
    }

    @SuppressWarnings("rawtypes")
    private static List<URL> searchSourceURLs(String localModelPath) {
        List<URL> result = new ArrayList<URL>();
        Enumeration emxURLs = testModelsBundle.findEntries(GENERAL_TEST_MODEL_PATH + localModelPath, "*.uml", false);
        while(emxURLs != null && emxURLs.hasMoreElements()) {
            result.add((URL) emxURLs.nextElement());
        }
        return result;
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testUml2Mp() throws Exception {
        modelConverter.uml2Mp(flattenedUmlFile, modelIsCPP(), false);
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testUml2Imm() throws Exception {
        if (modelIsCoreMw())
            modelConverter.uml2Imm(flattenedUmlFile);
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testUml2Vdicos() throws Exception {
        if (modelIsVdicos())
            modelConverter.uml2Vdicos();
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testUml2MmasCmPojo() throws EcimTransformationException, IOException {
        if (modelIsMMAS()) {
            modelConverter.uml2MmasCmPojo(flattenedUmlFile);
        }
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testUml2Yang() throws Exception {
        if (runYangTransform()) {
            modelConverter.uml2Yang(flattenedUmlFile);
        }
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testUml2Mgc() throws Exception {
        if (modelIsMgc()) {
            modelConverter.uml2Mgc(flattenedUmlFile);
        }
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testDecisionModelling() {
        if (modelHasOptionality()) {
            modelConverter.umlDecisions();
        }
    }
    
    abstract protected boolean modelIsCoreMw();

    abstract protected boolean modelIsVdicos();

    protected boolean modelIsMMAS() {
        return false;
    }

    protected boolean modelHasOptionality() {
        return false;
    }

    protected boolean modelIsCPP() {
        return false;
    }

    protected boolean runYangTransform() {
        return true;
    }

    protected boolean modelIsMgc() {
        return false;
    }

}
