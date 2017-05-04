package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.ClobType;
import org.sqlproc.engine.type.SqlClobType;

/**
 * The Hibernate META type CLOB.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateClobType extends SqlClobType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return ClobType.INSTANCE;
    }
}
