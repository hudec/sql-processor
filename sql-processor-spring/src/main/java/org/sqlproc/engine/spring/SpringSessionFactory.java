package org.sqlproc.engine.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

/**
 * The simple implementation of the factory {@link SqlSessionFactory} for the Spring stack.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SpringSessionFactory implements SqlSessionFactory {

    /**
     * The Spring JdbcTemplate, the central class for all Spring database operations.
     */
    private JdbcTemplate jdbcTemplate;

    /**
     * The name of the database related to this session. It's usage is implementation specific.
     */
    private String name;

    /**
     * Creates a new instance.
     * 
     * @param jdbcTemplate
     *            the Spring JdbcTemplate
     */
    public SpringSessionFactory(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Creates a new instance.
     * 
     * @param jdbcTemplate
     *            the Spring JdbcTemplate
     * @param name
     *            the name of the database related to this session
     */
    public SpringSessionFactory(JdbcTemplate jdbcTemplate, String name) {
        super();
        this.jdbcTemplate = jdbcTemplate;
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSession getSqlSession() {
        return new SpringSimpleSession(jdbcTemplate, name);
    }
}
