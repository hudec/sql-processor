package org.sqlproc.engine.jmx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.JAXBException;

import org.sqlproc.engine.SqlEngine;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.config.SqlEngineConfiguration;
import org.sqlproc.engine.config.SqlEngineConfiguration.NameValue;

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

    /**
     * In the case the SQL Query Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL Query Engines instances
     * @return the number of successfully initialized engines
     */
    public int initQueryEngines(String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        if ("*".equals(names)) {
            for (String name : sqlEngineFactory.getNames()) {
                try {
                    sqlEngineFactory.getCheckedQueryEngine(name);
                    count++;
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        } else {
            for (String name : names.split(",")) {
                try {
                    sqlEngineFactory.getCheckedQueryEngine(name);
                    count++;
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        }
        if (errors.length() == 0) {
            storeConfiguration();
            return count;
        }
        throw new RuntimeException(errors.append("/nInitialized engines: ").append(count).toString());
    }

    /**
     * In the case the SQL CRUD Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL CRUD Engines instances
     * @return the number of successfully initialized engines
     */
    public int initCrudEngines(String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        if ("*".equals(names)) {
            for (String name : sqlEngineFactory.getNames()) {
                try {
                    sqlEngineFactory.getCheckedCrudEngine(name);
                    count++;
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        } else {
            for (String name : names.split(",")) {
                try {
                    sqlEngineFactory.getCheckedCrudEngine(name);
                    count++;
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        }
        if (errors.length() == 0) {
            storeConfiguration();
            return count;
        }
        throw new RuntimeException(errors.append("/nInitialized engines: ").append(count).toString());
    }

    /**
     * In the case the SQL Procedure Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL Procedure Engines instances
     * @return the number of successfully initialized engines
     */
    public int initProcedureEngines(String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        if ("*".equals(names)) {
            for (String name : sqlEngineFactory.getNames()) {
                try {
                    sqlEngineFactory.getCheckedProcedureEngine(name);
                    count++;
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        } else {
            for (String name : names.split(",")) {
                try {
                    sqlEngineFactory.getCheckedProcedureEngine(name);
                    count++;
                } catch (SqlEngineException ex) {
                    errors.append(ex.getMessage()).append("\n");
                }
            }
        }
        if (errors.length() == 0) {
            storeConfiguration();
            return count;
        }
        throw new RuntimeException(errors.append("/nInitialized engines: ").append(count).toString());
    }

    /**
     * In the case any dynamic SQL Query Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL Query Engines instances
     * @return the number of successfully reset engines
     */
    public int resetQueryEngines(String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticQueryEngine(name);
                count++;
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        if (errors.length() == 0) {
            storeConfiguration();

            return count;
        }
        throw new RuntimeException(errors.append("/nReset engines: ").append(count).toString());
    }

    /**
     * In the case any dynamic SQL CRUD Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL CRUD Engines instances
     * @return the number of successfully reset engines
     */
    public int resetCrudEngines(String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticCrudEngine(name);
                count++;
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        if (errors.length() == 0) {
            storeConfiguration();
            return count;
        }
        throw new RuntimeException(errors.append("/nReset engines: ").append(count).toString());
    }

    /**
     * In the case a dynamic SQL Procedure Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL Procedure Engines instances
     * @return the number of successfully reset engines
     */
    public int resetProcedureEngines(String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticProcedureEngine(name);
                count++;
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        if (errors.length() == 0) {
            storeConfiguration();
            return count;
        }
        throw new RuntimeException(errors.append("/nReset engines: ").append(count).toString());
    }

    /**
     * A new dynamic SQL Query Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     */
    public void newQueryEngine(String name, String sqlStatement) throws SqlEngineException {
        try {
            sqlEngineFactory.getDynamicQueryEngine(name, sqlStatement);
            storeConfiguration();
        } catch (SqlEngineException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    /**
     * A new dynamic SQL CRUD Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     */
    public void newCrudEngine(String name, String sqlStatement) {
        try {
            sqlEngineFactory.getDynamicCrudEngine(name, sqlStatement);
            storeConfiguration();
        } catch (SqlEngineException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    /**
     * A new dynamic SQL Procedure Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     */
    public void newProcedureEngine(String name, String sqlStatement) {
        try {
            sqlEngineFactory.getDynamicProcedureEngine(name, sqlStatement);
            storeConfiguration();
        } catch (SqlEngineException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    /**
     * Returns the collection of names of all initialized/constructed static SQL Engine instances.
     * 
     * @return The collection of all initialized static SQL Engine instances' names
     */
    public List<String> getNames() {
        List<String> list = new ArrayList<String>();
        list.addAll(sqlEngineFactory.getNames());
        Collections.sort(list);
        return list;
    }

    /**
     * Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.
     * 
     * @return The collection of all initialized dynamic SQL Engine instances' names
     */
    public List<String> getDynamicNames() {
        List<String> list = new ArrayList<String>();
        list.addAll(sqlEngineFactory.getDynamicNames());
        Collections.sort(list);
        return list;
    }

    /**
     * Returns the processing cache used for the selected SQL Query Engine
     * 
     * @param name
     *            the name of the required SQL Query Engine
     * @return the processing cache used for the selected SQL Query Engine or the error message
     */
    public List<String> getQueryEngineProcessingCache(String name) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedQueryEngine(name);
            List<String> list = new ArrayList<String>();
            list.addAll(engine.getProcessingCache().keySet());
            Collections.sort(list);
            return list;
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
    public List<String> getCrudEngineProcessingCache(String name) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedCrudEngine(name);
            List<String> list = new ArrayList<String>();
            list.addAll(engine.getProcessingCache().keySet());
            Collections.sort(list);
            return list;
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
    public List<String> getProcedureEngineProcessingCache(String name) {
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedProcedureEngine(name);
            List<String> list = new ArrayList<String>();
            list.addAll(engine.getProcessingCache().keySet());
            Collections.sort(list);
            return list;
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
     * @return the number of successfully reset engine cache entries
     */
    public int resetQueryEngineProcessingCache(String name, String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedQueryEngine(name);
            for (String name0 : names.split(",")) {
                engine.getProcessingCache().remove(name0);
                count++;
            }
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        if (errors.length() == 0)
            return count;
        throw new RuntimeException(errors.append("/nReset engine cache: ").append(count).toString());
    }

    /**
     * Clears the processing cache used for the selected SQL CRUD Engine
     * 
     * @param name
     *            the name of the required SQL CRUD Engine
     * @param names
     *            the names of the processing cache entries to be cleared
     * @return the number of successfully reset engine cache entries
     */
    public int resetCrudEngineProcessingCache(String name, String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedCrudEngine(name);
            for (String name0 : names.split(",")) {
                engine.getProcessingCache().remove(name0);
                count++;
            }
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        if (errors.length() == 0)
            return count;
        throw new RuntimeException(errors.append("/nReset engine cache: ").append(count).toString());
    }

    /**
     * Clears the processing cache used for the selected SQL Procedure Engine
     * 
     * @param name
     *            the name of the required SQL Procedure Engine
     * @param names
     *            the names of the processing cache entries to be cleared
     * @return the number of successfully reset engine cache entries
     */
    public int resetProcedureEngineProcessingCache(String name, String names) {
        int count = 0;
        StringBuilder errors = new StringBuilder();
        try {
            SqlEngine engine = sqlEngineFactory.getCheckedProcedureEngine(name);
            for (String name0 : names.split(",")) {
                engine.getProcessingCache().remove(name0);
                count++;
            }
        } catch (SqlEngineException ex) {
            errors.append(ex.getMessage()).append("\n");
        }
        if (errors.length() == 0)
            return count;
        throw new RuntimeException(errors.append("/nReset engine cache: ").append(count).toString());
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
        storeConfiguration();
    }

    /**
     * Returns the number of threads used for asynchronous initialization
     * 
     * @return the number of threads used for asynchronous initialization
     */
    public Integer getAsyncInitThreads() {
        return getConfiguration().getAsyncInitThreads();
    }

    /**
     * Sets the number of threads used for asynchronous initialization
     * 
     * @param asyncInitThreads
     *            the number of threads used for asynchronous initialization
     */
    public void setAsyncInitThreads(Integer asyncInitThreads) {
        getConfiguration().setAsyncInitThreads(asyncInitThreads);
        storeConfiguration();
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
        storeConfiguration();
    }

    /**
     * Returns the indicator that the most frequently used engines should be initialized preferentially
     * 
     * @return the indicator that the most frequently used engines should be initialized preferentially
     */
    public Boolean getInitInUsageOrder() {
        return getConfiguration().getInitInUsageOrder();
    }

    /**
     * Sets the indicator that the most frequently used engines should be initialized preferentially
     * 
     * @param initInUsageOrder
     *            the indicator that the most frequently used engines should be initialized preferentially
     */
    public void setInitInUsageOrder(Boolean initInUsageOrder) {
        getConfiguration().setInitInUsageOrder(initInUsageOrder);
        storeConfiguration();
    }

    /**
     * Loads the persisted configuration.
     */
    public void loadConfiguration() {
        try {
            getConfiguration().load();
        } catch (JAXBException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * Persists the configuration into the external file.
     */
    public void storeConfiguration() {
        getConfiguration().store();
    }

    /**
     * Resets the state of the dynamic configuration instance.
     */
    public void clearConfiguration() {
        getConfiguration().clear();
    }

    /**
     * Reset the engines' usage counters.
     */
    public void clearConfigurationUsage() {
        getConfiguration().clearUsage();
    }

    /**
     * Converts list
     * 
     * @param namevals
     *            the input list
     * @return the output list
     */
    private List<String> toList(List<NameValue> namevals) {
        List<String> list = new ArrayList<String>();
        for (NameValue nameval : namevals)
            list.add(nameval.name);
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
     * @return the container of the CRUD Engines' names, which has to be initialized
     */
    public List<String> getCrudEnginesToInit() {
        return toList(getConfiguration().getCrudEnginesToInit(getConfiguration().getInitTreshold()));
    }

    /**
     * Returns the container of the Procedure Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @return the container of the Procedure Engines' names, which has to be initialized
     */
    public List<String> getProcedureEnginesToInit() {
        return toList(getConfiguration().getProcedureEnginesToInit(getConfiguration().getInitTreshold()));
    }

    /**
     * Returns the Query Engine usage number.
     * 
     * @param name
     *            the name of the SQL Query Engine
     * 
     * @return the Query Engine usage number
     */
    public int getQueryEngineUsage(String name) {
        AtomicInteger usage = getConfiguration().getQueryEngines().get(name);
        if (usage == null)
            return 0;
        return usage.get();
    }

    /**
     * Returns the CRUD Engine usage number.
     * 
     * @param name
     *            the name of the SQL CRUD Engine
     * 
     * @return the CRUD Engine usage number
     */
    public int getCrudEngineUsage(String name) {
        AtomicInteger usage = getConfiguration().getCrudEngines().get(name);
        if (usage == null)
            return 0;
        return usage.get();
    }

    /**
     * Returns the Procedure Engine usage number.
     * 
     * @param name
     *            the name of the SQL Procedure Engine
     * 
     * @return the Procedure Engine usage number
     */
    public int getProcedureEngineUsage(String name) {
        AtomicInteger usage = getConfiguration().getProcedureEngines().get(name);
        if (usage == null)
            return 0;
        return usage.get();
    }

    /**
     * Resets the Query Engine usage number.
     * 
     * @param name
     *            the name of the SQL Query Engine
     * 
     * @return the Query Engine usage number
     */
    public int resetQueryEngineUsage(String name) {
        AtomicInteger usage = getConfiguration().getQueryEngines().get(name);
        if (usage == null)
            return 0;
        usage.set(0);
        storeConfiguration();
        return usage.get();
    }

    /**
     * Resets the CRUD Engine usage number.
     * 
     * @param name
     *            the name of the SQL CRUD Engine
     * 
     * @return the CRUD Engine usage number
     */
    public int resetCrudEngineUsage(String name) {
        AtomicInteger usage = getConfiguration().getCrudEngines().get(name);
        if (usage == null)
            return 0;
        usage.set(0);
        storeConfiguration();
        return usage.get();
    }

    /**
     * Resets the Procedure Engine usage number.
     * 
     * @param name
     *            the name of the SQL Procedure Engine
     * 
     * @return the Procedure Engine usage number
     */
    public int resetProcedureEngineUsage(String name) {
        AtomicInteger usage = getConfiguration().getProcedureEngines().get(name);
        if (usage == null)
            return 0;
        usage.set(0);
        storeConfiguration();
        return usage.get();
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
