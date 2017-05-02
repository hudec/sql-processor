package org.sqlproc.engine.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type for an auto-generated identity.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlIdentityType extends SqlDefaultType {

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
        return new String[] {};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object identitySetter,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, identitySetter, ingoreError, inputTypes);

        if (identitySetter != null && identitySetter instanceof IdentitySetter) {
            query.setParameter(paramName, identitySetter, getProviderSqlType());
        }
    }
}
