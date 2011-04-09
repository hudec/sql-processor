package org.sqlproc.engine.hibernate.type;

import org.hibernate.Hibernate;
import org.sqlproc.engine.type.SqlTextType;

/**
 * The Hibernate META type TEXT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateTextType extends SqlTextType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return Hibernate.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Hibernate.TEXT;
    }
}
