package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TimestampType;
import org.sqlproc.engine.type.SqlLocalDateTimeType;

/**
 * The JDBC META type LOCALDATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateLocalDateTimeType extends SqlLocalDateTimeType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TimestampType.INSTANCE;
    }

}
