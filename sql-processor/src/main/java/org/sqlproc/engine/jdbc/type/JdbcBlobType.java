package org.sqlproc.engine.jdbc.type;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlBlobType;

/**
 * The SQL META Types for BLOB.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcBlobType extends SqlBlobType implements JdbcSqlType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Blob.class };
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
        return Types.BLOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        Blob value;
        if (Character.isDigit(columnLabel.charAt(0)))
            value = rs.getBlob(Integer.parseInt(columnLabel));
        else
            value = rs.getBlob(columnLabel);
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        Blob blob = (Blob) value;
        st.setBlob(index, blob);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Object result = cs.getBlob(index);
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
