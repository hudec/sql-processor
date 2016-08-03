package org.sqlproc.engine.jdbc.type;

import org.sqlproc.engine.type.SqlDefaultType;

/**
 * The default META type for the JDBC stack. It's used in the case there's no explicit META type declaration in the META
 * SQL statements.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcDefaultType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypesForDefault() {
        return null;
    }
}
