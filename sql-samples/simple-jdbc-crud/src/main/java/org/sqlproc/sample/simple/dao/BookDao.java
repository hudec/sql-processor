package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.NewBook;

public class BookDao extends BaseDao {

    public BookDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public NewBook insertBook(NewBook book) {
        SqlCrudEngine sqlInsertMedia = getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertBook = getCrudEngine("INSERT_NEW_BOOK");
        int count = sqlInsertMedia.insert(session, book);
        if (count > 0) {
            sqlInsertBook.insert(session, book);
        }
        logger.info("insert book: " + count + ": " + book);
        return (count > 0) ? book : null;
    }

    public NewBook getBook(NewBook book) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_NEW_BOOK");
        NewBook b = sqlEngine.get(session, NewBook.class, book);
        logger.info("get book: " + b);
        return b;
    }

    public NewBook updateBook(NewBook book) {
        SqlCrudEngine sqlEngineBook = getCrudEngine("UPDATE_NEW_BOOK");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("UPDATE_MEDIA");
        int count = sqlEngineBook.update(session, book);
        if (count > 0) {
            sqlEngineMedia.update(session, book);
        }
        logger.info("update book: " + count);
        return (count > 0) ? book : null;
    }

    public boolean deleteBook(NewBook book) {
        SqlCrudEngine sqlEngineBook = getCrudEngine("DELETE_NEW_BOOK");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("DELETE_MEDIA");
        int count = sqlEngineBook.delete(session, book);
        logger.info("delete book: " + count);
        if (count > 0)
            sqlEngineMedia.delete(session, book);
        return (count > 0);
    }
}
