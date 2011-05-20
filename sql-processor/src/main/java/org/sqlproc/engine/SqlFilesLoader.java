package org.sqlproc.engine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The helper class for the file(s) loading. The file(s) can be located on the classpath, in the root directory or in
 * the user's home directory. It's used for the purpose of the {@link SqlProcessorLoader} instance creation.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlFilesLoader {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The string representation of the file(s) content.
     */
    private StringBuilder sbStatements;

    /**
     * Reads the file(s) content and creates a new SqlFilesLoader instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public SqlFilesLoader(String fileName, Class<?> loaderClass) {
        sbStatements = load(fileName, loaderClass);
    }

    /**
     * Reads the file(s) content and creates a new SqlFilesLoader instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return the content of the specified file(s) as a String
     */
    public static StringBuilder getStatements(Class<?> loaderClass, String fileName) {
        SqlFilesLoader loader = new SqlFilesLoader(fileName, loaderClass);
        return loader.getStatements();
    }

    /**
     * Reads the file(s) content and creates a new SqlFilesLoader instance.
     * 
     * @param fileNames
     *            The names of the files to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public SqlFilesLoader(List<String> fileNames, Class<?> loaderClass) {
        sbStatements = new StringBuilder();
        if (fileNames == null || fileNames.isEmpty())
            return;
        for (String fileName : fileNames) {
            StringBuilder statements = load(fileName, loaderClass);
            sbStatements.append(statements);
        }
    }

    /**
     * Reads the file(s) content and creates a new SqlFilesLoader instance.
     * 
     * @param fileNames
     *            The name sof the files to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return the content of the specified file(s) as a String
     */
    public static StringBuilder getStatements(Class<?> loaderClass, String... fileNames) {
        ArrayList<String> propsNames = new ArrayList<String>();
        Collections.addAll(propsNames, fileNames);
        SqlFilesLoader loader = new SqlFilesLoader(propsNames, loaderClass);
        return loader.getStatements();
    }

    /**
     * Reads the file content and creates a String representation of this content.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return the content of the specified file as a String
     */
    private StringBuilder load(String fileName, Class<?> loaderClass) {
        if (logger.isTraceEnabled()) {
            logger.trace(">> load, fileName=" + fileName + ", loaderClass=" + loaderClass);
        }
        StringBuilder statements = new StringBuilder();

        try {
            String configFile = "/" + fileName;
            InputStream is = loaderClass.getResourceAsStream(configFile);
            if (is == null) {
                configFile = fileName;
                is = loaderClass.getResourceAsStream(configFile);
            }
            if (is == null) {
                try {
                    configFile = "/" + fileName;
                    is = new FileInputStream(configFile);
                } catch (FileNotFoundException e) {
                }
            }
            if (is == null) {
                try {
                    configFile = System.getProperty("user.home") + configFile;
                    is = new FileInputStream(configFile);
                } catch (FileNotFoundException e) {
                }
            }
            if (is != null) {
                try {
                    BufferedReader input = new BufferedReader(new InputStreamReader(is));
                    String line = null;
                    /*
                     * readLine is a bit quirky : it returns the content of a line MINUS the newline. it returns null
                     * only for the END of the stream. it returns an empty String if two newlines appear in a row.
                     */
                    while ((line = input.readLine()) != null) {
                        statements.append(line);
                        statements.append(System.getProperty("line.separator"));
                    }
                } catch (IOException ioe) {
                } finally {
                    try {
                        is.close();
                    } catch (IOException ignore) {
                    }
                }
            }
            return statements;
        } finally {
            if (logger.isTraceEnabled()) {
                logger.trace("<< load, properties=" + statements);
            }
        }
    }

    /**
     * Returns the content of all read files.
     * 
     * @return the content of all read files
     */
    public StringBuilder getStatements() {
        return sbStatements;
    }

    /**
     * Returns a string representation of the object.
     * 
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Statements: ");
        sb.append(sbStatements);
        return sb.toString();
    }
}
