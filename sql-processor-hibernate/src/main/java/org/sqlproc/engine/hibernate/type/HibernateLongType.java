package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.LongType;
import org.sqlproc.engine.type.SqlLongType;

/**
 * The Hibernate META type LONG.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateLongType extends SqlLongType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return LongType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return LongType.INSTANCE;
    }
}
