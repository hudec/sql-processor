package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.IntegerType;
import org.sqlproc.engine.type.SqlEnumIntegerType;

/**
 * The Hibernate META type ENUMINTEGER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateEnumIntegerType extends SqlEnumIntegerType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return IntegerType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return IntegerType.INSTANCE;
    }
}
