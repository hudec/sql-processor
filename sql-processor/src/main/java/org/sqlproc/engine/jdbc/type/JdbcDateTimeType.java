package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;

import org.sqlproc.engine.type.SqlDateTimeType;

/**
 * The JDBC META type DATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcDateTimeType extends SqlDateTimeType implements JdbcSqlType {

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
        return Types.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        Timestamp ts;
        if (Character.isDigit(columnLabel.charAt(0)))
            ts = rs.getTimestamp(Integer.parseInt(columnLabel));
        else
            ts = rs.getTimestamp(columnLabel);
        if (ts == null)
            return null;
        return new java.util.Date(ts.getTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        Timestamp ts;
        if (value instanceof Timestamp) {
            ts = (Timestamp) value;
        } else {
            ts = new Timestamp(((java.util.Date) value).getTime());
        }
        st.setTimestamp(index, ts);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Timestamp ts = cs.getTimestamp(index);
        if (ts == null)
            return null;
        return new java.util.Date(ts.getTime());
    }
}
