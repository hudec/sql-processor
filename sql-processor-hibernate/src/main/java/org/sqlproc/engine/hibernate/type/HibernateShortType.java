package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.ShortType;
import org.sqlproc.engine.type.SqlShortType;

/**
 * The Hibernate META type SHORT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateShortType extends SqlShortType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Short.class, short.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return ShortType.INSTANCE;
    }
}
