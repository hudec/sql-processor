package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.IntegerType;
import org.sqlproc.engine.type.SqlIntegerType;

/**
 * The Hibernate META type INTEGER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateIntegerType extends SqlIntegerType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return IntegerType.INSTANCE;
    }
}
