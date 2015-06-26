package org.sqlproc.engine.jmx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.sqlproc.engine.SqlEngine;
import org.sqlproc.engine.SqlEngineConfiguration;
import org.sqlproc.engine.SqlEngineConfiguration.NameValue;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.SqlEngineFactory;

/**
 * The simplified JMX interface for the SQL Engine factory.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlSimpleFactoryMXBean {

    /**
     * The SQL Engine factory instance
     */
    private SqlEngineFactory sqlEngineFactory;

    public static final String OK = "OK";

    /**
     * In the case the SQL Query Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL Query Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String initQueryEngines(String names) {
        StringBuilder errors = new StringBuilder();
        if ("*".equals(names)) {
            for (String name : sqlEngineFactory.getNames()) {
                try {
                    sqlEngineFactory.getCheckedQueryEngine(name);
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        } else {
            for (String name : names.split(",")) {
                try {
                    sqlEngineFactory.getCheckedQueryEngine(name);
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * In the case the SQL CRUD Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL CRUD Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String initCrudEngines(String names) {
        StringBuilder errors = new StringBuilder();
        if ("*".equals(names)) {
            for (String name : sqlEngineFactory.getNames()) {
                try {
                    sqlEngineFactory.getCheckedCrudEngine(name);
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        } else {
            for (String name : names.split(",")) {
                try {
                    sqlEngineFactory.getCheckedCrudEngine(name);
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * In the case the SQL Procedure Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL Procedure Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String initProcedureEngines(String names) {
        StringBuilder errors = new StringBuilder();
        if ("*".equals(names)) {
            for (String name : sqlEngineFactory.getNames()) {
                try {
                    sqlEngineFactory.getCheckedProcedureEngine(name);
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        } else {
            for (String name : names.split(",")) {
                try {
                    sqlEngineFactory.getCheckedProcedureEngine(name);
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * In the case any dynamic SQL Query Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL Query Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String resetQueryEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticQueryEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * In the case any dynamic SQL CRUD Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL CRUD Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String resetCrudEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticCrudEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * In the case a dynamic SQL Procedure Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL Procedure Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String resetProcedureEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticProcedureEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * A new dynamic SQL Query Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String newQueryEngine(String name, String sqlStatement) throws SqlEngineException {
        try {
            sqlEngineFactory.getDynamicQueryEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * A new dynamic SQL CRUD Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String newCrudEngine(String name, String sqlStatement) {
        try {
            sqlEngineFactory.getDynamicCrudEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * A new dynamic SQL Procedure Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String newProcedureEngine(String name, String sqlStatement) {
        try {
            sqlEngineFactory.getDynamicProcedureEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * Returns the collection of names of all initialized/constructed static SQL Engine instances.
     * 
     * @return The collection of all initialized static SQL Engine instances' names
     */
    public Collection<String> getNames() {
        return sqlEngineFactory.getNames();
    }

    /**
     * Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.
     * 
     * @return The collection of all initialized dynamic SQL Engine instances' names
     */
    public Collection<String> getDynamicNames() {
        return sqlEngineFactory.getDynamicNames();
    }

    /**
     * Returns the processing cache used for the selected SQL Query Engine
     * 
     * @param name
     *            the name of the required SQL Query Engine
     * @return the processing cache used for the selected SQL Query Engine or the error message
     */
    public Collection<String> getQueryEngineProcessingCache(String name) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedQueryEngine(name);
            return engine.getProcessingCache().keySet();
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        throw new RuntimeException(errors.toString());
    }

    /**
     * Returns the processing cache used for the selected SQL CRUD Engine
     * 
     * @param name
     *            the name of the required SQL CRUD Engine
     * @return the processing cache used for the selected SQL CRUD Engine or the error message
     */
    public Collection<String> getCrudEngineProcessingCache(String name) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedCrudEngine(name);
            return engine.getProcessingCache().keySet();
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        throw new RuntimeException(errors.toString());
    }

    /**
     * Returns the processing cache used for the selected SQL Procedure Engine
     * 
     * @param name
     *            the name of the required SQL Procedure Engine
     * @return the processing cache used for the selected SQL Procedure Engine or the error message
     */
    public Collection<String> getProcedureEngineProcessingCache(String name) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedProcedureEngine(name);
            return engine.getProcessingCache().keySet();
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        throw new RuntimeException(errors.toString());
    }

    /**
     * Clears the processing cache used for the selected SQL Query Engine
     * 
     * @param name
     *            the name of the required SQL Query Engine
     * @param names
     *            the names of the processing cache entries to be cleared
     * @return the OK or the error message
     */
    public String resetQueryEngineProcessingCache(String name, String names) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedQueryEngine(name);
            for (String name0 : names.split(",")) {
                engine.getProcessingCache().remove(name0);
            }
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * Clears the processing cache used for the selected SQL CRUD Engine
     * 
     * @param name
     *            the name of the required SQL CRUD Engine
     * @param names
     *            the names of the processing cache entries to be cleared
     * @return the OK or the error message
     */
    public String resetCrudEngineProcessingCache(String name, String names) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedCrudEngine(name);
            for (String name0 : names.split(",")) {
                engine.getProcessingCache().remove(name0);
            }
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * Clears the processing cache used for the selected SQL Procedure Engine
     * 
     * @param name
     *            the name of the required SQL Procedure Engine
     * @param names
     *            the names of the processing cache entries to be cleared
     * @return the OK or the error message
     */
    public String resetProcedureEngineProcessingCache(String name, String names) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedProcedureEngine(name);
            for (String name0 : names.split(",")) {
                engine.getProcessingCache().remove(name0);
            }
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * Returns the dynamic SQL Processor configuration ant checks it's not null
     * 
     * @return the dynamic SQL Processor configuration
     */
    private SqlEngineConfiguration getConfiguration() {
        SqlEngineConfiguration configuration = sqlEngineFactory.getConfiguration();
        if (configuration == null)
            throw new IllegalArgumentException("The dynamic configation is null");
        return configuration;
    }

    /**
     * Returns the indicator to speed up the initialization process
     * 
     * @return the indicator to speed up the initialization process
     */
    public boolean isLazyInit() {
        return sqlEngineFactory.isLazyInit();
    }

    /**
     * Sets the indicator to speed up the initialization process
     * 
     * @param lazyInit
     *            the indicator to speed up the initialization process
     */
    public void setLazyInit(boolean lazyInit) {
        getConfiguration().setLazyInit(lazyInit);
    }

    /**
     * Returns the indicator the initialization process should be done asynchronously
     * 
     * @return the indicator the initialization process should be done asynchronously
     */
    public Boolean getAsyncInit() {
        return getConfiguration().getAsyncInit();
    }

    /**
     * Sets the indicator the initialization process should be done asynchronously
     * 
     * @param asyncInit
     *            the indicator the initialization process should be done asynchronously
     */
    public void setAsyncInit(Boolean asyncInit) {
        getConfiguration().setAsyncInit(asyncInit);
    }

    /**
     * Returns the initialization threshold. The engines, which usage is at least this number should be initialized
     * directly
     * 
     * @return the initialization threshold. The engines, which usage is at least this number should be initialized
     *         directly
     */
    public Integer getInitTreshold() {
        return getConfiguration().getInitTreshold();
    }

    /**
     * Sets the initialization threshold. The engines, which usage is at least this number should be initialized
     * directly
     * 
     * @param initTreshold
     *            the initialization threshold. The engines, which usage is at least this number should be initialized
     *            directly
     */
    public void setInitTreshold(Integer initTreshold) {
        getConfiguration().setInitTreshold(initTreshold);
    }

    private List<String> toList(NameValue[] namevals) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < namevals.length; i++)
            list.add(namevals[i].name);
        return list;
    }

    /**
     * Returns the container of the Query Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @return the container of the Query Engines' names, which has to be initialized
     */
    public List<String> getQueryEnginesToInit() {
        return toList(getConfiguration().getQueryEnginesToInit(getConfiguration().getInitTreshold()));
    }

    /**
     * Returns the container of the CRUD Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @param treshold
     *            the engines, which usage is at least this number should be initialized directly
     * @return the container of the CRUD Engines' names, which has to be initialized
     */
    public List<String> getCrudEnginesToInit() {
        return toList(getConfiguration().getQueryEnginesToInit(getConfiguration().getInitTreshold()));
    }

    /**
     * Returns the container of the Procedure Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @param treshold
     *            the engines, which usage is at least this number should be initialized directly
     * @return the container of the Procedure Engines' names, which has to be initialized
     */
    public List<String> getProcedureEnginesToInit() {
        return toList(getConfiguration().getQueryEnginesToInit(getConfiguration().getInitTreshold()));
    }

    /**
     * Sets the SQL Engine factory instance
     * 
     * @param sqlEngineFactory
     *            the SQL Engine factory instance
     */
    public void setSqlEngineFactory(SqlEngineFactory sqlEngineFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
    }
}
