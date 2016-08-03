package org.sqlproc.engine.hibernate.type;

import java.sql.Blob;

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
    public Class<?>[] getClassTypes() {
        return new Class[] { Blob.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return BlobType.INSTANCE;
    }
}
