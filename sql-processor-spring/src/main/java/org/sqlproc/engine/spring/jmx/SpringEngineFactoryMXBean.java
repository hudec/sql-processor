package org.sqlproc.engine.spring.jmx;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.jdbc.jmx.SqlSimpleFactoryMXBean;
import org.sqlproc.engine.spring.SpringEngineFactory;

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
@ManagedResource(objectName = "jmx.sqlproc:type=engineFactoryConfig", description = "The simplified JMX interface for the SQL Engine factory.")
public class SpringEngineFactoryMXBean extends SpringEngineFactory implements SqlSimpleFactoryMXBean {

    /**
     * Creates a new instance with default values for the Spring stack.
     */
    public SpringEngineFactoryMXBean() {
        super();
    }

    /**
     * Creates a new instance with default values for the Spring stack.
     * 
     * @param lazyInit
     *            this flag indicates to speed up the initialization process.
     */
    public SpringEngineFactoryMXBean(boolean lazyInit) {
        super(lazyInit);
    }

    public static final String OK = "OK";

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL Query Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Query Engines instances") })
    public String initQueryEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedQueryEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL CRUD Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL CRUD Engines instances") })
    public String initCrudEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedCrudEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case the SQL Procedure Engines are not initialized, a new static instances are established in the cache.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Procedure Engines instances") })
    public String initProcedureEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedProcedureEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL Query Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Query Engines instances") })
    public String resetQueryEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedStaticQueryEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL CRUD Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL CRUD Engines instances") })
    public String resetCrudEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedStaticCrudEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @ManagedOperation(description = "In the case any dynamic SQL Procedure Engine is in the cache, the static one is re-established.")
    @ManagedOperationParameters({ @ManagedOperationParameter(name = "names", description = "The names of the required SQL Procedure Engines instances") })
    public String resetProcedureEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedStaticProcedureEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
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
        try {
            getDynamicQueryEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
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
        try {
            getDynamicCrudEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
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
        try {
            getDynamicProcedureEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }
}
