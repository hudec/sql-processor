package org.sqlproc.engine;

/**
 * The factory definition, which can be used to construct the {@link SqlEngine} instances.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlEngineFactory {

    /**
     * Returns the named SQL Query Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @return the SQL Engine instance
     */
    SqlQueryEngine getQueryEngine(String name);

    /**
     * Returns the named SQL CRUD Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @return the SQL Engine instance
     */
    SqlCrudEngine getCrudEngine(String name);

    /**
     * Returns the named SQL Callable Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Callable Engine instance
     * @return the SQL Engine instance
     */
    SqlProcedureEngine getProcedureEngine(String name);
}
