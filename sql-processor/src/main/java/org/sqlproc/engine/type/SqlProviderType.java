package org.sqlproc.engine.type;

/**
 * The META type contract for types provided by the stack on top of which the SQL Processor works. They can be the JDBC
 * types or the Hibernate types.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlProviderType extends SqlInternalType {

    /**
     * Returns the type provided by the stack on top of which the SQL Processor works.
     * 
     * @return the provided type
     */
    public abstract Object getProviderSqlType();

    /**
     * Returns the type provided by the stack on top of which the SQL Processor works. It has to support <tt>null</tt>
     * input/output values.
     * 
     * @return the provided type
     */
    public abstract Object getProviderSqlNullType();
}
