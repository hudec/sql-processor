package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TimeType;
import org.sqlproc.engine.type.SqlLocalTimeType;

/**
 * The JDBC META type LOCALTIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateLocalTimeType extends SqlLocalTimeType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TimeType.INSTANCE;
    }

}
