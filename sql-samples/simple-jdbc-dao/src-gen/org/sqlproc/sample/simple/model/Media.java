package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class Media extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_AUTHOR = 2;
	
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
  
  private Performer author;
    
  public Performer getAuthor() {
    return author;
  }
    
  public void setAuthor(Performer author) {
    this.author = author;
  }
    
  public Media _setAuthor(Performer author) {
    this.author = author;
    return this;
  }
  
  private Integer version = 0;
    
  public Integer getVersion() {
    return version;
  }
    
  public void setVersion(Integer version) {
    this.version = version;
  }
    
  public Media _setVersion(Integer version) {
    this.version = version;
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
    Media other = (Media) obj;
    if (!id.equals(other.id))
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id.hashCode();
    return result;
  }  
  
  public enum Association {
    author
  }
  
  public enum Attribute {
    author
  }
  
  @Override
  public String toString() {
    return "Media [id=" + id + ", title=" + title + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Media [id=" + id + ", author=" + author + ", title=" + title + ", version=" + version + "]";
  }
}
