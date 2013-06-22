package org.sample.auth.model;
  
import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import ch.ralscha.extdirectspring.generator.ModelField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;
import org.sample.web.util.DMYDateTimeDeserializer;
import org.sample.web.util.DMYDateTimeSerializer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

@Model(value = "SimpleWeb.model.AuthUser", paging = true, readMethod = "simpleService.loadAuthUsers")
public class AuthUser implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @JsonIgnore
  public static final int ORDER_BY_ID = 1;
  @JsonIgnore
  public static final int ORDER_BY_USERNAME = 2;
	
  public AuthUser() {
  }
  
  public AuthUser(String username, String name) {
    this.username = username;
    this.name = name;
  }
  
  private Long id;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public AuthUser _setId(Long id) {
    this.id = id;
    return this;
  }
  
  @NotBlank
  private String username;
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public AuthUser _setUsername(String username) {
    this.username = username;
    return this;
  }
  
  private String password;
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public AuthUser _setPassword(String password) {
    this.password = password;
    return this;
  }
  
  @NotBlank
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public AuthUser _setName(String name) {
    this.name = name;
    return this;
  }
  
  private String email;
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public AuthUser _setEmail(String email) {
    this.email = email;
    return this;
  }
  
  @ModelField(dateFormat = "d.m.Y H:i:s")
  @Past
  private Date lastLogin;
  
  @JsonSerialize(using = DMYDateTimeSerializer.class)
  public Date getLastLogin() {
    return lastLogin;
  }
  
  @JsonDeserialize(using = DMYDateTimeDeserializer.class)
  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }
  
  public AuthUser _setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }
  
  @NotNull
  private Integer version = 0;
  
  public Integer getVersion() {
    return version;
  }
  
  public void setVersion(Integer version) {
    this.version = version;
  }
  
  public AuthUser _setVersion(Integer version) {
    this.version = version;
    return this;
  }
  
  @ModelAssociation(value = ModelAssociationType.HAS_MANY, model = UserRole.class)
  private List<UserRole> userRoles = new ArrayList<UserRole>();
  
  public List<UserRole> getUserRoles() {
    return userRoles;
  }
  
  public void setUserRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }
  
  public AuthUser _setUserRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
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
    AuthUser other = (AuthUser) obj;
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
    userRoles
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
    lastLogin, email, password
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
    return "AuthUser [id=" + id + ", lastLogin=" + lastLogin + ", username=" + username + ", email=" + email + ", name=" + name + ", password=" + password + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "AuthUser [id=" + id + ", lastLogin=" + lastLogin + ", username=" + username + ", email=" + email + ", name=" + name + ", password=" + password + ", version=" + version + "]";
  }
  
  public enum OpAttribute {
      id, username, password, name, email, lastLogin, version, userRoles
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
