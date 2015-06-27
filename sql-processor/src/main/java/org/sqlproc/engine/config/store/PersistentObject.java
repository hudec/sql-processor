package org.sqlproc.engine.config.store;

/**
 * The classes, which implements this interface, can be persisted using the sql-processor-spring.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface PersistentObject {

    /**
     * Returns the persisted class type.
     * 
     * @return the persisted class type
     */
    public Class<?> getType();

    /**
     * This is called after the persisted class instantiation.
     */
    public void init();

    /**
     * This is called in the case the state of the persisted class instance should be cleared.
     */
    public void empty();

}
