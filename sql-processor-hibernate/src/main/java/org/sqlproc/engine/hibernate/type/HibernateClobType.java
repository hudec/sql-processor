package org.sqlproc.engine.hibernate.type;

import org.hibernate.Hibernate;
import org.sqlproc.engine.type.SqlClobType;

/**
 * The Hibernate META type CLOB.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateClobType extends SqlClobType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return Hibernate.CLOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Hibernate.CLOB;
    }
}
