package org.sample.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.sample.model.Person;
import org.sample.model.PersonDetailType;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class PersonDetail implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  private Person id;
  
  public Person getId() {
    return this.id;
  }
  
  public void setId(final Person id) {
    this.id = id;
  }
  
  public PersonDetail _setId(final Person id) {
    this.id = id;
    return this;
  }
  
  private PersonDetailType type;
  
  public PersonDetailType getType() {
    return this.type;
  }
  
  public void setType(final PersonDetailType type) {
    this.type = type;
  }
  
  public PersonDetail _setType(final PersonDetailType type) {
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
  
  public PersonDetail _setWeight(final Integer weight) {
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
  
  public PersonDetail _setHeight(final Integer height) {
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
  
  public PersonDetail _setDisposition(final String disposition) {
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
  
  public PersonDetail _setTitles(final String titles) {
    this.titles = titles;
    return this;
  }
  
  private boolean onlyIds;
  
  public boolean isOnlyIds() {
    return this.onlyIds;
  }
  
  public void setOnlyIds(final boolean onlyIds) {
    this.onlyIds = onlyIds;
  }
  
  public PersonDetail _setOnlyIds(final boolean onlyIds) {
    this.onlyIds = onlyIds;
    return this;
  }
  
  @XmlTransient
  private List<Long> ids = new java.util.ArrayList<Long>();
  
  @XmlTransient
  public List<Long> getIds() {
    return this.ids;
  }
  
  public void setIds(final List<Long> ids) {
    this.ids = ids;
  }
  
  public PersonDetail _setIds(final List<Long> ids) {
    this.ids = ids;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes() {
    StringBuilder result = new StringBuilder("PersonDetail");
    if (id != null)
    	result.append("@").append("{").append(id.getProcessingIdForAttributes()).append("}");
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
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    PersonDetail other = (PersonDetail) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    if (type == null || !type.equals(other.type))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, type);
  }
  
  @Override
  public String toString() {
    return "PersonDetail [type=" + type + ", weight=" + weight + ", height=" + height + ", disposition=" + disposition + ", titles=" + titles + "]";
  }
  
  public String toStringFull() {
    return "PersonDetail [id=" + id + ", type=" + type + ", weight=" + weight + ", height=" + height + ", disposition=" + disposition + ", titles=" + titles + ", onlyIds=" + onlyIds + ", ids=" + ids + "]";
  }
  
  public enum Attribute {
    weight,
    
    height,
    
    disposition,
    
    titles;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  public void setNull(final PersonDetail.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  public PersonDetail _setNull(final PersonDetail.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final PersonDetail.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  public PersonDetail _clearNull(final PersonDetail.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public PersonDetail _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public PersonDetail _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(final PersonDetail.Attribute attribute) {
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
    id;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
  public void setInit(final PersonDetail.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public PersonDetail _setInit(final PersonDetail.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final PersonDetail.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public PersonDetail _clearInit(final PersonDetail.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public PersonDetail _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public PersonDetail _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final PersonDetail.Association association) {
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
    
    type,
    
    weight,
    
    height,
    
    disposition,
    
    titles,
    
    onlyIds,
    
    ids;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  public void setOp(final String operator, final PersonDetail.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  public PersonDetail _setOp(final String operator, final PersonDetail.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final PersonDetail.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  public PersonDetail _clearOp(final PersonDetail.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public PersonDetail _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public PersonDetail _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setNullOp(final PersonDetail.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  public PersonDetail _setNullOp(final PersonDetail.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public PersonDetail _setNullOp(final String... attributes) {
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
