package org.sqlproc.engine.type;

import java.math.BigDecimal;

/**
 * The META type BIGDECIMAL.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlBigDecimalType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { BigDecimal.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "BIGDEC", "BIGDECIMAL" };
    }
}
