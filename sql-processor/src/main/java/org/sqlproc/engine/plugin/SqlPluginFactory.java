package org.sqlproc.engine.plugin;

/**
 * The factory definition, which can be used to construct the SQL Processor plugins instances.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlPluginFactory {

    /**
     * Returns the SQL Processor plugin devoted to evaluate the emptiness of the input value.
     * 
     * @return the SQL Processor plugin devoted to evaluate the emptiness of the input value
     */
    public IsEmptyPlugin getIsEmptyPlugin();

    /**
     * Returns the SQL Processor plugin devoted to evaluate the boolean value of the logical expression.
     * 
     * @return the SQL Processor plugin devoted to evaluate the boolean value of the logical expression
     */
    public IsTruePlugin getIsTruePlugin();

    /**
     * Returns the SQL Processor plugin devoted to the COUNT SQL construction.
     * 
     * @return the SQL Processor plugin devoted to the COUNT SQL construction
     */
    public SqlCountPlugin getSqlCountPlugin();

    /**
     * Returns the SQL Processor plugin devoted to the FROM-TO SQL construction.
     * 
     * @return the SQL Processor plugin devoted to the FROM-TO SQL construction
     */
    public SqlFromToPlugin getSqlFromToPlugin();

    /**
     * Returns the SQL Processor plugin devoted to the sequence SELECT SQL construction.
     * 
     * @return the SQL Processor plugin devoted to the sequence SELECT SQL construction
     */
    public SqlSequencePlugin getSqlSequencePlugin();

    /**
     * Returns the SQL Processor plugin devoted to the identity SELECT SQL construction.
     * 
     * @return the SQL Processor plugin devoted to the identity SELECT SQL construction
     */
    public SqlIdentityPlugin getSqlIdentityPlugin();

    /**
     * Returns the SQL Processor plugin devoted to possible SQL query/command modification just before it is executed.
     * 
     * @return the SQL Processor plugin devoted to possible SQL query/command modification just before it is executed
     */
    public SqlExecutionPlugin getSqlExecutionPlugin();
}
