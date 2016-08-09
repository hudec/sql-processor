package org.sqlproc.engine.hibernate.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.type.SqlDefaultType;
import org.sqlproc.engine.type.SqlMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The default META type for the Hibernate stack. It's used in the case there's no explicit META type declaration in the
 * META SQL statements.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateDefaultType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes) {
        if (getProviderSqlType() != null) {
            query.addScalar(dbName, getProviderSqlType());
        } else {
            Object type = (attributeTypes.length > 0) ? typeFactory.getMetaType(attributeTypes[0]) : null;
            if (type != null && type instanceof SqlMetaType)
                query.addScalar(dbName, ((SqlMetaType) type).getProviderSqlType());
            else
                query.addScalar(dbName);
        }
    }

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
