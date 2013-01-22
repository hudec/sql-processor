package org.sqlproc.sample.simple.model;
  
import java.sql.Timestamp;

import java.io.Serializable;

public class Payment implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
	
  public Payment() {
  }
  
  public Payment(Long billingDetails, Timestamp paid, Integer version) {
    this.billingDetails = billingDetails;
    this.paid = paid;
    this.version = version;
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
  
  private Long billingDetails;
    
  public Long getBillingDetails() {
    return billingDetails;
  }
    
  public void setBillingDetails(Long billingDetails) {
    this.billingDetails = billingDetails;
  }
    
  public Payment _setBillingDetails(Long billingDetails) {
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
  
  private Integer version;
    
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
  
  @Override
  public String toString() {
    return "Payment [id=" + id + ", paid=" + paid + ", billingDetails=" + billingDetails + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Payment [id=" + id + ", paid=" + paid + ", billingDetails=" + billingDetails + ", version=" + version + "]";
  }
}
