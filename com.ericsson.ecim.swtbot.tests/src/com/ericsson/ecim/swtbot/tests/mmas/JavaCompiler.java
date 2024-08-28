package com.ericsson.ecim.swtbot.tests.mmas;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.log4j.Logger;

public class JavaCompiler {

    private static final Logger LOGGER = Logger.getLogger(JavaCompiler.class);

    private JavaCompiler() {
    }
    /**
     * Compiles all java files in supplied directory using java v1.6.
     * 
     * @return false if no javac compiler was found, or true if javac compilation went without errors
     */
    private static boolean javac6(String userClassPath, String javaSourceDir) throws IOException {

        String javacCmd = "/usr/bin/javac";
        if (!isWindows() && !new File(javacCmd).exists()) {
            return false;
        }
        if (isWindows()) {
            String javaHomeEnv = System.getenv("JAVA_HOME");
            if (javaHomeEnv == null || javaHomeEnv.isEmpty()) {
                return false;
            }

            javacCmd = javaHomeEnv + File.separator + "bin" + File.separator + "javac.exe";
            if (!new File(javacCmd).exists()) {
                return false;
            }
        }

        // Get all java files
        File sourceDir = new File(javaSourceDir);
        File[] javaFiles = listFilesAsArray(sourceDir, new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                 return name.endsWith(".java");
            }
        });

        for (File javaFile : javaFiles) {
            // Call native javac. This probably does not work on Windows ("-d /tmp")
            List<String> cmdArray = new ArrayList<String>();
            cmdArray.add(javacCmd);
            cmdArray.add("-classpath");
            cmdArray.add(userClassPath);
            if (!isWindows()) {
                cmdArray.add("-d");
                cmdArray.add("/tmp");
            }
            cmdArray.add("-sourcepath");
            cmdArray.add(javaSourceDir);
            cmdArray.add(javaFile.getAbsolutePath());

            ProcessBuilder builder = new ProcessBuilder(cmdArray.toArray(new String[] {}));
            builder.redirectErrorStream(true);
            Process process = builder.start();
            runProcess(process);
        }
        return true;
    }

    public static void verifyJavaSourceByCompilation(String javaSourceDir, String userClassPath) {
        javax.tools.JavaCompiler javaxCompiler = ToolProvider.getSystemJavaCompiler();
        if(javaxCompiler == null) {
            try {
                if(!javac6(userClassPath, javaSourceDir)) {
                    throw new JavaCompilerException("No Java compiler found to compile MMAS CM POJO code.");
                }
                return;
            } catch (IOException e) {
                throw new JavaCompilerException(e.getMessage(), e);
            }
        }
        StandardJavaFileManager fileManager = javaxCompiler.getStandardFileManager(null, null, null);
        Iterable<String> compileOptions = Arrays.asList("-cp", userClassPath);
        File[] javaFiles = listFilesAsArray(new File(javaSourceDir), new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        final StringWriter outputWriter = new StringWriter();
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjects(javaFiles);
        CompilationTask compileTask = javaxCompiler.getTask(outputWriter, fileManager, null, compileOptions, null, compilationUnits);
        boolean result = false;
        try {
            result = compileTask.call();
        } catch (Exception e) {
            throw new JavaCompilerException(e.getMessage(), e);
        }
        if(!result) {
            throw new JavaCompilerException(outputWriter.toString());
        }
    }


    private static boolean isWindows() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("windows");
    }

    /**
     * Runs supplied process and checks output. If compilation fails, the output
     * is thrown back in a JavaCompilerException.
     */
    private static void runProcess(Process process) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            LOGGER.warn(e.getMessage(), e);
        }

        InputStreamReader tempReader = new InputStreamReader(new BufferedInputStream(process.getInputStream()));
        BufferedReader reader = new BufferedReader(tempReader);
        while (true) {
            String line = reader.readLine();
            if (line == null)
                break;
            sb.append(line + "\n");
        }
        if (process.exitValue() != 0)
            throw new JavaCompilerException("Exit value=" + process.exitValue() + " \n" + sb.toString());
    }

    /**
     * Custom exception class.
     */
    static class JavaCompilerException extends RuntimeException {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        public JavaCompilerException() {
            super();
        }

        public JavaCompilerException(String message, Throwable cause) {
            super(message, cause);
        }

        public JavaCompilerException(String message) {
            super(message);
        }

        public JavaCompilerException(Throwable cause) {
            super(cause);
        }

    }

    /**
     * Returns all files recursively in a directory that pass supplied filter. 
     */
    private static File[] listFilesAsArray(File directory, FilenameFilter filter) {
        Collection<File> files = listFiles(directory, filter, true);

        return files.toArray(new File[files.size()]);
    }

    private static Collection<File> listFiles(File directory, FilenameFilter filter, boolean recurse) {
        // List of files / directories
        List<File> files = new ArrayList<File>();

        // Get files / directories in the directory
        File[] entries = directory.listFiles();

        // Go over entries
        for (File entry : entries) {
            // If there is no filter or the filter accepts the 
            // file / directory, add it to the list
            if (filter == null || filter.accept(directory, entry.getName())) {
                files.add(entry);
            }

            // If the file is a directory and the recurse flag
            // is set, recurse into the directory
            if (recurse && entry.isDirectory()) {
                files.addAll(listFiles(entry, filter, recurse));
            }
        }

        // Return collection of files
        return files;
    }

}
