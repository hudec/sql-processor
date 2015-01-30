package org.sample.model.person;
	
import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import ch.ralscha.extdirectspring.generator.ModelField;
import ch.ralscha.extdirectspring.generator.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

@Model(value = "SimpleWeb.model.Relative")
@JsonIgnore
@JsonIgnore
public class Relative implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	public static final int ORDER_BY_ID = 1;
	@JsonIgnore
	public static final int ORDER_BY_PERSON_ID = 2;
	@JsonIgnore
	public static final int ORDER_BY_REL_PERSON = 3;
	
	public Relative() {
	}
		
	public Relative(Long personId, Person relPerson, RelativeRtype rtype) {
		this.personId = personId;
		this.relPerson = relPerson;
		this.rtype = rtype;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Relative _setId(Long id) {
		this.id = id;
		return this;
	}

	private Long personId;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Relative _setPersonId(Long personId) {
		this.personId = personId;
		return this;
	}

	@ModelAssociation(value = ModelAssociationType.HAS_ONE, model = Person.class)
	private Person relPerson;

	public Person getRelPerson() {
		return relPerson;
	}

	public void setRelPerson(Person relPerson) {
		this.relPerson = relPerson;
	}

	public Relative _setRelPerson(Person relPerson) {
		this.relPerson = relPerson;
		return this;
	}

	@ModelField(type = ModelType.STRING)
	@NotNull
	private RelativeRtype rtype;

	public RelativeRtype getRtype() {
		return rtype;
	}

	public void setRtype(RelativeRtype rtype) {
		this.rtype = rtype;
	}

	public Relative _setRtype(RelativeRtype rtype) {
		this.rtype = rtype;
		return this;
	}

	@NotNull
	private Integer version;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Relative _setVersion(Integer version) {
		this.version = version;
		return this;
	}

	public enum Association {
		relPerson
	}

	private Set<String> initAssociations = new HashSet<String>();

	@JsonIgnore
	public void setInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.add(association.name());
	}
	
	@JsonIgnore
	public Relative	_setInit(Association... associations) {
		setInit(associations);
		return this;
	}

	@JsonIgnore
	public void clearInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.remove(association.name());
	}

	@JsonIgnore
	public Relative _clearInit(Association... associations) {
		clearInit(associations);
		return this;
	}

	public void setInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.add(association);
	}

	public Relative _setInit(String... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.remove(association);
	}

	public Relative _clearInit(String... associations) {
		clearInit(associations);
		return this;
	}

	public Boolean toInit(String association) {
		if (association == null)
			throw new IllegalArgumentException();
		return initAssociations.contains(association);
	}

	public void clearAllInit() {
		initAssociations = new HashSet<String>();
	}

	public enum Attribute {
		version
	}

	private Set<String> nullValues = new HashSet<String>();

	@JsonIgnore
	public void setNull(Attribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (Attribute attribute : attributes)
			nullValues.add(attribute.name());
	}

	@JsonIgnore
	public Relative _setNull(Attribute... attributes) {
		setNull(attributes);
		return this;
	}

	@JsonIgnore
	public void clearNull(Attribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (Attribute attribute : attributes)
			nullValues.remove(attribute.name());
	}

	@JsonIgnore
	public Relative _clearNull(Attribute... attributes) {
		clearNull(attributes);
		return this;
	}

	public void setNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.add(attribute);
	}

	public Relative _setNull(String... attributes) {
		setNull(attributes);
		return this;
	}

	public void clearNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.remove(attribute);
	}

	public Relative _clearNull(String... attributes) {
		clearNull(attributes);
		return this;
	}

	public Boolean isNull(String attrName) {
		if (attrName == null)
			throw new IllegalArgumentException();
		return nullValues.contains(attrName);
	}

	@JsonIgnore
	public Boolean isNull(Attribute attribute) {
		if (attribute == null)
			throw new IllegalArgumentException();
		return nullValues.contains(attribute.name());
	}

	public Boolean isDef(String attrName) {
		if (attrName == null)
			throw new IllegalArgumentException();
		if (nullValues.contains(attrName))
			return true;
		try {
			Object result = MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
			return (result != null) ? true : false;
		} catch (NoSuchMethodException e) {
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		try {
			Object result = MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
			return (result != null) ? true : false;
		} catch (NoSuchMethodException e) {
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		return false;
	}

	public void clearAllNull() {
		nullValues = new HashSet<String>();
	}

	@Override
	public boolean equals(Object obj) {
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id != null) ? id.hashCode() : 0);
		return result;
	}	

	@Override
	public String toString() {
		return "Relative [id=" + id + ", rtype=" + rtype + ", personId=" + personId + ", version=" + version + "]";
	}

	public String toStringFull() {
		return "Relative [id=" + id + ", personId=" + personId + ", relPerson=" + relPerson + ", rtype=" + rtype + ", version=" + version + "]";
	}

	public enum OpAttribute {
		id, personId, relPerson, rtype, version
	}

	@JsonIgnore
	private Map<String, String> operators = new HashMap<String, String>();

	public Map<String, String> getOperators() {
		return operators;
	}

	@JsonIgnore
	public void setOp(String operator, OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.put(attribute.name(), operator);
	}

	@JsonIgnore
	public Relative _setOp(String operator, OpAttribute... attributes) {
		setOp(operator, attributes);
		return this;
	}

	@JsonIgnore
	public void clearOp(OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.remove(attribute.name());
	}

	@JsonIgnore
	public Relative _clearOp(OpAttribute... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setOp(String operator, String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, operator);
	}

	public Relative _setOp(String operator, String... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.remove(attribute);
	}

	public Relative _clearOp(String... attributes) {
		clearOp(attributes);
		return this;
	}

	@JsonIgnore
	public void setNullOp(OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.put(attribute.name(), "is null");
	}

	@JsonIgnore
	public Relative _setNullOp(OpAttribute... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void setNullOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, "is null");
	}

	public Relative _setNullOp(String... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void clearAllOps() {
		operators = new HashMap<String, String>();
	}
}
