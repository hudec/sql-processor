package org.sqlproc.engine.hibernate.type;

import org.hibernate.Hibernate;
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
        return Hibernate.DOUBLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Hibernate.DOUBLE;
    }
}
