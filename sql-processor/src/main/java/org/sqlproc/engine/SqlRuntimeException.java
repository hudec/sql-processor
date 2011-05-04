package org.sqlproc.engine;

/**
 * The general runtime exception class for the SQL Processor engine.
 * 
 * This exception can be raised in the process of a META SQL query or a statement execution. It's not produced in the
 * JDBC or ORM layer, but in the SQL Processor engine itself. Primarily it devoted to the problems with the input/output
 * values handling.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlRuntimeException extends RuntimeException {

    /**
     * Creates a new instance of the exception.
     */
    public SqlRuntimeException() {
        super();
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param message
     *            the error message
     */
    public SqlRuntimeException(String message) {
        super(message);
    }

    /**
     * Creates a new instance of the exception.
     * 
     * @param cause
     *            the error cause
     */
    public SqlRuntimeException(Throwable cause) {
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
    public SqlRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}
