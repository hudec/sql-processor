package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.BooleanType;
import org.sqlproc.engine.type.SqlBooleanType;

/**
 * The Hibernate META type BOOLEAN.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateBooleanType extends SqlBooleanType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return BooleanType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return BooleanType.INSTANCE;
    }
}
