package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.Library;

@Pojo
@SuppressWarnings("all")
public class Subscriber implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_LIBRARY = "LIBRARY";
  
  public Subscriber() {
  }
  
  public Subscriber(final Library library, final String name) {
    super();
    setLibrary(library);
    setName(name);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Subscriber _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Library library;
  
  public Library getLibrary() {
    return this.library;
  }
  
  public void setLibrary(final Library library) {
    this.library = library;
  }
  
  public Subscriber _setLibrary(final Library library) {
    this.library = library;
    return this;
  }
  
  private Contact contact;
  
  public Contact getContact() {
    return this.contact;
  }
  
  public void setContact(final Contact contact) {
    this.contact = contact;
  }
  
  public Subscriber _setContact(final Contact contact) {
    this.contact = contact;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public Subscriber _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private List<BillingDetails> billingDetails = new java.util.ArrayList<BillingDetails>();
  
  public List<BillingDetails> getBillingDetails() {
    return this.billingDetails;
  }
  
  public void setBillingDetails(final List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
  }
  
  public Subscriber _setBillingDetails(final List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("Subscriber");
    if (id != null)
    	result.append("@").append("id");
    if (library != null)
    	result.append("@").append("{").append(library.getProcessingIdForAttributes_()).append("}");
    if (contact != null)
    	result.append("@").append("{").append(contact.getProcessingIdForAttributes_()).append("}");
    if (name != null)
    	result.append("@").append("name");
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
    Subscriber other = (Subscriber) obj;
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
    return "Subscriber [id=" + id + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Subscriber [id=" + id + ", library=" + library + ", contact=" + contact + ", name=" + name + ", billingDetails=" + billingDetails + "]";
  }
  
  public enum Attribute {
    contact;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final Subscriber.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public Subscriber _setNull_(final Subscriber.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final Subscriber.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public Subscriber _clearNull_(final Subscriber.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public Subscriber _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public Subscriber _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final Subscriber.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attribute.name());
  }
  
  public Boolean isNull_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attrName);
  }
  
  public Boolean isDef_(final String attrName, final Boolean isAttrNotNull) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues_.contains(attrName))
    	return true;
    if (isAttrNotNull != null)
    	return isAttrNotNull;
    return false;
  }
  
  public void clearAllNull_() {
    nullValues_ = new java.util.HashSet<String>();
  }
  
  public StringBuilder getProcessingIdForNulls_() {
    if (nullValues_ == null || nullValues_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("NULL");
    for (Attribute attribute : Attribute.values()) {
    	if (nullValues_.contains(attribute.name()))
    		result.append("@").append(attribute.name());
    }
    return result;
  }
  
  public enum Association {
    library,
    
    contact,
    
    billingDetails;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Subscriber.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Subscriber _setInit_(final Subscriber.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Subscriber.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Subscriber _clearInit_(final Subscriber.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Subscriber _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Subscriber _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Subscriber.Association association) {
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
    StringBuilder processingIdForNulls = getProcessingIdForNulls_();
    if (processingIdForNulls != null)
    	result.append(",").append(processingIdForNulls);
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
