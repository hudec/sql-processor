package org.sample.model.auth;

import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import ch.ralscha.extdirectspring.generator.ModelField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;
import org.sample.model.auth.UserRole;
import org.sample.web.util.DMYDateTimeSerializer;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Model(value = "SimpleWeb.model.AuthUser", paging = true, readMethod = "simpleService.loadAuthUsers")
@SuppressWarnings("all")
public class AuthUser implements Serializable {
  private final static long serialVersionUID = 1L;
  
  @JsonIgnore
  public final static int ORDER_BY_ID = 1;
  
  @JsonIgnore
  public final static int ORDER_BY_USERNAME = 2;
  
  public AuthUser() {
  }
  
  public AuthUser(final String username, final String name) {
    super();
    setUsername(username);
    setName(name);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public AuthUser _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  @NotBlank
  private String username;
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(final String username) {
    this.username = username;
  }
  
  public AuthUser _setUsername(final String username) {
    this.username = username;
    return this;
  }
  
  private String password;
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(final String password) {
    this.password = password;
  }
  
  public AuthUser _setPassword(final String password) {
    this.password = password;
    return this;
  }
  
  @NotBlank
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public AuthUser _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private String email;
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(final String email) {
    this.email = email;
  }
  
  public AuthUser _setEmail(final String email) {
    this.email = email;
    return this;
  }
  
  @ModelField(dateFormat = "d.m.Y")
  @Past
  private Date lastLogin;
  
  @JsonSerialize(using = DMYDateTimeSerializer.class)
  public Date getLastLogin() {
    return this.lastLogin;
  }
  
  @JsonSerialize(using = DMYDateTimeSerializer.class)
  public void setLastLogin(final Date lastLogin) {
    this.lastLogin = lastLogin;
  }
  
  public AuthUser _setLastLogin(final Date lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }
  
  @NotNull
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public AuthUser _setVersion(final Integer version) {
    this.version = version;
    return this;
  }
  
  @ModelAssociation(value = ModelAssociationType.HAS_MANY, model = UserRole.class)
  private List<UserRole> userRoles = new java.util.ArrayList<UserRole>();
  
  public List<UserRole> getUserRoles() {
    return this.userRoles;
  }
  
  public void setUserRoles(final List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }
  
  public AuthUser _setUserRoles(final List<UserRole> userRoles) {
    this.userRoles = userRoles;
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
  
  @Override
  public String toString() {
    return "AuthUser [id=" + id + ", lastLogin=" + lastLogin + ", username=" + username + ", email=" + email + ", name=" + name + ", password=" + password + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "AuthUser [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + ", lastLogin=" + lastLogin + ", version=" + version + ", userRoles=" + userRoles + "]";
  }
  
  public enum Attribute {
    password,
    
    email,
    
    lastLogin;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setNull(final AuthUser.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public AuthUser _setNull(final AuthUser.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearNull(final AuthUser.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  @JsonIgnore
  public AuthUser _clearNull(final AuthUser.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public AuthUser _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public AuthUser _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public Boolean isNull(final AuthUser.Attribute attribute) {
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
    userRoles;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setInit(final AuthUser.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public AuthUser _setInit(final AuthUser.Association... associations) {
    setInit(associations);
    return this;
  }
  
  @JsonIgnore
  public void clearInit(final AuthUser.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  @JsonIgnore
  public AuthUser _clearInit(final AuthUser.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public AuthUser _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public AuthUser _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  @JsonIgnore
  public Boolean toInit(final AuthUser.Association association) {
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
  
  public enum OpAttribute {
    id,
    
    username,
    
    password,
    
    name,
    
    email,
    
    lastLogin,
    
    version,
    
    userRoles;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  @JsonIgnore
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(final String operator, final AuthUser.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public AuthUser _setOp(final String operator, final AuthUser.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearOp(final AuthUser.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  @JsonIgnore
  public AuthUser _clearOp(final AuthUser.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public AuthUser _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public AuthUser _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  @JsonIgnore
  public void setNullOp(final AuthUser.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  @JsonIgnore
  public AuthUser _setNullOp(final AuthUser.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public AuthUser _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
