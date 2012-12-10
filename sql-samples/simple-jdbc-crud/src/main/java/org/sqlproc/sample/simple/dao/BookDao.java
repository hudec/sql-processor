package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Book;

public class BookDao extends BaseDao {

    public BookDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Book insertBook(Book book) {
        SqlCrudEngine sqlInsertMedia = getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertBook = getCrudEngine("INSERT_BOOK");
        int count = sqlInsertMedia.insert(session, book);
        if (count > 0) {
            sqlInsertBook.insert(session, book);
        }
        logger.info("insert book: " + count + ": " + book);
        return (count > 0) ? book : null;
    }

    public Book getBook(Book book) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_BOOK");
        Book b = sqlEngine.get(session, Book.class, book);
        logger.info("get book: " + b);
        return b;
    }

    public Book updateBook(Book book) {
        SqlCrudEngine sqlEngineBook = getCrudEngine("UPDATE_BOOK");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("UPDATE_MEDIA");
        int count = sqlEngineBook.update(session, book);
        if (count > 0) {
            sqlEngineMedia.update(session, book);
        }
        logger.info("update book: " + count);
        return (count > 0) ? book : null;
    }

    public boolean deleteBook(Book book) {
        SqlCrudEngine sqlEngineBook = getCrudEngine("DELETE_BOOK");
        SqlCrudEngine sqlEngineMedia = getCrudEngine("DELETE_MEDIA");
        int count = sqlEngineBook.delete(session, book);
        logger.info("delete book: " + count);
        if (count > 0)
            sqlEngineMedia.delete(session, book);
        return (count > 0);
    }
}
