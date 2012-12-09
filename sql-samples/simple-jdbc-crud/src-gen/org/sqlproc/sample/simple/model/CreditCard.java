package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

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
  
  private Set<String> nullValues = new HashSet<String>();
  
  public enum Attribute {
    ccNumber
  }
  
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
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
