package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public abstract class BillingDetails extends BaseModelImpl implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_SUBSCRIBER = "SUBSCRIBER";
  
  public BillingDetails() {
  }
  
  public BillingDetails(final Subscriber subscriber, final String type) {
    super();
    setSubscriber(subscriber);
    setType(type);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public BillingDetails _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Subscriber subscriber;
  
  public Subscriber getSubscriber() {
    return this.subscriber;
  }
  
  public void setSubscriber(final Subscriber subscriber) {
    this.subscriber = subscriber;
  }
  
  public BillingDetails _setSubscriber(final Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }
  
  private String type;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  public BillingDetails _setType(final String type) {
    this.type = type;
    return this;
  }
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public BillingDetails _setVersion(final Integer version) {
    this.version = version;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("BillingDetails");
    if (id != null)
    	result.append("@").append("id");
    if (subscriber != null)
    	result.append("@").append("{").append(subscriber.getProcessingIdForAttributes()).append("}");
    if (type != null)
    	result.append("@").append("type");
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
    BillingDetails other = (BillingDetails) obj;
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
    return "BillingDetails [id=" + id + ", type=" + type + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "BillingDetails [id=" + id + ", subscriber=" + subscriber + ", type=" + type + ", version=" + version + "]";
  }
  
  public enum Association {
    subscriber;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
  public void setInit(final BillingDetails.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public BillingDetails _setInit(final BillingDetails.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final BillingDetails.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public BillingDetails _clearInit(final BillingDetails.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public BillingDetails _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public BillingDetails _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final BillingDetails.Association association) {
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
