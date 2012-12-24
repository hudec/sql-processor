package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.Movie;

public class MovieDao extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Movie insertMovie(Movie movie) {
        SqlCrudEngine sqlInsertMedia = getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertMovie = getCrudEngine("INSERT_MOVIE");
        int count = sqlInsertMedia.insert(getSqlSession(), movie);
        if (count > 0) {
            sqlInsertMovie.insert(getSqlSession(), movie);
        }
        logger.info("insert movie: " + count + ": " + movie);
        return (count > 0) ? movie : null;
    }

    public Movie getMovie(Movie movie) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_MOVIE");
        Movie m = sqlEngine.get(getSqlSession(), Movie.class, movie);
        logger.info("get movie: " + m + " for " + movie);
        return m;
    }

    public Movie updateMovie(Movie movie) {
        SqlCrudEngine sqlEngineBook = getCrudEngine("UPDATE_MOVIE");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("UPDATE_MEDIA");
        int count = sqlEngineBook.update(getSqlSession(), movie);
        if (count > 0) {
            sqlEngineMedia.update(getSqlSession(), movie);
        }
        logger.info("update movie: " + count);
        return (count > 0) ? movie : null;
    }

    public boolean deleteMovie(Movie movie) {
        SqlCrudEngine sqlEngineMovie = getCrudEngine("DELETE_MOVIE");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("DELETE_MEDIA");
        int count = sqlEngineMovie.delete(getSqlSession(), movie);
        logger.info("delete movie: " + count);
        if (count > 0)
            sqlEngineMedia.delete(getSqlSession(), movie);
        return (count > 0);
    }

}
