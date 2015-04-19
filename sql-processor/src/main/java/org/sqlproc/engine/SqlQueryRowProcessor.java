package org.sqlproc.engine;

import org.sqlproc.engine.annotation.Beta;

/**
 * A low level callback to be used with the cursor based queries.
 * 
 * <p>
 * {@link #processRow} will be called for each database row that is read, and should return {@code false} when you want
 * to stop processing. It is utilized by {@link SqlQuery#query(SqlRuntimeContext, SqlQueryRowProcessor)}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@Beta
public interface SqlQueryRowProcessor {

    /**
     * This method will be called once for database row.
     *
     * @param resultRow
     *            The object representation of the database row.
     * @param rownum
     *            The database row number starting from 1.
     * @return True to continue processing, false to stop.
     */
    boolean processRow(Object resultRow, int rownum) throws SqlRuntimeException;
}
