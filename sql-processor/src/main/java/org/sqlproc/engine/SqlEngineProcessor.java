package org.sqlproc.engine;

public interface SqlEngineProcessor<E> {

    boolean processResult(E result, int rownum) throws SqlRuntimeException;
}
