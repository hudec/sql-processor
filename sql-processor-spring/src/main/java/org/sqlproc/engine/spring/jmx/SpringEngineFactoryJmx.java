package org.sqlproc.engine.spring.jmx;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.jmx.SqlSimpleFactoryJmx;
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
public class SpringEngineFactoryJmx extends SqlSimpleFactoryJmx implements SqlSimpleFactoryMXBean {

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL Query Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Query Engines instances") })
    public String initQueryEngines(String names) {
        return super.initQueryEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL CRUD Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL CRUD Engines instances") })
    public String initCrudEngines(String names) {
        return super.initCrudEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL Procedure Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Procedure Engines instances") })
    public String initProcedureEngines(String names) {
        return super.initProcedureEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL Query Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Query Engines instances") })
    public String resetQueryEngines(String names) {
        return super.resetQueryEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL CRUD Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL CRUD Engines instances") })
    public String resetCrudEngines(String names) {
        return super.resetCrudEngines(names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL Procedure Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Procedure Engines instances") })
    public String resetProcedureEngines(String names) {
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
    public String newQueryEngine(String name, String sqlStatement) throws SqlEngineException {
        return super.newQueryEngine(name, sqlStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "A new dynamic SQL CRUD Engine instance is established in the cache. The static one is suppressed.")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "name", description = "The name of the required SQL CRUD Engine instances"),
            @ManagedOperationParameter(name = "sqlStatement", description = "The new SQL statement, which is going to replace the original one") })
    public String newCrudEngine(String name, String sqlStatement) {
        return super.newCrudEngine(name, sqlStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "A new dynamic SQL Procedure Engine instance is established in the cache. The static one is suppressed.")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "name", description = "The name of the required Procedure Query Engine instances"),
            @ManagedOperationParameter(name = "sqlStatement", description = "The new SQL statement, which is going to replace the original one") })
    public String newProcedureEngine(String name, String sqlStatement) {
        return super.newProcedureEngine(name, sqlStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the collection of names of all initialized/constructed static SQL Engine instances.")
    public String getNames() {
        return super.getNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.")
    public String getDynamicNames() {
        return super.getDynamicNames();
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
    @ManagedOperation(description = "Returns the processing cache used for the selected SQL Query Engine.")
    public String getQueryEngineProcessingCache(String name) {
        return super.getQueryEngineProcessingCache(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the processing cache used for the selected SQL CRUD Engine.")
    public String getCrudEngineProcessingCache(String name) {
        return super.getCrudEngineProcessingCache(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Returns the processing cache used for the selected SQL Procedure Engine.")
    public String getProcedureEngineProcessingCache(String name) {
        return super.getProcedureEngineProcessingCache(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Clears the processing cache used for the selected SQL Query Engine.")
    public String resetQueryEngineProcessingCache(String name, String names) {
        return super.resetQueryEngineProcessingCache(name, names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Clears the processing cache used for the selected SQL CRUD Engine.")
    public String resetCrudEngineProcessingCache(String name, String names) {
        return super.resetCrudEngineProcessingCache(name, names);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "Clears the processing cache used for the selected SQL Procedure Engine.")
    public String resetProcedureEngineProcessingCache(String name, String names) {
        return super.resetProcedureEngineProcessingCache(name, names);
    }
}
