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
    public Object getProviderSqlNullType() {
        return Types.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        if (Character.isDigit(columnLabel.charAt(0)))
            return rs.getTimestamp(Integer.parseInt(columnLabel));
        else
            return rs.getTimestamp(columnLabel);
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
        Object result = cs.getTimestamp(index);
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
