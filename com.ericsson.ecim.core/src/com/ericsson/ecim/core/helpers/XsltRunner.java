package com.ericsson.ecim.core.helpers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;

import com.ericsson.ecim.core.exceptions.EcimException;

public class XsltRunner {

    private XsltRunner() {
    }

    /**
     * Runs XSLT script and returns result in a string.
     * 
     * @param inputFile
     * @param xslFile
     * @return
     * @throws IOException
     * @throws EcimException
     */
    public static String transformAndReturnStringResult(File inputFile, InputStream xsltStream) throws EcimException {
        try {
            File tmpOutputFile = File.createTempFile("xsltrunner", "tmpOutput.txt");

            transform(inputFile, tmpOutputFile, xsltStream, null);

            String result = FileUtils.readFileToString(tmpOutputFile);
            tmpOutputFile.deleteOnExit();

            return result;
        } catch (IOException ioe) {
            throw new EcimException(ioe.getMessage(), ioe);
        }
    }

    /**
     * Generic caller to run XSLT scripts.
     * 
     * @param inputFile
     * @param outputFile
     * @param xslFile
     * @param params
     *            each param in array must be of format 'name:value'
     */
    public static void transform(File inputFile, File outputFile, InputStream xsltStream, String[] params) throws EcimException {
        XsltRunner.transform(inputFile, outputFile, xsltStream, params, null);
    }

    public static void transform(File inputFile, File outputFile, InputStream xsltStream, String[] params, Properties userProperties) throws EcimException {
        Source xmlInput = new StreamSource(inputFile);
        Source xsl = new StreamSource(xsltStream);
        Result xmlOutput = new StreamResult(outputFile);

        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
            if (params != null) {
                for (String param : params) {
                    String paramName = param.split(":")[0];
                    String paramValue = param.split(":")[1];
                    transformer.setParameter(paramName, paramValue);
                }
            }
            transformer.setURIResolver(new EmptyURIResolver());

            Properties staticProperties = transformer.getOutputProperties();
            // Give control to the XSLT Script of how it will handle white-space
            // Without these 2 lines the output will not be formatted nicely
            if (!staticProperties.containsKey("{http://xml.apache.org/xslt}indent-amount")) {
                staticProperties.put("{http://xml.apache.org/xslt}indent-amount", "4");
            }
            if (!staticProperties.containsKey(OutputKeys.INDENT)) {
                staticProperties.put(OutputKeys.INDENT, "yes");
            }
            if (userProperties != null && !userProperties.isEmpty()) {
                staticProperties.putAll(userProperties);
            }
            transformer.setOutputProperties(staticProperties);

            transformer.transform(xmlInput, xmlOutput);
        } catch (TransformerException e) {
            throw new EcimException("XSLT transformation failed.", e);
        }
    }

    static class EmptyURIResolver implements URIResolver {
        @Override
        public Source resolve(String arg0, String arg1) throws TransformerException {
            return new StreamSource();
        }
    }

}
