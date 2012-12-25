package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Performer;

public class PerformerDao1 extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Performer insertPerformer(Performer performer) {
        SqlCrudEngine sqlInsertPerformer = getCrudEngine("INSERT_PERFORMER");
        int count = sqlInsertPerformer.insert(getSqlSession(), performer);
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
        Performer p = sqlEngine.get(getSqlSession(), Performer.class, performer, null, moreResultClasses);
        logger.info("get performer: " + p);
        return p;
    }

    public Performer updatePerformer(Performer performer) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PERFORMER");
        int count = sqlEngine.update(getSqlSession(), performer);
        logger.info("update performer: " + count);
        return (count > 0) ? performer : null;
    }

    public boolean deletePerformer(Performer performer) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PERFORMER");
        int count = sqlEngine.delete(getSqlSession(), performer);
        logger.info("delete: " + count);
        return (count > 0);
    }
}
