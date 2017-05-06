package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class PersonLibrary implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_PERSON_ID = "PERSON_ID";
  
  public final static String ORDER_BY_MEDIA_ID = "MEDIA_ID";
  
  public PersonLibrary() {
  }
  
  public PersonLibrary(final Long personId, final Long mediaId) {
    super();
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
  
  public PersonLibrary withId(final Long id) {
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
  
  public PersonLibrary withPersonId(final Long personId) {
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
  
  public PersonLibrary withMediaId(final Long mediaId) {
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
    return java.util.Objects.hash(id);
  }
  
  @Override
  public String toString() {
    return "PersonLibrary [id=" + id + ", personId=" + personId + ", mediaId=" + mediaId + "]";
  }
  
  public String toStringFull() {
    return "PersonLibrary [id=" + id + ", personId=" + personId + ", mediaId=" + mediaId + "]";
  }
}
