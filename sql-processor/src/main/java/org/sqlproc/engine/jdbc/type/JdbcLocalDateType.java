package org.sqlproc.engine.jdbc.type;

import java.sql.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.jdbc.type.JdbcDateType;

/**
 * The META type LOCALDATE.
 * 
 */
public class JdbcLocalDateType extends JdbcDateType {

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "LOCALDATE" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }
        if (resultValue instanceof java.sql.Date) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
                    ((java.sql.Date) resultValue).toLocalDate(), java.time.LocalDate.class))
                return;
        } else if (ingoreError) {
            logger.error("Incorrect localdate " + resultValue + " for " + attributeName + " in " + resultInstance);
            return;
        } else {
            throw new SqlRuntimeException("Incorrect localdate " + resultValue.getClass() + " for " + attributeName
                    + " in " + resultInstance);
        }
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
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputTypes);
        }
        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        } else if (inputValue instanceof java.time.LocalDate) {
            Date value = Date.valueOf((java.time.LocalDate) inputValue);
            query.setParameter(paramName, value, getProviderSqlType());
        }
    }
}
