package org.sqlproc.sample.simple.model;
  
import java.io.Serializable;

public class Library implements Serializable {
	
  public Library() {
  }
  
  public Library(String name) {
    this.name = name;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Library _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
    
  public Library _setName(String name) {
    this.name = name;
    return this;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Library other = (Library) obj;
    if (id != other.id)
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }  
  
  @Override
  public String toString() {
    return "Library [id=" + id + ", name=" + name + "]";
  }
}
