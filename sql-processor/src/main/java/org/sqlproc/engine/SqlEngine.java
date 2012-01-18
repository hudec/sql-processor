package org.sqlproc.engine;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.impl.SqlEmptyMonitor;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * Common ancestor for {@link SqlQueryEngine} and {@link SqlCrudEngine}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlEngine {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Name of the META SQL query or statement, which uniquely identifies this instance.
     */
    protected String name;

    /**
     * The pre-compiled META SQL query or statement. The META SQL is an ANSI SQL extension using the ANTLR defined
     * grammar.
     */
    protected SqlMetaStatement statement;

    /**
     * The pre-compiled mapping rule, which is an SQL execution result to Java output classes mapping prescription.
     */
    protected SqlMappingRule mapping;

    /**
     * Configuration of the SQL Processor using map of features. Optional features can alter the SQL Processor runtime
     * behavior.
     */
    protected Map<String, Object> features = new HashMap<String, Object>();

    /**
     * Monitor for the runtime statistics gathering.
     */
    protected SqlMonitor monitor;

    /**
     * The factory for the META types construction. The META type defines the mapping between a Java class type and a
     * JDBC datatype. For the default META type factory, please see {@link org.sqlproc.engine.jdbc.type.JdbcTypeFactory}
     * .
     */
    protected SqlTypeFactory typeFactory;

    /**
     * The factory for the SQL Processor plugins. This is the basic facility to alter the SQL Processor processing.
     */
    protected SqlPluginFactory pluginFactory;

    /**
     * Creates a new instance of the SqlEngine from one META SQL statement and one SQL Mapping rule instance. Both
     * parameters are already pre-compiled instances using the ANTLR parsers. This is the recommended usage for the
     * runtime performance optimization. This constructor is devoted to be used from the {@link SqlProcessorLoader} or
     * {@link SqlEngineLoader}, which are able to read all statements definitions from an external meta statements file
     * and create the named SqlEngine instances. Also an external SQL Monitor for the runtime statistics gathering can
     * be engaged.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL statement
     * @param mapping
     *            the pre-compiled SQL mapping rule
     * @param monitor
     *            the SQL Monitor for the runtime statistics gathering
     * @param features
     *            the optional SQL Processor features
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    public SqlEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) {
        this.name = name;
        this.statement = statement;
        this.mapping = mapping;
        this.features = (features != null) ? features : new HashMap<String, Object>();
        this.monitor = (monitor != null) ? monitor : new SqlEmptyMonitor();
        this.typeFactory = typeFactory;
        this.pluginFactory = pluginFactory;
    }

}
