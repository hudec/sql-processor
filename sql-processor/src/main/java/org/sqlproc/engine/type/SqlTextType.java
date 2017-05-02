package org.sqlproc.engine.type;

/**
 * The META type TEXT.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlTextType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] {};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "TEXT" };
    }
}
