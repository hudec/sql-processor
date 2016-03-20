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
  
  public final static String ORDER_BY_BILLING_DETAILS = "BILLING_DETAILS";
  
  public final static String ORDER_BY_ID = "ID";
  
  public Payment() {
  }
  
  public Payment(final BillingDetails billingDetails, final Timestamp paid) {
    super();
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
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("Payment");
    if (id != null)
    	result.append("@").append("id");
    if (billingDetails != null)
    	result.append("@").append("{").append(billingDetails.getProcessingIdForAttributes_()).append("}");
    if (paid != null)
    	result.append("@").append("paid");
    return result;
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
    return java.util.Objects.hash(id);
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
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Payment.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Payment _setInit_(final Payment.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Payment.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Payment _clearInit_(final Payment.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Payment _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Payment _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Payment.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association.name());
  }
  
  public Boolean toInit_(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association);
  }
  
  public void clearAllInit_() {
    initAssociations_ = new java.util.HashSet<String>();
  }
  
  public StringBuilder getProcessingIdForAssociations_() {
    if (initAssociations_ == null || initAssociations_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("ASSOC");
    for (Association association : Association.values()) {
    	if (initAssociations_.contains(association.name()))
    		result.append("@").append(association.name());
    }
    return result;
  }
  
  public String getProcessingId_(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes_();
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations_();
    if (processingIdForAssociations != null)
    	result.append(",").append(processingIdForAssociations);
    if (moreAttributes != null && moreAttributes.length > 0) {
    	result.append(",MORE");
    	for (String moreAttr : moreAttributes)
    		result.append("@").append(moreAttr);
    }
    return result.toString();
  }
}
