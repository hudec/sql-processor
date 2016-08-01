package org.sqlproc.engine.type;

import java.util.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type DATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlDateType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.sql.Date.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "DATE" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult for META type " + this + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }

        if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, java.sql.Date.class,
                java.util.Date.class))
            return;
        error(ingoreError,
                "There's no setter for " + attributeName + " in " + resultInstance + ", META type is " + this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter for META type " + this + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }

        if (inputValue == null) {
            query.setParameter(paramName, null, getProviderSqlNullType());
        } else if (inputValue instanceof java.sql.Date) {
            query.setParameter(paramName, (java.sql.Date) inputValue, getProviderSqlType());
        } else if (inputValue instanceof Date) {
            query.setParameter(paramName, (Date) inputValue, getProviderSqlType());
        } else {
            error(ingoreError, "Incorrect date " + inputValue + " for " + paramName);
        }
    }
}
