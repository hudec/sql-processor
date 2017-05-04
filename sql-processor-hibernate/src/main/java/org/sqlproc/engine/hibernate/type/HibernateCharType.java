package org.sqlproc.engine.hibernate.type;

import org.hibernate.type.CharacterType;
import org.sqlproc.engine.type.SqlCharType;

/**
 * The Hibernate META type CHARACTER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateCharType extends SqlCharType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return CharacterType.INSTANCE;
    }
}
