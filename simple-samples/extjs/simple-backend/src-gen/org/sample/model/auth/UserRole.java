package org.sample.model.auth;
  
import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

@Model(value = "SimpleWeb.model.UserRole", paging = true, readMethod = "simpleService.loadUserRoles")
public class UserRole implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @JsonIgnore
  public static final int ORDER_BY_ID = 1;
  @JsonIgnore
  public static final int ORDER_BY_AUTH_USER_ID = 4;
  @JsonIgnore
  public static final int ORDER_BY_AUTH_ROLE = 5;
	
  public UserRole() {
  }
  
  public UserRole(Long authUserId, AuthRole authRole) {
    this.authUserId = authUserId;
    this.authRole = authRole;
  }
  
  private Long id;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public UserRole _setId(Long id) {
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
  
  public UserRole _setAuthUserId(Long authUserId) {
    this.authUserId = authUserId;
    return this;
  }
  
  @ModelAssociation(value = ModelAssociationType.HAS_ONE, model = AuthRole.class)
  private AuthRole authRole;
  
  public AuthRole getAuthRole() {
    return authRole;
  }
  
  public void setAuthRole(AuthRole authRole) {
    this.authRole = authRole;
  }
  
  public UserRole _setAuthRole(AuthRole authRole) {
    this.authRole = authRole;
    return this;
  }
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return version;
  }
  
  public void setVersion(Integer version) {
    this.version = version;
  }
  
  public UserRole _setVersion(Integer version) {
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
    UserRole other = (UserRole) obj;
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
    authRole
  }
  
  private Set<String> initAssociations = new HashSet<String>();
  
  @JsonIgnore
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public void setInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.add(association);
  }
  
  public void clearInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.remove(association);
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
  
  @JsonIgnore
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public void setNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.add(attribute);
  }
  
  public void clearNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.remove(attribute);
  }
  
  public Boolean isNull(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  @JsonIgnore
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
    return "UserRole [id=" + id + ", authUserId=" + authUserId + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "UserRole [id=" + id + ", authUserId=" + authUserId + ", authRole=" + authRole + ", version=" + version + "]";
  }
  
  public enum OpAttribute {
      id, authUserId, authRole, version
  }
  
  private Map<String, String> operators = new HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(String operator, OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public void clearOp(OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.remove(attribute.name());
  }
  
  public void setOp(String operator, String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.put(attribute, operator);
  }
  
  public void clearOp(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.remove(attribute);
  }
  
  @JsonIgnore
  public void setNullOp(OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.put(attribute.name(), "is null");
  }
  
  public void setNullOp(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.put(attribute, "is null");
  }
  
  public void clearAllOps() {
    operators = new HashMap<String, String>();
  }
}
