package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.Media;

@Pojo
@SuppressWarnings("all")
public class Person implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_NAME = "NAME";
  
  public Person() {
  }
  
  public Person(final String name) {
    super();
    setName(name);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Person _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public Person _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private List<Contact> contacts = new java.util.ArrayList<Contact>();
  
  public List<Contact> getContacts() {
    return this.contacts;
  }
  
  public void setContacts(final List<Contact> contacts) {
    this.contacts = contacts;
  }
  
  public Person _setContacts(final List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  private List<Media> library = new java.util.ArrayList<Media>();
  
  public List<Media> getLibrary() {
    return this.library;
  }
  
  public void setLibrary(final List<Media> library) {
    this.library = library;
  }
  
  public Person _setLibrary(final List<Media> library) {
    this.library = library;
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
    Person other = (Person) obj;
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
    return "Person [id=" + id + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Person [id=" + id + ", name=" + name + ", contacts=" + contacts + ", library=" + library + "]";
  }
}
