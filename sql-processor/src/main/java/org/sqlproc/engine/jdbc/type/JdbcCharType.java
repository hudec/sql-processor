package org.sqlproc.engine.jdbc.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlCharType;

/**
 * The JDBC META type CHARACTER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcCharType extends SqlCharType implements JdbcSqlType {

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
        return Types.CHAR;
    }

    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        String str;
        if (Character.isDigit(columnLabel.charAt(0)))
            str = rs.getString(Integer.parseInt(columnLabel));
        else
            str = rs.getString(columnLabel);
        if (str == null) {
            return null;
        } else {
            return new Character(str.charAt(0));
        }
    }

    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        st.setString(index, (value).toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        String result = cs.getString(index);
        if (cs.wasNull() || result == null)
            return null;
        return new Character(result.charAt(0));
    }
}
