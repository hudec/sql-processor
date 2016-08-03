package org.sqlproc.engine.type;

/**
 * The common ancestor of all META types. These internal types are devoted for the special processing of the
 * input/output values.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlTaggedMetaType extends SqlMetaType {

    /**
     * Returns the list of Java class types related to this META type.
     * 
     * @return the list of Java class types related to this META type
     */
    public Class<?>[] getClassTypes();

    /**
     * Returns the list of names of this META type. These names can be used in the META SQL statements.
     * 
     * @return list of names of this META type. These names can be used in the META SQL statements
     */
    public String[] getMetaTypes();
}
