package org.sqlproc.sample.simple.model;

import java.io.Serializable;

public class Performer implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
	
  public Performer() {
  }
  
  public Performer(Long personId, Integer ver) {
    this.personId = personId;
    this.ver = ver;
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
  
  private Long personId;
    
  public Long getPersonId() {
    return personId;
  }
    
  public void setPersonId(Long personId) {
    this.personId = personId;
  }
    
  public Performer _setPersonId(Long personId) {
    this.personId = personId;
    return this;
  }
  
  private Integer ver;
    
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
  
  @Override
  public String toString() {
    return "Performer [id=" + id + ", personId=" + personId + ", ver=" + ver + "]";
  }
  
  public String toStringFull() {
    return "Performer [id=" + id + ", personId=" + personId + ", ver=" + ver + "]";
  }
}
