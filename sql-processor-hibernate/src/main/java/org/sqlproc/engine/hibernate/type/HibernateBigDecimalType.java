package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.BigDecimalType;
import org.sqlproc.engine.type.SqlBigDecimalType;

/**
 * The Hibernate META type BIGDECIMAL.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateBigDecimalType extends SqlBigDecimalType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return BigDecimalType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return BigDecimalType.INSTANCE;
    }
}
