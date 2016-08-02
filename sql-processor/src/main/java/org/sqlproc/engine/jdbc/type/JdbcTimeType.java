package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Types;

import org.sqlproc.engine.type.SqlTimeType;

/**
 * The JDBC META type TIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcTimeType extends SqlTimeType implements JdbcSqlType {

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
    public Object getDatabaseSqlType() {
        return Types.TIME;
    }

    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        if (Character.isDigit(columnLabel.charAt(0)))
            return rs.getTime(Integer.parseInt(columnLabel));
        else
            return rs.getTime(columnLabel);
    }

    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        Time time;
        if (value instanceof Time) {
            time = (Time) value;
        } else {
            time = new Time(((java.util.Date) value).getTime());
        }
        st.setTime(index, time);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Object result = cs.getTime(index);
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
