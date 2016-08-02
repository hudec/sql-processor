package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.BinaryType;
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
        return BinaryType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return BinaryType.INSTANCE;
    }
}
