package org.sqlproc.sample.simple.model;
  
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

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
  
  private List<PhysicalMedia> library = new ArrayList<PhysicalMedia>();
    
  public List<PhysicalMedia> getLibrary() {
    return library;
  }
    
  public void setLibrary(List<PhysicalMedia> library) {
    this.library = library;
  }
    
  public Library _setLibrary(List<PhysicalMedia> library) {
    this.library = library;
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
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public enum Association {
    library, subscribers
  }
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public Boolean toInit(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(attrName);
  }
  
  public Boolean toInit(Association association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "Library [id=" + id + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Library [id=" + id + ", name=" + name + "]";
  }
}
