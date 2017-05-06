package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public class BankAccount extends BillingDetails implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public BankAccount() {
  }
  
  public BankAccount(final Subscriber subscriber, final String type) {
    super(subscriber,type);
  }
  
  private String baAccount;
  
  public String getBaAccount() {
    return this.baAccount;
  }
  
  public void setBaAccount(final String baAccount) {
    this.baAccount = baAccount;
  }
  
  public BankAccount withBaAccount(final String baAccount) {
    this.baAccount = baAccount;
    return this;
  }
  
  @Override
  public String toString() {
    return "BankAccount [baAccount=" + baAccount + "]";
  }
  
  public String toStringFull() {
    return "BankAccount [baAccount=" + baAccount + "]";
  }
}
