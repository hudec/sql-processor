package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Media;

@Pojo
@SuppressWarnings("all")
public class Movie extends Media implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public Movie() {
  }
  
  public Movie(final String title, final String urlimdb, final Integer playlength) {
    super(title);
    setUrlimdb(urlimdb);
    setPlaylength(playlength);
  }
  
  private String urlimdb;
  
  public String getUrlimdb() {
    return this.urlimdb;
  }
  
  public void setUrlimdb(final String urlimdb) {
    this.urlimdb = urlimdb;
  }
  
  public Movie _setUrlimdb(final String urlimdb) {
    this.urlimdb = urlimdb;
    return this;
  }
  
  private Integer playlength;
  
  public Integer getPlaylength() {
    return this.playlength;
  }
  
  public void setPlaylength(final Integer playlength) {
    this.playlength = playlength;
  }
  
  public Movie _setPlaylength(final Integer playlength) {
    this.playlength = playlength;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("Movie");
    if (urlimdb != null)
    	result.append("@").append("urlimdb");
    if (playlength != null)
    	result.append("@").append("playlength");
    result.append("@@").append(super.getProcessingIdForAttributes_());
    return result;
  }
  
  @Override
  public String toString() {
    return "Movie [urlimdb=" + urlimdb + ", playlength=" + playlength + "]";
  }
  
  public String toStringFull() {
    return "Movie [urlimdb=" + urlimdb + ", playlength=" + playlength + "]";
  }
  
  public enum Attribute {
    author;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final Movie.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public Movie _setNull_(final Movie.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final Movie.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public Movie _clearNull_(final Movie.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public Movie _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public Movie _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final Movie.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attribute.name());
  }
  
  public Boolean isNull_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attrName);
  }
  
  public Boolean isDef_(final String attrName, final Boolean isAttrNotNull) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues_.contains(attrName))
    	return true;
    if (isAttrNotNull != null)
    	return isAttrNotNull;
    return false;
  }
  
  public void clearAllNull_() {
    nullValues_ = new java.util.HashSet<String>();
  }
  
  public StringBuilder getProcessingIdForNulls_() {
    if (nullValues_ == null || nullValues_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("NULL");
    for (Attribute attribute : Attribute.values()) {
    	if (nullValues_.contains(attribute.name()))
    		result.append("@").append(attribute.name());
    }
    return result;
  }
  
  public enum Association {
    author;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Movie.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Movie _setInit_(final Movie.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Movie.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Movie _clearInit_(final Movie.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Movie _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Movie _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Movie.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association.name());
  }
  
  public Boolean toInit_(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association);
  }
  
  public void clearAllInit_() {
    initAssociations_ = new java.util.HashSet<String>();
  }
  
  public StringBuilder getProcessingIdForAssociations_() {
    if (initAssociations_ == null || initAssociations_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("ASSOC");
    for (Association association : Association.values()) {
    	if (initAssociations_.contains(association.name()))
    		result.append("@").append(association.name());
    }
    return result;
  }
  
  public String getProcessingId_(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes_();
    StringBuilder processingIdForNulls = getProcessingIdForNulls_();
    if (processingIdForNulls != null)
    	result.append(",").append(processingIdForNulls);
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations_();
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
