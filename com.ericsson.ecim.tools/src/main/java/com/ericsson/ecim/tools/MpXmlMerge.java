package com.ericsson.ecim.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Parser;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

/**
 * Merges MP xml files. See main class for options.
 * 
 * @author ERAJAIK
 *
 */
public class MpXmlMerge {

    private static final String OUTPUT_FILE = "outputfile";
    private static final String MERGE_XSL_SCRIPT = "mergeMpXml.xsl";
    public static final String FILES_OPT = "files";
    public static final String DIR_OPT = "directory";
    public static final String SUBTITLE_OPT = "subtitle";
    public static final String TITLE_OPT = "title";
    public static final String DOCNUM_OPT = "docnum";
    public static final String DOCLANG_OPT = "doclang";
    public static final String DOCREV_OPT = "docrev";
    public static final String DOCDATE_OPT = "docdate";
    public static final String CREATEDBY_OPT = "createdby";
    public static final String APPROVEDBY_OPT = "approvedby";
    private static final String DEFAULT_OUTPUT_FILE_NAME = "Merged_mp.xml";

    private Collection<File> inputFiles;
    private File outputFile;
    private Map<String, String> momMetaData = new HashMap<String, String>();

    /**
     * Constructor
     * 
     * @param inputFiles
     * @param outputFile
     * @param subtitle
     */
    public MpXmlMerge(Collection<File> inputFiles, File outputFile, Map<String, String> momMetaData) {
        this.inputFiles = inputFiles;
        this.outputFile = outputFile;
        this.momMetaData = momMetaData;
    }

