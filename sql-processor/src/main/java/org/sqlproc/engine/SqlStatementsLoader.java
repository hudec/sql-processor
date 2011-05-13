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
 * The helper class for the properties file loading. The properties file can be located on the classpath, in the root
 * directory or in the user's home directory.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlStatementsLoader {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Properties from the properties file.
     */
    private StringBuilder sbStatements;

    /**
     * Reads the properties file and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public SqlStatementsLoader(String fileName, Class<?> loaderClass) {
        sbStatements = load(fileName, loaderClass);
    }

    /**
     * Reads the properties file and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public static StringBuilder getStatements(Class<?> loaderClass, String fileName) {
        SqlStatementsLoader loader = new SqlStatementsLoader(fileName, loaderClass);
        return loader.getStatements();
    }

    /**
     * Reads the properties files and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public SqlStatementsLoader(List<String> fileNames, Class<?> loaderClass) {
        sbStatements = new StringBuilder();
        if (fileNames == null || fileNames.isEmpty())
            return;
        for (String fileName : fileNames) {
            StringBuilder statements = load(fileName, loaderClass);
            sbStatements.append(statements);
        }
    }

    /**
     * Reads the properties files and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public static StringBuilder getStatements(Class<?> loaderClass, String... fileNames) {
        ArrayList<String> propsNames = new ArrayList<String>();
        Collections.addAll(propsNames, fileNames);
        SqlStatementsLoader loader = new SqlStatementsLoader(propsNames, loaderClass);
        return loader.getStatements();
    }

    /**
     * Reads the properties file and creates a new Properties instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return a new Properties instance
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
     * Returns all properties.
     * 
     * @return all properties
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
