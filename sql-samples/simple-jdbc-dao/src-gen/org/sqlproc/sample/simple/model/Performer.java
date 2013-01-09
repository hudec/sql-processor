package org.sqlproc.sample.simple.model;
  
import java.util.List;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;
import java.util.ArrayList;

public class Performer extends BaseModelImpl implements Serializable {
  
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
  
  private Integer ver = 0;
    
  public Integer getVer() {
    return ver;
  }
    
  public void setVer(Integer ver) {
    this.ver = ver;
  }
    
  public Performer _setVer(Integer ver) {
    this.ver = ver;
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
    work, person
  }
  
  @Override
  public String toString() {
    return "Performer [id=" + id + ", ver=" + ver + "]";
  }
  
  public String toStringFull() {
    return "Performer [id=" + id + ", person=" + person + ", ver=" + ver + "]";
  }
}
