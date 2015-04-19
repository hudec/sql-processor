package org.sqlproc.engine;

import org.sqlproc.engine.annotation.Beta;

/**
 * A callback to be used with the cursor based queries.
 * 
 * <p>
 * {@link #processRow} will be called for each database row that is read, and should return {@code false} when you want
 * to stop processing. It is utilized by
 * {@link SqlQueryEngine#query(SqlSession, Class, Object, SqlControl, SqlRowProcessor)}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@Beta
public interface SqlRowProcessor<E> {

    /**
     * This method will be called once for database row.
     *
     * @param result
     *            The result class instance. The object representation of the database row.
     * @param rownum
     *            The database row number starting from 1.
     * @return True to continue processing, false to stop.
     */
    boolean processRow(E result, int rownum) throws SqlRuntimeException;
}
