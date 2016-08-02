package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.TextType;
import org.sqlproc.engine.type.SqlTextType;

/**
 * The Hibernate META type TEXT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateTextType extends SqlTextType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return TextType.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDatabaseSqlType() {
        return TextType.INSTANCE;
    }
}
