package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TimestampType;
import org.sqlproc.engine.type.SqlTimestampType;

/**
 * The Hibernate META type TIMESTAMP.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateTimestampType extends SqlTimestampType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.sql.Timestamp.class, java.util.Date.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TimestampType.INSTANCE;
    }
}
