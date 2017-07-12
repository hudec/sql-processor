package org.sqlproc.engine;

import java.util.Map;

/**
 * The compound parameters controlling the META SQL execution.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlControl {

    /**
     * Returns the object used for the SQL statement static input values. The class of this object is also named as the
     * input class or the static parameters class. The exact class type isn't important, all the parameters injected
     * into the SQL query command are picked up using the reflection API. Compared to dynamicInputValues input
     * parameters, parameters in this class should't be produced by an end user to prevent SQL injection threat!
     * 
     * @return the object used for the SQL statement static input values
     */
    public Object getStaticInputValues();

    /**
     * The object used for the SQL update statement dynamic input values. This enables to split input values into value
     * used for WHERE fragment and for UPDATE fragment of the SQL statement. In the case this parameter is null, the
     * dynamicInputValues parameter for {@link SqlCrudEngine#update(SqlSession, Object, SqlControl)} holds all input
     * values.
     * 
     * @return the object used for the SQL update statement dynamic input values (UPDATE fragment)
     */
    public Object getDynamicUpdateValues();

    /**
     * Returns the max SQL execution time. This parameter can help to protect production system against ineffective SQL
     * query commands. The value is in milliseconds.
     * 
     * @return the max SQL execution time
     */
    public Integer getMaxTimeout();

    /**
     * Returns the first SQL execution output row to be returned in the case we need to skip some rows in the result
     * set. The primary usage is to support the pagination.
     * 
     * @return the first SQL execution output row
     */
    public Integer getFirstResult();

    /**
     * Returns the max number of SQL execution output rows, which can be returned in the result list. The primary usage
     * is to support the pagination.
     * 
     * @return the max number of SQL execution output rows
     */
    public Integer getMaxResults();

    /**
     * Returns the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering
     * rule in this chain should correspond to one META SQL ordering statement.
     * 
     * @return the ordering directive list
     */
    public SqlOrder getOrder();

    /**
     * Returns more result classes used for the return values, like the collections classes or the collections items.
     * They are used mainly for the one-to-one, one-to-many and many-to-many associations.
     * 
     * @return more result classes used for the return values
     */
    public Map<String, Class<?>> getMoreResultClasses();

    /**
     * Returns the optional features. These features are defined in the statement execution scope. In the case of
     * conflict with the optional features defined in sthe statement/global scope, their priority is higher.
     * 
     * @return the optional features
     */
    public Map<String, Object> getFeatures();

    /**
     * Returns the unique ID of the executed statement based on the input values combination. This ID can be used for
     * the caching purposes to optimize the
     * {@link org.sqlproc.engine.impl.SqlMetaStatement#process(org.sqlproc.engine.impl.SqlMetaStatement.Type, Object, SqlControl, SqlEngine)}
     * 
     * The generation of the final ANSI SQL statement from the META SQL statement is influenced by the input values.
     * This ID is an indicator of the uniqueness these input values. For more info please see the tutorials.
     * 
     * @return the unique ID of the executed statement based on the input values combination
     */
    public String getProcessingId();

    /**
     * Returns the fetch size of SQL execution output rows, which can be returned in one SQL statement.
     *
     * @return the fetch size of SQL execution output rows
     */
    public Integer getFetchSize();

    /**
     * Returns the indicator, that an empty INSERT or UPDATE statement execution should be ignored (for example update
     * statement without any bounded input values).
     * 
     * @return the indicator, that an empty INSERT or UPDATE statement execution should be ignored
     */
    public Boolean getSkipEmptyStatement();

    /**
     * The low level (before and after the SQL command execution) SQL callback.
     */
    public static interface LowLevelSqlCallback {
        /**
         * Enables the input values and the final SQL command modification before the required database command
         * execution.
         * 
         * @param sqlCommand
         *            the final SQL command, which can be modified
         * @param inputValues
         *            the input values, which can be modified
         * @return in the case of not null value the modified SQL command
         */
        String handleInputValues(String sqlCommand, Map<String, Object> inputValues);

        /**
         * Enables the output values modification after the required database command execution.
         * 
         * @param outputValues
         *            the output values, which can be modified
         */
        void handleOutputValues(Map<String, Object> outputValues);
    }

    /**
     * Returns the low level SQL callback handler
     * 
     * @return the low level SQL callback handler
     */
    public LowLevelSqlCallback getLowLevelSqlCallback();

    /**
     * The SQL command execution callback (before and after the SQL command execution).
     */
    public static interface SqlExecutionCallback {
        /**
         * Enables the input values and the final SQL command modification before the required database command
         * execution.
         * 
         * @param inputValues
         *            the input values, which can be modified
         */
        void handleInputValues(Object inputValues);

        /**
         * Enables the output values modification after the required database command execution.
         * 
         * @param outputValues
         *            the output values, which can be modified
         */
        void handleOutputValues(Object outputValues);
    }

    /**
     * Returns the SQL command execution callback handler
     * 
     * @return the SQL command execution callback handler
     */
    public SqlExecutionCallback getSqlExecutionCallback();

    /**
     * Returns the name of the required SQL Query Engine instance
     * 
     * @return the name of the required SQL Query Engine instance
     */
    public String getSqlName();
}
