package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class PersonLibrary implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public PersonLibrary() {
  }
  
  public PersonLibrary(Long personId, Long mediaId) {
    this.personId = personId;
    this.mediaId = mediaId;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public PersonLibrary _setId(Long id) {
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
    
  public PersonLibrary _setPersonId(Long personId) {
    this.personId = personId;
    return this;
  }
  
  private Long mediaId;
    
  public Long getMediaId() {
    return mediaId;
  }
    
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }
    
  public PersonLibrary _setMediaId(Long mediaId) {
    this.mediaId = mediaId;
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
    PersonLibrary other = (PersonLibrary) obj;
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
    return "PersonLibrary [mediaId=" + mediaId + ", id=" + id + ", personId=" + personId + "]";
  }
  
  public String toStringFull() {
    return "PersonLibrary [mediaId=" + mediaId + ", id=" + id + ", personId=" + personId + "]";
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public enum Attribute {
    mediaId, id, personId
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
