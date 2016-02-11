package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public class PersonLibrary extends BaseModelImpl implements Serializable {
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
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("PersonLibrary");
    if (id != null)
    	result.append("@").append("id");
    if (personId != null)
    	result.append("@").append("personId");
    if (mediaId != null)
    	result.append("@").append("mediaId");
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
  
  public String getProcessingId(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes();
    if (moreAttributes != null && moreAttributes.length > 0) {
    	result.append(",MORE");
    	for (String moreAttr : moreAttributes)
    		result.append("@").append(moreAttr);
    }
    return result.toString();
  }
}
