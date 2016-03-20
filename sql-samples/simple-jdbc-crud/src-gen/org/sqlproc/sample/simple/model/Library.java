package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.PhysicalMedia;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public class Library implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
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
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("Library");
    if (id != null)
    	result.append("@").append("id");
    if (name != null)
    	result.append("@").append("name");
    return result;
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
    return java.util.Objects.hash(id);
  }
  
  @Override
  public String toString() {
    return "Library [id=" + id + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Library [id=" + id + ", name=" + name + ", catalog=" + catalog + ", subscribers=" + subscribers + "]";
  }
  
  public enum Association {
    catalog,
    
    subscribers;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Library.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Library _setInit_(final Library.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Library.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Library _clearInit_(final Library.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Library _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Library _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Library.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association.name());
  }
  
  public Boolean toInit_(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association);
  }
  
  public void clearAllInit_() {
    initAssociations_ = new java.util.HashSet<String>();
  }
  
  public StringBuilder getProcessingIdForAssociations_() {
    if (initAssociations_ == null || initAssociations_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("ASSOC");
    for (Association association : Association.values()) {
    	if (initAssociations_.contains(association.name()))
    		result.append("@").append(association.name());
    }
    return result;
  }
  
  public String getProcessingId_(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes_();
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations_();
    if (processingIdForAssociations != null)
    	result.append(",").append(processingIdForAssociations);
    if (moreAttributes != null && moreAttributes.length > 0) {
    	result.append(",MORE");
    	for (String moreAttr : moreAttributes)
    		result.append("@").append(moreAttr);
    }
    return result.toString();
  }
}
