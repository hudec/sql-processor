package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * Precompiled META SQL statement.
 * 
 * Instance of this class is created by the ANTLR parser. The grammar is defined in SqlStatement.g.
 * 
 * It's based on the Composite (desing pattern). The main contract is
 * {@link org.sqlproc.engine.impl.SqlMetaElement#process(SqlProcessContext)}
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaStatement
 *     SqlMetaText
 *     SqlMetaIdent
 *     SqlMetaConst
 *     { SqlMetaAndOr}
 *     {? SqlMetaIf}
 *     {& SqlMetaAndOr}
 *     {| SqlMetaAndOr}
 *     {#DIGIT SqlMetaOrd}
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlMetaStatement implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    protected static Logger logger = LoggerFactory.getLogger(SqlMetaElement.class);

    /**
     * The SQL command type.
     */
    public static enum Type {
        /**
         * SQL SELECT
         */
        QUERY,
        /**
         * SQL INSERT
         */
        CREATE,
        /**
         * SQL SELECT one row
         */
        RETRIEVE,
        /**
         * SQL SET
         */
        UPDATE,
        /**
         * SQL DELETE/DROP
         */
        DELETE,
        /**
         * SQL CALL
         */
        CALL
    }

    /**
     * A raw representation this META SQL statement
     */
    String raw;

    /**
     * All sub-elements based on ANTLR grammar defined in SqlStatement.g.
     */
    List<SqlMetaElement> elements;

    /**
     * An indicator for embedded output mapping
     */
    boolean hasOutputMapping;

    /**
     * Simple factory method (design pattern). The new instance of precompiled META SQL is created from the String input
     * by the ANTLR parser.
     * 
     * @param name
     *            the name of this META SQL query/statement
     * @param statement
     *            String representation of META SQL query/statement
     * @param typeFactory
     *            the factory for the META types construction
     * @return new instance of precompiled META SQL query/statement
     * @throws SqlEngineException
     *             in the case of ANTLR parsing exception
     */
    public static SqlMetaStatement getInstance(String name, String statement, SqlTypeFactory typeFactory)
            throws SqlEngineException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> getInstance, statement=" + statement);
        }
        SqlMetaStatement stmt = null;
        try {
            StringBuilder sbStatements = new StringBuilder(statement);
            SqlProcessorLexer lexer = new SqlProcessorLexer(new ANTLRStringStream(sbStatements.toString()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlProcessorParser parser = new SqlProcessorParser(tokens);
            try {
                stmt = parser.meta(name, typeFactory, false);
            } catch (RecognitionException ex) {
                ex.printStackTrace();
            }
            if (!lexer.getErrors().isEmpty() || !parser.getErrors().isEmpty()) {
                throw new SqlEngineException("Statement error for '" + statement + "'", lexer.getErrors(),
                        parser.getErrors());
            }
            return stmt;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< getInstance, stmt=" + stmt);
            }
        }
    }

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    SqlMetaStatement() {
        this.elements = new ArrayList<SqlMetaElement>();
    }

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    public SqlMetaStatement(String raw) {
        this.raw = raw;
    }

    /**
     * Returns raw representation this META SQL statement
     * 
     * @return raw representation this META SQL statement
     */
    public String getRaw() {
        return raw;
    }

    /**
     * Adds a new sub-element. It's used from inside ANTLR parser.
     * 
     * @param element
     *            new sub-element, based on ANTLR grammar
     */
    void addElement(SqlMetaElement element) {
        elements.add(element);
    }

    /**
     * Returns the indicator for embedded output mapping.
     * 
     * @return the indicator for embedded output mapping
     */
    public boolean isHasOutputMapping() {
        return hasOutputMapping;
    }

    /**
     * Sets the indicator for embedded output mapping.
     * 
     * @param hasOutputMapping
     *            the indicator for embedded output mapping
     */
    public void setHasOutputMapping(boolean hasOutputMapping) {
        this.hasOutputMapping = hasOutputMapping;
    }

    /**
     * The main contract for a dynamic ANSI SQL Query generation.
     * 
     * The ANSI SQL Query creation is based on
     * <ul>
     * <li>META SQL
     * <li>dynamic input values
     * <li>static input values
     * <li>ordering list directive
     * <li>optional features
     * <ul>
     * 
     * @param sqlStatementType
     *            the SQL command type
     * @param dynamicInputValues
     *            the SQL statement dynamic parameters (input values)
     * @param staticInputValues
     *            the SQL statement static parameters (input values)
     * @param order
     *            the list of ordering directives
     * @param features
     *            the optional features in the statement/global scope
     * @param runtimeFeatures
     *            the optional features in the statement's exection scope
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @return the crate for ANSI SQL and other attributes, which control the SQL statement itself
     */
    public SqlProcessResult process(Type sqlStatementType, Object dynamicInputValues, Object staticInputValues,
            List<SqlOrder> order, Map<String, Object> features, Map<String, Object> runtimeFeatures,
            SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) {
        SqlProcessContext ctx = new SqlProcessContext(sqlStatementType, dynamicInputValues, staticInputValues, order,
                features, runtimeFeatures, typeFactory, pluginFactory);
        SqlProcessResult result = this.process(ctx);
        result.setLogError(SqlProcessContext.isFeature(SqlFeature.LOG_SQL_COMMAND_FOR_EXCEPTION));
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult();
        StringBuilder s = new StringBuilder();
        result.setSql(s);
        List<SqlProcessResult> orderByResult = new ArrayList<SqlProcessResult>();
        for (SqlMetaElement item : this.elements) {
            SqlProcessResult itemResult = item.process(ctx);
            if (itemResult.isAdd()) {
                if (itemResult.getOrderIndex() != null) {
                    orderByResult.add(itemResult);
                } else {
                    s.append(itemResult.getSql());
                    result.addInputValues(itemResult.getInputValues());
                    result.addMappedInputValues(itemResult.getMappedInputValues());
                    result.addOutputValues(itemResult.getOutputValues());
                    result.addIdentities(itemResult.getIdentities());
                    result.addOutValues(itemResult.getOutValues());
                }
            } else {
                result.addFalse();
            }
        }
        if (!orderByResult.isEmpty()) {
            Collections.sort(orderByResult);
            s.append("order by ");
            boolean first = true;
            for (SqlProcessResult itemResult : orderByResult) {
                if (!first)
                    s.append(", ");
                else
                    first = false;
                s.append(itemResult.getSql());
                result.addInputValues(itemResult.getInputValues());
                result.addMappedInputValues(itemResult.getMappedInputValues());
            }
        }
        return result;
    }
}
