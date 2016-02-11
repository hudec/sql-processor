package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public class Performer extends BaseModelImpl implements Serializable {
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
  
  private Integer ver = 0;
  
  public Integer getVer() {
    return this.ver;
  }
  
  public void setVer(final Integer ver) {
    this.ver = ver;
  }
  
  public Performer _setVer(final Integer ver) {
    this.ver = ver;
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
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("Performer");
    if (id != null)
    	result.append("@").append("id");
    if (person != null)
    	result.append("@").append("{").append(person.getProcessingIdForAttributes()).append("}");
    if (ver != null)
    	result.append("@").append("ver");
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
    return "Performer [id=" + id + ", ver=" + ver + "]";
  }
  
  public String toStringFull() {
    return "Performer [id=" + id + ", person=" + person + ", ver=" + ver + ", work=" + work + "]";
  }
  
  public enum Association {
    person,
    
    work;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
  public void setInit(final Performer.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Performer _setInit(final Performer.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Performer.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Performer _clearInit(final Performer.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Performer _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Performer _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Performer.Association association) {
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
  
  public StringBuilder getProcessingIdForAssociations() {
    if (initAssociations == null || initAssociations.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("ASSOC");
    for (Association association : Association.values()) {
    	if (initAssociations.contains(association.name()))
    		result.append("@").append(association.name());
    }
    return result;
  }
  
  public String getProcessingId(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes();
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations();
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
