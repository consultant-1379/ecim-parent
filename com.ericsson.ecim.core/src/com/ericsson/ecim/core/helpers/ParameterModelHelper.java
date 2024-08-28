package com.ericsson.ecim.core.helpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import ParameterModel.Parameter;
import ParameterModel.ParameterModelFactory;
import ParameterModel.Parameters;
import ParameterModel.util.ParameterModelResourceFactoryImpl;

public class ParameterModelHelper {
    
    private static final Logger LOGGER = Logger.getLogger(ParameterModelHelper.class);

    private ParameterModelHelper() {
    }
    
    /**
     * Use this class to create a Parameters model. Call methods in the
     * following order:<br>
     * 1) {@link #initializeParametersResource()}<br>
     * 2) {@link #addParameter(String, String)}<br>
     * 3) {@link #createParametersFile()} 4) {@link #deleteParametersFile()}
     * 
     * @author erajaik
     * 
     */
    public static class ParametersResource {
        private static final String PARA_FILE_EXTENSION = ".parametermodel";
        private Resource resource;
        private Parameters parameters;
        private File paramFile;

        public ParametersResource() {
        }

        /**
         * Creates an empty Parameter model.
         * 
         * @return
         */
        public void initializeParametersResource() {

            ParameterModelResourceFactoryImpl resourceFactory = new ParameterModelResourceFactoryImpl();
            URI uri = URI.createURI("http://ericsson.com/ECIM/ParameterModel");
            resource = resourceFactory.createResource(uri);

            parameters = ParameterModelFactory.eINSTANCE.createParameters();

        }

        /**
         * Call this for every parameter to be added to the model.
         * 
         * @param name
         * @param value
         */
        public void addParameter(String name, String value) {

            Parameter parameter = ParameterModelFactory.eINSTANCE.createParameter();
            parameter.setName(name);
            parameter.setValue(value);
            parameters.getParameter().add(parameter);

        }

        /**
         * Creates a Parameters model file with the parameters previously added.
         * 
         * @return
         */
        public File createParametersFile() {
            resource.getContents().add(parameters);

            try {
                paramFile = File.createTempFile("dxet_parameter_model_", PARA_FILE_EXTENSION, FileUtils.getTempDirectory());
                resource.save(new FileOutputStream(paramFile), null);
                paramFile.deleteOnExit();
            } catch (IOException e) {
                LOGGER.warn(e.getMessage(), e);
            }

            return paramFile;
        }
    }

    /**
     * Creates a special Parameter Model and serializes it to a File. The model
     * contains the single supplied string as parameter.
     * 
     * @param any
     *            string to put as a parameter in the model
     * @return the parameter file
     */
    public static File createParameterModelFile(String s) {
        ParametersResource pr = new ParametersResource();

        pr.initializeParametersResource();

        pr.addParameter(s, s);

        return pr.createParametersFile();
    }

    /**
     * Creates a special Parameter Model and serializes it to a File. The model
     * contains multiple name value pairs.
     * 
     * @param strings
     *            array of params, one param has format "<name>:<value>" then
     *            name and value strings are separated.
     * @return
     */
    public static File createParameterModelFile(String[] strings) {
        ParametersResource pr = new ParametersResource();

        pr.initializeParametersResource();

        for (String s : strings) {
            StringTokenizer st = new StringTokenizer(s, ":=");

            String name;
            String value;
            if (st.countTokens() == 1) {
                name = s;
                value = s;
            } else {
                name = st.nextToken();
                value = st.nextToken();
            }
            pr.addParameter(name, value);

        }
        return pr.createParametersFile();
    }
}
