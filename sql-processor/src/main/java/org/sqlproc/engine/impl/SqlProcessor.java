package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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

    // TODO - control duplicate statements
    // TODO - select based on input statements names

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
     * The mapping rule type.
     */
    public static enum FeatureType {
        /**
         * String option
         */
        OPT,
        /**
         * Long option
         */
        LOPT,
        /**
         * Integer option
         */
        IOPT,
        /**
         * Short option
         */
        SOPT,
        /**
         * Boolean option
         */
        BOPT
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
    private Map<String, Object> features;

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
        features = new LinkedHashMap<String, Object>();
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

    public boolean addMetaStatement(String type, String name, SqlMetaStatement statement, List<String> activeFilters,
            String... filters) {
        StatementType.valueOf(type);
        String[] commonFilters = commonFilters(filters, activeFilters);
        if (commonFilters == null) {
            return false;
        }
        Map<String, SqlMetaStatement> statements = getMetaStatements(type);
        if (commonFilters.length == 0) {
            if (statements.containsKey(name)) {
                return false;
            } else {
                statements.put(name, statement);
                return true;
            }
        } else {
            statements.put(name, statement);
            return true;
        }
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

    public boolean addMappingRule(String type, String name, SqlMappingRule mapping, List<String> activeFilters,
            String... filters) {
        MappingType.valueOf(type);
        String[] commonFilters = commonFilters(filters, activeFilters);
        if (commonFilters == null) {
            return false;
        }
        Map<String, SqlMappingRule> mappings = getMappingRules(type);
        if (commonFilters.length == 0) {
            if (mappings.containsKey(name)) {
                return false;
            } else {
                mappings.put(name, mapping);
                return true;
            }
        } else {
            mappings.put(name, mapping);
            return true;
        }
    }

    /**
     * Returns the collection of the SQL Processor optional features.
     * 
     * @return the collection of the SQL Processor optional features
     */
    public Map<String, Object> getFeatures() {
        return features;
    }

    private Object getFeature(String type, String feature) {
        FeatureType ftype = FeatureType.valueOf(type);
        if (ftype == FeatureType.LOPT) {
            return Long.parseLong(feature);
        } else if (ftype == FeatureType.IOPT) {
            return Integer.parseInt(feature);
        } else if (ftype == FeatureType.SOPT) {
            return Short.parseShort(feature);
        } else if (ftype == FeatureType.BOPT) {
            return Boolean.parseBoolean(feature);
        }
        return feature;
    }

    public boolean addFeature(String type, String name, String feature, List<String> activeFilters, String... filters) {
        FeatureType.valueOf(type);
        String[] commonFilters = commonFilters(filters, activeFilters);
        if (commonFilters == null) {
            return false;
        }
        if (commonFilters.length == 0) {
            if (getFeatures().containsKey(name)) {
                return false;
            } else {
                getFeatures().put(name, getFeature(type, feature));
                return true;
            }
        } else {
            getFeatures().put(name, getFeature(type, feature));
            return true;
        }
    }

    // in the case there are no filters
    // - there are filtersTokens, the artefact is dead
    // - otherwise the artefact is ok
    // in the case there are filters
    // - there are no filtersTokens, the artefact is ok, but lower priority
    // - there are filtersTokens, and the intersection is not empty, the artefact is ok
    String[] commonFilters(String[] filters, List<String> activeFilters) {
        if (filters == null || filters.length == 0) {
            if (activeFilters == null || activeFilters.isEmpty()) {
                return new String[] {};
            } else {
                return null;
            }
        } else if (activeFilters == null || activeFilters.isEmpty()) {
            return new String[] {};
        } else {
            List<String> commonList = new ArrayList<String>();
            for (String filter : filters) {
                if (activeFilters.contains(filter)) {
                    commonList.add(filter);
                }
            }
            return commonList.toArray(new String[0]);
        }
    }
}
