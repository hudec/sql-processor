package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class PhysicalMedia extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
	
  public PhysicalMedia() {
  }
  
  public PhysicalMedia(String location, Media media, Library library) {
    this.location = location;
    this.media = media;
    this.library = library;
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
  
  private Media media;
    
  public Media getMedia() {
    return media;
  }
    
  public void setMedia(Media media) {
    this.media = media;
  }
    
  public PhysicalMedia _setMedia(Media media) {
    this.media = media;
    return this;
  }
  
  private Library library;
    
  public Library getLibrary() {
    return library;
  }
    
  public void setLibrary(Library library) {
    this.library = library;
  }
    
  public PhysicalMedia _setLibrary(Library library) {
    this.library = library;
    return this;
  }
  
  private Integer version = 0;
    
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
  
  public enum Association {
    library, media
  }
  
  @Override
  public String toString() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", library=" + library + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", library=" + library + ", media=" + media + ", version=" + version + "]";
  }
}
