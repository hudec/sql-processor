package org.sqlproc.engine.plugin;

import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeContext;

/**
 * The SQL Processor plugin devoted to the sequence SELECT SQL construction.
 * 
 * There are utilized the patterns from the {@link SqlFeature}. These pattern have to be combined with the sequence name
 * used in the META SQL query in the next way:
 * <ul>
 * <li>$n is the name of the sequence from the META SQL query</li>
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlSequencePlugin extends Modifiers {

    /**
     * Used to construct the sequence SELECT SQL.
     * 
     * @param runtime
     *            the public runtime context
     * @param sequenceName
     *            the sequence name
     * @return the final sequence SELECT SQL
     */
    public String sequenceSelect(SqlRuntimeContext runtime, String sequenceName);
}
