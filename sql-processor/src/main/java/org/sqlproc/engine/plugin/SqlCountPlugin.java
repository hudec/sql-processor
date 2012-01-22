package org.sqlproc.engine.plugin;

/**
 * The SQL Processor plugin devoted to the COUNT SQL construction.
 * 
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlCountPlugin {

    /**
     * Used to construct the COUNT SQL.
     * 
     * @param sql
     *            original META SQL
     * @return the COUNT SQL
     */
    public String sqlCount(StringBuilder sql);
}
