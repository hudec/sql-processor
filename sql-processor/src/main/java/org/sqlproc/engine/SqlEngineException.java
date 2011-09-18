package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.List;

import org.sqlproc.engine.impl.ErrorMsg;

/**
 * The general exception class for the SQL Processor parser.
 * 
 * This exception can be raised in the process of the META SQL statement or the mapping rule parsing. It encapsulates
 * the ANTLR exceptions. In the runtime (query command execution) only {@link SqlRuntimeException} or
 * {@link SqlProcessorException} can be raised.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlEngineException extends RuntimeException {
    private static final long serialVersionUID = 3902062078303952832L;

    /**
     * The list of parsing errors.
     */
    private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();

    /**
     * Creates a new instance of the exception in the process of lexer and parser processing.
     * 
     * @param msg
     *            the error message
     */
    public SqlEngineException(String msg) {
        super(msg);
    }

    /**
     * Creates a new instance of the exception in the process of lexer and parser processing.
     * 
     * @param msg
     *            the error message
     * @param lexerErrors
     *            the optional list of (ANTLR) lexer errors
     * @param parserErrors
     *            the optional list of (ANTLR) parser errors
     * @param processorErrors
     *            the optional list of (ANTLR) processor errors
     */
    public SqlEngineException(String msg, List<ErrorMsg> lexerErrors, List<ErrorMsg> parserErrors,
            List<ErrorMsg> processorErrors) {
        super(msg);
        if (lexerErrors != null && !lexerErrors.isEmpty())
            errors.addAll(lexerErrors);
        if (parserErrors != null && !parserErrors.isEmpty())
            errors.addAll(parserErrors);
        if (processorErrors != null && !processorErrors.isEmpty())
            errors.addAll(processorErrors);
    }

    /**
     * Creates a new instance of the exception in the process of lexer and parser processing.
     * 
     * @param msg
     *            the error message
     * @param lexerErrors
     *            the optional list of (ANTLR) lexer errors
     * @param parserErrors
     *            the optional list of (ANTLR) parser errors
     */
    public SqlEngineException(String msg, List<ErrorMsg> lexerErrors, List<ErrorMsg> parserErrors) {
        this(msg, lexerErrors, parserErrors, null);
    }

    /**
     * Creates a human readable message describing the exception raised in the process of lexer and parser processing.
     * 
     * @return the readable message describing exception
     */
    public String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        if (!errors.isEmpty())
            sb.append("\nANTLR messages:");
        for (ErrorMsg errorMsg : errors) {
            sb.append("\n  ").append(errorMsg.toString());
        }
        return sb.toString();
    }
}
