package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.FloatType;
import org.sqlproc.engine.type.SqlFloatType;

/**
 * The Hibernate META type FLOAT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateFloatType extends SqlFloatType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Float.class, float.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return FloatType.INSTANCE;
    }
}
