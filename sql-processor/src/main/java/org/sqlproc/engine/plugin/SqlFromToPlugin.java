package org.sqlproc.engine.plugin;

import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlQuery;

/**
 * The SQL Processor plugin devoted to the FROM-TO SQL construction.
 * 
 * The primary usage is to support the pagination.
 * 
 * There are utilized the patterns from the {@link SqlFeature}. These pattern have to be combined with the original SQL
 * query, the limit and the offset in the next way:
 * <ul>
 * <li>$S is the full original query</li>
 * <li>$s is the original query without the token <code>select</code></li>
 * <li>$F is 1-based from rowid (=offset)</li>
 * <li>$f is 0-based from rowid (offset)</li>
 * <li>$M is the max number of returned rows</li>
 * <li>$m is the max rowid of returned rows</li>
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlFromToPlugin {

    /**
     * The characteristic of FROM and TO restrictions used in {@link SqlQuery#list()}.
     */
    public static class LimitType {
        public boolean alsoFirst;
        public boolean afterSql;
        public boolean maxBeforeFirst;
        public boolean zeroBasedFirst;
        public boolean rowidBasedMax;
    }

    /**
     * Used to construct the FROM-TO SQL.
     * 
     * @param queryString
     *            the original ANSI SQL
     * @param queryResult
     *            the final ANSI SQL reflected FROM and TO restrictions
     * @param firstResult
     *            The first SQL execution output row to be returned in the case we need to skip some rows in the result
     *            set. The primary usage is to support the pagination.
     * @param maxResults
     *            The max number of SQL execution output rows, which can be returned in the result list. The primary
     *            usage is to support the pagination.
     * @return the characteristic of FROM and TO restrictions used in {@link SqlQuery#list()}
     */
    public LimitType limitQuery(String queryString, StringBuilder queryResult, Integer firstResult, Integer maxResults);
}
