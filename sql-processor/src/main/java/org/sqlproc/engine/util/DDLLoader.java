package org.sqlproc.engine.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The helper class for the DDL file(s) loading. This file can be located on the classpath, in the root directory or in
 * the user's home directory. It's used for example to set up database layout before the JUnit tests are processed.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class DDLLoader {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * DDL statements from the file.
     */
    private List<String> ddls;

    /**
     * Reads the DDL file and creates a new DDLLoader instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public DDLLoader(String fileName, Class<?> loaderClass) {
        ddls = load(fileName, loaderClass);
    }

    /**
     * Reads the DDL file and creates a new DDLLoader instance.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return all DDL statements as a list
     */
    public static List<String> getDDLs(Class<?> loaderClass, String fileName) {
        DDLLoader loader = new DDLLoader(fileName, loaderClass);
        return loader.getDdls();
    }

    /**
     * Reads the DDL files and creates a new DDLLoader instance.
     * 
     * @param fileNames
     *            The names of the files to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     */
    public DDLLoader(List<String> fileNames, Class<?> loaderClass) {
        ddls = new ArrayList<String>();
        if (fileNames == null || fileNames.isEmpty())
            return;
        for (String fileName : fileNames) {
            List<String> _ddls = load(fileName, loaderClass);
            ddls.addAll(_ddls);
        }
    }

    /**
     * Reads the DDL files and parse DDL statements into a list.
     * 
     * @param fileNames
     *            The names of the files to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return all DDL statements as a list
     */
    public static List<String> getDDLs(Class<?> loaderClass, String... fileNames) {
        ArrayList<String> propsNames = new ArrayList<String>();
        Collections.addAll(propsNames, fileNames);
        DDLLoader loader = new DDLLoader(propsNames, loaderClass);
        return loader.getDdls();
    }

    /**
     * Reads the DDL file and parse DDL statements into a list.
     * 
     * @param fileName
     *            The name of the file to be read.
     * @param loaderClass
     *            Class used to detect the correct classloader.
     * @return all DDL statements as a list
     */
    private List<String> load(String fileName, Class<?> loaderClass) {
        if (logger.isDebugEnabled()) {
            logger.debug(">> load, fileName=" + fileName + ", loaderClass=" + loaderClass);
        }
        List<String> ddls = new ArrayList<String>();
        InputStream is = null;
        BufferedReader bfr = null;

        try {
            String ddlFile = "/" + fileName;
            is = loaderClass.getResourceAsStream(ddlFile);
            if (is == null) {
                ddlFile = fileName;
                is = loaderClass.getResourceAsStream(ddlFile);
            }
            if (is == null) {
                try {
                    ddlFile = "/" + fileName;
                    is = new FileInputStream(ddlFile);
                } catch (FileNotFoundException e) {
                }
            }
            if (is == null) {
                try {
                    ddlFile = System.getProperty("user.home") + ddlFile;
                    is = new FileInputStream(ddlFile);
                } catch (FileNotFoundException e) {
                }
            }
            if (is == null)
                return ddls;

            bfr = new BufferedReader(new InputStreamReader(is));
            StringBuilder completeLine = new StringBuilder("");
            String line;
            boolean inFuncOrProc = false;
            while ((line = bfr.readLine()) != null) {
                if (line.startsWith("--"))
                    continue;
                if (line.trim().length() > 0)
                    completeLine.append(" ").append(line);
                if (!inFuncOrProc && line.trim().toUpperCase().startsWith("CREATE")
                        && (line.indexOf("FUNCTION") >= 0 || line.indexOf("PROCEDURE") >= 0))
                    inFuncOrProc = true;
                boolean finishedDdl = false;
                if (!inFuncOrProc && line.trim().endsWith(";")) {
                    finishedDdl = true;
                } else if (line.trim().length() == 0) {
                    finishedDdl = true;
                }
                if (finishedDdl) {
                    if (completeLine.length() > 0)
                        ddls.add(completeLine.toString());
                    completeLine = new StringBuilder("");
                    inFuncOrProc = false;
                }
            }
            if (completeLine.length() > 0)
                ddls.add(completeLine.toString());
            return ddls;

        } catch (Exception ex) {
            logger.error("I cant read " + fileName, ex);
            return ddls;
        } finally {
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (Exception ignore) {
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (Exception ignore) {
                }
            }
            if (logger.isDebugEnabled()) {
                logger.debug("<< load, properties=" + ddls);
            }
        }
    }

    public List<String> getDdls() {
        return ddls;
    }
}
