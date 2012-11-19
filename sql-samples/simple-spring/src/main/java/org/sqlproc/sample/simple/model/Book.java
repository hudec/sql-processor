package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class Book extends Media {

    private String isbn;

    public Book() {
    }

    public Book(String title, String isbn) {
        super(title);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", getId()=" + getId() + ", getTitle()=" + getTitle() + "]";
    }
}
