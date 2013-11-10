package org.sqlproc.engine.validation;

/**
 * The generic interface definition for the validation result.
 * 
 * <p>
 * For more information please see {@link SqlValidator}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlValidationResult<T> {
    /**
     * Returns the validation result specific for the selected validator implementation.
     * 
     * @return the validation result
     */
    T getResult();
}
