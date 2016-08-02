package org.sqlproc.engine.jdbc.type;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.type.SqlTextType;

/**
 * The JDBC META type TEXT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcTextType extends SqlTextType implements JdbcSqlType {

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
        return Types.LONGVARCHAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        Reader charReader;
        if (Character.isDigit(columnLabel.charAt(0)))
            charReader = rs.getCharacterStream(Integer.parseInt(columnLabel));
        else
            charReader = rs.getCharacterStream(columnLabel);
        if (charReader == null)
            return null;
        StringBuffer sb = new StringBuffer();
        try {
            char[] buffer = new char[2048];
            while (true) {
                int amountRead = charReader.read(buffer, 0, buffer.length);
                if (amountRead == -1)
                    break;
                sb.append(buffer, 0, amountRead);
            }
        } catch (IOException e) {
            throw new SqlProcessorException("IOException occurred reading text", e);
        } finally {
            try {
                charReader.close();
            } catch (IOException e) {
                throw new SqlProcessorException("IOException occurred closing stream", e);
            }
        }
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        String str = (String) value;
        st.setCharacterStream(index, new StringReader((String) value), str.length());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Reader charReader = cs.getCharacterStream(index);
        if (cs.wasNull() || charReader == null)
            return null;
        StringBuffer sb = new StringBuffer();
        try {
            char[] buffer = new char[2048];
            while (true) {
                int amountRead = charReader.read(buffer, 0, buffer.length);
                if (amountRead == -1)
                    break;
                sb.append(buffer, 0, amountRead);
            }
        } catch (IOException e) {
            throw new SqlProcessorException("IOException occurred reading text", e);
        } finally {
            try {
                charReader.close();
            } catch (IOException e) {
                throw new SqlProcessorException("IOException occurred closing stream", e);
            }
        }
        return sb.toString();
    }
}
