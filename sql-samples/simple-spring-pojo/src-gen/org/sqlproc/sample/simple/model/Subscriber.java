package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.Library;

@Pojo
@SuppressWarnings("all")
public class Subscriber implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_SUBSCRIBER_ID = "SUBSCRIBER_ID";
  
  public final static String ORDER_BY_LIBRARY = "LIBRARY";
  
  public final static String ORDER_BY_CONTACT = "CONTACT";
  
  public Subscriber() {
  }
  
  public Subscriber(final Library library, final String name) {
    super();
    setLibrary(library);
    setName(name);
  }
  
  private Long subscriberId;
  
  public Long getSubscriberId() {
    return this.subscriberId;
  }
  
  public void setSubscriberId(final Long subscriberId) {
    this.subscriberId = subscriberId;
  }
  
  public Subscriber _setSubscriberId(final Long subscriberId) {
    this.subscriberId = subscriberId;
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
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    Subscriber other = (Subscriber) obj;
    if (subscriberId == null || !subscriberId.equals(other.subscriberId))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(subscriberId);
  }
  
  @Override
  public String toString() {
    return "Subscriber [subscriberId=" + subscriberId + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Subscriber [subscriberId=" + subscriberId + ", library=" + library + ", contact=" + contact + ", name=" + name + ", billingDetails=" + billingDetails + "]";
  }
}
