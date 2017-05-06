package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class PersonLibrary implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_PERSON_LIBRARY_ID = "PERSON_LIBRARY_ID";
  
  public final static String ORDER_BY_PERSON_ID = "PERSON_ID";
  
  public final static String ORDER_BY_MEDIA_ID = "MEDIA_ID";
  
  public PersonLibrary() {
  }
  
  public PersonLibrary(final Long personId, final Long mediaId) {
    super();
    setPersonId(personId);
    setMediaId(mediaId);
  }
  
  private Long personLibraryId;
  
  public Long getPersonLibraryId() {
    return this.personLibraryId;
  }
  
  public void setPersonLibraryId(final Long personLibraryId) {
    this.personLibraryId = personLibraryId;
  }
  
  public PersonLibrary withPersonLibraryId(final Long personLibraryId) {
    this.personLibraryId = personLibraryId;
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
    if (personLibraryId == null || !personLibraryId.equals(other.personLibraryId))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(personLibraryId);
  }
  
  @Override
  public String toString() {
    return "PersonLibrary [personLibraryId=" + personLibraryId + ", personId=" + personId + ", mediaId=" + mediaId + "]";
  }
  
  public String toStringFull() {
    return "PersonLibrary [personLibraryId=" + personLibraryId + ", personId=" + personId + ", mediaId=" + mediaId + "]";
  }
}
