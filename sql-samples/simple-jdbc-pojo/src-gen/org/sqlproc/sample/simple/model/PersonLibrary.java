package org.sqlproc.sample.simple.model;

public class PersonLibrary {
	
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
    
  public PersonLibrary ssetId(Long id) {
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
    
  public PersonLibrary ssetPersonId(Long personId) {
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
    
  public PersonLibrary ssetMediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
