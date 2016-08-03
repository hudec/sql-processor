package org.sqlproc.engine.hibernate.type;

import java.sql.Clob;

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
    public Class<?>[] getClassTypes() {
        return new Class[] { Clob.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return ClobType.INSTANCE;
    }
}
