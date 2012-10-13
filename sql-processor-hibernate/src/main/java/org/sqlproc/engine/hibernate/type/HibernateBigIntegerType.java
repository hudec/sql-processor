package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.BigIntegerType;
import org.sqlproc.engine.type.SqlBigIntegerType;

/**
 * The Hibernate META type BIGINTEGER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateBigIntegerType extends SqlBigIntegerType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return BigIntegerType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return BigIntegerType.INSTANCE;
    }
}
