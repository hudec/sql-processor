package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element. It represents the name of a database column, which is a text without any semantic value for a
 * META SQL generation.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlDatabaseColumn implements SqlMetaSimple {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The name of a database column.
     */
    private String name;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param name
     *            the name of a database column
     */
    SqlDatabaseColumn(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        return new SqlProcessResult(ctx, name);
    }
}
