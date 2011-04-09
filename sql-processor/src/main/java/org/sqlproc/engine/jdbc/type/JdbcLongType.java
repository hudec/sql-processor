package org.sqlproc.engine.jdbc.type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlLongType;

/**
 * The JDBC META type LONG.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcLongType extends SqlLongType implements JdbcSqlType {

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
        return Types.BIGINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        if (Character.isDigit(columnLabel.charAt(0))) {
            return new Long(rs.getLong(Integer.parseInt(columnLabel)));
        } else {
            return new Long(rs.getLong(columnLabel));
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        st.setLong(index, ((Long) value).longValue());
    }
}
