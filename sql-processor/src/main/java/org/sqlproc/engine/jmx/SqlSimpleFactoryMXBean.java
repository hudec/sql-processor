package org.sqlproc.engine.jmx;

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
public interface SqlSimpleFactoryMXBean {

    /**
     * In the case the SQL Query Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL Query Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String initQueryEngines(String names);

    /**
     * In the case the SQL CRUD Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL CRUD Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String initCrudEngines(String names);

    /**
     * In the case the SQL Procedure Engines are not initialized, a new static instances are established in the cache.
     * 
     * @param names
     *            the names of the required SQL Procedure Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String initProcedureEngines(String names);

    /**
     * In the case any dynamic SQL Query Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL Query Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String resetQueryEngines(String names);

    /**
     * In the case any dynamic SQL CRUD Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL CRUD Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String resetCrudEngines(String names);

    /**
     * In the case a dynamic SQL Procedure Engine is in the cache, the static one is re-established.
     * 
     * @param names
     *            the names of the required SQL Procedure Engines instances
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String resetProcedureEngines(String names);

    /**
     * A new dynamic SQL Query Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String newQueryEngine(String name, String sqlStatement);

    /**
     * A new dynamic SQL CRUD Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String newCrudEngine(String name, String sqlStatement);

    /**
     * A new dynamic SQL Procedure Engine instance is established in the cache. The static one is suppressed.
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return for the case there's an error thrown, the error Message. Otherwise the OK.
     */
    public String newProcedureEngine(String name, String sqlStatement);

    /**
     * Returns the collection of names of all initialized/constructed static SQL Engine instances.
     * 
     * @return The collection of all initialized static SQL Engine instances' names
     */
    public String getNames();

    /**
     * Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.
     * 
     * @return The collection of all initialized dynamic SQL Engine instances' names
     */
    public String getDynamicNames();

    /**
     * Returns the indicator to speed up the initialization process
     * 
     * @return the indicator to speed up the initialization process
     */
    public boolean isLazyInit();

    /**
     * Sets the time interval in milliseconds. In the case it's not zero, this value is the maximum interval, which
     * doens't trigger the trace output.
     * 
     * @param name
     *            the name of the required SQL Procedure Engines instance
     * @param trace
     *            the time interval in milliseconds
     * @return the indicator the engine is instantiated and the trace value is set
     */
    public boolean setTrace(String name, Integer trace);
}
