package org.sample.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.sample.model.Person;
import org.sample.model.PersonDetailType;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class PersonDetail implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_PERSON = "PERSON";
  
  public PersonDetail() {
  }
  
  public PersonDetail(final Person person, final PersonDetailType type) {
    super();
    setPerson(person);
    setType(type);
  }
  
  @NotNull
  private Person person;
  
  public Person getPerson() {
    return this.person;
  }
  
  public void setPerson(final Person person) {
    this.person = person;
  }
  
  public PersonDetail withPerson(final Person person) {
    this.person = person;
    return this;
  }
  
  @NotNull
  private PersonDetailType type;
  
  public PersonDetailType getType() {
    return this.type;
  }
  
  public void setType(final PersonDetailType type) {
    this.type = type;
  }
  
  public PersonDetail withType(final PersonDetailType type) {
    this.type = type;
    return this;
  }
  
  private Integer weight;
  
  public Integer getWeight() {
    return this.weight;
  }
  
  public void setWeight(final Integer weight) {
    this.weight = weight;
  }
  
  public PersonDetail withWeight(final Integer weight) {
    this.weight = weight;
    return this;
  }
  
  private Integer height;
  
  public Integer getHeight() {
    return this.height;
  }
  
  public void setHeight(final Integer height) {
    this.height = height;
  }
  
  public PersonDetail withHeight(final Integer height) {
    this.height = height;
    return this;
  }
  
  @Size(max = 200)
  private String disposition;
  
  public String getDisposition() {
    return this.disposition;
  }
  
  public void setDisposition(final String disposition) {
    this.disposition = disposition;
  }
  
  public PersonDetail withDisposition(final String disposition) {
    this.disposition = disposition;
    return this;
  }
  
  @Size(max = 100)
  private String titles;
  
  public String getTitles() {
    return this.titles;
  }
  
  public void setTitles(final String titles) {
    this.titles = titles;
  }
  
  public PersonDetail withTitles(final String titles) {
    this.titles = titles;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("PersonDetail");
    if (person != null)
    	result.append("@").append("{").append(person.getProcessingIdForAttributes_()).append("}");
    if (type != null)
    	result.append("@").append("type");
    if (weight != null)
    	result.append("@").append("weight");
    if (height != null)
    	result.append("@").append("height");
    if (disposition != null)
    	result.append("@").append("disposition");
    if (titles != null)
    	result.append("@").append("titles");
    return result;
  }
  
  @Override
  public String toString() {
    return "PersonDetail [type=" + type + ", weight=" + weight + ", height=" + height + ", disposition=" + disposition + ", titles=" + titles + "]";
  }
  
  public String toStringFull() {
    return "PersonDetail [person=" + person + ", type=" + type + ", weight=" + weight + ", height=" + height + ", disposition=" + disposition + ", titles=" + titles + "]";
  }
  
  public enum Attribute {
    weight,
    
    height,
    
    disposition,
    
    titles;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final PersonDetail.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public PersonDetail withNull_(final PersonDetail.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final PersonDetail.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public PersonDetail _clearNull_(final PersonDetail.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public PersonDetail withNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public PersonDetail _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final PersonDetail.Attribute attribute) {
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
    person;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final PersonDetail.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public PersonDetail withInit_(final PersonDetail.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final PersonDetail.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public PersonDetail _clearInit_(final PersonDetail.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public PersonDetail withInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public PersonDetail _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final PersonDetail.Association association) {
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
  
  public enum OpAttribute {
    person,
    
    type,
    
    weight,
    
    height,
    
    disposition,
    
    titles;
  }
  
  private Map<String, String> operators_ =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators_() {
    return operators_;
  }
  
  public String getOp_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return operators_.get(attrName);
  }
  
  public void setOp_(final String operator, final PersonDetail.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public PersonDetail withOp_(final String operator, final PersonDetail.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final PersonDetail.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public PersonDetail _clearOp_(final PersonDetail.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public PersonDetail withOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public PersonDetail _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final PersonDetail.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public PersonDetail withNullOp_(final PersonDetail.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public PersonDetail withNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
  
  public StringBuilder getProcessingIdForOperators_() {
    if (operators_ == null || operators_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("OPER");
    for (OpAttribute opAttribute : OpAttribute.values()) {
    	if (operators_.containsKey(opAttribute.name()))
    		result.append("@").append(opAttribute.name()).append("=").append(operators_.get(opAttribute.name()));
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
    StringBuilder processingIdForOperators = getProcessingIdForOperators_();
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
