package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * Pre-compiled META SQL statements, output mappings and optional features (also known as the SQL Processor artifacts).
 * 
 * Instance of this class is created by the ANTLR parser. The grammar is defined in SqlProcessor.g.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessor {

    // TODO - better exception messages handling

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
     * The collection of the SQL Processor optional features in the statement context.
     */
    private Map<String, Map<String, Object>> statementsFeatures;
    /**
     * The collection of the SQL Processor optional features to be cleared in the statement context.
     */
    private Map<String, Set<String>> statementsFeaturesUnset;
    /**
     * The collection of the SQL Processor default optional features.
     */
    private Map<String, Object> defaultFeatures;
    /**
     * Only statements and rules with the names in this set are picked up from the statements' repository.
     */
    private Set<String> onlyStatements;
    /**
     * The collection of all artifacts to enable duplicity control.
     */
    private Set<String> allArtifactsNames;
    /**
     * The list of all warnings.
     */
    private List<String> warnings;
    /**
     * The list of all errors.
     */
    private List<ErrorMsg> errors;

    /**
     * Simple factory method (design pattern). The new instance is created from the String input by the ANTLR parser.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param defaultFeatures
     *            the default features based on {@link SqlFeature}
     * @param onlyStatements
     *            only the statements and rules with the names in this set are picked up from the statements' repository
     * @param filters
     *            only the artifacts without active filters and the artifacts with the active filter from this
     *            collections are picked up from the statements' repository
     * @return new container of pre-compiled META SQL queries/statements/output mappings
     * @throws SqlEngineException
     *             in the case of ANTLR parsing exception
     */
    public static SqlProcessor getInstance(StringBuilder sbStatements, SqlTypeFactory typeFactory,
            Map<String, Object> defaultFeatures, Set<String> onlyStatements, String... filters)
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
                processor = parser.parse2(typeFactory, defaultFeatures, onlyStatements, filters);
            } catch (RecognitionException ex) {
                ex.printStackTrace();
            }
            if (!lexer.getErrors().isEmpty() || !parser.getErrors().isEmpty() || !processor.getErrors().isEmpty()) {
                throw new SqlEngineException("Statement error for '" + sbStatements + "'", lexer.getErrors(),
                        parser.getErrors(), processor.getErrors());
            }
            return processor;
        } finally {
            if (logger.isTraceEnabled()) {
                if (processor != null) {
                    logger.trace("<< getInstance, queries=" + processor.getMetaStatements(StatementType.QRY));
                    logger.trace("<< getInstance, cruds=" + processor.getMetaStatements(StatementType.CRUD));
                    logger.trace("<< getInstance, calls=" + processor.getMetaStatements(StatementType.CALL));
                    logger.trace("<< getInstance, input mappings=" + processor.getMappingRules(MappingType.IN));
                    logger.trace("<< getInstance, output mappings=" + processor.getMappingRules(MappingType.OUT));
                    logger.trace("<< getInstance, features=" + processor.getFeatures());
                }
            }
        }
    }

    /**
     * Creates a new instance.
     */
    SqlProcessor(Map<String, Object> defaultFeatures, Set<String> onlyStatements) {
        metaStatements = new LinkedHashMap<String, Map<String, SqlMetaStatement>>();
        for (StatementType type : StatementType.values())
            metaStatements.put(type.name(), new LinkedHashMap<String, SqlMetaStatement>());
        mappingRules = new LinkedHashMap<String, Map<String, SqlMappingRule>>();
        for (MappingType type : MappingType.values())
            mappingRules.put(type.name(), new LinkedHashMap<String, SqlMappingRule>());
        this.defaultFeatures = defaultFeatures;
        features = new LinkedHashMap<String, Object>();
        features.putAll(defaultFeatures);
        statementsFeatures = new HashMap<String, Map<String, Object>>();
        statementsFeaturesUnset = new HashMap<String, Set<String>>();
        if (onlyStatements != null && !onlyStatements.isEmpty())
            this.onlyStatements = onlyStatements;
        allArtifactsNames = new HashSet<String>();
        warnings = new ArrayList<String>();
        errors = new ArrayList<ErrorMsg>();
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
     *            the String representation of the META SQL statement type
     * 
     * @return the collection of the META SQL statements
     */
    public Map<String, SqlMetaStatement> getMetaStatements(String type) {
        StatementType.valueOf(type);
        return metaStatements.get(type);
    }

    /**
     * Adds a new META SQL statement. It's used internally by the ANTLR parser.
     * 
     * @param type
     *            the String representation of the META SQL statement type
     * @param name
     *            the name of the META SQL statement
     * @param statement
     *            the META SQL statement
     * @param errors
     *            the list of potential errors created during the ANTLR based parsing
     * @param activeFilters
     *            the active filters from the META SQL statement definition
     * @param filters
     *            only the artifacts without active filters and the artifacts with the active filter from this
     *            collections are taken into this instance of the SQL Processor
     * @return the indicator this statement was taken into this instance of the SQL Processor
     */
    boolean addMetaStatement(String type, String name, SqlMetaStatement statement, List<ErrorMsg> errors,
            List<String> activeFilters, String... filters) {
        StatementType.valueOf(type);
        if (nameControl(onlyStatements, name)) {
            addWarnings(errors);
            return false;
        }
        if (errors != null && !errors.isEmpty()) {
            this.errors.addAll(errors);
            return false;
        }
        List<String> filteredActiveFilters = filterActiveFilters(activeFilters);
        FilterStatus status = filtersControl(filters, filteredActiveFilters);
        if (status == FilterStatus.NOK) {
            return false;
        }
        Map<String, SqlMetaStatement> statements = getMetaStatements(type);
        if (status == FilterStatus.OK_LOWER) {
            if (statements.containsKey(name)) {
                warnings.add("The artifact " + uniqueArtifactName(type, name, filteredActiveFilters)
                        + " is already defined, the first definition is used.");
                return false;
            } else {
                statements.put(name, statement);
                loadStatementFeatures(name, activeFilters);
                return true;
            }
        } else {
            duplicityControl(type, name, filteredActiveFilters);
            statements.put(name, statement);
            loadStatementFeatures(name, activeFilters);
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
     *            the String representation of the input/output mapping rule type
     * 
     * @return the collection of the output value mappings
     */
    public Map<String, SqlMappingRule> getMappingRules(String type) {
        MappingType.valueOf(type);
        return mappingRules.get(type);
    }

    /**
     * Adds a new output value mapping. It's used internally by the ANTLR parser.
     * 
     * @param type
     *            the String representation of the output value mapping type
     * @param name
     *            the name of the output value mapping
     * @param mapping
     *            the output value mapping
     * @param errors
     *            the list of potential errors created during the ANTLR based parsing
     * @param activeFilters
     *            the active filters from the output value mapping definition
     * @param filters
     *            only the artifacts without active filters and the artifacts with the active filter from this
     *            collections are taken into this instance of the SQL Processor
     * @return the indicator this output value mapping was taken into this instance of the SQL Processor
     */
    public boolean addMappingRule(String type, String name, SqlMappingRule mapping, List<ErrorMsg> errors,
            List<String> activeFilters, String... filters) {
        MappingType.valueOf(type);
        if (nameControl(onlyStatements, name)) {
            addWarnings(errors);
            return false;
        }
        if (errors != null && !errors.isEmpty()) {
            this.errors.addAll(errors);
            return false;
        }
        List<String> filteredActiveFilters = filterActiveFilters(activeFilters);
        FilterStatus status = filtersControl(filters, filteredActiveFilters);
        if (status == FilterStatus.NOK) {
            return false;
        }
        Map<String, SqlMappingRule> mappings = getMappingRules(type);
        if (status == FilterStatus.OK_LOWER) {
            if (mappings.containsKey(name)) {
                warnings.add("The artifact " + uniqueArtifactName(type, name, filteredActiveFilters)
                        + " is already defined, the first definition is used.");
                return false;
            } else {
                mappings.put(name, mapping);
                return true;
            }
        } else {
            duplicityControl(type, name, filteredActiveFilters);
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

    /**
     * Returns the collection of the SQL Processor optional features in the statement context.
     * 
     * @return the collection of the SQL Processor optional features in the statement context
     */
    public Map<String, Map<String, Object>> getStatementsFeatures() {
        return statementsFeatures;
    }

    /**
     * Returns the collection of the SQL Processor optional features to be cleared in the statement context.
     * 
     * @return the collection of the SQL Processor optional features to be cleared in the statement context
     */
    public Map<String, Set<String>> getStatementsFeaturesUnset() {
        return statementsFeaturesUnset;
    }

    /**
     * Builds the correct class instance for the optional feature
     * 
     * @param type
     *            the type of the optional feature based on enumaration {@link FeatureType}
     * @param feature
     *            the String representation of the optional feature
     * @return the correct class instance for the optional feature
     */
    protected Object getFeature(String type, String feature) {
        FeatureType ftype = FeatureType.valueOf(type);
        if (ftype == FeatureType.LOPT) {
            return Long.parseLong(feature);
        } else if (ftype == FeatureType.IOPT) {
            return Integer.parseInt(feature);
        } else if (ftype == FeatureType.SOPT) {
            return Short.parseShort(feature);
        } else if (ftype == FeatureType.BOPT) {
            return Boolean.parseBoolean(feature);
        } else if (ftype == FeatureType.OPT) {
            return feature;
        }
        return null;
    }

    /**
     * Adds a new optional feature. It's used internally by the ANTLR parser.
     * 
     * @param type
     *            the String representation of the optional feature type
     * @param name
     *            the name of the optional feature
     * @param feature
     *            the optional feature
     * @param errors
     *            the list of potential errors created during the ANTLR based parsing
     * @param activeFilters
     *            the active filters from the optional feature definition
     * @param filters
     *            only the artifacts without active filters and the artifacts with the active filter from this
     *            collections are taken into this instance of the SQL Processor
     * @return the indicator this optional feature was taken into this instance of the SQL Processor
     */
    public boolean addFeature(String type, String name, String feature, List<ErrorMsg> errors,
            List<String> activeFilters, String... filters) {
        FeatureType.valueOf(type);
        if (errors != null && !errors.isEmpty()) {
            this.errors.addAll(errors);
            return false;
        }
        FilterStatus status = filtersControl(filters, activeFilters);
        if (status == FilterStatus.NOK) {
            return false;
        }
        if (status == FilterStatus.OK_LOWER) {
            if (getFeatures().containsKey(name)) {
                if (!defaultFeatures.containsKey(name)) {
                    warnings.add("The artifact " + uniqueArtifactName(type, name, activeFilters)
                            + " is already defined, the first definition is used.");
                    return false;
                } else {
                    defaultFeatures.remove(name);
                    getFeatures().put(name, getFeature(type, feature));
                    return true;
                }
            } else {
                getFeatures().put(name, getFeature(type, feature));
                return true;
            }
        } else {
            duplicityControl(type, name, activeFilters);
            getFeatures().put(name, getFeature(type, feature));
            return true;
        }
    }

    /**
     * Controls if the name of the artifact isn't already used.
     * 
     * @param type
     *            the String representation of the artifact type
     * @param name
     *            the name of the artifact
     * @param activeFilters
     *            the active filters from the artifact definition
     * @return the indicator of the potential duplicity
     */
    protected boolean duplicityControl(String type, String name, List<String> activeFilters) {
        String uniqueName = uniqueArtifactName(type, name, activeFilters);
        if (allArtifactsNames.contains(uniqueName)) {
            warnings.add("The artifact " + uniqueName + " is already defined, the latest definition is used.");
            return true;
        }
        allArtifactsNames.add(uniqueName);
        return false;
    }

    /**
     * Builds the unique artifact name.
     * 
     * @param type
     *            the String representation of the artifact type
     * @param name
     *            the name of the artifact
     * @param activeFilters
     *            the active filters from the artifact definition
     * @return the unique artifact name
     */
    protected String uniqueArtifactName(String type, String name, List<String> activeFilters) {
        return type + ":" + name
                + (((activeFilters) != null && !activeFilters.isEmpty()) ? activeFilters.toString() : "");
    }

    /**
     * Adds all parsing errors as warnings.
     * 
     * @param errors
     *            the list of potential errors created during the ANTLR based parsing
     */
    protected void addWarnings(List<ErrorMsg> errors) {
        if (errors == null || errors.isEmpty())
            return;
        for (ErrorMsg errorMsg : errors) {
            warnings.add(errorMsg.toString());
        }
    }

    /**
     * Returns the list of warnings, which can happen in the process of this instance creation and ALTLR parsing
     * 
     * @return the list of warnings
     */
    public List<String> getWarnings() {
        return warnings;
    }

    /**
     * Returns the list of error, which can happen in the process of this instance creation and ALTLR parsing
     * 
     * @return the list of errors
     */
    public List<ErrorMsg> getErrors() {
        return errors;
    }

    /**
     * This status is the result of the filters processing, based on the next rules: <br>
     * in the case there are no filters <br>
     * - there are activeFilters, the artifact is dead - NOK <br>
     * - otherwise the artifact is ok - OK <br>
     * in the case there are filters <br>
     * - there are no activeFilters, the artifact is ok, but lower priority - OK_LOWER <br>
     * - there are activeFilters, and the intersection is not empty, the artifact is ok - OK <br>
     * - there are activeFilters, and the intersection is empty, the artifact is dead - NOK
     */
    enum FilterStatus {
        /**
         * The related artifact won't be used
         */
        NOK,
        /**
         * The related artifact will be used, but with lower priority
         */
        OK_LOWER,
        /**
         * The related artifact will be used
         */
        OK
    }

    /**
     * Runs the business logic for the filters related to the artifact usability.
     * 
     * @param activeFilters
     *            the active filters from the artifact definition
     * @param filters
     *            only the artifacts without active filters and the artifacts with the active filter from this
     *            collections are taken into this instance of the SQL Processor
     * @return the status, which control the artifact usability
     */
    protected FilterStatus filtersControl(String[] filters, List<String> activeFilters) {
        if (filters == null || filters.length == 0) {
            if (activeFilters == null || activeFilters.isEmpty()) {
                return FilterStatus.OK;
            } else {
                return FilterStatus.NOK;
            }
        } else if (activeFilters == null || activeFilters.isEmpty()) {
            return FilterStatus.OK_LOWER;
        } else {
            List<String> commonList = new ArrayList<String>();
            for (String filter : filters) {
                if (activeFilters.contains(filter)) {
                    commonList.add(filter);
                }
            }
            return commonList.isEmpty() ? FilterStatus.NOK : FilterStatus.OK;
        }
    }

    /**
     * Controls, if the artifact name is listed in the provided container
     * 
     * @param onlyStatements
     *            only the statements and rules with the names in this set are picked up from the statements' repository
     * @param name
     *            the artifact name
     * @return the indicator if the artifact name is listed in the provided container
     */
    protected boolean nameControl(Set<String> onlyStatements, String name) {
        if (onlyStatements == null || onlyStatements.isEmpty())
            return false;
        return !onlyStatements.contains(name);
    }

    /**
     * Filter the active filters removing all values, which contain the character '='
     * 
     * @param activeFilters
     *            the active filters from the artifact definition
     * @return filtered active filters
     */
    private List<String> filterActiveFilters(List<String> activeFilters) {
        if (activeFilters == null)
            return null;
        List<String> filteredActiveFilters = new ArrayList<String>();
        for (String filter : activeFilters) {
            if (filter.indexOf('=') >= 0)
                continue;
            filteredActiveFilters.add(filter);
        }
        return filteredActiveFilters;
    }

    /**
     * Some filters can be the optional features in the statement context.
     * 
     * @param name
     *            the name of the META SQL statement
     * @param activeFilters
     *            the active filters from the META SQL statement definition
     */
    private void loadStatementFeatures(String name, List<String> activeFilters) {
        if (activeFilters == null)
            return;
        for (String filter : activeFilters) {
            int ix = filter.indexOf('=');
            if (ix <= 0)
                continue;
            String type = filter.substring(0, ix);
            if (!type.equals(FeatureType.OPT.name()) && !type.equals(FeatureType.IOPT.name())
                    && !type.equals(FeatureType.LOPT.name()) && !type.equals(FeatureType.BOPT.name())
                    && !type.equals(FeatureType.SOPT.name()))
                continue;
            filter = filter.substring(ix + 1);
            int ix2 = filter.indexOf('=');
            if (ix2 <= 0) {
                if (!getStatementsFeaturesUnset().containsKey(name))
                    getStatementsFeaturesUnset().put(name, new HashSet<String>());
                getStatementsFeaturesUnset().get(name).add(filter);
                continue;
            }
            String featureName = filter.substring(0, ix2);
            Object value = getFeature(type, filter.substring(ix2 + 1));
            if (value != null) {
                if (!getStatementsFeatures().containsKey(name))
                    getStatementsFeatures().put(name, new HashMap<String, Object>());
                getStatementsFeatures().get(name).put(featureName, value);
            }
        }
    }
}
