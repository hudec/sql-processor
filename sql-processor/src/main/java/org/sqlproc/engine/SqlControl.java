package org.sqlproc.engine;

import java.util.Map;

/**
 * The compound parameters controlling the META SQL execution.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlControl {

    /**
     * Returns the max SQL execution time. This parameter can help to protect production system against ineffective SQL
     * query commands. The value is in milliseconds.
     */
    public int getMaxTimeout();

    /**
     * Returns the first SQL execution output row to be returned in the case we need to skip some rows in the result
     * set. The primary usage is to support the pagination.
     */
    public int getFirstResult();

    /**
     * Returns the max number of SQL execution output rows, which can be returned in the result list. The primary usage
     * is to support the pagination.
     */
    public int getMaxResults();

    /**
     * Returns the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering
     * rule in this chain should correspond to one META SQL ordering statement.
     */
    public SqlOrder getOrder();

    /**
     * Returns more result classes used for the return values, like the collections classes or the collections items.
     * They are used mainly for the one-to-one, one-to-many and many-to-many associations.
     */
    public Map<String, Class<?>> getMoreResultClasses();
}
