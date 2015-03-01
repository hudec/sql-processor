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
  
  @Override
  public String toString() {
    return "Movie [playlength=" + playlength + ", urlimdb=" + urlimdb + "]";
  }
  
  public String toStringFull() {
    return "Movie [urlimdb=" + urlimdb + ", playlength=" + playlength + "]";
  }
  
  public enum Attribute {
    author;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  public void setNull(final Movie.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  public Movie _setNull(final Movie.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final Movie.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  public Movie _clearNull(final Movie.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public Movie _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public Movie _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(final Movie.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isNull(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isDef(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
    	return true;
    try {
    	Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
    	return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
    	throw new RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
    	throw new RuntimeException(e);
    }
    try {
    	Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
    	return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
    	throw new RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
    	throw new RuntimeException(e);
    }
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new java.util.HashSet<String>();
  }
  
  public enum Association {
    author;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final Movie.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Movie _setInit(final Movie.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Movie.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Movie _clearInit(final Movie.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Movie _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Movie _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Movie.Association association) {
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
