package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element. It represents a text without any semantic value for a META SQL generation.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaText implements SqlMetaSimple {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * An ANSI SQL fragment from META SQL.
     */
    private String sql;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param sql
     *            the ANSI SQL fragment from META SQL
     */
    SqlMetaText(String sql) {
        this.sql = sql;
    }

    /**
     * Returns an indicator that the text fragment is empty.
     * 
     * @return an indicator that the text fragment is empty
     */
    public boolean isWhite() {
        if (sql == null || sql.trim().length() == 0)
            return true;
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        return new SqlProcessResult(sql);
    }
}
