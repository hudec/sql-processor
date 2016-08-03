package org.sqlproc.engine.hibernate.type;

import java.math.BigInteger;

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
    public Class<?>[] getClassTypes() {
        return new Class[] { BigInteger.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return BigIntegerType.INSTANCE;
    }
}
