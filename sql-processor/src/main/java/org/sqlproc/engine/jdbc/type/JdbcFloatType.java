package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlFloatType;

/**
 * The JDBC META type FLOAT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcFloatType extends SqlFloatType implements JdbcSqlType {

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
        return Types.FLOAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        if (Character.isDigit(columnLabel.charAt(0)))
            return Float.valueOf(rs.getFloat(Integer.parseInt(columnLabel)));
        else
            return Float.valueOf(rs.getFloat(columnLabel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        st.setFloat(index, ((Float) value).floatValue());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Object result = Float.valueOf(cs.getFloat(index));
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
