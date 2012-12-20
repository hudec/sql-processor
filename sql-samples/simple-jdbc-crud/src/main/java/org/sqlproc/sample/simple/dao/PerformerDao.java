package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Performer;

public class PerformerDao extends BaseDao {

    public PerformerDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Performer insertPerformer(Performer performer) {
        SqlCrudEngine sqlInsertPerformer = getCrudEngine("INSERT_PERFORMER");
        int count = sqlInsertPerformer.insert(session, performer);
        logger.info("insert performer: " + count + ": " + performer);
        return (count > 0) ? performer : null;
    }

    public Performer getPerformer(Performer performer) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERFORMER");
        Map<String, Class<?>> moreResultClasses = null;
        if (performer.toInit(Performer.Association.work)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", NewBook.class);
        }
        Performer p = sqlEngine.get(session, Performer.class, performer, null, moreResultClasses);
        logger.info("get performer: " + p);
        return p;
    }

    public Performer updatePerformer(Performer performer) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PERFORMER");
        int count = sqlEngine.update(session, performer);
        logger.info("update performer: " + count);
        return (count > 0) ? performer : null;
    }

    public boolean deletePerformer(Performer performer) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PERFORMER");
        int count = sqlEngine.delete(session, performer);
        logger.info("delete: " + count);
        return (count > 0);
    }
}
