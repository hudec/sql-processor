package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Media;

@Pojo
@SuppressWarnings("all")
public class Book extends Media implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public Book() {
  }
  
  public Book(final String title, final String isbn) {
    super(title);
    setIsbn(isbn);
  }
  
  private String isbn;
  
  public String getIsbn() {
    return this.isbn;
  }
  
  public void setIsbn(final String isbn) {
    this.isbn = isbn;
  }
  
  public Book withIsbn(final String isbn) {
    this.isbn = isbn;
    return this;
  }
  
  @Override
  public String toString() {
    return "Book [isbn=" + isbn + "]";
  }
  
  public String toStringFull() {
    return "Book [isbn=" + isbn + "]";
  }
}
