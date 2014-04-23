package org.sqlproc.engine.plugin;

import org.sqlproc.engine.SqlFeature;

/**
 * The SQL Processor plugin devoted to the identity SELECT SQL construction.
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
     * @param identitySelectName
     *            the identity SELECT SQL name
     * @param tableName
     *            the table name. Right now it's not supplied.
     * @param columnName
     *            the column name. Right now it's not supplied.
     * @param inputValueType
     *            a dynamic input value Java type
     * @return the final identity SELECT SQL
     */
    public String identitySelect(String identitySelectName, String tableName, String columnName, Class<?> inputValueType);
}
