package org.sqlproc.sample.simple.model;

public abstract class Media {
	
  public Media() {
  }
  
  public Media(String title) {
    this.title = title;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Media _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String title;
    
  public String getTitle() {
    return title;
  }
    
  public void setTitle(String title) {
    this.title = title;
  }
    
  public Media _setTitle(String title) {
    this.title = title;
    return this;
  }
  
  @Override
  public String toString() {
      return "Media [id=" + id + ", title=" + title + "]";
  }
}
