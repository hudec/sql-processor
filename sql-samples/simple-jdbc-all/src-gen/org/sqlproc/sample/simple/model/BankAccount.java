package org.sqlproc.sample.simple.model;

import java.io.Serializable;

public class BankAccount extends BillingDetails implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public BankAccount() {
  }
  
  public BankAccount(Subscriber subscriber, String type, String baAccount) {
    super(subscriber, type);
    this.baAccount = baAccount;
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
  
  @Override
  public String toString() {
    return "BankAccount [baAccount=" + baAccount + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "BankAccount [baAccount=" + baAccount + super.toString() + "]";
  }
}
