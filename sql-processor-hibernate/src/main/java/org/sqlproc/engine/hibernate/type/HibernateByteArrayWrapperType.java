package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.WrappedMaterializedBlobType;
import org.sqlproc.engine.type.SqlByteArrayType;

/**
 * The Hibernate META type BYTEARRAY.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateByteArrayWrapperType extends SqlByteArrayType {

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
    public Object getProviderSqlType() {
        return WrappedMaterializedBlobType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "BYTEARR", "BYTEARRAY" };
    }
}
