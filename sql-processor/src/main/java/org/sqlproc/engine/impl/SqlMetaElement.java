package org.sqlproc.engine.impl;

/**
 * The parents of all ANTLR grammar based elements for META SQL.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
interface SqlMetaElement {

    static final char IDENT_SEPARATOR = '_';
    static final char IDENT_PREFIX = ':';
    static final int lIDENT_PREFIX = 1;
    static final char CONST_PREFIX = '$';
    static final int lCONST_PREFIX = 1;

    static final String AND_PREFIX = "AND ";
    static final String OR_PREFIX = "OR ";
    static final String WHERE_PREFIX = "WHERE ";
    static final String SET_PREFIX = "SET ";
    static final String VALUES_PREFIX = "VALUES";

    /**
     * The main contract for a dynamic ANSI SQL Query generation. Also known as a META SQL processing.
     * 
     * The composite pattern main contract. All ANTLR grammar based elements must implement this contract.
     * 
     * @param ctx
     *            the crate for all input parameters and the context of processing
     */
    SqlProcessResult process(SqlProcessContext ctx);
}
