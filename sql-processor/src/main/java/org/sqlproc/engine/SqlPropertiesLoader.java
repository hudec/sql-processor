package org.sqlproc.engine;

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
 * The helper class for the properties file loading. The properties file can be located on the classpath, in the root
 * directory or in the user's home directory.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlPropertiesLoader {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Properties from the properties file.
     */
    private Properties properties;

    /**
     * Reads the properties file and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public SqlPropertiesLoader(String fileName, Class<?> loaderClass) {
        properties = load(fileName, loaderClass);
    }

    /**
     * Reads the properties file and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public static Properties getProperties(Class<?> loaderClass, String fileName) {
        SqlPropertiesLoader loader = new SqlPropertiesLoader(fileName, loaderClass);
        return loader.getProperties();
    }

    /**
     * Reads the properties files and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public SqlPropertiesLoader(List<String> fileNames, Class<?> loaderClass) {
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
     * Reads the properties files and creates a new SqlPropertiesLoader instance.
     * 
     * @param fileName
     *            Properties file name.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public static Properties getProperties(Class<?> loaderClass, String... fileNames) {
        ArrayList<String> propsNames = new ArrayList<String>();
        Collections.addAll(propsNames, fileNames);
        SqlPropertiesLoader loader = new SqlPropertiesLoader(propsNames, loaderClass);
        return loader.getProperties();
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
     * Returns the named property value from the properties file.
     * 
     * @param name
     *            the name (=key in the properties file)
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

    /**
     * Returns a string representation of the object.
     * 
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queries: ");
        boolean first = true;
        for (String name : properties.stringPropertyNames()) {
            if (!first)
                sb.append("\n");
            else
                first = false;
            sb.append(name).append("=").append(properties.getProperty(name));
        }
        return sb.toString();
    }
}
