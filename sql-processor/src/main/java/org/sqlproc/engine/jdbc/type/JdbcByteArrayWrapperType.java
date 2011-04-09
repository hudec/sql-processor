package org.sqlproc.engine.jdbc.type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.type.SqlByteArrayType;

/**
 * TThe JDBC META type BYTEARRAY.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcByteArrayWrapperType extends SqlByteArrayType implements JdbcSqlType {

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
        return Types.VARBINARY;
    }

    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        byte[] bytes = rs.getBytes(columnLabel);
        if (bytes == null)
            return null;
        int length = bytes.length;
        Byte[] result = new Byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = new Byte(bytes[i]);
        }
        return result;
    }

    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        Byte[] bytes = (Byte[]) value;
        if (bytes == null)
            st.setBytes(index, null);
        else {
            int length = bytes.length;
            byte[] result = new byte[length];
            for (int i = 0; i < length; i++) {
                if (bytes[i] == null)
                    throw new SqlProcessorException("Bytes array has at least one element null: " + value);
                result[i] = bytes[i].byteValue();
            }
            st.setBytes(index, result);
        }
    }
}
