package org.sample.model;
  
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

public class State implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @JsonIgnore
  public static final int ORDER_BY_ID = 1;
  @JsonIgnore
  public static final int ORDER_BY_CODE = 2;
	
  public State() {
  }
  
  public State(String code) {
    this.code = code;
  }
  
  private Long id;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public State _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String code;
 
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public State _setCode(String code) {
    this.code = code;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public State _setName(String name) {
    this.name = name;
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
    State other = (State) obj;
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
    name
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
    return "State [id=" + id + ", name=" + name + ", code=" + code + "]";
  }
  
  public String toStringFull() {
    return "State [id=" + id + ", name=" + name + ", code=" + code + "]";
  }
  
  public enum OpAttribute {
      id, code, name
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
