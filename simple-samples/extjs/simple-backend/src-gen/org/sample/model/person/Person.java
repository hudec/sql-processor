package org.sample.model.person;

import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import ch.ralscha.extdirectspring.generator.ModelField;
import ch.ralscha.extdirectspring.generator.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;
import org.sample.model.person.Contact;
import org.sample.model.person.PersonGender;
import org.sample.model.person.Relative;
import org.sample.web.util.DMYDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Model(value = "SimpleWeb.model.Person", paging = true, readMethod = "simpleService.loadPeople")
@SuppressWarnings("all")
public class Person implements Serializable {
  private final static long serialVersionUID = 1L;
  
  @JsonIgnore
  public final static String ORDER_BY_ID = "ID";
  
  @JsonIgnore
  public final static String ORDER_BY_LAST_NAME = "LAST_NAME";
  
  public Person() {
  }
  
  public Person(final String firstName, final String lastName, final PersonGender gender) {
    super();
    setFirstName(firstName);
    setLastName(lastName);
    setGender(gender);
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
  
  @NotBlank
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  public Person _setFirstName(final String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @NotBlank
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public Person _setLastName(final String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ModelField(dateFormat = "d.m.Y")
  @Past
  @DateTimeFormat(pattern = "dd.MM.yyyy")
  private Date dateOfBirth;
  
  @JsonSerialize(using = DMYDateSerializer.class)
  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  @JsonSerialize(using = DMYDateSerializer.class)
  public void setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public Person _setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
  @ModelField(type = ModelType.STRING)
  @NotNull
  private PersonGender gender;
  
  public PersonGender getGender() {
    return this.gender;
  }
  
  public void setGender(final PersonGender gender) {
    this.gender = gender;
  }
  
  public Person _setGender(final PersonGender gender) {
    this.gender = gender;
    return this;
  }
  
  private String ssn;
  
  public String getSsn() {
    return this.ssn;
  }
  
  public void setSsn(final String ssn) {
    this.ssn = ssn;
  }
  
  public Person _setSsn(final String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  @NotNull
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public Person _setVersion(final Integer version) {
    this.version = version;
    return this;
  }
  
  @ModelAssociation(value = ModelAssociationType.HAS_MANY, model = Contact.class)
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
  
  @ModelAssociation(value = ModelAssociationType.HAS_MANY, model = Relative.class)
  private List<Relative> relatives = new java.util.ArrayList<Relative>();
  
  public List<Relative> getRelatives() {
    return this.relatives;
  }
  
  public void setRelatives(final List<Relative> relatives) {
    this.relatives = relatives;
  }
  
  public Person _setRelatives(final List<Relative> relatives) {
    this.relatives = relatives;
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
    return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + ", version=" + version + ", contacts=" + contacts + ", relatives=" + relatives + "]";
  }
  
  public enum Attribute {
    dateOfBirth,
    
    ssn;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setNull(final Person.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public Person _setNull(final Person.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearNull(final Person.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  @JsonIgnore
  public Person _clearNull(final Person.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public Person _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public Person _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public Boolean isNull(final Person.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isNull(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isDef(final String attrName, final Boolean isAttrNotNull) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
    	return true;
    if (isAttrNotNull != null)
    	return isAttrNotNull;
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new java.util.HashSet<String>();
  }
  
  public enum Association {
    contacts,
    
    relatives;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  @JsonIgnore
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
  @JsonIgnore
  public void setInit(final Person.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public Person _setInit(final Person.Association... associations) {
    setInit(associations);
    return this;
  }
  
  @JsonIgnore
  public void clearInit(final Person.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  @JsonIgnore
  public Person _clearInit(final Person.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Person _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Person _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  @JsonIgnore
  public Boolean toInit(final Person.Association association) {
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
  
  public enum OpAttribute {
    id,
    
    firstName,
    
    lastName,
    
    dateOfBirth,
    
    gender,
    
    ssn,
    
    version,
    
    contacts,
    
    relatives;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  @JsonIgnore
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(final String operator, final Person.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public Person _setOp(final String operator, final Person.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearOp(final Person.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  @JsonIgnore
  public Person _clearOp(final Person.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public Person _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public Person _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  @JsonIgnore
  public void setNullOp(final Person.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  @JsonIgnore
  public Person _setNullOp(final Person.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public Person _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
