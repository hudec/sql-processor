package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Media;

@Pojo
@SuppressWarnings("all")
public class PhysicalMedia implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
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
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("PhysicalMedia");
    if (id != null)
    	result.append("@").append("id");
    if (location != null)
    	result.append("@").append("location");
    if (media != null)
    	result.append("@").append("{").append(media.getProcessingIdForAttributes()).append("}");
    if (library != null)
    	result.append("@").append("{").append(library.getProcessingIdForAttributes()).append("}");
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
    PhysicalMedia other = (PhysicalMedia) obj;
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
    return "PhysicalMedia [id=" + id + ", location=" + location + "]";
  }
  
  public String toStringFull() {
    return "PhysicalMedia [id=" + id + ", location=" + location + ", media=" + media + ", library=" + library + "]";
  }
  
  public enum Association {
    media,
    
    library;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
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
  
  public StringBuilder getProcessingIdForAssociations() {
    if (initAssociations == null || initAssociations.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("ASSOC");
    for (Association association : Association.values()) {
    	if (initAssociations.contains(association.name()))
    		result.append("@").append(association.name());
    }
    return result;
  }
  
  public String getProcessingId(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes();
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations();
    if (processingIdForAssociations != null)
    	result.append(",").append(processingIdForAssociations);
    if (moreAttributes != null && moreAttributes.length > 0) {
    	result.append(",MORE");
    	for (String moreAttr : moreAttributes)
    		result.append("@").append(moreAttr);
    }
    return result.toString();
  }
}
