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
public abstract class SqlByteArrayType extends SqlMetaType {

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
        return new String[] { "BYTEARR", "BYTEARRAY", "BYTES" };
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
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue);
        }
        if (resultValue instanceof byte[]) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, byte[].class))
                return;
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, SqlUtils.toBytes((byte[]) resultValue),
                    Byte[].class))
                return;
            if (ingoreError) {
                logger.error("There's no getter for " + attributeName + " in " + resultInstance + ", META type is "
                        + getMetaTypes()[0]);
            } else {
                throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                        + ", META type is " + getMetaTypes()[0]);
            }
        } else if (resultValue instanceof Byte[]) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, Byte[].class))
                return;
            if (ingoreError) {
                logger.error("There's no getter for " + attributeName + " in " + resultInstance + ", META type is "
                        + getMetaTypes()[0]);
            } else {
                throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                        + ", META type is " + getMetaTypes()[0]);
            }
        } else
            throw new RuntimeException("Incorrect binary array " + resultValue);
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
            query.setParameter(paramName, inputValue, getProviderSqlNullType());
        } else {
            if (inputValue instanceof byte[])
                query.setParameter(paramName, (byte[]) inputValue, getProviderSqlType());
            else if (inputValue instanceof Byte[]) {
                query.setParameter(paramName, SqlUtils.toBytes((Byte[]) inputValue), getProviderSqlType());
            } else if (ingoreError) {
                logger.error("Incorrect binary array " + inputValue + " for " + paramName);
            } else {
                throw new SqlRuntimeException("Incorrect binary array " + inputValue + " for " + paramName);
            }
        }
    }
}
