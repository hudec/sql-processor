package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.DateType;
import org.sqlproc.engine.type.SqlDateType;

/**
 * The Hibernate META type DATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateDateType extends SqlDateType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return DateType.INSTANCE;
    }
}
