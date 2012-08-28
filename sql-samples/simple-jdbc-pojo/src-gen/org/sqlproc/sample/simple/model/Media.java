package org.sqlproc.sample.simple.model;

public abstract class Media {
	
  public Media() {
  }
  
  public Media(String title) {
  setTitle(title);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public Media setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String title;
    
  public String getTitle() {
    return title;
  }
    
  public Media setTitle(String title) {
    this.title = title;
    return this;
  }
}
