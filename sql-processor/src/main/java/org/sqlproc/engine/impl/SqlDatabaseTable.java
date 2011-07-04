package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element. It represents the name of a database table, which is a text without any semantic value for a
 * META SQL generation.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlDatabaseTable implements SqlMetaSimple {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The name of a database table.
     */
    private String name;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param name
     *            the name of a database table
     */
    SqlDatabaseTable(String sql) {
        this.name = sql;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        return new SqlProcessResult(name);
    }
}
