package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Movie;

public class MovieDao extends BaseDao {

    public MovieDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Movie insertMovie(Movie movie) {
        SqlCrudEngine sqlInsertMedia = getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertMovie = getCrudEngine("INSERT_MOVIE");
        int count = sqlInsertMedia.insert(session, movie);
        if (count > 0) {
            sqlInsertMovie.insert(session, movie);
        }
        logger.info("insert movie: " + count + ": " + movie);
        return (count > 0) ? movie : null;
    }

    public Movie getMovie(Movie movie) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_MOVIE");
        Movie m = sqlEngine.get(session, Movie.class, movie);
        logger.info("get movie: " + m);
        return m;
    }

    public Movie updateMovie(Movie movie) {
        SqlCrudEngine sqlEngineBook = getCrudEngine("UPDATE_MOVIE");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("UPDATE_MEDIA");
        int count = sqlEngineBook.update(session, movie);
        if (count > 0) {
            sqlEngineMedia.update(session, movie);
        }
        logger.info("update movie: " + count);
        return (count > 0) ? movie : null;
    }

    public boolean deleteMovie(Movie movie) {
        SqlCrudEngine sqlEngineMovie = getCrudEngine("DELETE_MOVIE");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("DELETE_MEDIA");
        int count = sqlEngineMovie.delete(session, movie);
        logger.info("delete movie: " + count);
        if (count > 0)
            sqlEngineMedia.delete(session, movie);
        return (count > 0);
    }

}
