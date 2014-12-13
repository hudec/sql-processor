package org.sqlproc.engine.hibernate.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.IdentitySetter;

/**
 * The Hibernate META type for an auto-generated identity.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateIdentityType extends HibernateDefaultType {

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
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName,
            Object resultValue, boolean ingoreError) throws SqlRuntimeException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object identitySetter,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter IDENTITY: paramName=" + paramName + ", identitySetter=" + identitySetter
                    + ", inputType=" + inputType);
        }
        if (identitySetter != null && identitySetter instanceof IdentitySetter) {
            query.setParameter(paramName, identitySetter, hibernateTypes.get(inputType));
        }
    }
}
