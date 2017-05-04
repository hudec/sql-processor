package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.DateType;
import org.sqlproc.engine.type.SqlLocalDateType;

/**
 * The JDBC META type LOCALDATE.
 * 
 */
public class HibernateLocalDateType extends SqlLocalDateType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return DateType.INSTANCE;
    }

}
