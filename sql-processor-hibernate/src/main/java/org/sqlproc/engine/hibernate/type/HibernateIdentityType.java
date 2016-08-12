package org.sqlproc.engine.hibernate.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.IdentitySetter;
import org.sqlproc.engine.type.SqlIdentityType;
import org.sqlproc.engine.type.SqlMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The Hibernate META type for an auto-generated identity.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateIdentityType extends SqlIdentityType {

    /**
     * {@inheritDoc}
     */
    @Override
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes) {
        throw new UnsupportedOperationException();
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
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter IDENTITY: paramName=" + paramName + ", identitySetter=" + identitySetter
                    + ", inputTypes=" + inputTypes);
        }
        if (identitySetter != null && identitySetter instanceof IdentitySetter) {
            Object type = runtimeCtx.getTypeFactory().getMetaType(inputTypes[0]);
            if (type != null && type instanceof SqlMetaType)
                query.setParameter(paramName, identitySetter, ((SqlMetaType) type).getProviderSqlType());
            else
                query.setParameter(paramName, identitySetter);
        }
    }

    @Override
    public Class<?>[] getClassTypes() {
        return null;
    }

    @Override
    public Object getProviderSqlType() {
        return null;
    }
}
