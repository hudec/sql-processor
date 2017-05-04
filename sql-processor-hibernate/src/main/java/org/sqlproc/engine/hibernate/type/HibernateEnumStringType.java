package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.StringType;
import org.sqlproc.engine.type.SqlEnumStringType;

/**
 * The Hibernate META type ENUMSTRING.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateEnumStringType extends SqlEnumStringType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return StringType.INSTANCE;
    }
}
