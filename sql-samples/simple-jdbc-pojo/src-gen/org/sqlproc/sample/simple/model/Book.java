package org.sqlproc.sample.simple.model;

public class Book extends Media {
	
  public Book() {
  }
  
  public Book(String title, String isbn) {
  setTitle(title);
  setIsbn(isbn);
  }
  
  private String isbn;
    
  public String getIsbn() {
    return isbn;
  }
    
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
