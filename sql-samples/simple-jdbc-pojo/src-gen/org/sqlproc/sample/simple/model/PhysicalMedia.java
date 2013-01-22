package org.sqlproc.sample.simple.model;

import java.io.Serializable;

public class PhysicalMedia implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
	
  public PhysicalMedia() {
  }
  
  public PhysicalMedia(String location, Long media, Long library, Integer version) {
    this.location = location;
    this.media = media;
    this.library = library;
    this.version = version;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public PhysicalMedia _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String location;
    
  public String getLocation() {
    return location;
  }
    
  public void setLocation(String location) {
    this.location = location;
  }
    
  public PhysicalMedia _setLocation(String location) {
    this.location = location;
    return this;
  }
  
  private Long media;
    
  public Long getMedia() {
    return media;
  }
    
  public void setMedia(Long media) {
    this.media = media;
  }
    
  public PhysicalMedia _setMedia(Long media) {
    this.media = media;
    return this;
  }
  
  private Long library;
    
  public Long getLibrary() {
    return library;
  }
    
  public void setLibrary(Long library) {
    this.library = library;
  }
    
  public PhysicalMedia _setLibrary(Long library) {
    this.library = library;
    return this;
  }
  
  private Integer version;
    
  public Integer getVersion() {
    return version;
  }
    
  public void setVersion(Integer version) {
    this.version = version;
  }
    
  public PhysicalMedia _setVersion(Integer version) {
    this.version = version;
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
    PhysicalMedia other = (PhysicalMedia) obj;
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
    return "PhysicalMedia [id=" + id + ", location=" + location + ", library=" + library + ", media=" + media + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", library=" + library + ", media=" + media + ", version=" + version + "]";
  }
}
