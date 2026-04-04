package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/**
 * ANTLR 4 error listener that collects parse errors into ErrorMsg instances.
 *
 * Replaces the inline getErrorMessage/reportError overrides that were embedded
 * in the ANTLR 3 grammar's @members and @lexer::members sections.
 */
class SqlProcessorErrorListener extends BaseErrorListener {

    private final List<ErrorMsg> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine, String msg, RecognitionException e) {
        int startIndex = charPositionInLine;
        int length = 1;
        if (offendingSymbol instanceof Token) {
            Token t = (Token) offendingSymbol;
            startIndex = t.getStartIndex();
            int stop = t.getStopIndex();
            length = (stop >= startIndex) ? (stop - startIndex + 1) : 1;
            line = t.getLine();
        }
        errors.add(new ErrorMsg(null, msg, startIndex, length, line));
    }

    public List<ErrorMsg> getErrors() {
        return errors;
    }
}
