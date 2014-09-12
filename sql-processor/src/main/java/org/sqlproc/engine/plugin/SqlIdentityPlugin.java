package org.sqlproc.engine.plugin;

import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeContext;

/**
 * The SQL Processor plugin devoted to the identity or sequence SELECT SQL construction.
 * 
 * There are utilized the patterns from the {@link SqlFeature}. These pattern have to be combined with the table and or
 * column name in the next way:
 * <ul>
 * <li>$t is the table name</li>
 * <li>$c is the column name</li>
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlIdentityPlugin extends Modifiers {

    /**
     * Used to construct the identity SELECT SQL.
     * 
     * @param runtime
     *            the public runtime context
     * @param identitySelectName
     *            the identity SELECT SQL name
     * @param inputValueType
     *            a dynamic input value Java type
     * @return the final identity SELECT SQL
     */
    public String identitySelect(SqlRuntimeContext runtime, String identitySelectName, Class<?> inputValueType);
}
