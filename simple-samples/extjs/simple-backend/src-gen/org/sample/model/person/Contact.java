package org.sample.model.person;
	
import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelField;
import ch.ralscha.extdirectspring.generator.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

@Model(value = "SimpleWeb.model.Contact", paging = true, readMethod = "simpleService.loadContacts")
@JsonIgnore
@JsonIgnore
public class Contact implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	public static final int ORDER_BY_ID = 1;
	@JsonIgnore
	public static final int ORDER_BY_PERSON_ID = 2;
	@JsonIgnore
	public static final int ORDER_BY_COUNTRY = 3;
	
	public Contact() {
	}
		
	public Contact(Long personId, ContactCtype ctype, String address, Country country) {
		this.personId = personId;
		this.ctype = ctype;
		this.address = address;
		this.country = country;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contact _setId(Long id) {
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

	public Contact _setPersonId(Long personId) {
		this.personId = personId;
		return this;
	}

	@ModelField(type = ModelType.STRING)
	@NotNull
	private ContactCtype ctype;

	public ContactCtype getCtype() {
		return ctype;
	}

	public void setCtype(ContactCtype ctype) {
		this.ctype = ctype;
	}

	public Contact _setCtype(ContactCtype ctype) {
		this.ctype = ctype;
		return this;
	}

	@NotBlank
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Contact _setAddress(String address) {
		this.address = address;
		return this;
	}

	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact _setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	@NotNull
	private Integer version = 0;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Contact _setVersion(Integer version) {
		this.version = version;
		return this;
	}

	private Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
		if (this.country != null)
			this.countryCode = this.country.getCode();
	}

	public Contact _setCountry(Country country) {
		this.country = country;
		if (this.country != null)
			this.countryCode = this.country.getCode();
		return this;
	}

	private String countryCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if (this.country == null)
			this.country = new Country();
		this.country.setCode(countryCode);
	}

	public Contact _setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if (this.country == null)
			this.country = new Country();
		this.country.setCode(countryCode);
		return this;
	}

	public enum Association {
		country
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
	public Contact	_setInit(Association... associations) {
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
	public Contact _clearInit(Association... associations) {
		clearInit(associations);
		return this;
	}

	public void setInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.add(association);
	}

	public Contact _setInit(String... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.remove(association);
	}

	public Contact _clearInit(String... associations) {
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
		phoneNumber
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
	public Contact _setNull(Attribute... attributes) {
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
	public Contact _clearNull(Attribute... attributes) {
		clearNull(attributes);
		return this;
	}

	public void setNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.add(attribute);
	}

	public Contact _setNull(String... attributes) {
		setNull(attributes);
		return this;
	}

	public void clearNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.remove(attribute);
	}

	public Contact _clearNull(String... attributes) {
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
		Contact other = (Contact) obj;
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
		return "Contact [id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + ", countryCode=" + countryCode + ", ctype=" + ctype + ", personId=" + personId + ", version=" + version + "]";
	}

	public String toStringFull() {
		return "Contact [id=" + id + ", personId=" + personId + ", ctype=" + ctype + ", address=" + address + ", phoneNumber=" + phoneNumber + ", version=" + version + ", country=" + country + ", countryCode=" + countryCode + "]";
	}

	public enum OpAttribute {
		id, personId, ctype, address, phoneNumber, version, country, countryCode
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
	public Contact _setOp(String operator, OpAttribute... attributes) {
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
	public Contact _clearOp(OpAttribute... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setOp(String operator, String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, operator);
	}

	public Contact _setOp(String operator, String... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.remove(attribute);
	}

	public Contact _clearOp(String... attributes) {
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
	public Contact _setNullOp(OpAttribute... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void setNullOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, "is null");
	}

	public Contact _setNullOp(String... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void clearAllOps() {
		operators = new HashMap<String, String>();
	}
}
