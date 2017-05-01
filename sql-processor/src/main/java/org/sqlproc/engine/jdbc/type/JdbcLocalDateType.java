package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlLocalDateType;

/**
 * The JDBC META type LOCALDATE.
 * 
 */
public class JdbcLocalDateType extends SqlLocalDateType implements JdbcSqlType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.sql.Date.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getDatabaseSqlType() {
        return Types.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        if (Character.isDigit(columnLabel.charAt(0)))
            return rs.getDate(Integer.parseInt(columnLabel));
        else
            return rs.getDate(columnLabel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        if (value instanceof java.sql.Date) {
            st.setDate(index, (java.sql.Date) value);
        } else if (value instanceof Date) {
            st.setDate(index, new java.sql.Date(((java.util.Date) value).getTime()));
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Object result = cs.getDate(index);
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
