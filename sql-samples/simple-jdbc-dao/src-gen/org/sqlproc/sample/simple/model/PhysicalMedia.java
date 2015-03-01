package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public class PhysicalMedia extends BaseModelImpl implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public PhysicalMedia() {
  }
  
  public PhysicalMedia(final String location, final Media media, final Library library) {
    super();
    	   				setLocation(location);
    	   				setMedia(media);
    	   				setLibrary(library);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public PhysicalMedia _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private String location;
  
  public String getLocation() {
    return this.location;
  }
  
  public void setLocation(final String location) {
    this.location = location;
  }
  
  public PhysicalMedia _setLocation(final String location) {
    this.location = location;
    return this;
  }
  
  private Media media;
  
  public Media getMedia() {
    return this.media;
  }
  
  public void setMedia(final Media media) {
    this.media = media;
  }
  
  public PhysicalMedia _setMedia(final Media media) {
    this.media = media;
    return this;
  }
  
  private Library library;
  
  public Library getLibrary() {
    return this.library;
  }
  
  public void setLibrary(final Library library) {
    this.library = library;
  }
  
  public PhysicalMedia _setLibrary(final Library library) {
    this.library = library;
    return this;
  }
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public PhysicalMedia _setVersion(final Integer version) {
    this.version = version;
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
    PhysicalMedia other = (PhysicalMedia) obj;
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
    return "PhysicalMedia [id=" + id + ", location=" + location + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", media=" + media + ", library=" + library + ", version=" + version + "]";
  }
  
  public enum Association {
    media,
    
    library;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final PhysicalMedia.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public PhysicalMedia _setInit(final PhysicalMedia.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final PhysicalMedia.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public PhysicalMedia _clearInit(final PhysicalMedia.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public PhysicalMedia _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public PhysicalMedia _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final PhysicalMedia.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public Boolean toInit(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new java.util.HashSet<String>();
  }
}
