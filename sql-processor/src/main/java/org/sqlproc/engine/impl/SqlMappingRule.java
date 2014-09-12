package org.sqlproc.engine.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The precompiled mapping entity for one external META SQL mapping rule.
 * 
 * Instances of this class are created by the ANTLR parser. The grammar itself is defined in SqlMapping.g.
 * 
 * The main runtime contracts is {@link SqlMappingRule#merge(SqlMappingRule, SqlProcessResult)}.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMappingRule = SqlMappingItem+
 *     SqlMappingItem = dbName$sqlType$javaName^(value(=value2)?)*.javaName...
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlMappingRule {

    /**
     * The internal slf4j logger.
     */
    protected static Logger logger = LoggerFactory.getLogger(SqlMappingRule.class);

    /**
     * A raw representation this output value mapping
     */
    String raw;

    /**
     * All sub-elements based on ANTLR grammar defined in SqlMapping.g. Every sub-element is one mapping item.
     */
    private Map<String, SqlMappingItem> mappings;

    /**
     * Simple factory method (design pattern). The new instance of precompiled mapping rule is created from the String
     * input by the ANTLR parser.
     * 
     * @param name
     *            the name of this mapping rule
     * @param mappingStatement
     *            String representation of mapping rule
     * @param typeFactory
     *            the factory for the META types construction
     * @return the new instance of precompiled mapping rule
     * @throws SqlEngineException
     *             in the case of ANTRL parsing exception
     */
    public static SqlMappingRule getInstance(String name, String mappingStatement, SqlTypeFactory typeFactory)
            throws SqlEngineException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> getInstance, mappingStatement=" + mappingStatement);
        }
        SqlMappingRule mapping = null;
        try {
            StringBuilder sbMappingStatement = new StringBuilder(mappingStatement);
            SqlProcessorLexer lexer = new SqlProcessorLexer(new ANTLRStringStream(sbMappingStatement.toString()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlProcessorParser parser = new SqlProcessorParser(tokens);
            try {
                mapping = parser.mapping(name, typeFactory, false);
            } catch (RecognitionException ex) {
                ex.printStackTrace();
            }
            if (!lexer.getErrors().isEmpty() || !parser.getErrors().isEmpty()) {
                throw new SqlEngineException("Mapping error for '" + mappingStatement + "'", lexer.getErrors(),
                        parser.getErrors());
            }
            return mapping;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< getInstance, mapping=" + mapping);
            }
        }
    }

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    public SqlMappingRule() {
        mappings = new LinkedHashMap<String, SqlMappingItem>();
    }

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    public SqlMappingRule(String raw) {
        this.raw = raw;
    }

    /**
     * Returns raw representation this output value mapping
     * 
     * @return raw representation this output value mapping
     */
    public String getRaw() {
        return raw;
    }

    /**
     * Adds a new Mapping item, which is a mapping rule for one column.
     * 
     * @param item
     *            the mapping item
     */
    void addMapping(SqlMappingItem item) {
        mappings.put(item.getDbName(), item);
    }

    /**
     * Returns a collection of all mapping items in this mapping rule.
     * 
     * @return the collection of all mapping items
     */
    Map<String, SqlMappingItem> getMappings() {
        return mappings;
    }

    /**
     * Merge mapping rule for one META SQL query based on SqlMapping.g and SqlStatement.g. The mapping rule based on
     * SqlMapping.g has the higher priority compared to mapping rule based on SqlStatement.g. The mapping rule based on
     * SqlStatement.g obtains a list of real output values.
     * 
     * @param mapping
     *            the mapping rule based on SqlMapping.g
     * @param processResult
     *            contains a mapping rule based on SqlStatement.g
     * @return the crate for output mapping rule and database row identities
     */
    public static SqlMappingResult merge(SqlMappingRule mapping, SqlProcessResult processResult) {
        return new SqlMappingResult(processResult.getCtx(), mapping, processResult.getOutputValues());
    }
}
