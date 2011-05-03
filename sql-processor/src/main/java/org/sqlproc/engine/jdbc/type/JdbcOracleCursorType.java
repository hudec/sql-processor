package org.sqlproc.engine.jdbc.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlProviderType;

public class JdbcOracleCursorType extends SqlProviderType {

    private static final Integer JDBC_TYPE = -10;

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return JDBC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return JDBC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] {};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "ORACLE_CURSOR", "OCURSOR" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(Object resultInstance, String attributeName, Object resultValue, boolean ingoreError)
            throws SqlRuntimeException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlQuery query, String paramName, Object inputValue, Class<?> inputType,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }
        query.setParameter(paramName, inputValue, getProviderSqlNullType());
    }
}
