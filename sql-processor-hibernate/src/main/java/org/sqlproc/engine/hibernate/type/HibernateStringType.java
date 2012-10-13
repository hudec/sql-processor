package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.StringType;
import org.sqlproc.engine.type.SqlStringType;

/**
 * The Hibernate META type STRING.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateStringType extends SqlStringType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return StringType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return StringType.INSTANCE;
    }
}
