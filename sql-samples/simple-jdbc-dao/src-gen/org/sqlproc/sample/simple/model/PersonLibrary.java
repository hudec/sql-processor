package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class PersonLibrary extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_PERSON_ID = 2;
  public static final int ORDER_BY_MEDIA_ID = 3;
	
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
    return "PersonLibrary [mediaId=" + mediaId + ", id=" + id + ", personId=" + personId + "]";
  }
  
  public String toStringFull() {
    return "PersonLibrary [mediaId=" + mediaId + ", id=" + id + ", personId=" + personId + "]";
  }
}
