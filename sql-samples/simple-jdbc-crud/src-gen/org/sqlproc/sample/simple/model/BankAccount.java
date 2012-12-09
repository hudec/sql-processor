package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class BankAccount extends BillingDetails implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public BankAccount() {
  }
  
  public BankAccount(Subscriber subscriber, String type) {
    super(subscriber, type);
  }
  
  private String baAccount;
    
  public String getBaAccount() {
    return baAccount;
  }
    
  public void setBaAccount(String baAccount) {
    this.baAccount = baAccount;
  }
    
  public BankAccount _setBaAccount(String baAccount) {
    this.baAccount = baAccount;
    return this;
  }
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public enum Association {
    subscriber
  }
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public Boolean isInit(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(attrName);
  }
  
  public Boolean isInit(Association association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public enum Attribute {
    baAccount
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
    return "BankAccount [baAccount=" + baAccount + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "BankAccount [baAccount=" + baAccount + super.toString() + "]";
  }
}
