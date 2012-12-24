package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.Library;

public class LibraryDao extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Library insertLibrary(Library library) {
        SqlCrudEngine sqlInsertLibrary = getCrudEngine("INSERT_LIBRARY");
        int count = sqlInsertLibrary.insert(getSqlSession(), library);
        logger.info("insert library: " + count + ": " + library);
        return (count > 0) ? library : null;
    }

    public Library getLibrary(Library library) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_LIBRARY");
        Library l = sqlEngine.get(getSqlSession(), Library.class, library);
        logger.info("get library: " + l);
        return l;
    }

    public Library updateLibrary(Library library) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_LIBRARY");
        int count = sqlEngine.update(getSqlSession(), library);
        logger.info("update library: " + count);
        return (count > 0) ? library : null;
    }

    public boolean deleteLibrary(Library library) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_LIBRARY");
        int count = sqlEngine.delete(getSqlSession(), library);
        logger.info("delete library: " + count);
        return (count > 0);
    }
}
