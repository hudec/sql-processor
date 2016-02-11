package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public class Payment extends BaseModelImpl implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_BILLING_DETAILS = "BILLING_DETAILS";
  
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
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public Payment _setVersion(final Integer version) {
    this.version = version;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("Payment");
    if (id != null)
    	result.append("@").append("id");
    if (billingDetails != null)
    	result.append("@").append("{").append(billingDetails.getProcessingIdForAttributes()).append("}");
    if (paid != null)
    	result.append("@").append("paid");
    if (version != null)
    	result.append("@").append("version");
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
    return "Payment [id=" + id + ", paid=" + paid + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Payment [id=" + id + ", billingDetails=" + billingDetails + ", paid=" + paid + ", version=" + version + "]";
  }
  
  public enum Association {
    billingDetails;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
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
  
  public StringBuilder getProcessingIdForAssociations() {
    if (initAssociations == null || initAssociations.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("ASSOC");
    for (Association association : Association.values()) {
    	if (initAssociations.contains(association.name()))
    		result.append("@").append(association.name());
    }
    return result;
  }
  
  public String getProcessingId(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes();
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations();
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
