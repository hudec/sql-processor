package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class CreditCard extends BillingDetails implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public CreditCard() {
  }
  
  public CreditCard(Subscriber subscriber, String type) {
    super(subscriber, type);
  }
  
  private Long ccNumber;
  
  public Long getCcNumber() {
    return ccNumber;
  }
  
  public void setCcNumber(Long ccNumber) {
    this.ccNumber = ccNumber;
  }
  
  public CreditCard _setCcNumber(Long ccNumber) {
    this.ccNumber = ccNumber;
    return this;
  }
  
  public enum Association {
    subscriber
  }
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public CreditCard  _setInit(Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public CreditCard _clearInit(Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.add(association);
  }
  
  public CreditCard _setInit(String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.remove(association);
  }
  
  public CreditCard _clearInit(String... associations) {
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
    ccNumber
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  public CreditCard _setNull(Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public CreditCard _clearNull(Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.add(attribute);
  }
  
  public CreditCard _setNull(String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.remove(attribute);
  }
  
  public CreditCard _clearNull(String... attributes) {
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
    return "CreditCard [ccNumber=" + ccNumber + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "CreditCard [ccNumber=" + ccNumber + super.toString() + "]";
  }
}
