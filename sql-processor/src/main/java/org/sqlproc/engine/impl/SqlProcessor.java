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
     * All META SQL statements;
     */
    Map<String, SqlMetaStatement> statements;
    /**
     * All output value mappings.
     */
    Map<String, SqlMappingRule> mappingRules;

    /**
     * Simple factory method (design pattern). The new instance of precompiled META SQL is created from the String input
     * by the ANTLR parser.
     * 
     * @param sbStatements
     *            String representation of META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @return new container of pre-compiled META SQL queries/statements/output mappings
     * @throws SqlEngineException
     *             in the case of ANTLR parsing exception
     */
    public static SqlProcessor getInstance(StringBuilder sbStatements, SqlTypeFactory typeFactory)
            throws SqlEngineException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> getInstance, sStatements=" + sbStatements);
        }
        SqlProcessor processor = new SqlProcessor();
        try {
            SqlProcessorLexer lexer = new SqlProcessorLexer(new ANTLRStringStream(sbStatements.toString()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlProcessorParser parser = new SqlProcessorParser(tokens);
            try {
                parser.parse(typeFactory, processor.getStatements(), processor.getMappingRules());
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
                logger.trace("<< getInstance, statements=" + processor.getStatements());
            }
        }
    }

    /**
     * Creates a new instance.
     */
    SqlProcessor() {
        this.statements = new LinkedHashMap<String, SqlMetaStatement>();
        this.mappingRules = new LinkedHashMap<String, SqlMappingRule>();
    }

    public Map<String, SqlMetaStatement> getStatements() {
        return statements;
    }

    public Map<String, SqlMappingRule> getMappingRules() {
        return mappingRules;
    }
}
