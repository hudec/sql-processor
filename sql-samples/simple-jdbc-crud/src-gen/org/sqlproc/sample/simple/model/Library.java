package org.sqlproc.sample.simple.model;
  
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Library implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
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
  
  private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    
  public List<Subscriber> getSubscribers() {
    return subscribers;
  }
    
  public void setSubscribers(List<Subscriber> subscribers) {
    this.subscribers = subscribers;
  }
    
  public Library _setSubscribers(List<Subscriber> subscribers) {
    this.subscribers = subscribers;
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
  
  public String toStringFull() {
    return "Library [id=" + id + ", name=" + name + "]";
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public enum Attribute {
    id, name
  }
  
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public Boolean isNull(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isNull(Attribute attribute) {
    if (attribute == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public void clearAllNull() {
    nullValues = new HashSet<String>();
  }
}
