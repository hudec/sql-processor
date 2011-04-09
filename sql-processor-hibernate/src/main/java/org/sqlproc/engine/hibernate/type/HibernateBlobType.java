package org.sqlproc.engine.hibernate.type;

import org.hibernate.Hibernate;
import org.sqlproc.engine.type.SqlBlobType;

/**
 * The Hibernate META type BLOB.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateBlobType extends SqlBlobType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return Hibernate.BLOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Hibernate.BLOB;
    }
}
