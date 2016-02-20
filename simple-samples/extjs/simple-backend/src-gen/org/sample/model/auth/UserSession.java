package org.sample.model.auth;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class UserSession implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_AUTH_USER_ID = "AUTH_USER_ID";
  
  public UserSession() {
  }
  
  public UserSession(final Long authUserId, final Date lastAccess) {
    super();
    setAuthUserId(authUserId);
    setLastAccess(lastAccess);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public UserSession _setId(final Long id) {
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
  
  public UserSession _setAuthUserId(final Long authUserId) {
    this.authUserId = authUserId;
    return this;
  }
  
  private Date lastAccess;
  
  public Date getLastAccess() {
    return this.lastAccess;
  }
  
  public void setLastAccess(final Date lastAccess) {
    this.lastAccess = lastAccess;
  }
  
  public UserSession _setLastAccess(final Date lastAccess) {
    this.lastAccess = lastAccess;
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
    UserSession other = (UserSession) obj;
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
    return "UserSession [id=" + id + ", authUserId=" + authUserId + ", lastAccess=" + lastAccess + "]";
  }
  
  public String toStringFull() {
    return "UserSession [id=" + id + ", authUserId=" + authUserId + ", lastAccess=" + lastAccess + "]";
  }
  
  public enum OpAttribute {
    id,
    
    authUserId,
    
    lastAccess;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  public void setOp(final String operator, final UserSession.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  public UserSession _setOp(final String operator, final UserSession.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final UserSession.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  public UserSession _clearOp(final UserSession.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public UserSession _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public UserSession _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setNullOp(final UserSession.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  public UserSession _setNullOp(final UserSession.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public UserSession _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
