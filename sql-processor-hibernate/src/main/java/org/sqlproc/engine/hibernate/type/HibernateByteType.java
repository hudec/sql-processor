package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.ByteType;
import org.sqlproc.engine.type.SqlByteType;

/**
 * The Hibernate META type BYTE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateByteType extends SqlByteType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return ByteType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return ByteType.INSTANCE;
    }
}
