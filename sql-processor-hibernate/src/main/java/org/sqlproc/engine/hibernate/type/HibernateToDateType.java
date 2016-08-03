package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.DateType;
import org.sqlproc.engine.type.SqlToDateType;

/**
 * The Hibernate META type TODATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateToDateType extends SqlToDateType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] {};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return DateType.INSTANCE;
    }
}
