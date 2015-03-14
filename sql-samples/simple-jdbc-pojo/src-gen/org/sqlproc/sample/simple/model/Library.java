package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public class Library implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public Library() {
  }
  
  public Library(final String name) {
    super();
    setName(name);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Library _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public Library _setName(final String name) {
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
  
  public Library _setSubscribers(final List<Subscriber> subscribers) {
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
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id != null) ? id.hashCode() : 0);
    return result;
  }
  
  @Override
  public String toString() {
    return "Library [id=" + id + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Library [id=" + id + ", name=" + name + ", subscribers=" + subscribers + "]";
  }
}
