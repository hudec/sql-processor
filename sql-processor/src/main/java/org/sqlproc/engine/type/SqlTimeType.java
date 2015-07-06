package org.sqlproc.engine.type;

import java.util.Date;

import org.sqlproc.engine.BeanUtils;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type TIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlTimeType extends SqlProviderType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.sql.Time.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "TIME" };
    }

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        query.addScalar(dbName, getProviderSqlType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName,
            Object resultValue, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }
        if (BeanUtils.simpleSetAttribute(resultInstance, attributeName, resultValue, java.sql.Time.class,
                java.util.Date.class))
            return;
        if (ingoreError) {
            logger.error("There's no setter for " + attributeName + " in " + resultInstance + ", META type is "
                    + getMetaTypes()[0]);
        } else {
            throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }
        if (inputValue == null) {
            query.setParameter(paramName, null, getProviderSqlNullType());
        } else if (inputValue instanceof java.sql.Time) {
            query.setParameter(paramName, (java.sql.Time) inputValue, getProviderSqlType());
        } else if (inputValue instanceof Date) {
            query.setParameter(paramName, (Date) inputValue, getProviderSqlType());
        } else if (ingoreError) {
            logger.error("Incorrect time " + inputValue + " for " + paramName);
        } else {
            throw new SqlRuntimeException("Incorrect time " + inputValue + " for " + paramName);
        }
    }
}
