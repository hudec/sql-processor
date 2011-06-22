package org.sqlproc.engine.impl;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Parser utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class ParserUtils {

    private static Logger logger = LoggerFactory.getLogger(ParserUtils.class);
    static long counter = 0;

    private ParserUtils() {
    }

    // just for the internal JUnit tests
    static void nullCounter() {
        counter = 0;
    }

    static void addText(Object target, StringBuilder text) {
        if (logger.isTraceEnabled()) {
            logger.trace("addText " + text);
        }
        if (text != null && text.length() > 0) {
            if (target instanceof SqlMetaStatement) {
                ((SqlMetaStatement) target).addElement(new SqlMetaText(text.toString()));
            } else if (target instanceof SqlMetaOrd) {
                ((SqlMetaOrd) target).addElement(new SqlMetaText(text.toString()));
            } else if (target instanceof SqlMetaIfItem) {
                ((SqlMetaIfItem) target).addElement(new SqlMetaText(text.toString()));
            } else {
                throw new RuntimeException("Invalid target for addText :" + target);
            }
            text.delete(0, text.length());
        }
    }

    static void addColumn(Object target, SqlMappingItem col, StringBuilder text) {
        if (logger.isTraceEnabled()) {
            logger.trace("addColumn " + col);
        }
        if (col != null) {
            if (target instanceof SqlMetaStatement) {
                addText(target, text);
                ((SqlMetaStatement) target).addElement(col);
            } else if (target instanceof SqlMetaIfItem) {
                addText(target, text);
                ((SqlMetaIfItem) target).addElement(col);
            } else {
                throw new RuntimeException("Invalid target for addColumn :" + target);
            }
        }
    }

    static void addIdent(Object target, SqlMetaIdent ident, StringBuilder text) {
        if (logger.isTraceEnabled()) {
            logger.trace("addIdent " + ident);
        }
        if (ident != null) {
            if (target instanceof SqlMetaStatement) {
                addText(target, text);
                ((SqlMetaStatement) target).addElement(ident);
            } else if (target instanceof SqlMetaOrd) {
                addText(target, text);
                ((SqlMetaOrd) target).addElement(ident);
            } else if (target instanceof SqlMetaLogExpr) {
                ((SqlMetaLogExpr) target).addElement(ident);
            } else if (target instanceof SqlMetaIfItem) {
                addText(target, text);
                ((SqlMetaIfItem) target).addElement(ident);
            } else {
                throw new RuntimeException("Invalid target for addIdent :" + target);
            }
        }
    }

    static void addConstant(Object target, SqlMetaConst cnst, StringBuilder text) {
        if (logger.isTraceEnabled()) {
            logger.trace("addConstant " + cnst);
        }
        if (cnst != null) {
            if (target instanceof SqlMetaStatement) {
                addText(target, text);
                ((SqlMetaStatement) target).addElement(cnst);
            } else if (target instanceof SqlMetaOrd) {
                addText(target, text);
                ((SqlMetaOrd) target).addElement(cnst);
            } else if (target instanceof SqlMetaLogExpr) {
                ((SqlMetaLogExpr) target).addElement(cnst);
            } else if (target instanceof SqlMetaIfItem) {
                addText(target, text);
                ((SqlMetaIfItem) target).addElement(cnst);
            } else {
                throw new RuntimeException("Invalid target for addConstant :" + target);
            }
        }
    }

    static SqlMappingItem newColumn(String name) {
        if (logger.isTraceEnabled()) {
            logger.trace("newColumn " + name);
        }
        if (name.length() > 0) {
            SqlMappingItem col = null;
            String[] javaNames = name.split("\\.");
            if (javaNames.length > 1) {
                String dbName = javaNames[javaNames.length - 1] + "_" + (counter++);
                col = new SqlMappingItem(dbName);
                for (String javaName : javaNames) {
                    col.addAttributeName(javaName);
                }
            } else {
                col = new SqlMappingItem(name);
            }
            return col;
        }
        return null;
    }

    static SqlMappingItem addColumnAttr(SqlMappingItem col, String name) {
        if (logger.isTraceEnabled()) {
            logger.trace("addColumnAttr " + name);
        }
        if (name.length() > 0) {
            String[] javaNames = name.split("\\.");
            for (String javaName : javaNames) {
                col.addAttributeName(javaName);
            }
            return col;
        }
        return null;
    }

    static SqlDatabaseColumn newDatabaseColumn(String name) {
        if (logger.isTraceEnabled()) {
            logger.trace("newDatabaseColumn " + name);
        }
        if (name.length() > 0) {
            SqlDatabaseColumn col = new SqlDatabaseColumn(name);
            return col;
        }
        return null;
    }

    static void addDatabaseColumn(Object target, SqlDatabaseColumn dbcol, StringBuilder text) {
        if (logger.isTraceEnabled()) {
            logger.trace("addDatabaseColumn " + dbcol);
        }
        if (dbcol != null) {
            if (target instanceof SqlMetaStatement) {
                addText(target, text);
                ((SqlMetaStatement) target).addElement(dbcol);
            } else if (target instanceof SqlMetaOrd) {
                addText(target, text);
                ((SqlMetaOrd) target).addElement(dbcol);
            } else if (target instanceof SqlMetaIfItem) {
                addText(target, text);
                ((SqlMetaIfItem) target).addElement(dbcol);
            } else {
                throw new RuntimeException("Invalid target for addIdent :" + target);
            }
        }
    }

    static SqlMetaConst newConstant(String name, String caseConversion) {
        if (logger.isTraceEnabled()) {
            logger.trace("newConstant " + name);
        }
        SqlInputValue.Code caseConv = SqlInputValue.Code.NONE;
        if ("+".equals(caseConversion))
            caseConv = SqlInputValue.Code.UPPER;
        else if ("-".equals(caseConversion))
            caseConv = SqlInputValue.Code.LOWER;
        if (name.length() > 0) {
            SqlMetaConst constant = new SqlMetaConst(caseConv);
            String[] idents = name.split("\\.");
            for (String ident : idents) {
                constant.addConst(ident);
            }
            return constant;
        }
        return null;
    }

    static SqlMetaIdent newIdent(String name, String modeIdent, String caseIdent) {
        if (logger.isTraceEnabled()) {
            logger.trace("newIdent " + name);
        }
        SqlInputValue.Code caseConv = SqlInputValue.Code.NONE;
        SqlInputValue.Mode inOutMode = SqlInputValue.Mode.IN;
        if ("+".equals(caseIdent))
            caseConv = SqlInputValue.Code.UPPER;
        else if ("-".equals(caseIdent))
            caseConv = SqlInputValue.Code.LOWER;
        if (">".equals(modeIdent))
            inOutMode = SqlInputValue.Mode.IN;
        else if ("<".equals(modeIdent))
            inOutMode = SqlInputValue.Mode.OUT;
        else if ("=".equals(modeIdent))
            inOutMode = SqlInputValue.Mode.INOUT;
        if (name.length() > 0) {
            SqlMetaIdent identifier = new SqlMetaIdent(caseConv, inOutMode);
            String[] idents = name.split("\\.");
            for (String ident : idents) {
                identifier.addIdent(ident);
            }
            return identifier;
        }
        return null;
    }

    public static ErrorMsg create(String name, RecognitionException ex, String[] tokenNames) {
        String msg = "Parse error";
        try {
            if (ex instanceof MismatchedTokenException) {
                MismatchedTokenException mte = (MismatchedTokenException) ex;
                if (ex.token.getType() == -1) {
                    msg = "Unexpected end of file! Expecting " + tokenNames[mte.expecting];
                } else if (tokenNames != null && ex.token != null && ex.token.getText() != null) {
                    msg = "Unexpected token '" + ex.token.getText() + "' (type: " + tokenNames[ex.getUnexpectedType()]
                            + ") - expecting : " + (mte.expecting == -1 ? "end of File" : tokenNames[mte.expecting]);
                }
            } else if (ex.token != null && ex.token.getText() != null)
                msg = "Unexpected token '" + ex.token.getText() + "' (type: " + tokenNames[ex.getUnexpectedType()]
                        + ")";
        } catch (Exception e) {
            // ignore
        }
        return create(name, msg, ex, tokenNames);
    }

    public static ErrorMsg create(String name, String msg, RecognitionException ex, String[] tokenNames) {
        int length = 1;
        if (ex.token != null && ex.token.getText() != null) {
            length = ex.token.getText().length();
        }
        if (ex.token != null) {
            Token t = ex.token;
            if (t instanceof CommonToken) {
                CommonToken ct = (CommonToken) t;
                return new ErrorMsg(name, msg, ct.getStartIndex(), ct.getStopIndex() - ct.getStartIndex(), ct.getLine());
            }
        }
        return new ErrorMsg(name, msg, ex.index >= 0 ? ex.index : 0, length, ex.line);
    }
}
