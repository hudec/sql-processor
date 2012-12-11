package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Library;

public class LibraryDao extends BaseDao {

    public LibraryDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Library insertLibrary(Library library) {
        SqlCrudEngine sqlInsertLibrary = getCrudEngine("INSERT_LIBRARY");
        int count = sqlInsertLibrary.insert(session, library);
        logger.info("insert library: " + count + ": " + library);
        return (count > 0) ? library : null;
    }

    public Library getLibrary(Library library) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_LIBRARY");
        Library l = sqlEngine.get(session, Library.class, library);
        logger.info("get library: " + l);
        return l;
    }

    public Library updateLibrary(Library library) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_LIBRARY");
        int count = sqlEngine.update(session, library);
        logger.info("update library: " + count);
        return (count > 0) ? library : null;
    }

    public boolean deleteLibrary(Library library) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_LIBRARY");
        int count = sqlEngine.delete(session, library);
        logger.info("delete library: " + count);
        return (count > 0);
    }
}