    /**
     * Creates the master mp xml file which points to the files to be merged. This is the file that the xslt transform
     * gets as input.
     * 
     * @return
     * @throws IOException
     */
    private File createMasterXmlFile() throws IOException {
        long currentTime = System.currentTimeMillis();
        File masterFile = new File(FileUtils.getTempDirectory(), "MasterMpXmlMergeFile_" + currentTime + ".xml");

        if (!masterFile.exists()) {
            masterFile.createNewFile();
        }

        FileWriter fw = new FileWriter(masterFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("<?xml version=\"1.0\"?>\n");
        bw.write("<contents>\n");
        for (File f : inputFiles) {
            String fileName = f.getCanonicalPath();
            bw.write("<mpfile name=\"" + fileName + "\"/>\n");
        }
        bw.write("</contents>\n");
        bw.close();
        return masterFile;
    }

    /**
     * Sets up the parameters and runs the xslt transform.
     */
    public void run() throws IOException, TransformerException {  // NOSONAR
        File masterFile = createMasterXmlFile();

        InputStream xslScript = getClass().getResourceAsStream("/" + MERGE_XSL_SCRIPT);
        if (xslScript == null) {
            System.out.println("Could not retrieve " + MERGE_XSL_SCRIPT + " from classpath; resorting to look up script file in " // NOSONAR
                    + System.getProperty("user.dir"));
            Collection<File> xslFiles = FileUtils.listFiles(new File(System.getProperty("user.dir")), new NameFileFilter(MERGE_XSL_SCRIPT),
                    TrueFileFilter.INSTANCE);
            if (xslFiles == null || xslFiles.isEmpty()) {
                throw new FileNotFoundException("The " + MERGE_XSL_SCRIPT
                        + " file was not found. Make sure to run command in the 'dxet-mpxmlmerge' folder or a parent thereof.");
            }
            File xslFile = xslFiles.iterator().next();
            xslScript = new FileInputStream(xslFile);
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String[] params = { TITLE_OPT + ":" + momMetaData.get(TITLE_OPT), SUBTITLE_OPT + ":" + momMetaData.get(SUBTITLE_OPT),
                DOCNUM_OPT + ":" + momMetaData.get(DOCNUM_OPT), DOCREV_OPT + ":" + momMetaData.get(DOCREV_OPT),
                DOCLANG_OPT + ":" + momMetaData.get(DOCLANG_OPT), DOCDATE_OPT + ":" + momMetaData.get(DOCDATE_OPT),
                CREATEDBY_OPT + ":" + momMetaData.get(CREATEDBY_OPT), APPROVEDBY_OPT + ":" + momMetaData.get(APPROVEDBY_OPT),
                "current-date:" + dateFormat.format(date), "current-time:" + timeFormat.format(date) };

        transform(masterFile, outputFile, xslScript, params);

        System.out.println("Merged file: " + outputFile); // NOSONAR
    }

    /**
     * Checks options and calls the merge run method.
     * 
     * @param args
     *            usage: java -cp <path/to/mpxmlmergetool/>dxet-mpxmlmerge.jar com.ericsson.ecim.tools.MpXmlMerge
     *            -d,--directory <arg> directory with MP XML files to be merged (not allowed with -f) --docdate
     *            <docdate> docDate tag in mp.dtd --doclang <doclang> docLang tag in mp.dtd --docnum <docnum> docNum tag
     *            in mp.dtd --docrev <docrev> docRev tag in mp.dtd -f,--files <arg> list of MP XML files to be merged
     *            -h,--help print this message -o,--outputfile <outputfile> use given file for output -s,--subtitle
     *            <subtitle> momSubtitle tag in mp.dtd -t,--title <title> momTitle tag in mp.dtd -v,--version print the
     *            version information and exit
     */
    public static void main(String[] args) throws Exception { // NOSONAR
        Options options = createOptions();
        Parser commandLineParser = new PosixParser();

        // parse the command line arguments
        CommandLine line = commandLineParser.parse(options, args);

        if (args.length == 0 || line.hasOption("help")) {
            printUsage(options);
        } else if (line.hasOption("version")) {
            System.out.println(MpXmlMerge.class.getSimpleName() + " version 1.0"); // NOSONAR
        } else if (line.hasOption(FILES_OPT) && line.hasOption(DIR_OPT)) {
            System.err.println("Not both of files and directory options may be choosen simultanously."); // NOSONAR
            printUsage(options);
        } else {
            doMpXmlMerge(line);
        }
    }

    private static void doMpXmlMerge(CommandLine line) throws IOException, TransformerException {
        Collection<File> files = new ArrayList<File>();
        Map<String, String> momMetaData = new HashMap<String, String>();
        momMetaData.put(TITLE_OPT, line.getOptionValue(TITLE_OPT, "MergedModel"));
        momMetaData.put(SUBTITLE_OPT, line.getOptionValue(SUBTITLE_OPT, ""));
        momMetaData.put(DOCNUM_OPT, line.getOptionValue(DOCNUM_OPT, "0"));
        momMetaData.put(DOCREV_OPT, line.getOptionValue(DOCREV_OPT, "0"));
        momMetaData.put(CREATEDBY_OPT, line.getOptionValue(CREATEDBY_OPT, MpXmlMerge.class.getSimpleName()));
        momMetaData.put(APPROVEDBY_OPT, line.getOptionValue(APPROVEDBY_OPT, ""));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        momMetaData.put(DOCDATE_OPT, line.getOptionValue(DOCDATE_OPT, dateFormat.format(new Date())));
        momMetaData.put(DOCLANG_OPT, line.getOptionValue(DOCLANG_OPT, "English"));

        if (!line.hasOption(FILES_OPT)) {
            // use specified directory or current directory
            File dir = new File(line.getOptionValue(DIR_OPT, ".").trim());
            if (!dir.isDirectory())
                System.err.println("Not a directory: '" + dir + "'"); // NOSONAR
            files = FileUtils.listFiles(dir, FileFilterUtils.suffixFileFilter("_mp.xml"), TrueFileFilter.INSTANCE);
        } else {
            // use specified files
            String[] fileNames = line.getOptionValues(FILES_OPT);
            for (String fileName : fileNames) {
                File file = new File(fileName);
                files.add(file);
            }
        }
        File output = new File(line.getOptionValue(OUTPUT_FILE, DEFAULT_OUTPUT_FILE_NAME));

        MpXmlMerge merger = new MpXmlMerge(files, output, momMetaData);
        merger.run();
    }

    /**
     * Prints the tools options.
     * 
     * @param options
     */
    private static void printUsage(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -cp <path/to/mpxmlmergetool/>dxet-mpxmlmerge.jar com.ericsson.ecim.tools.MpXmlMerge", options);
    }

    /**
     * Creates the command line options structure.
     * 
     * @return
     */
    private static Options createOptions() {
        Option help = new Option("h", "help", false, "print this message");
        Option version = new Option("v", "version", false, "print the version information and exit");

        @SuppressWarnings("static-access")
        Option title = OptionBuilder.withArgName(TITLE_OPT).hasArg().withLongOpt(TITLE_OPT).withDescription("momTitle tag in mp.dtd").create("t");

        @SuppressWarnings("static-access")
        Option subtitle = OptionBuilder.withArgName(SUBTITLE_OPT).hasArg().withLongOpt(SUBTITLE_OPT).withDescription("momSubtitle tag in mp.dtd").create("s");

        @SuppressWarnings("static-access")
        Option docNum = OptionBuilder.withArgName(DOCNUM_OPT).hasArg().withLongOpt(DOCNUM_OPT).withDescription("docNum tag in mp.dtd").create();

        @SuppressWarnings("static-access")
        Option docRev = OptionBuilder.withArgName(DOCREV_OPT).hasArg().withLongOpt(DOCREV_OPT).withDescription("docRev tag in mp.dtd").create();

        @SuppressWarnings("static-access")
        Option docLang = OptionBuilder.withArgName(DOCLANG_OPT).hasArg().withLongOpt(DOCLANG_OPT).withDescription("docLang tag in mp.dtd").create();

        @SuppressWarnings("static-access")
        Option docDate = OptionBuilder.withArgName(DOCDATE_OPT).hasArg().withLongOpt(DOCDATE_OPT).withDescription("docDate tag in mp.dtd").create();

        @SuppressWarnings("static-access")
        Option createdBy = OptionBuilder.withArgName(CREATEDBY_OPT).hasArg().withLongOpt(CREATEDBY_OPT)
                .withDescription("signature in created by tag in mp.dtd").create();

        @SuppressWarnings("static-access")
        Option approvedBy = OptionBuilder.withArgName(APPROVEDBY_OPT).hasArg().withLongOpt(APPROVEDBY_OPT)
                .withDescription("signature in approved by tag in mp.dtd").create();

        @SuppressWarnings("static-access")
        Option output = OptionBuilder.withArgName(OUTPUT_FILE).hasArg().withLongOpt(OUTPUT_FILE).withDescription("use given file for output").create("o");

        @SuppressWarnings("static-access")
        Option inputDirectory = OptionBuilder.withDescription("directory with MP XML files to be merged (not allowed with -f)").hasArg().withLongOpt(DIR_OPT)
                .create("d");

        @SuppressWarnings("static-access")
        Option inputFiles = OptionBuilder.withDescription("list of MP XML files to be merged").hasArgs().withLongOpt(FILES_OPT).create("f");

        Options opts = new Options();
        opts.addOption(help);
        opts.addOption(title);
        opts.addOption(subtitle);
        opts.addOption(docNum);
        opts.addOption(docRev);
        opts.addOption(docLang);
        opts.addOption(docDate);
        opts.addOption(createdBy);
        opts.addOption(approvedBy);
        opts.addOption(version);
        opts.addOption(output);
        opts.addOption(inputDirectory);
        opts.addOption(inputFiles);

        return opts;
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
    public String transformAndReturnStringResult(File inputFile, InputStream xslFile) throws TransformerException {
        File tmpOutputFile = new File(FileUtils.getTempDirectory(), "tmpOutput.txt");

        transform(inputFile, tmpOutputFile, xslFile, null);

        try {
            return FileUtils.readFileToString(tmpOutputFile);
        } catch (IOException e) {
            throw new TransformerException(e.getMessage(), e);
        } finally {
            tmpOutputFile.deleteOnExit();
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
    private void transform(File inputFile, File outputFile, InputStream xslFile, String[] params) throws TransformerException {
        Source xmlInput = new StreamSource(inputFile);
        Source xsl = new StreamSource(xslFile);
        Result xmlOutput = new StreamResult(outputFile);

        Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
        if (params != null) {
            for (String param : params) {
                String paramName = param.substring(0, param.indexOf(":"));
                String paramValue = param.substring(param.indexOf(":") + 1);
                transformer.setParameter(paramName, paramValue);
            }
        }

        // Give control to the XSLT Script of how it will handle white-space
        // Without these 2 lines the output will not be formatted nicely
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        transformer.transform(xmlInput, xmlOutput);
    }

}
