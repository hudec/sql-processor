package org.sample.model.auth;
  
import java.util.Date;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

public class UserSession implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_AUTH_USER_ID = 3;
	
  public UserSession() {
  }
  
  public UserSession(Long authUserId, Date lastAccess) {
    this.authUserId = authUserId;
    this.lastAccess = lastAccess;
  }
  
  private Long id;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public UserSession _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private Long authUserId;
  
  public Long getAuthUserId() {
    return authUserId;
  }
  
  public void setAuthUserId(Long authUserId) {
    this.authUserId = authUserId;
  }
  
  public UserSession _setAuthUserId(Long authUserId) {
    this.authUserId = authUserId;
    return this;
  }
  
  private Date lastAccess;
  
  public Date getLastAccess() {
    return lastAccess;
  }
  
  public void setLastAccess(Date lastAccess) {
    this.lastAccess = lastAccess;
  }
  
  public UserSession _setLastAccess(Date lastAccess) {
    this.lastAccess = lastAccess;
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
    UserSession other = (UserSession) obj;
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
  
  public UserSession  _setInit(Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public UserSession _clearInit(Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.add(association);
  }
  
  public UserSession _setInit(String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.remove(association);
  }
  
  public UserSession _clearInit(String... associations) {
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
  
  public UserSession _setNull(Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public UserSession _clearNull(Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.add(attribute);
  }
  
  public UserSession _setNull(String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.remove(attribute);
  }
  
  public UserSession _clearNull(String... attributes) {
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
    return "UserSession [id=" + id + ", authUserId=" + authUserId + ", lastAccess=" + lastAccess + "]";
  }
  
  public String toStringFull() {
    return "UserSession [id=" + id + ", authUserId=" + authUserId + ", lastAccess=" + lastAccess + "]";
  }
  
  public enum OpAttribute {
      id, authUserId, lastAccess
  }
  
  private Map<String, String> operators = new HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  public void setOp(String operator, OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.put(attribute.name(), operator);
  }
  
  public UserSession _setOp(String operator, OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.remove(attribute.name());
  }
  
  public UserSession _clearOp(OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(String operator, String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.put(attribute, operator);
  }
  
  public UserSession _setOp(String operator, String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.remove(attribute);
  }
  
  public UserSession _clearOp(String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setNullOp(OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.put(attribute.name(), "is null");
  }
  
  public UserSession _setNullOp(OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.put(attribute, "is null");
  }
  
  public UserSession _setNullOp(String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new HashMap<String, String>();
  }
}
