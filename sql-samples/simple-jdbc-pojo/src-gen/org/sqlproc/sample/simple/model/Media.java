package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public abstract class Media implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public Media() {
  }
  
  public Media(final String title) {
    super();
    setTitle(title);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Media withId(final Long id) {
    this.id = id;
    return this;
  }
  
  private String title;
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(final String title) {
    this.title = title;
  }
  
  public Media withTitle(final String title) {
    this.title = title;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    Media other = (Media) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(id);
  }
  
  @Override
  public String toString() {
    return "Media [id=" + id + ", title=" + title + "]";
  }
  
  public String toStringFull() {
    return "Media [id=" + id + ", title=" + title + "]";
  }
}
