package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class PersonLibrary extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_PERSON_ID = 2;
  public static final int ORDER_BY_MEDIA_ID = 3;
	
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
  
  public PersonLibrary _setId(Long id) {
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
  
  public PersonLibrary _setPersonId(Long personId) {
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
  
  public PersonLibrary _setMediaId(Long mediaId) {
    this.mediaId = mediaId;
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
    PersonLibrary other = (PersonLibrary) obj;
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
  
  public enum Association {
  }
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public PersonLibrary  _setInit(Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public PersonLibrary _clearInit(Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.add(association);
  }
  
  public PersonLibrary _setInit(String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.remove(association);
  }
  
  public PersonLibrary _clearInit(String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(String association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  public enum Attribute {
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  public PersonLibrary _setNull(Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public PersonLibrary _clearNull(Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.add(attribute);
  }
  
  public PersonLibrary _setNull(String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.remove(attribute);
  }
  
  public PersonLibrary _clearNull(String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isNull(Attribute attribute) {
    if (attribute == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isDef(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
      return true;
    try {
      Object result = MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
      return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    try {
      Object result = MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
      return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "PersonLibrary [mediaId=" + mediaId + ", id=" + id + ", personId=" + personId + "]";
  }
  
  public String toStringFull() {
    return "PersonLibrary [id=" + id + ", personId=" + personId + ", mediaId=" + mediaId + "]";
  }
}
