package org.sqlproc.engine.type;

/**
 * The common ancestor of all generic META types with assigned names and the related Java class types.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlInternalType extends SqlMetaType {

    /**
     * The list of Java class types related to this META type.
     */
    public abstract Class<?>[] getClassTypes();

    /**
     * The list of names of this META type. These names can be used in the META SQL statements.
     */
    public abstract String[] getMetaTypes();
}
