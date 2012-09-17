package org.sqlproc.sample.simple.model;
  
import java.io.Serializable;

public class Book extends Media implements Serializable {
	
  public Book() {
  }
  
  public Book(String title, String isbn) {
    super(title);
    this.isbn = isbn;
  }
  
  private String isbn;
    
  public String getIsbn() {
    return isbn;
  }
    
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
    
  public Book _setIsbn(String isbn) {
    this.isbn = isbn;
    return this;
  }
  
  @Override
  public String toString() {
    return "Book [isbn=" + isbn + super.toString() + "]";
  }
}
