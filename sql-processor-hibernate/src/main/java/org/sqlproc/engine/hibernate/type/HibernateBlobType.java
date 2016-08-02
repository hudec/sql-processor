package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.BlobType;
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
        return BlobType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return BlobType.INSTANCE;
    }
}
