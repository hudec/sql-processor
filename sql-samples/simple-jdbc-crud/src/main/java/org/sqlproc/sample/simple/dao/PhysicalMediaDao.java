package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.PhysicalMedia;

public class PhysicalMediaDao extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public PhysicalMedia insertPhysicalMedia(PhysicalMedia physicalMedia) {
        SqlCrudEngine sqlEngine = getCrudEngine("INSERT_PHYSICAL_MEDIA");
        int count = sqlEngine.insert(getSqlSession(), physicalMedia);
        logger.info("insert physicalMedia: " + count + ": " + physicalMedia);
        return (count > 0) ? physicalMedia : null;
    }

    public PhysicalMedia getPhysicalMedia(PhysicalMedia physicalMedia) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PHYSICAL_MEDIA");
        Map<String, Class<?>> moreResultClasses = null;
        if (physicalMedia.toInit(PhysicalMedia.Association.media)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("book", NewBook.class);
            moreResultClasses.put("movie", Movie.class);
        }
        PhysicalMedia m = sqlEngine.get(getSqlSession(), PhysicalMedia.class, physicalMedia, null, moreResultClasses);
        logger.info("get physicalMedia: " + m + " for " + physicalMedia);
        return m;
    }

    public PhysicalMedia updatePhysicalMedia(PhysicalMedia physicalMedia) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PHYSICAL_MEDIA");
        int count = sqlEngine.update(getSqlSession(), physicalMedia);
        if (count > 0) {
            sqlEngine.update(getSqlSession(), physicalMedia);
        }
        logger.info("update physicalMedia: " + count);
        return (count > 0) ? physicalMedia : null;
    }

    public boolean deletePhysicalMedia(PhysicalMedia physicalMedia) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PHYSICAL_MEDIA");
        int count = sqlEngine.delete(getSqlSession(), physicalMedia);
        logger.info("delete physicalMedia: " + count);
        return (count > 0);
    }
}
