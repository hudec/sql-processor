package org.sample.model.auth;

import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.sample.model.auth.AuthRole;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Model(value = "SimpleWeb.model.UserRole", paging = true, readMethod = "simpleService.loadUserRoles")
@SuppressWarnings("all")
public class UserRole implements Serializable {
  private final static long serialVersionUID = 1L;
  
  @JsonIgnore
  public final static int ORDER_BY_ID = 1;
  
  @JsonIgnore
  public final static int ORDER_BY_AUTH_USER_ID = 4;
  
  @JsonIgnore
  public final static int ORDER_BY_AUTH_ROLE = 5;
  
  public UserRole() {
  }
  
  public UserRole(final Long authUserId, final AuthRole authRole) {
    super();
    setAuthUserId(authUserId);
    setAuthRole(authRole);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public UserRole _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Long authUserId;
  
  public Long getAuthUserId() {
    return this.authUserId;
  }
  
  public void setAuthUserId(final Long authUserId) {
    this.authUserId = authUserId;
  }
  
  public UserRole _setAuthUserId(final Long authUserId) {
    this.authUserId = authUserId;
    return this;
  }
  
  @ModelAssociation(value = ModelAssociationType.HAS_ONE, model = AuthRole.class)
  private AuthRole authRole;
  
  public AuthRole getAuthRole() {
    return this.authRole;
  }
  
  public void setAuthRole(final AuthRole authRole) {
    this.authRole = authRole;
  }
  
  public UserRole _setAuthRole(final AuthRole authRole) {
    this.authRole = authRole;
    return this;
  }
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public UserRole _setVersion(final Integer version) {
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
  
  @Override
  public String toString() {
    return "UserRole [id=" + id + ", authUserId=" + authUserId + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "UserRole [id=" + id + ", authUserId=" + authUserId + ", authRole=" + authRole + ", version=" + version + "]";
  }
  
  public enum Association {
    authRole;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setInit(final UserRole.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public UserRole _setInit(final UserRole.Association... associations) {
    setInit(associations);
    return this;
  }
  
  @JsonIgnore
  public void clearInit(final UserRole.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  @JsonIgnore
  public UserRole _clearInit(final UserRole.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public UserRole _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public UserRole _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  @JsonIgnore
  public Boolean toInit(final UserRole.Association association) {
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
    
    authUserId,
    
    authRole,
    
    version;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  @JsonIgnore
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(final String operator, final UserRole.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public UserRole _setOp(final String operator, final UserRole.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearOp(final UserRole.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  @JsonIgnore
  public UserRole _clearOp(final UserRole.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public UserRole _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public UserRole _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  @JsonIgnore
  public void setNullOp(final UserRole.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  @JsonIgnore
  public UserRole _setNullOp(final UserRole.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public UserRole _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
