package org.sqlproc.engine.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The Spring stack implementation of the SQL Engine session contract. In fact it's a simple wrapper for the
 * {@link org.springframework.jdbc.core.JdbcTemplate}.
 * 
 * It's the first parameter to all primary methods in the {@link SqlQueryEngine} and {@link SqlCrudEngine}.
 * 
 * <p>
 * The primary contract is the method for the {@link SqlQuery} instance creation.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SpringSimpleSession implements SqlSession {

    /**
     * The Spring JdbcTemplate, the central class for all Spring database operations.
     */
    JdbcTemplate jdbcTemplate;

    /**
     * Creates a new instance.
     * 
     * @param jdbcTemplate
     *            the Spring JdbcTemplate instance
     */
    public SpringSimpleSession(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Returns the internal Spring JdbcTemplate instance.
     * 
     * @return the internal Spring JdbcTemplate instance
     */
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery createSqlQuery(String queryString) throws SqlProcessorException {
        return new SpringQuery(jdbcTemplate, queryString);
    }

}
