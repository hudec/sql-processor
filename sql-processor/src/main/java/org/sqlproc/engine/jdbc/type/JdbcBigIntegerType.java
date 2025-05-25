package org.sqlproc.engine.jdbc.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlBigIntegerType;

/**
 * The JDBC META type BIGINTEGER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcBigIntegerType extends SqlBigIntegerType implements JdbcSqlType {

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
        return Types.NUMERIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        BigDecimal bigDecimal;
        if (Character.isDigit(columnLabel.charAt(0))) {
            bigDecimal = rs.getBigDecimal(Integer.parseInt(columnLabel));
        } else {
            bigDecimal = rs.getBigDecimal(columnLabel);
        }
        return bigDecimal == null ? null : bigDecimal.setScale(0, RoundingMode.UNNECESSARY).unscaledValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        st.setBigDecimal(index, new BigDecimal((BigInteger) value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(CallableStatement cs, int index) throws SQLException {
        Object result = cs.getBigDecimal(index);
        if (cs.wasNull())
            return null;
        else
            return result;
    }
}
