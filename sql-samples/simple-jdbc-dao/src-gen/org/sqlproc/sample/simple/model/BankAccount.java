package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

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
  
  public enum Association {
    subscriber
  }
  
  public enum Attribute {
    baAccount
  }
  
  @Override
  public String toString() {
    return "BankAccount [baAccount=" + baAccount + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "BankAccount [baAccount=" + baAccount + super.toString() + "]";
  }
}
