package org.sqlproc.sample.simple.model;

public class PersonLibrary {
	
  public PersonLibrary() {
  }
  
  public PersonLibrary(Long personId, Long mediaId) {
  setPersonId(personId);
  setMediaId(mediaId);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public PersonLibrary setId(Long id) {
    this.id = id;
    return this;
  }
  
  private Long personId;
    
  public Long getPersonId() {
    return personId;
  }
    
  public PersonLibrary setPersonId(Long personId) {
    this.personId = personId;
    return this;
  }
  
  private Long mediaId;
    
  public Long getMediaId() {
    return mediaId;
  }
    
  public PersonLibrary setMediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
