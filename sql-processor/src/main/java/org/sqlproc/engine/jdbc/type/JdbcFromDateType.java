package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlFromDateType;

/**
 * The JDBC META type FROMDATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcFromDateType extends SqlFromDateType implements JdbcSqlType {

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
        Date date;
        if (value instanceof java.sql.Date) {
            date = (java.sql.Date) value;
        } else {
            date = new java.sql.Date(((java.util.Date) value).getTime());
        }
        st.setDate(index, date);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        return cs.getDate(index);
    }
}
