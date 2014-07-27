package org.sqlproc.engine;

import java.util.List;

import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.validation.SqlValidatorFactory;

/**
 * The helper class for the META SQL statements and mapping rules parsing. These statements and rules are taken from the
 * file repository based on the provided ANTLR grammar.<br>
 * 
 * This loader is a lazy one. All META SQL statements and mapping rules are initialized only in the case of they are
 * required.
 * 
 * More detailed javadoc can be find at {@link org.sqlproc.engine.SqlProcessorLoader}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessorLazyLoader extends SqlProcessorLoader {

    /**
     * Creates a new instance of the SqlProcessorLazyLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLazyLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory)
            throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, null, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLazyLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLazyLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory, String filter) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLazyLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLazyLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory, String filter, SqlMonitorFactory monitorFactory) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLazyLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLazyLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory, String filter, SqlMonitorFactory monitorFactory, String... onlyStatements) {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, null, onlyStatements);
    }

    /**
     * Creates a new instance of the SqlProcessorLazyLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLazyLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory, String filter, SqlMonitorFactory monitorFactory,
            List<SqlInternalType> customTypes, String... onlyStatements) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, null, customTypes, onlyStatements);
    }

    /**
     * Creates a new instance of the SqlProcessorLazyLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param validatorFactory
     *            the validator factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLazyLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory, String filter, SqlMonitorFactory monitorFactory,
            SqlValidatorFactory validatorFactory, List<SqlInternalType> customTypes, String... onlyStatements)
            throws SqlEngineException {
        super(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, validatorFactory, customTypes, true,
                onlyStatements);
    }
}
