package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class PersonLibrary implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public final static int ORDER_BY_PERSON_ID = 2;
  
  public final static int ORDER_BY_MEDIA_ID = 3;
  
  public PersonLibrary() {
  }
  
  public PersonLibrary(final Long personId, final Long mediaId) {
    setPersonId(personId);
    setMediaId(mediaId);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public PersonLibrary _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Long personId;
  
  public Long getPersonId() {
    return this.personId;
  }
  
  public void setPersonId(final Long personId) {
    this.personId = personId;
  }
  
  public PersonLibrary _setPersonId(final Long personId) {
    this.personId = personId;
    return this;
  }
  
  private Long mediaId;
  
  public Long getMediaId() {
    return this.mediaId;
  }
  
  public void setMediaId(final Long mediaId) {
    this.mediaId = mediaId;
  }
  
  public PersonLibrary _setMediaId(final Long mediaId) {
    this.mediaId = mediaId;
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
    PersonLibrary other = (PersonLibrary) obj;
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
    return "PersonLibrary [mediaId=" + mediaId + ", id=" + id + ", personId=" + personId + "]";
  }
  
  public String toStringFull() {
    return "PersonLibrary [id=" + id + ", personId=" + personId + ", mediaId=" + mediaId + "]";
  }
}
