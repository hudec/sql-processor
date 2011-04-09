package org.sqlproc.engine.jdbc.type;

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
    public Object getProviderSqlNullType() {
        return Types.TIME;
    }

    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
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
}
