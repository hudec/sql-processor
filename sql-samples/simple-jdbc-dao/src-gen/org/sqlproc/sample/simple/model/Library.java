package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.PhysicalMedia;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public class Library extends BaseModelImpl implements Serializable {
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
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public Library _setVersion(final Integer version) {
    this.version = version;
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
  
  private List<PhysicalMedia> catalog = new java.util.ArrayList<PhysicalMedia>();
  
  public List<PhysicalMedia> getCatalog() {
    return this.catalog;
  }
  
  public void setCatalog(final List<PhysicalMedia> catalog) {
    this.catalog = catalog;
  }
  
  public Library _setCatalog(final List<PhysicalMedia> catalog) {
    this.catalog = catalog;
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
    return "Library [id=" + id + ", name=" + name + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Library [id=" + id + ", name=" + name + ", version=" + version + ", subscribers=" + subscribers + ", catalog=" + catalog + "]";
  }
  
  public enum Association {
    subscribers,
    
    catalog;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final Library.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Library _setInit(final Library.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Library.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Library _clearInit(final Library.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Library _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Library _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Library.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public Boolean toInit(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new java.util.HashSet<String>();
  }
}
