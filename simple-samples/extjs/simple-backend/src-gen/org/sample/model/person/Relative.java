package org.sample.model.person;

import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import ch.ralscha.extdirectspring.generator.ModelField;
import ch.ralscha.extdirectspring.generator.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import jakarta.validation.constraints.NotNull;
import org.sample.model.person.Person;
import org.sample.model.person.RelativeRtype;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Model(value = "SimpleWeb.model.Relative")
@SuppressWarnings("all")
public class Relative implements Serializable {
  private final static long serialVersionUID = 1L;
  
  @JsonIgnore
  public final static String ORDER_BY_ID = "ID";
  
  @JsonIgnore
  public final static String ORDER_BY_PERSON_ID = "PERSON_ID";
  
  @JsonIgnore
  public final static String ORDER_BY_REL_PERSON = "REL_PERSON";
  
  public Relative() {
  }
  
  public Relative(final Long personId, final Person relPerson, final RelativeRtype rtype) {
    super();
    setPersonId(personId);
    setRelPerson(relPerson);
    setRtype(rtype);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Relative _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Long personId;
  
  public Long getPersonId() {
    return this.personId;
  }
  
  public void setPersonId(final Long personId) {
    this.personId = personId;
  }
  
  public Relative _setPersonId(final Long personId) {
    this.personId = personId;
    return this;
  }
  
  @ModelAssociation(value = ModelAssociationType.HAS_ONE, model = Person.class)
  private Person relPerson;
  
  public Person getRelPerson() {
    return this.relPerson;
  }
  
  public void setRelPerson(final Person relPerson) {
    this.relPerson = relPerson;
  }
  
  public Relative _setRelPerson(final Person relPerson) {
    this.relPerson = relPerson;
    return this;
  }
  
  @ModelField(type = ModelType.STRING)
  @NotNull
  private RelativeRtype rtype;
  
  public RelativeRtype getRtype() {
    return this.rtype;
  }
  
  public void setRtype(final RelativeRtype rtype) {
    this.rtype = rtype;
  }
  
  public Relative _setRtype(final RelativeRtype rtype) {
    this.rtype = rtype;
    return this;
  }
  
  @NotNull
  private Integer version;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public Relative _setVersion(final Integer version) {
    this.version = version;
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
    Relative other = (Relative) obj;
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
    return "Relative [id=" + id + ", personId=" + personId + ", rtype=" + rtype + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Relative [id=" + id + ", personId=" + personId + ", relPerson=" + relPerson + ", rtype=" + rtype + ", version=" + version + "]";
  }
  
  public enum Attribute {
    version;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setNull(final Relative.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public Relative _setNull(final Relative.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearNull(final Relative.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  @JsonIgnore
  public Relative _clearNull(final Relative.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public Relative _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public Relative _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public Boolean isNull(final Relative.Attribute attribute) {
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
    relPerson;
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
  public void setInit(final Relative.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public Relative _setInit(final Relative.Association... associations) {
    setInit(associations);
    return this;
  }
  
  @JsonIgnore
  public void clearInit(final Relative.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  @JsonIgnore
  public Relative _clearInit(final Relative.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Relative _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Relative _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  @JsonIgnore
  public Boolean toInit(final Relative.Association association) {
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
    
    personId,
    
    relPerson,
    
    rtype,
    
    version;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  @JsonIgnore
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(final String operator, final Relative.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public Relative _setOp(final String operator, final Relative.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearOp(final Relative.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  @JsonIgnore
  public Relative _clearOp(final Relative.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public Relative _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public Relative _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  @JsonIgnore
  public void setNullOp(final Relative.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  @JsonIgnore
  public Relative _setNullOp(final Relative.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public Relative _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
