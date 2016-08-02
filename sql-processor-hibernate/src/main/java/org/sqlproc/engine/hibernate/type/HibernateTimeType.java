package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TimeType;
import org.sqlproc.engine.type.SqlTimeType;

/**
 * The Hibernate META type TIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateTimeType extends SqlTimeType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TimeType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return TimeType.INSTANCE;
    }
}
