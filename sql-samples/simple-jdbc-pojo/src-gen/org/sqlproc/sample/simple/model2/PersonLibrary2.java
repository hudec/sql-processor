package org.sqlproc.sample.simple.model2;

public class PersonLibrary2 {
	
  public PersonLibrary2() {
  }
  
  public PersonLibrary2(Long personId, Long mediaId) {
  setPersonId(personId);
  setMediaId(mediaId);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
  
  private Long personId;
    
  public Long getPersonId() {
    return personId;
  }
    
  public void setPersonId(Long personId) {
    this.personId = personId;
  }
  
  private Long mediaId;
    
  public Long getMediaId() {
    return mediaId;
  }
    
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }
}
