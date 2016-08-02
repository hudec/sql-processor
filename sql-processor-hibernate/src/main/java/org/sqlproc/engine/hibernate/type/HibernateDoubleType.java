package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.DoubleType;
import org.sqlproc.engine.type.SqlDoubleType;

/**
 * The Hibernate META type DOUBLE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateDoubleType extends SqlDoubleType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return DoubleType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return DoubleType.INSTANCE;
    }
}
