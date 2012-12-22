package org.sqlproc.sample.simple.model;
  
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class Performer implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_PERSON = 2;
	
  public Performer() {
  }
  
  public Performer(Person person) {
    this.person = person;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Performer _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private Person person;
    
  public Person getPerson() {
    return person;
  }
    
  public void setPerson(Person person) {
    this.person = person;
  }
    
  public Performer _setPerson(Person person) {
    this.person = person;
    return this;
  }
  
  private List<Media> work = new ArrayList<Media>();
    
  public List<Media> getWork() {
    return work;
  }
    
  public void setWork(List<Media> work) {
    this.work = work;
  }
    
  public Performer _setWork(List<Media> work) {
    this.work = work;
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
    Performer other = (Performer) obj;
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
    work, person
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
    return "Performer [id=" + id + "]";
  }
  
  public String toStringFull() {
    return "Performer [id=" + id + ", person=" + person + "]";
  }
}
