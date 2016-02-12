package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
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
  
  private Long contact;
  
  public Long getContact() {
    return this.contact;
  }
  
  public void setContact(final Long contact) {
    this.contact = contact;
  }
  
  public Subscriber _setContact(final Long contact) {
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
    return "Subscriber [id=" + id + ", contact=" + contact + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Subscriber [id=" + id + ", library=" + library + ", contact=" + contact + ", name=" + name + ", billingDetails=" + billingDetails + "]";
  }
}
