package org.sqlproc.engine.type;

import java.sql.Timestamp;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type LOCALTIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlInstantType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.time.Instant.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "INSTANT" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (resultValue == null) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, null, java.time.Instant.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        } else if (resultValue instanceof java.sql.Timestamp) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
                    ((java.sql.Timestamp) resultValue).toInstant(), java.time.Instant.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        }
        error(logger, ingoreError,
                "Incorrect instant " + resultValue + " for " + attributeName + " in " + resultInstance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getResult(SqlRuntimeContext runtimeCtx, String attributeName, Object resultValue, boolean ingoreError)
            throws SqlRuntimeException {
        if (resultValue == null)
            return null;
        if (resultValue instanceof java.sql.Timestamp)
            return ((java.sql.Timestamp) resultValue).toInstant();
        return resultValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);

        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        } else if (inputValue instanceof java.time.Instant) {
            Timestamp value = Timestamp.from((java.time.Instant) inputValue);
            query.setParameter(paramName, value, getProviderSqlType());
        } else if (inputValue instanceof OutValueSetter) {
            OutValueSetter outValueSetter = (OutValueSetter) inputValue;
            OutValueSetter _outValueSetter = new OutValueSetter() {
                @Override
                public Object setOutValue(Object outValue) {
                    if (outValue == null)
                        return outValueSetter.setOutValue(null);
                    if (outValue instanceof java.sql.Timestamp) {
                        java.time.Instant result = ((java.sql.Timestamp) outValue).toInstant();
                        return outValueSetter.setOutValue(result);
                    }
                    throw new RuntimeException("Incorret function output value for instant");
                }
            };
            query.setParameter(paramName, _outValueSetter, getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect instant " + inputValue + " for " + paramName);
        }
    }
}
