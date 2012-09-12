package org.sqlproc.sample.simple.model2;

public abstract class Media2 {
	
  public Media2() {
  }
  
  public Media2(String title) {
  setTitle(title);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
  
  private String title;
    
  public String getTitle() {
    return title;
  }
    
  public void setTitle(String title) {
    this.title = title;
  }
}
