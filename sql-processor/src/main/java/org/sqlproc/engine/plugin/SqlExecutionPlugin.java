package org.sqlproc.engine.plugin;

/**
 * The SQL Processor plugin devoted to possible SQL query/command modification just before it is executed.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlExecutionPlugin extends Modifiers {

    /**
     * Used to possible SQL query/command modification just before it is executed.
     * 
     * @param name
     *            Name of the META SQL query or statement
     * @param queryString
     *            the SQL query command
     * @return the SQL query command, which is going to be executed
     */
    public String beforeSqlExecution(String name, String queryString);
}
