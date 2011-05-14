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
 * Pre-compiled META SQL statements, output mappings and optional features.
 * 
 * Instance of this class is created by the ANTLR parser. The grammar is defined in SqlProcessor.g.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessor {

    /**
     * The internal slf4j logger.
     */
    protected static Logger logger = LoggerFactory.getLogger(SqlMetaElement.class);

    /**
     * The META SQL statement type.
     */
    public static enum StatementType {
        /**
         * Query
         */
        QRY,
        /**
         * CRUD, can be GET, INSERT, UPDATE, DELETE
         */
        CRUD,
        /**
         * SQL CALL
         */
        CALL
    }

    /**
     * The mapping rule type.
     */
    public static enum MappingType {
        /**
         * Output values mapping
         */
        OUT,
        /**
         * Input values mapping
         */
        IN
    }

    /**
     * The collection of the META SQL statements.
     */
    Map<String, Map<String, SqlMetaStatement>> metaStatements;
    /**
     * The collection of the output value mappings.
     */
    Map<String, Map<String, SqlMappingRule>> mappingRules;
    /**
     * The collection of the SQL Processor optional features.
     */
    private Map<String, String> features;

    /**
     * Simple factory method (design pattern). The new instance is created from the String input by the ANTLR parser.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @return new container of pre-compiled META SQL queries/statements/output mappings
     * @throws SqlEngineException
     *             in the case of ANTLR parsing exception
     */
    public static SqlProcessor getInstance(StringBuilder sbStatements, SqlTypeFactory typeFactory, String... filters)
            throws SqlEngineException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> getInstance, sStatements=" + sbStatements);
        }
        SqlProcessor processor = null;
        try {
            SqlProcessorLexer lexer = new SqlProcessorLexer(new ANTLRStringStream(sbStatements.toString()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlProcessorParser parser = new SqlProcessorParser(tokens);
            try {
                processor = parser.parse(typeFactory, filters);
            } catch (RecognitionException ex) {
                ex.printStackTrace();
            }
            if (!lexer.getErrors().isEmpty() || !parser.getErrors().isEmpty()) {
                throw new SqlEngineException("Statement error for '" + sbStatements + "'", lexer.getErrors(),
                        parser.getErrors());
            }
            return processor;
        } finally {
            if (logger.isTraceEnabled()) {
                logger.trace("<< getInstance, queries=" + processor.getMetaStatements(StatementType.QRY));
                logger.trace("<< getInstance, cruds=" + processor.getMetaStatements(StatementType.CRUD));
                logger.trace("<< getInstance, calls=" + processor.getMetaStatements(StatementType.CALL));
                logger.trace("<< getInstance, input mappings=" + processor.getMappingRules(MappingType.IN));
                logger.trace("<< getInstance, output mappings=" + processor.getMappingRules(MappingType.OUT));
                logger.trace("<< getInstance, features=" + processor.getFeatures());
            }
        }
    }

    /**
     * Creates a new instance.
     */
    SqlProcessor() {
        metaStatements = new LinkedHashMap<String, Map<String, SqlMetaStatement>>();
        for (StatementType type : StatementType.values())
            metaStatements.put(type.name(), new LinkedHashMap<String, SqlMetaStatement>());
        mappingRules = new LinkedHashMap<String, Map<String, SqlMappingRule>>();
        for (MappingType type : MappingType.values())
            mappingRules.put(type.name(), new LinkedHashMap<String, SqlMappingRule>());
        features = new LinkedHashMap<String, String>();
    }

    /**
     * Returns the collection of the META SQL statements.
     * 
     * @param type
     *            the META SQL statement type
     * 
     * @return the collection of the META SQL statements
     */
    public Map<String, SqlMetaStatement> getMetaStatements(StatementType type) {
        return metaStatements.get(type.name());
    }

    /**
     * Returns the collection of the META SQL statements.
     * 
     * @param type
     *            the META SQL statement type
     * 
     * @return the collection of the META SQL statements
     */
    public Map<String, SqlMetaStatement> getMetaStatements(String type) {
        StatementType.valueOf(type);
        return metaStatements.get(type);
    }

    /**
     * Returns the collection of the output value mappings.
     * 
     * @param type
     *            the input/output mapping rule type
     * 
     * @return the collection of the output value mappings
     */
    public Map<String, SqlMappingRule> getMappingRules(MappingType type) {
        return mappingRules.get(type.name());
    }

    /**
     * Returns the collection of the output value mappings.
     * 
     * @param type
     *            the input/output mapping rule type
     * 
     * @return the collection of the output value mappings
     */
    public Map<String, SqlMappingRule> getMappingRules(String type) {
        MappingType.valueOf(type);
        return mappingRules.get(type);
    }

    /**
     * Returns the collection of the SQL Processor optional features.
     * 
     * @return the collection of the SQL Processor optional features
     */
    public Map<String, String> getFeatures() {
        return features;
    }
}
