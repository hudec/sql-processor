package org.sqlproc.engine.type;

/**
 * The META type CHARACTER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlCharType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Character.class, char.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "CHARACTER", "CHAR" };
    }
}
