package org.sqlproc.engine.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.SqlUtils;

/**
 * The META type BYTEARRAY.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlByteArrayType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { byte[].class, Byte[].class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "BYTES" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (resultValue instanceof byte[]) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, byte[].class))
                return;
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, SqlUtils.toBytes((byte[]) resultValue),
                    Byte[].class))
                return;
            error(logger, ingoreError,
                    "There's no getter for " + attributeName + " in " + resultInstance + ", META type is " + this);
            return;
        } else if (resultValue instanceof Byte[]) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, Byte[].class))
                return;
            error(logger, ingoreError,
                    "There's no getter for " + attributeName + " in " + resultInstance + ", META type is " + this);
            return;
        } else
            throw new RuntimeException("Incorrect binary array " + resultValue + ", META type is " + this);
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
        } else {
            if (inputValue instanceof byte[])
                query.setParameter(paramName, (byte[]) inputValue, getProviderSqlType());
            else if (inputValue instanceof Byte[]) {
                query.setParameter(paramName, SqlUtils.toBytes((Byte[]) inputValue), getProviderSqlType());
            } else {
                error(logger, ingoreError,
                        "Incorrect binary array " + inputValue + " for " + paramName + ", META type is " + this);
                return;
            }
        }
    }
}
