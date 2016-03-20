package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.Person;

@Pojo
@SuppressWarnings("all")
public class Performer implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_PERSON = "PERSON";
  
  public Performer() {
  }
  
  public Performer(final Person person) {
    super();
    setPerson(person);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Performer _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Person person;
  
  public Person getPerson() {
    return this.person;
  }
  
  public void setPerson(final Person person) {
    this.person = person;
  }
  
  public Performer _setPerson(final Person person) {
    this.person = person;
    return this;
  }
  
  private List<Media> work = new java.util.ArrayList<Media>();
  
  public List<Media> getWork() {
    return this.work;
  }
  
  public void setWork(final List<Media> work) {
    this.work = work;
  }
  
  public Performer _setWork(final List<Media> work) {
    this.work = work;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("Performer");
    if (id != null)
    	result.append("@").append("id");
    if (person != null)
    	result.append("@").append("{").append(person.getProcessingIdForAttributes_()).append("}");
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
    Performer other = (Performer) obj;
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
    return "Performer [id=" + id + "]";
  }
  
  public String toStringFull() {
    return "Performer [id=" + id + ", person=" + person + ", work=" + work + "]";
  }
  
  public enum Association {
    person,
    
    work;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Performer.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Performer _setInit_(final Performer.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Performer.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Performer _clearInit_(final Performer.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Performer _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Performer _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Performer.Association association) {
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
