package org.sqlproc.sample.simple.model;
  
import java.sql.Timestamp;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class Payment extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_BILLING_DETAILS = 2;
	
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
  
  private Integer version = 0;
    
  public Integer getVersion() {
    return version;
  }
    
  public void setVersion(Integer version) {
    this.version = version;
  }
    
  public Payment _setVersion(Integer version) {
    this.version = version;
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
    if (!id.equals(other.id))
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id.hashCode();
    return result;
  }  
  
  public enum Association {
    billingDetails
  }
  
  @Override
  public String toString() {
    return "Payment [id=" + id + ", paid=" + paid + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Payment [id=" + id + ", paid=" + paid + ", billingDetails=" + billingDetails + ", version=" + version + "]";
  }
}
