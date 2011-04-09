package org.sqlproc.engine.hibernate.type;

import org.hibernate.Hibernate;
import org.sqlproc.engine.type.SqlByteArrayType;

/**
 * The Hibernate META type BYTEARRAY.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateByteArrayType extends SqlByteArrayType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return Hibernate.BINARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Hibernate.BINARY;
    }
}
