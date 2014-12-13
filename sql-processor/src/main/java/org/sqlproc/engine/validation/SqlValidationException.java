package org.sqlproc.engine.validation;

/**
 * The general runtime exception class for the SQL Processor engine.
 * 
 * This exception can be raised in the process of a CRUD statement execution as the result of the input values
 * validation. This is just a container for the validation result.
 * 
 * <p>
 * For more information please see {@link SqlValidator}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlValidationException extends RuntimeException {

    private static final long serialVersionUID = -37341245018301697L;

    /**
     * The result of the validation.
     */
    private SqlValidationResult<?> result;

    /**
     * Creates a new instance of the exception.
     */
    public SqlValidationException() {
        super();
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param message
     *            the error message
     */
    public SqlValidationException(String message) {
        super(message);
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param cause
     *            the error cause
     */
    public SqlValidationException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param message
     *            the error message
     * @param cause
     *            the error cause
     */
    public SqlValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param result
     *            the validation result
     */
    public <T> SqlValidationException(SqlValidationResult<T> result) {
        super(result.getMessage());
        this.result = result;
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param message
     *            the error message
     * @param result
     *            the validation result
     */
    public <T> SqlValidationException(String message, SqlValidationResult<T> result) {
        super(message + "\n" + result.getMessage());
        this.result = result;
    }

    /**
     * Returns the validation result.
     * 
     * @return the validation result
     */
    @SuppressWarnings("unchecked")
    public <T> SqlValidationResult<T> getResult() {
        return (SqlValidationResult<T>) result;
    }
}
