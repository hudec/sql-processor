package org.sqlproc.sample.simple.model2;

public class Book2 extends Media2 {
	
  public Book2() {
  }
  
  public Book2(String title, String isbn) {
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
