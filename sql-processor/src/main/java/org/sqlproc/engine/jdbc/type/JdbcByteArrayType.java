package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlByteArrayType;

/**
 * The JDBC META type BYTEARRAY.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcByteArrayType extends SqlByteArrayType implements JdbcSqlType {

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
        return Types.VARBINARY;
    }

    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        if (Character.isDigit(columnLabel.charAt(0)))
            return rs.getBytes(Integer.parseInt(columnLabel));
        else
            return rs.getBytes(columnLabel);
    }

    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        byte[] bytes = (byte[]) value;
        st.setBytes(index, bytes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Object result = cs.getBytes(index);
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
