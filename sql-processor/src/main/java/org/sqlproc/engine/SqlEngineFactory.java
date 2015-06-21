package org.sqlproc.engine;

import java.util.Collection;
import java.util.Map;

/**
 * The factory definition, which can be used to construct the {@link SqlEngine} instances.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlEngineFactory {

    /**
     * Returns the named static or dynamic SQL Query Engine instance (the primary SQL Processor class). In fact it
     * returns the cached instance in the case it exists (it can be a static or dynamic one). Otherwise it instantiates
     * a new static instance.
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @return the SQL Engine instance or null value in the case the related statement is missing
     */
    SqlQueryEngine getQueryEngine(String name);

    /**
     * Returns the named static or dynamic SQL CRUD Engine instance (the primary SQL Processor class). In fact it
     * returns the cached instance in the case it exists (it can be a static or dynamic one). Otherwise it instantiates
     * a new static instance.
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @return the SQL Engine instance or null value in the case the related statement is missing
     */
    SqlCrudEngine getCrudEngine(String name);

    /**
     * Returns the named static or dynamic SQL Procedure Engine instance (the primary SQL Processor class). In fact it
     * returns the cached instance in the case it exists (it can be a static or dynamic one). Otherwise it instantiates
     * a new static instance.
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @return the SQL Engine instance or null value in the case the related statement is missing
     */
    SqlProcedureEngine getProcedureEngine(String name);

    /**
     * Returns the named dynamic SQL Query Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the original statement is missing
     */
    SqlQueryEngine getDynamicQueryEngine(String name, String sqlStatement) throws SqlEngineException;

    /**
     * Returns the named dynamic SQL CRUD Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the original statement is missing
     */
    SqlCrudEngine getDynamicCrudEngine(String name, String sqlStatement);

    /**
     * Returns the named dynamic SQL Procedure Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param sqlStatement
     *            the new SQL statement, which is going to replace the original one
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the original statement is missing
     */
    SqlProcedureEngine getDynamicProcedureEngine(String name, String sqlStatement);

    /**
     * Returns the named static SQL Query Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @return the SQL Engine instance or null value in the case the related statement is missing
     */
    SqlQueryEngine getStaticQueryEngine(String name);

    /**
     * Returns the named static SQL CRUD Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @return the SQL Engine instance or null value in the case the related statement is missing
     */
    SqlCrudEngine getStaticCrudEngine(String name);

    /**
     * Returns the named static SQL Procedure Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @return the SQL Engine instance or null value in the case the related statement is missing
     */
    SqlProcedureEngine getStaticProcedureEngine(String name);

    /**
     * Returns the named static or dynamic SQL Query Engine instance (the primary SQL Processor class). In fact it
     * returns the cached instance in the case it exists (it can be a static or dynamic one). Otherwise it instantiates
     * a new static instance.
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the related statement is missing
     */
    SqlQueryEngine getCheckedQueryEngine(String name) throws SqlEngineException;

    /**
     * Returns the named static or dynamic SQL CRUD Engine instance (the primary SQL Processor class). In fact it
     * returns the cached instance in the case it exists (it can be a static or dynamic one). Otherwise it instantiates
     * a new static instance.
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the related statement is missing
     */
    SqlCrudEngine getCheckedCrudEngine(String name);

    /**
     * Returns the named static or dynamic SQL Procedure Engine instance (the primary SQL Processor class). In fact it
     * returns the cached instance in the case it exists (it can be a static or dynamic one). Otherwise it instantiates
     * a new static instance.
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the related statement is missing
     */
    SqlProcedureEngine getCheckedProcedureEngine(String name);

    /**
     * Returns the named static SQL Query Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Query Engine instance
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the related statement is missing
     */
    SqlQueryEngine getCheckedStaticQueryEngine(String name) throws SqlEngineException;

    /**
     * Returns the named static SQL CRUD Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL CRUD Engine instance
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the related statement is missing
     */
    SqlCrudEngine getCheckedStaticCrudEngine(String name);

    /**
     * Returns the named static SQL Procedure Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the related statement is missing
     */
    SqlProcedureEngine getCheckedStaticProcedureEngine(String name);

    /**
     * Returns the collection of names of all initialized/constructed static SQL Engine instances.
     * 
     * @return The collection of all initialized static SQL Engine instances' names
     */
    public Collection<String> getNames();

    /**
     * Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.
     * 
     * @return The collection of all initialized dynamic SQL Engine instances' names
     */
    public Collection<String> getDynamicNames();

    /**
     * Returns the collection of named dynamic SQL Engines (the primary SQL Processor class) instances.
     * 
     * @return The collection of named dynamic SQL Engines (the primary SQL Processor class) instances
     */
    public Map<String, SqlEngine> getEngines();

    /**
     * Returns the collection of names of all initialized/constructed dynamic SQL Engine instances.
     * 
     * @return The collection of all initialized dynamic SQL Engine instances' names
     */
    public Map<String, SqlEngine> getDynamicEngines();

    /**
     * Returns the indicator to speed up the initialization process
     * 
     * @return the indicator to speed up the initialization process
     */
    public boolean isLazyInit();
}
