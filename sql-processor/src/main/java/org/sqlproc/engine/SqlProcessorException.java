package org.sqlproc.engine;

/**
 * the general runtime exception class for the SQL Processor engine.
 * 
 * This exception can be raised in the process of a META SQL query or a statement execution. It's produced in the JDBC
 * or ORM layer, not in the SQL Processor engine itself. Most of the time it's a wrapper class for the cause exception.
 * 
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessorException extends RuntimeException {
    private static final long serialVersionUID = -3445190167492657525L;

    /**
     * Creates a new instance of the exception.
     */
    public SqlProcessorException() {
        super();
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param message
     *            the error message
     */
    public SqlProcessorException(String message) {
        super(message);
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param cause
     *            the error cause
     */
    public SqlProcessorException(Throwable cause) {
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
    public SqlProcessorException(String message, Throwable cause) {
        super(message, cause);
    }

}
