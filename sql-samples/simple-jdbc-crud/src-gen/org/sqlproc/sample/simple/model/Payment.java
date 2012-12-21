package org.sqlproc.sample.simple.model;
  
import java.sql.Timestamp;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class Payment implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public Payment() {
  }
  
  public Payment(BillingDetails billingDetails, Timestamp paid) {
    this.billingDetails = billingDetails;
    this.paid = paid;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Payment _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private BillingDetails billingDetails;
    
  public BillingDetails getBillingDetails() {
    return billingDetails;
  }
    
  public void setBillingDetails(BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }
    
  public Payment _setBillingDetails(BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }
  
  private Timestamp paid;
    
  public Timestamp getPaid() {
    return paid;
  }
    
  public void setPaid(Timestamp paid) {
    this.paid = paid;
  }
    
  public Payment _setPaid(Timestamp paid) {
    this.paid = paid;
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
    Payment other = (Payment) obj;
    if (id != other.id)
      return false;
    if (billingDetails != other.billingDetails)
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    result = prime * result + (int) (billingDetails ^ (billingDetails >>> 32));
    return result;
  }  
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public enum Association {
    billingDetails
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
  
  public Boolean toInit(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(attrName);
  }
  
  public Boolean toInit(Association association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "Payment [id=" + id + ", paid=" + paid + "]";
  }
  
  public String toStringFull() {
    return "Payment [id=" + id + ", paid=" + paid + ", billingDetails=" + billingDetails + "]";
  }
}
