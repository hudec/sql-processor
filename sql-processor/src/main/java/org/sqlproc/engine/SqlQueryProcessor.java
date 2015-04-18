package org.sqlproc.engine;

public interface SqlQueryProcessor {

    boolean processRow(Object resultRow, int rownum) throws SqlRuntimeException;
}
