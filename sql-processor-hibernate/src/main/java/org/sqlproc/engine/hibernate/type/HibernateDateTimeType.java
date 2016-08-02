package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TimestampType;
import org.sqlproc.engine.type.SqlDateTimeType;

/**
 * The Hibernate META type DATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateDateTimeType extends SqlDateTimeType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TimestampType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return TimestampType.INSTANCE;
    }
}
