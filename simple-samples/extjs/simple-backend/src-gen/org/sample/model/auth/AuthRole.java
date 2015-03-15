package org.sample.model.auth;

import ch.ralscha.extdirectspring.generator.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Model(value = "SimpleWeb.model.AuthRole", paging = true, readMethod = "simpleService.loadAuthRoles")
@SuppressWarnings("all")
public class AuthRole implements Serializable {
  private final static long serialVersionUID = 1L;
  
  @JsonIgnore
  public final static int ORDER_BY_ID = 1;
  
  public AuthRole() {
  }
  
  public AuthRole(final String name) {
    super();
    setName(name);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public AuthRole _setId(final Long id) {
    this.id = id;
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
  
  public AuthRole _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private String description;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(final String description) {
    this.description = description;
  }
  
  public AuthRole _setDescription(final String description) {
    this.description = description;
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
  
  public AuthRole _setVersion(final Integer version) {
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
    AuthRole other = (AuthRole) obj;
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
    return "AuthRole [id=" + id + ", description=" + description + ", name=" + name + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "AuthRole [id=" + id + ", name=" + name + ", description=" + description + ", version=" + version + "]";
  }
  
  public enum Attribute {
    description;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setNull(final AuthRole.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public AuthRole _setNull(final AuthRole.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearNull(final AuthRole.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  @JsonIgnore
  public AuthRole _clearNull(final AuthRole.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public AuthRole _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public AuthRole _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public Boolean isNull(final AuthRole.Attribute attribute) {
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
  
  public enum OpAttribute {
    id,
    
    name,
    
    description,
    
    version;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  @JsonIgnore
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(final String operator, final AuthRole.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public AuthRole _setOp(final String operator, final AuthRole.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearOp(final AuthRole.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  @JsonIgnore
  public AuthRole _clearOp(final AuthRole.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public AuthRole _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public AuthRole _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  @JsonIgnore
  public void setNullOp(final AuthRole.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  @JsonIgnore
  public AuthRole _setNullOp(final AuthRole.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public AuthRole _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
