package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class PhysicalMedia implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
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
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public enum Association {
    library, media
  }
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public Boolean toInit(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(attrName);
  }
  
  public Boolean toInit(Association association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", library=" + library + "]";
  }
  
  public String toStringFull() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", library=" + library + ", media=" + media + "]";
  }
}
