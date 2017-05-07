package org.sqlproc.engine.type;

/**
 * The helper contract implemented by SqlInputValue to support the OUT and INOUT input values.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface OutValueSetter {

    /**
     * Sets the result of the callable statement execution for the output parameter.
     * 
     * @param outValue
     *            the output value
     * @return the output value after possible conversion
     */
    Object setOutValue(Object outValue);
}
