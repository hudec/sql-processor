package org.sqlproc.sample.simple.model;
  
import java.util.List;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;
import java.util.ArrayList;

public class Library extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
	
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
  
  private Integer version = 0;
    
  public Integer getVersion() {
    return version;
  }
    
  public void setVersion(Integer version) {
    this.version = version;
  }
    
  public Library _setVersion(Integer version) {
    this.version = version;
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
  
  private List<PhysicalMedia> catalog = new ArrayList<PhysicalMedia>();
    
  public List<PhysicalMedia> getCatalog() {
    return catalog;
  }
    
  public void setCatalog(List<PhysicalMedia> catalog) {
    this.catalog = catalog;
  }
    
  public Library _setCatalog(List<PhysicalMedia> catalog) {
    this.catalog = catalog;
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
    catalog, subscribers
  }
  
  @Override
  public String toString() {
    return "Library [id=" + id + ", name=" + name + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Library [id=" + id + ", name=" + name + ", version=" + version + "]";
  }
}
