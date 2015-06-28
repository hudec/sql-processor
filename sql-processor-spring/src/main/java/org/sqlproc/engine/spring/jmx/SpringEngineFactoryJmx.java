package org.sqlproc.engine.spring.jmx;

import java.util.List;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.jmx.SqlSimpleFactoryMXBean;

/**
 * The implementation of the simplified JMX interface for the SQL Engine factory.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@ManagedResource(objectName = "sql-processor:type=Engine", description = "The simplified JMX interface for the SQL Engine factory.")
public class SpringEngineFactoryJmx extends SqlSimpleFactoryMXBean {

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL Query Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Query Engines instances") })
    public int initQueryEngines(String names) {
        return super.initQueryEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL CRUD Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL CRUD Engines instances") })
    public int initCrudEngines(String names) {
        return super.initCrudEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL Procedure Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Procedure Engines instances") })
    public int initProcedureEngines(String names) {
        return super.initProcedureEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL Query Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Query Engines instances") })
    public int resetQueryEngines(String names) {
        return super.resetQueryEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL CRUD Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL CRUD Engines instances") })
    public int resetCrudEngines(String names) {
        return super.resetCrudEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL Procedure Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Procedure Engines instances") })
    public int resetProcedureEngines(String names) {
        return super.resetProcedureEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "A new dynamic SQL Query Engine instance is established in the cache. The static one is suppressed.")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "name", description = "The name of the required SQL Query Engine instances"),
            @ManagedOperationParameter(name = "sqlStatement", description = "The new SQL statement, which is going to replace the original one") })
    public void newQueryEngine(String name, String sqlStatement) throws SqlEngineException {
        super.newQueryEngine(name, sqlStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "A new dynamic SQL CRUD Engine instance is established in the cache. The static one is suppressed.")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "name", description = "The name of the required SQL CRUD Engine instances"),
            @ManagedOperationParameter(name = "sqlStatement", description = "The new SQL statement, which is going to replace the original one") })
    public void newCrudEngine(String name, String sqlStatement) {
        super.newCrudEngine(name, sqlStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "A new dynamic SQL Procedure Engine instance is established in the cache. The static one is suppressed.")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "name", description = "The name of the required Procedure Query Engine instances"),
            @ManagedOperationParameter(name = "sqlStatement", description = "The new SQL statement, which is going to replace the original one") })
    public void newProcedureEngine(String name, String sqlStatement) {
        super.newProcedureEngine(name, sqlStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the collection of names of all initialized/constructed static SQL Engine instances.")
    public List<String> getNames() {
        return super.getNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.")
    public List<String> getDynamicNames() {
        return super.getDynamicNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the processing cache used for the selected SQL Query Engine.")
    public List<String> getQueryEngineProcessingCache(String name) {
        return super.getQueryEngineProcessingCache(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the processing cache used for the selected SQL CRUD Engine.")
    public List<String> getCrudEngineProcessingCache(String name) {
        return super.getCrudEngineProcessingCache(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the processing cache used for the selected SQL Procedure Engine.")
    public List<String> getProcedureEngineProcessingCache(String name) {
        return super.getProcedureEngineProcessingCache(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Clears the processing cache used for the selected SQL Query Engine.")
    public int resetQueryEngineProcessingCache(String name, String names) {
        return super.resetQueryEngineProcessingCache(name, names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Clears the processing cache used for the selected SQL CRUD Engine.")
    public int resetCrudEngineProcessingCache(String name, String names) {
        return super.resetCrudEngineProcessingCache(name, names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Clears the processing cache used for the selected SQL Procedure Engine.")
    public int resetProcedureEngineProcessingCache(String name, String names) {
        return super.resetProcedureEngineProcessingCache(name, names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the collection of names of all initialized/constructed static SQL Engine instances.")
    public boolean isLazyInit() {
        return super.isLazyInit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Sets the indicator to speed up the initialization process.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "lazyInit", description = "The indicator to speed up the initialization process.") })
    public void setLazyInit(boolean lazyInit) {
        super.setLazyInit(lazyInit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the indicator the initialization process should be done asynchronously.")
    public Boolean getAsyncInit() {
        return super.getAsyncInit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Sets the indicator the initialization process should be done asynchronously")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "asyncInit", description = "The indicator the initialization process should be done asynchronously.") })
    public void setAsyncInit(Boolean asyncInit) {
        super.setAsyncInit(asyncInit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the initialization threshold. The engines, which usage is at least this number should be initialized directly.")
    public Integer getInitTreshold() {
        return super.getInitTreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Sets the initialization threshold. The engines, which usage is at least this number should be initialized directly.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "initTreshold", description = "The initialization threshold.") })
    public void setInitTreshold(Integer initTreshold) {
        super.setInitTreshold(initTreshold);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the indicator that the most frequently used engines should be initialized preferentially.")
    public Boolean getInitInUsageOrder() {
        return super.getInitInUsageOrder();
    }

    @Override
    @ManagedOperation(description = "Sets the indicator that the most frequently used engines should be initialized preferentially.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "initTreshold", description = "The indicator value.") })
    public void setInitInUsageOrder(Boolean initInUsageOrder) {
        super.setInitInUsageOrder(initInUsageOrder);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the container of the Query Engines' names, which has to be initialized.")
    public List<String> getQueryEnginesToInit() {
        return super.getQueryEnginesToInit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the container of the CRUD Engines' names, which has to be initialized.")
    public List<String> getCrudEnginesToInit() {
        return super.getCrudEnginesToInit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the container of the Procedure Engines' names, which has to be initialized.")
    public List<String> getProcedureEnginesToInit() {
        return super.getProcedureEnginesToInit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the Query Engine usage number.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "name", description = "The name of the SQL Query Engine") })
    public int getQueryEngineUsage(String name) {
        return super.getQueryEngineUsage(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the CRUD Engine usage number.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "name", description = "The name of the SQL CRUD Engine") })
    public int getCrudEngineUsage(String name) {
        return super.getCrudEngineUsage(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the Procedure Engine usage number.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "name", description = "The name of the SQL Procedure Engine") })
    public int getProcedureEngineUsage(String name) {
        return super.getProcedureEngineUsage(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Resets the Query Engine usage number.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "name", description = "The name of the SQL Query Engine") })
    public int resetQueryEngineUsage(String name) {
        return super.resetQueryEngineUsage(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Resets the CRUD Engine usage number.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "name", description = "The name of the SQL CRUD Engine") })
    public int resetCrudEngineUsage(String name) {
        return super.resetCrudEngineUsage(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Resets the Procedure Engine usage number.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "name", description = "The name of the SQL Procedure Engine") })
    public int resetProcedureEngineUsage(String name) {
        return super.resetProcedureEngineUsage(name);
    }

    @Override
    @ManagedOperation(description = "Persists the configuration into the external file.")
    public void storeConfiguration() {
        super.storeConfiguration();
    }

    @Override
    @ManagedOperation(description = "Resets the state of the dynamic configuration instance.")
    public void clearConfiguration() {
        super.clearConfiguration();
    }
}
