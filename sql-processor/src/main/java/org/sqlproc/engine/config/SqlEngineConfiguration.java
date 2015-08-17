package org.sqlproc.engine.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.config.store.SqlEngineConfigurationStore;
import org.sqlproc.engine.config.store.XmlEngineConfiguration;
import org.sqlproc.engine.impl.config.store.SimpleEngineConfigurationStore;

/**
 * The dynamic configuration of the SQL Processor.
 * 
 * <p>
 * The primary goal of this configuration is the eager initialization of the selected SQL Engines. The overall
 * configuration can be also persisted using the sql-processor-spring.
 * 
 * The configuration can be dynamically changed using the JMX interface
 * {@link org.sqlproc.engine.jmx.SqlDefaultFactoryMXBean}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlEngineConfiguration {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The container of initialized Query Engines' names (static or dynamic ones) together with the number of their
     * usage.
     */
    private ConcurrentHashMap<String, AtomicInteger> queryEngines = new ConcurrentHashMap<String, AtomicInteger>();
    /**
     * The container of initialized CRUD Engines' names (static or dynamic ones) together with the number of their
     * usage.
     */
    private ConcurrentHashMap<String, AtomicInteger> crudEngines = new ConcurrentHashMap<String, AtomicInteger>();
    /**
     * The container of initialized Procedure Engines' names (static or dynamic ones) together with the number of their
     * usage.
     */
    private ConcurrentHashMap<String, AtomicInteger> procedureEngines = new ConcurrentHashMap<String, AtomicInteger>();
    /**
     * The container of initialized dynamic Query Engines' names together with their SQL statement.
     */
    private ConcurrentHashMap<String, String> dynamicQueryEngines = new ConcurrentHashMap<String, String>();
    /**
     * The container of initialized dynamic CRUD Engines' names together with their SQL statement.
     */
    private ConcurrentHashMap<String, String> dynamicCrudEngines = new ConcurrentHashMap<String, String>();
    /**
     * The container of initialized dynamic Procedure Engines' names together with their SQL statement.
     */
    private ConcurrentHashMap<String, String> dynamicProcedureEngines = new ConcurrentHashMap<String, String>();
    /**
     * This flag indicates to speed up the initialization process.
     */
    private Boolean lazyInit;
    /**
     * The number of threads used for asynchronous initialization.
     */
    private Integer asyncInitThreads;
    /**
     * The engines, which usage is at least this number should be initialized directly.
     */
    private Integer initTreshold;
    /**
     * The most frequently used engines should be initialized preferentially.
     */
    private Boolean initInUsageOrder;
    /**
     * After the engines instantiations the users should be cleared.
     */
    private Boolean initClearUsage;

    /**
     * The store to persist this configuration;
     */
    private SqlEngineConfigurationStore store;

    /**
     * The default constructor.
     */
    public SqlEngineConfiguration() {
    }

    /**
     * The constructor takes data from the persisted state in external file.
     * 
     * @param directory
     *            the directory, where the persisted file is placed
     * @param fileName
     *            the name of the persisted file
     * @throws IOException
     *             in the case there's a I/O problem with the persisted file
     * @throws JAXBException
     *             in the case there's a problem with JAXB deserialization
     */
    public SqlEngineConfiguration(String directory, String fileName) throws IOException, JAXBException {
        store = new SimpleEngineConfigurationStore(directory, fileName, XmlEngineConfiguration.class,
                XmlEngineConfiguration.EngineUsage.class, XmlEngineConfiguration.EngineSql.class);
    }

    /**
     * The constructor takes data from the persisted state in external file.
     * 
     * @param directory
     *            the directory, where the persisted file is placed
     * @param fileName
     *            the name of the persisted file
     * @throws IOException
     *             in the case there's a I/O problem with the persisted file
     * @throws JAXBException
     *             in the case there's a problem with JAXB deserialization
     */
    public SqlEngineConfiguration(SqlEngineConfigurationStore jaxbStore) {
        this.store = jaxbStore;
    }

    /**
     * Loads the persisted configuration.
     * 
     * @throws JAXBException
     */
    public void load() throws JAXBException {
        if (store != null) {
            logger.warn(">>> load");
            boolean ok = store.readConfig(this);
            logger.warn("=== load ok={}", ok);
            logger.warn("<<< load this={}", this);
        }
    }

    /**
     * Persist the configuration into the external file.
     */
    public void store() {
        if (store != null) {
            logger.warn(">>> store this={}", this);
            store.writeConfig(this);
            logger.warn("<<< store");
        }
    }

    /**
     * Reset the state of the dynamic configuration instance.
     */
    public void clear() {
        queryEngines = new ConcurrentHashMap<String, AtomicInteger>();
        crudEngines = new ConcurrentHashMap<String, AtomicInteger>();
        procedureEngines = new ConcurrentHashMap<String, AtomicInteger>();
        dynamicQueryEngines = new ConcurrentHashMap<String, String>();
        dynamicCrudEngines = new ConcurrentHashMap<String, String>();
        dynamicProcedureEngines = new ConcurrentHashMap<String, String>();
        lazyInit = null;
        asyncInitThreads = null;
        initTreshold = null;
        initInUsageOrder = null;
        initClearUsage = null;
    }

    /**
     * Reset the engines' usage counters.
     */
    public void clearUsage() {
        queryEngines = new ConcurrentHashMap<String, AtomicInteger>();
        crudEngines = new ConcurrentHashMap<String, AtomicInteger>();
        procedureEngines = new ConcurrentHashMap<String, AtomicInteger>();
    }

    /**
     * Adds the SQL Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the SQL Engine
     * @param engines
     *            the container of initialized engines
     * @return the actual number of the engine's usage
     */
    protected int addEngine(String name, ConcurrentHashMap<String, AtomicInteger> engines) {
        AtomicInteger counter = engines.get(name);
        if (counter == null)
            counter = engines.putIfAbsent(name, new AtomicInteger(1));
        if (counter == null)
            return 1;
        else
            return counter.addAndGet(1);
    }

    /**
     * Removes the SQL Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the SQL Engine
     * @param engines
     *            the container of initialized engines
     * @return the actual number of the engine's usage
     */
    protected int removeEngine(String name, ConcurrentHashMap<String, AtomicInteger> engines) {
        AtomicInteger counter = engines.remove(name);
        return (counter == null) ? 0 : counter.get();
    }

    /**
     * Adds the Query Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the Query Engine
     * @return the actual number of the engine's usage
     */
    public int addQueryEngine(String name) {
        return addEngine(name, queryEngines);
    }

    /**
     * Adds the CRUD Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the CRUD Engine
     * @return the actual number of the engine's usage
     */
    public int addCrudEngine(String name) {
        return addEngine(name, crudEngines);
    }

    /**
     * Adds the Procedure Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the Procedure Engine
     * @return the actual number of the engine's usage
     */
    public int addProcedureEngine(String name) {
        return addEngine(name, procedureEngines);
    }

    /**
     * Removes the Query Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the Query Engine
     * @return the actual number of the engine's usage
     */
    public int removeQueryEngine(String name) {
        return removeEngine(name, queryEngines);
    }

    /**
     * Removes the CRUD Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the CRUD Engine
     * @return the actual number of the engine's usage
     */
    public int removeCrudEngine(String name) {
        return removeEngine(name, crudEngines);
    }

    /**
     * Removes the Procedure Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the Procedure Engine
     * @return the actual number of the engine's usage
     */
    public int removeProcedureEngine(String name) {
        return removeEngine(name, procedureEngines);
    }

    /**
     * Adds the dynamic Query Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the dynamic Query Engine
     * @return the actual number of the engine's usage
     */
    public int addDynamicQueryEngine(String name, String sqlStatement) {
        dynamicQueryEngines.put(name, sqlStatement);
        return addQueryEngine(name);
    }

    /**
     * Adds the dynamic CRUD Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the dynamic CRUD Engine
     * @return the actual number of the engine's usage
     */
    public int addDynamicCrudEngine(String name, String sqlStatement) {
        dynamicCrudEngines.put(name, sqlStatement);
        return addCrudEngine(name);
    }

    /**
     * Adds the dynamic Procedure Engine to the container of initialized engines.
     * 
     * @param name
     *            the name of the dynamic Procedure Engine
     * @return the actual number of the engine's usage
     */
    public int addDynamicProcedureEngine(String name, String sqlStatement) {
        dynamicProcedureEngines.put(name, sqlStatement);
        return addProcedureEngine(name);
    }

    /**
     * Removes the dynamic Query Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the dynamic Query Engine
     * @return the actual number of the engine's usage
     */
    public int removeDynamicQueryEngine(String name) {
        dynamicQueryEngines.remove(name);
        AtomicInteger counter = queryEngines.get(name);
        return (counter == null) ? 0 : counter.get();
    }

    /**
     * Removes the dynamic CRUD Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the dynamic CRUD Engine
     * @return the actual number of the engine's usage
     */
    public int removeDynamicCrudEngine(String name) {
        dynamicCrudEngines.remove(name);
        AtomicInteger counter = crudEngines.get(name);
        return (counter == null) ? 0 : counter.get();
    }

    /**
     * Removes the dynamic Procedure Engine from the container of initialized engines.
     * 
     * @param name
     *            the name of the dynamic Procedure Engine
     * @return the actual number of the engine's usage
     */
    public int removeDynamicProcedureEngine(String name) {
        dynamicProcedureEngines.remove(name);
        AtomicInteger counter = procedureEngines.get(name);
        return (counter == null) ? 0 : counter.get();
    }

    /**
     * Returns the container of initialized Query Engines' names (static or dynamic ones) together with the number of
     * their usage
     * 
     * @return the container of initialized Query Engines' names (static or dynamic ones) together with the number of
     *         their usage
     */
    public ConcurrentHashMap<String, AtomicInteger> getQueryEngines() {
        return queryEngines;
    }

    /**
     * Returns the container of initialized CRUD Engines' names (static or dynamic ones) together with the number of
     * their usage
     * 
     * @return the container of initialized CRUD Engines' names (static or dynamic ones) together with the number of
     *         their usage
     */
    public ConcurrentHashMap<String, AtomicInteger> getCrudEngines() {
        return crudEngines;
    }

    /**
     * Returns the container of initialized Procedure Engines' names (static or dynamic ones) together with the number
     * of their usage
     * 
     * @return the container of initialized Procedure Engines' names (static or dynamic ones) together with the number
     *         of their usage
     */
    public ConcurrentHashMap<String, AtomicInteger> getProcedureEngines() {
        return procedureEngines;
    }

    /**
     * Returns the container of initialized dynamic Query Engines' names together with their SQL statement
     * 
     * @return the container of initialized dynamic Query Engines' names together with their SQL statement
     */
    public ConcurrentHashMap<String, String> getDynamicQueryEngines() {
        return dynamicQueryEngines;
    }

    /**
     * Returns the container of initialized dynamic CRUD Engines' names together with their SQL statement
     * 
     * @return the container of initialized dynamic CRUD Engines' names together with their SQL statement
     */
    public ConcurrentHashMap<String, String> getDynamicCrudEngines() {
        return dynamicCrudEngines;
    }

    /**
     * Returns the container of initialized dynamic Procedure Engines' names together with their SQL statement
     * 
     * @return the container of initialized dynamic Procedure Engines' names together with their SQL statement
     */
    public ConcurrentHashMap<String, String> getDynamicProcedureEngines() {
        return dynamicProcedureEngines;
    }

    /**
     * Sets the container of initialized Query Engines' names (static or dynamic ones) together with the number of their
     * usage
     * 
     * @param queryEngines
     *            the container of initialized Query Engines' names (static or dynamic ones) together with the number of
     *            their usage
     */
    public void setQueryEngines(ConcurrentHashMap<String, AtomicInteger> queryEngines) {
        this.queryEngines = queryEngines;
    }

    /**
     * Sets the container of initialized CRUD Engines' names (static or dynamic ones) together with the number of their
     * usage
     * 
     * @param crudEngines
     *            the container of initialized CRUD Engines' names (static or dynamic ones) together with the number of
     *            their usage
     */
    public void setCrudEngines(ConcurrentHashMap<String, AtomicInteger> crudEngines) {
        this.crudEngines = crudEngines;
    }

    /**
     * Sets the container of initialized Procedure Engines' names (static or dynamic ones) together with the number of
     * their usage
     * 
     * @param procedureEngines
     *            the container of initialized Procedure Engines' names (static or dynamic ones) together with the
     *            number of their usage
     */
    public void setProcedureEngines(ConcurrentHashMap<String, AtomicInteger> procedureEngines) {
        this.procedureEngines = procedureEngines;
    }

    /**
     * Sets the container of initialized dynamic Query Engines' names together with their SQL statement
     * 
     * @param dynamicQueryEngines
     *            the container of initialized dynamic Query Engines' names together with their SQL statement
     */
    public void setDynamicQueryEngines(ConcurrentHashMap<String, String> dynamicQueryEngines) {
        this.dynamicQueryEngines = dynamicQueryEngines;
    }

    /**
     * Sets the container of initialized dynamic CRUD Engines' names together with their SQL statement
     * 
     * @param dynamicCrudEngines
     *            the container of initialized dynamic CRUD Engines' names together with their SQL statement
     */
    public void setDynamicCrudEngines(ConcurrentHashMap<String, String> dynamicCrudEngines) {
        this.dynamicCrudEngines = dynamicCrudEngines;
    }

    /**
     * Sets the container of initialized dynamic Procedure Engines' names together with their SQL statement
     * 
     * @param dynamicProcedureEngines
     *            the container of initialized dynamic Procedure Engines' names together with their SQL statement
     */
    public void setDynamicProcedureEngines(ConcurrentHashMap<String, String> dynamicProcedureEngines) {
        this.dynamicProcedureEngines = dynamicProcedureEngines;
    }

    /**
     * Returns the indicator to speed up the initialization process
     * 
     * @return the indicator to speed up the initialization process
     */
    public Boolean getLazyInit() {
        return lazyInit;
    }

    /**
     * Sets the indicator to speed up the initialization process
     * 
     * @param lazyInit
     *            the indicator to speed up the initialization process
     */
    public void setLazyInit(Boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    /**
     * Returns the number of threads used for asynchronous initialization
     * 
     * @return the number of threads used for asynchronous initialization
     */
    public Integer getAsyncInitThreads() {
        return asyncInitThreads;
    }

    /**
     * Sets the number of threads used for asynchronous initialization
     * 
     * @param asyncInitThreads
     *            the number of threads used for asynchronous initialization
     */
    public void setAsyncInitThreads(Integer asyncInitThreads) {
        this.asyncInitThreads = asyncInitThreads;
    }

    /**
     * Returns the initialization threshold. The engines, which usage is at least this number should be initialized
     * directly
     * 
     * @return the initialization threshold. The engines, which usage is at least this number should be initialized
     *         directly
     */
    public Integer getInitTreshold() {
        return initTreshold;
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
        this.initTreshold = initTreshold;
    }

    /**
     * Returns the indicator that the most frequently used engines should be initialized preferentially
     * 
     * @return the indicator that the most frequently used engines should be initialized preferentially
     */
    public Boolean getInitInUsageOrder() {
        return initInUsageOrder;
    }

    /**
     * Sets the indicator that the most frequently used engines should be initialized preferentially
     * 
     * @param initInUsageOrder
     *            the indicator that the most frequently used engines should be initialized preferentially
     */
    public void setInitInUsageOrder(Boolean initInUsageOrder) {
        this.initInUsageOrder = initInUsageOrder;
    }

    /**
     * Returns the indicator that after the engines instantiations the users should be cleared
     * 
     * @return the indicator that after the engines instantiations the users should be cleared
     */
    public Boolean getInitClearUsage() {
        return initClearUsage;
    }

    /**
     * Sets the indicator that after the engines instantiations the users should be cleared
     * 
     * @param initClearUsage
     *            the indicator that after the engines instantiations the users should be cleared
     */
    public void setInitClearUsage(Boolean initClearUsage) {
        this.initClearUsage = initClearUsage;
    }

    /**
     * The simple container.
     */
    public class NameValue implements Comparable<NameValue> {
        public String name;
        public int value;

        public NameValue(String name, Integer value) {
            this.name = name;
            this.value = (value != null) ? value : 0;
        }

        @Override
        public int compareTo(NameValue o) {
            if (value < o.value)
                return 1;
            if (value > o.value)
                return -1;
            return 0;
        }
    }

    /**
     * Returns the container of the SQL Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @param engines
     *            the container of initialized engines
     * @param treshold
     *            the engines, which usage is at least this number should be initialized directly
     * @return the container of the Query Engines' names, which has to be initialized
     */
    protected Map<String, Integer> getEnginesToInit(ConcurrentHashMap<String, AtomicInteger> engines, Integer treshold) {
        Map<String, Integer> map;
        if (initInUsageOrder != null && initInUsageOrder) {
            map = new LinkedHashMap<String, Integer>();
            List<NameValue> list = new ArrayList<NameValue>();
            for (Entry<String, AtomicInteger> e : engines.entrySet()) {
                if (initTreshold == null || e.getValue().get() >= initTreshold)
                    list.add(new NameValue(e.getKey(), e.getValue().get()));
            }
            for (NameValue nv : list)
                map.put(nv.name, nv.value);
        } else {
            map = new TreeMap<String, Integer>();
            for (Entry<String, AtomicInteger> e : engines.entrySet()) {
                if (initTreshold == null || e.getValue().get() >= initTreshold)
                    map.put(e.getKey(), e.getValue().get());
            }
        }
        return map;
    }

    /**
     * Returns the container of the Query Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @param treshold
     *            the engines, which usage is at least this number should be initialized directly
     * @return the container of the Query Engines' names, which has to be initialized
     */
    public Map<String, Integer> getQueryEnginesToInit(Integer treshold) {
        return getEnginesToInit(queryEngines, treshold);
    }

    /**
     * Returns the container of the CRUD Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @param treshold
     *            the engines, which usage is at least this number should be initialized directly
     * @return the container of the CRUD Engines' names, which has to be initialized
     */
    public Map<String, Integer> getCrudEnginesToInit(Integer treshold) {
        return getEnginesToInit(crudEngines, treshold);
    }

    /**
     * Returns the container of the Procedure Engines' names, which has to be initialized. This is called during The SQL
     * Processor initialization, so there's no need to handle concurrent changes.
     * 
     * @param treshold
     *            the engines, which usage is at least this number should be initialized directly
     * @return the container of the Procedure Engines' names, which has to be initialized
     */
    public Map<String, Integer> getProcedureEnginesToInit(Integer treshold) {
        return getEnginesToInit(procedureEngines, treshold);
    }

    @Override
    public String toString() {
        return "SqlEngineConfiguration [queryEngines=" + queryEngines + ", crudEngines=" + crudEngines
                + ", procedureEngines=" + procedureEngines + ", dynamicQueryEngines=" + dynamicQueryEngines
                + ", dynamicCrudEngines=" + dynamicCrudEngines + ", dynamicProcedureEngines=" + dynamicProcedureEngines
                + ", lazyInit=" + lazyInit + ", asyncInitThreads=" + asyncInitThreads + ", initTreshold="
                + initTreshold + ", initInUsageOrder=" + initInUsageOrder + ", initClearUsage=" + initClearUsage + "]";
    }
}
