package org.sample.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.sample.model.Contact;
import org.sample.model.PersonDetail;
import org.sample.model.PersonGender;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class Person implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
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
  
  @NotNull
  @Size(max = 100)
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
  
  @NotNull
  @Size(max = 100)
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
  
  private Date dateOfBirth;
  
  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public Person _setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
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
  
  @Size(max = 100)
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
  
  private List<PersonDetail> personDetails = new java.util.ArrayList<PersonDetail>();
  
  public List<PersonDetail> getPersonDetails() {
    return this.personDetails;
  }
  
  public void setPersonDetails(final List<PersonDetail> personDetails) {
    this.personDetails = personDetails;
  }
  
  public Person _setPersonDetails(final List<PersonDetail> personDetails) {
    this.personDetails = personDetails;
    return this;
  }
  
  private boolean onlyIds;
  
  public boolean isOnlyIds() {
    return this.onlyIds;
  }
  
  public void setOnlyIds(final boolean onlyIds) {
    this.onlyIds = onlyIds;
  }
  
  public Person _setOnlyIds(final boolean onlyIds) {
    this.onlyIds = onlyIds;
    return this;
  }
  
  private List<Long> ids = new java.util.ArrayList<Long>();
  
  public List<Long> getIds() {
    return this.ids;
  }
  
  public void setIds(final List<Long> ids) {
    this.ids = ids;
  }
  
  public Person _setIds(final List<Long> ids) {
    this.ids = ids;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("Person");
    if (id != null)
    	result.append("@").append("id");
    if (firstName != null)
    	result.append("@").append("firstName");
    if (lastName != null)
    	result.append("@").append("lastName");
    if (dateOfBirth != null)
    	result.append("@").append("dateOfBirth");
    if (gender != null)
    	result.append("@").append("gender");
    if (ssn != null)
    	result.append("@").append("ssn");
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
    return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + "]";
  }
  
  public String toStringFull() {
    return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + ", contacts=" + contacts + ", personDetails=" + personDetails + ", onlyIds=" + onlyIds + ", ids=" + ids + "]";
  }
  
  public enum Attribute {
    dateOfBirth,
    
    ssn;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  public void setNull(final Person.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  public Person _setNull(final Person.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final Person.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
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
  
  public StringBuilder getProcessingIdForNulls() {
    if (nullValues == null || nullValues.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("NULL");
    for (Attribute attribute : Attribute.values()) {
    	if (nullValues.contains(attribute.name()))
    		result.append("@").append(attribute.name());
    }
    return result;
  }
  
  public enum Association {
    contacts,
    
    personDetails;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
  public void setInit(final Person.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Person _setInit(final Person.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Person.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
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
  
  public enum OpAttribute {
    id,
    
    firstName,
    
    lastName,
    
    dateOfBirth,
    
    gender,
    
    ssn,
    
    contacts,
    
    personDetails,
    
    onlyIds,
    
    ids;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  public void setOp(final String operator, final Person.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  public Person _setOp(final String operator, final Person.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final Person.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
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
  
  public void setNullOp(final Person.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
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
  
  public StringBuilder getProcessingIdForOperators() {
    if (operators == null || operators.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("OPER");
    for (OpAttribute opAttribute : OpAttribute.values()) {
    	if (operators.containsKey(opAttribute.name()))
    		result.append("@").append(opAttribute.name()).append("=").append(operators.get(opAttribute.name()));
    }
    return result;
  }
  
  public String getProcessingId(final String... moreAttributes) {
    if (ids != null && !ids.isEmpty())
    	return null;
    StringBuilder result = getProcessingIdForAttributes();
    StringBuilder processingIdForNulls = getProcessingIdForNulls();
    if (processingIdForNulls != null)
    	result.append(",").append(processingIdForNulls);
    StringBuilder processingIdForAssociations = getProcessingIdForAssociations();
    if (processingIdForAssociations != null)
    	result.append(",").append(processingIdForAssociations);
    StringBuilder processingIdForOperators = getProcessingIdForOperators();
    if (processingIdForOperators != null)
    	result.append(",").append(processingIdForOperators);
    if (moreAttributes != null && moreAttributes.length > 0) {
    	result.append(",MORE");
    	for (String moreAttr : moreAttributes)
    		result.append("@").append(moreAttr);
    }
    return result.toString();
  }
}
