package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public class Library implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_LIBRARY_ID = "LIBRARY_ID";
  
  public Library() {
  }
  
  public Library(final String name) {
    super();
    setName(name);
  }
  
  private Long libraryId;
  
  public Long getLibraryId() {
    return this.libraryId;
  }
  
  public void setLibraryId(final Long libraryId) {
    this.libraryId = libraryId;
  }
  
  public Library withLibraryId(final Long libraryId) {
    this.libraryId = libraryId;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public Library withName(final String name) {
    this.name = name;
    return this;
  }
  
  private List<Subscriber> subscribers = new java.util.ArrayList<Subscriber>();
  
  public List<Subscriber> getSubscribers() {
    return this.subscribers;
  }
  
  public void setSubscribers(final List<Subscriber> subscribers) {
    this.subscribers = subscribers;
  }
  
  public Library withSubscribers(final List<Subscriber> subscribers) {
    this.subscribers = subscribers;
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
    Library other = (Library) obj;
    if (libraryId == null || !libraryId.equals(other.libraryId))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(libraryId);
  }
  
  @Override
  public String toString() {
    return "Library [libraryId=" + libraryId + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Library [libraryId=" + libraryId + ", name=" + name + ", subscribers=" + subscribers + "]";
  }
}
