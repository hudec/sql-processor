package org.sample.model;
	
import java.sql.Timestamp;
import java.util.Date;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ORDER_BY_ID = 1;
	
	public Person() {
	}
		
	public Person(Date birthdate, Long version, String ssnNumber, String ssnCountry, String nameFirst, String nameLast, String sex) {
		this.birthdate = birthdate;
		this.version = version;
		this.ssnNumber = ssnNumber;
		this.ssnCountry = ssnCountry;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.sex = sex;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person _setId(Long id) {
		this.id = id;
		return this;
	}

	private Date birthdate;

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Person _setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
		return this;
	}

	private Timestamp lastupdated;

	public Timestamp getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Timestamp lastupdated) {
		this.lastupdated = lastupdated;
	}

	public Person _setLastupdated(Timestamp lastupdated) {
		this.lastupdated = lastupdated;
		return this;
	}

	private String lastupdatedby;

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public Person _setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
		return this;
	}

	private Timestamp createddate;

	public Timestamp getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	public Person _setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
		return this;
	}

	private String createdby;

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Person _setCreatedby(String createdby) {
		this.createdby = createdby;
		return this;
	}

	private Long version;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Person _setVersion(Long version) {
		this.version = version;
		return this;
	}

	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Person _setContact(Contact contact) {
		this.contact = contact;
		return this;
	}

	private String ssnNumber;

	public String getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public Person _setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
		return this;
	}

	private String ssnCountry;

	public String getSsnCountry() {
		return ssnCountry;
	}

	public void setSsnCountry(String ssnCountry) {
		this.ssnCountry = ssnCountry;
	}

	public Person _setSsnCountry(String ssnCountry) {
		this.ssnCountry = ssnCountry;
		return this;
	}

	private String nameFirst;

	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public Person _setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
		return this;
	}

	private String nameLast;

	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public Person _setNameLast(String nameLast) {
		this.nameLast = nameLast;
		return this;
	}

	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Person _setSex(String sex) {
		this.sex = sex;
		return this;
	}

	private Integer clothesSize;

	public Integer getClothesSize() {
		return clothesSize;
	}

	public void setClothesSize(Integer clothesSize) {
		this.clothesSize = clothesSize;
	}

	public Person _setClothesSize(Integer clothesSize) {
		this.clothesSize = clothesSize;
		return this;
	}

	public enum Association {
		contact
	}

	private Set<String> initAssociations = new HashSet<String>();

	public void setInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.add(association.name());
	}
	
	public Person	_setInit(Association... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.remove(association.name());
	}

	public Person _clearInit(Association... associations) {
		clearInit(associations);
		return this;
	}

	public void setInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.add(association);
	}

	public Person _setInit(String... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.remove(association);
	}

	public Person _clearInit(String... associations) {
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
		lastupdated, lastupdatedby, createddate, createdby, contact, clothesSize
	}

	private Set<String> nullValues = new HashSet<String>();

	public void setNull(Attribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (Attribute attribute : attributes)
			nullValues.add(attribute.name());
	}

	public Person _setNull(Attribute... attributes) {
		setNull(attributes);
		return this;
	}

	public void clearNull(Attribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (Attribute attribute : attributes)
			nullValues.remove(attribute.name());
	}

	public Person _clearNull(Attribute... attributes) {
		clearNull(attributes);
		return this;
	}

	public void setNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.add(attribute);
	}

	public Person _setNull(String... attributes) {
		setNull(attributes);
		return this;
	}

	public void clearNull(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			nullValues.remove(attribute);
	}

	public Person _clearNull(String... attributes) {
		clearNull(attributes);
		return this;
	}

	public Boolean isNull(String attrName) {
		if (attrName == null)
			throw new IllegalArgumentException();
		return nullValues.contains(attrName);
	}

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
		Person other = (Person) obj;
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
		return "Person [sex=" + sex + ", nameFirst=" + nameFirst + ", lastupdated=" + lastupdated + ", ssnCountry=" + ssnCountry + ", createddate=" + createddate + ", createdby=" + createdby + ", lastupdatedby=" + lastupdatedby + ", version=" + version + ", clothesSize=" + clothesSize + ", id=" + id + ", nameLast=" + nameLast + ", birthdate=" + birthdate + ", ssnNumber=" + ssnNumber + "]";
	}

	public String toStringFull() {
		return "Person [id=" + id + ", birthdate=" + birthdate + ", lastupdated=" + lastupdated + ", lastupdatedby=" + lastupdatedby + ", createddate=" + createddate + ", createdby=" + createdby + ", version=" + version + ", contact=" + contact + ", ssnNumber=" + ssnNumber + ", ssnCountry=" + ssnCountry + ", nameFirst=" + nameFirst + ", nameLast=" + nameLast + ", sex=" + sex + ", clothesSize=" + clothesSize + "]";
	}

	public enum OpAttribute {
		id, birthdate, lastupdated, lastupdatedby, createddate, createdby, version, contact, ssnNumber, ssnCountry, nameFirst, nameLast, sex, clothesSize
	}

	private Map<String, String> operators = new HashMap<String, String>();

	public Map<String, String> getOperators() {
		return operators;
	}

	public void setOp(String operator, OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.put(attribute.name(), operator);
	}

	public Person _setOp(String operator, OpAttribute... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.remove(attribute.name());
	}

	public Person _clearOp(OpAttribute... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setOp(String operator, String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, operator);
	}

	public Person _setOp(String operator, String... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.remove(attribute);
	}

	public Person _clearOp(String... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setNullOp(OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.put(attribute.name(), "is null");
	}

	public Person _setNullOp(OpAttribute... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void setNullOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, "is null");
	}

	public Person _setNullOp(String... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void clearAllOps() {
		operators = new HashMap<String, String>();
	}
}
