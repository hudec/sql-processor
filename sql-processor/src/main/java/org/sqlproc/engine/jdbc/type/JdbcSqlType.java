package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The contract which has to be implemented by all JDBC META types.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface JdbcSqlType {

    /**
     * Retrieves the value of the designated column in the current row of this <code>ResultSet</code> object as a Java
     * type value.
     * 
     * @param rs
     *            a ResultSet instance
     * @param columnLabel
     *            the label for the column specified with the SQL AS clause. If the SQL AS clause was not specified,
     *            then the label is the name of the column
     * @return the column value; if the value is SQL <code>NULL</code>, the value returned is <code>null</code>
     * @exception SQLException
     *                if the columnLabel is not valid; if a database access error occurs or this method is called on a
     *                closed result set
     */
    public abstract Object get(ResultSet rs, String columnLabel) throws SQLException;

    /**
     * Sets the designated parameter to the given Java value. The JDBC driver converts this to the appropriate SQL type
     * value.
     * 
     * @param st
     *            a PreparedStatement instance
     * @param index
     *            the first parameter is 1, the second is 2, ...
     * @param value
     *            the parameter value
     * @throws SQLException
     *             if parameterIndex does not correspond to a parameter marker in the SQL statement; if a database
     *             access error occurs or this method is called on a closed <code>PreparedStatement</code>
     */
    public abstract void set(PreparedStatement st, int index, Object value) throws SQLException;

    /**
     * Retrieves the value of the designated parameter from <code>CallableStatement</code> object as a Java type value.
     * 
     * @param cs
     *            a CallableStatement instance
     * @param index
     *            the first parameter is 1, the second is 2, ...
     * @return the parameter value; if the value is SQL <code>NULL</code>, the value depends on the Java type
     * @exception SQLException
     *                if the parameterIndex is not valid; if a database access error occurs or this method is called on
     *                a closed CallableStatement
     */
    public abstract Object get(CallableStatement cs, int index) throws SQLException;

    /**
     * Returns the type provided by the stack on top of which the SQL Processor works. It has to support <tt>null</tt>
     * input/output values.
     * 
     * @return the provided type
     */
    public Integer getDatabaseSqlType();
}
