package org.sqlproc.engine.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The helper class for the property file loading. The property file can be located on the classpath, in the root
 * directory or in the user's home directory.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class PropertiesLoader {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Properties from the property file.
     */
    private Properties properties;

    /**
     * Reads the property file and creates a new PropertiesLoader instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public PropertiesLoader(String fileName, Class<?> loaderClass) {
        properties = load(fileName, loaderClass);
    }

    /**
     * Reads the property file and creates a new PropertiesLoader instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return all properties from the specified file(s)
     */
    public static Properties getProperties(Class<?> loaderClass, String fileName) {
        PropertiesLoader loader = new PropertiesLoader(fileName, loaderClass);
        return loader.getProperties();
    }

    /**
     * Reads the property files and creates a new PropertiesLoader instance.
     * 
     * @param fileNames
     *            The names of the files to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public PropertiesLoader(List<String> fileNames, Class<?> loaderClass) {
        properties = new Properties();
        if (fileNames == null || fileNames.isEmpty())
            return;
        for (String fileName : fileNames) {
            Properties props = load(fileName, loaderClass);
            for (Map.Entry<Object, Object> e : props.entrySet()) {
                properties.setProperty((String) e.getKey(), (String) e.getValue());
            }
        }
    }

    /**
     * Reads the property files and creates a new PropertiesLoader instance.
     * 
     * @param fileNames
     *            The names of the files to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return all properties from the specified file(s)
     */
    public static Properties getProperties(Class<?> loaderClass, String... fileNames) {
        ArrayList<String> propsNames = new ArrayList<String>();
        Collections.addAll(propsNames, fileNames);
        PropertiesLoader loader = new PropertiesLoader(propsNames, loaderClass);
        return loader.getProperties();
    }

    /**
     * Reads the property file and creates a new Properties instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return all properties from the specified file
     */
    private Properties load(String fileName, Class<?> loaderClass) {
        if (logger.isDebugEnabled()) {
            logger.debug(">> load, fileName=" + fileName + ", loaderClass=" + loaderClass);
        }

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
            Properties properties = new Properties();
            if (is != null) {
                try {
                    properties.load(is);
                } catch (IOException ioe) {
                } finally {
                    try {
                        is.close();
                    } catch (IOException ignore) {
                    }
                }
            }
            return properties;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< load, properties=" + properties);
            }
        }
    }

    /**
     * Returns the named property value from the property file.
     * 
     * @param name
     *            the name (=key in the property file)
     * @return the value of the property
     */
    public String get(String name) {
        return (this.properties.getProperty(name));
    }

    /**
     * Returns all properties.
     * 
     * @return all properties
     */
    public Properties getProperties() {
        return properties;
    }
}
