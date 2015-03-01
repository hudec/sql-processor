package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;

@Pojo
@SuppressWarnings("all")
public class Payment implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public final static int ORDER_BY_BILLING_DETAILS = 2;
  
  public Payment() {
  }
  
  public Payment(final BillingDetails billingDetails, final Timestamp paid) {
    setBillingDetails(billingDetails);
    setPaid(paid);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Payment _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private BillingDetails billingDetails;
  
  public BillingDetails getBillingDetails() {
    return this.billingDetails;
  }
  
  public void setBillingDetails(final BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }
  
  public Payment _setBillingDetails(final BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }
  
  private Timestamp paid;
  
  public Timestamp getPaid() {
    return this.paid;
  }
  
  public void setPaid(final Timestamp paid) {
    this.paid = paid;
  }
  
  public Payment _setPaid(final Timestamp paid) {
    this.paid = paid;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    Payment other = (Payment) obj;
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
  
  @Override
  public String toString() {
    return "Payment [id=" + id + ", paid=" + paid + "]";
  }
  
  public String toStringFull() {
    return "Payment [id=" + id + ", billingDetails=" + billingDetails + ", paid=" + paid + "]";
  }
  
  public enum Association {
    billingDetails;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final Payment.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Payment _setInit(final Payment.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Payment.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Payment _clearInit(final Payment.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Payment _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Payment _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Payment.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public Boolean toInit(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new java.util.HashSet<String>();
  }
}
