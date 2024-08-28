package com.ericsson.ecim.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MpXmlMergeTest {

    private final static boolean DEBUG = true;
    private final static String LOG_FILE = "MpXmlMergeTest_messages.txt";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void init() {
        File f = new File(LOG_FILE);
        FileUtils.deleteQuietly(f);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {

        if (DEBUG) {
            if (errLength() > 0) {
                errContent.toString();
                File f = new File(LOG_FILE);
                try {
                    FileOutputStream fos = new FileOutputStream(f);
                    fos.write(errContent.toByteArray());
                    fos.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }

            }
        }
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testVersion() throws Exception {
        String[] args = { "-v" };
        MpXmlMerge.main(args);
        assertEquals(0, errLength());
        assertTrue(outMatch("MpXmlMerge version"));

        args = new String[] { "--version" };
        MpXmlMerge.main(args);
        assertEquals(errLength(), 0);
        assertTrue(outMatch("MpXmlMerge version"));
    }

    @Test
    public void testHelp() throws Exception {
        final String expected = "usage: java -cp <path/to/mpxmlmergetool/>dxet-mpxmlmerge.jar com.ericsson.ecim.tools.MpXmlMerge";
        String[] args = { "--h" };
        MpXmlMerge.main(args);
        assertEquals(0, errLength());
        assertTrue(outMatch(expected));

        args = new String[] { "--help" };
        MpXmlMerge.main(args);
        assertEquals(errLength(), 0);
        assertTrue(outMatch(expected));
    }

    @Test
    public void testMergeDirectory() throws Exception {
        String[] args = { "-d",
                System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator };
        MpXmlMerge.main(args);
        assertEquals(0, errLength());
        assertTrue(outMatch("Merged_mp.xml"));
    }

    @Test
    public void testSubtitleOnSingleFile() throws Exception {
        String[] args = {
                "-f",
                System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator
                        + "ComSaTop_DWAXE_mp.xml", "--subtitle", "\"  \"" };
        MpXmlMerge.main(args);
        assertEquals(0, errLength());
        assertTrue(outMatch("Merged_mp.xml"));
    }

    @Test
    public void testAllOptions() throws Exception {
        String[] args = { "-d",
                System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator, "--title",
                "ttt", "--subtitle", "sss", "--docnum", "123456", "--docrev", "r1a", "--doclang", "french", "--docdate", "1968-06-11", "--createdby", "me",
                "--approvedby", "me2" };
        MpXmlMerge.main(args);
        assertEquals(0, errLength());
        assertTrue(outMatch("Merged_mp.xml"));
    }

    @Test
    public void testOutput() throws Exception {
        String[] args = {
                "-f",
                System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator
                        + "ComSaTop_DWAXE_mp.xml", "-o", "MyOutputFile_mp.xml" };
        MpXmlMerge.main(args);
        assertEquals(0, errLength());
        assertTrue(outMatch("MyOutputFile_mp.xml"));
    }

    // @Test
    public void testUnrecognizedOption() throws Exception {
        String[] args = { "--blabla" };
        MpXmlMerge.main(args);

        assertEquals(0, outLength());
        assertTrue(errorMatch("org.apache.commons.cli.UnrecognizedOptionException: Unrecognized option:"));
    }

    private int outLength() {
        return outContent.toString().trim().length();
    }

    private int errLength() {
        return errContent.toString().trim().length();
    }

    private boolean errorMatch(String msg) {
        return stringMatch(msg, errContent.toString().trim());
    }

    private boolean outMatch(String msg) {
        return stringMatch(msg, outContent.toString().trim());
    }

    private boolean stringMatch(String expectedMessage, String fullMessage) {
        if (fullMessage == null)
            return false;

        String expectedNoWhiteSpace = expectedMessage.replaceAll("\\s", "");
        String fullNoWhiteSpace = fullMessage.replaceAll("\\s", "");

        return fullNoWhiteSpace.indexOf(expectedNoWhiteSpace) != -1;
    }

}
