package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TimestampType;
import org.sqlproc.engine.type.SqlInstantType;

/**
 * The JDBC META type INSTANT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateInstantType extends SqlInstantType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TimestampType.INSTANCE;
    }

}
