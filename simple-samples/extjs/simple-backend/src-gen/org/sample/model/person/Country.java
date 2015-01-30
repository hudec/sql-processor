package org.sample.model.person;
	
import ch.ralscha.extdirectspring.generator.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

@Model(value = "SimpleWeb.model.Country", paging = true, readMethod = "simpleService.loadCountries")
@JsonIgnore
@JsonIgnore
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	public static final int ORDER_BY_ID = 1;
	@JsonIgnore
	public static final int ORDER_BY_CODE = 3;
	@JsonIgnore
	public static final int ORDER_BY_NAME = 4;
	
	public Country() {
	}
		
	public Country(String code) {
		this.code = code;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country _setId(Long id) {
		this.id = id;
		return this;
	}

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Country _setCode(String code) {
		this.code = code;
		return this;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country _setName(String name) {
		this.name = name;
		return this;
	}

	public enum Attribute {
		name
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
	public Country _setNull(Attribute... attributes) {
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
	public Country _clearNull(Attribute... attributes) {
		clearNull(attributes);
		return this;
	}

	public void setNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.add(attribute);
	}

	public Country _setNull(String... attributes) {
		setNull(attributes);
		return this;
	}

	public void clearNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.remove(attribute);
	}

	public Country _clearNull(String... attributes) {
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
		Country other = (Country) obj;
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
		return "Country [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

	public String toStringFull() {
		return "Country [id=" + id + ", code=" + code + ", name=" + name + "]";
	}

	public enum OpAttribute {
		id, code, name
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
	public Country _setOp(String operator, OpAttribute... attributes) {
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
	public Country _clearOp(OpAttribute... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setOp(String operator, String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, operator);
	}

	public Country _setOp(String operator, String... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.remove(attribute);
	}

	public Country _clearOp(String... attributes) {
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
	public Country _setNullOp(OpAttribute... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void setNullOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, "is null");
	}

	public Country _setNullOp(String... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void clearAllOps() {
		operators = new HashMap<String, String>();
	}
}
