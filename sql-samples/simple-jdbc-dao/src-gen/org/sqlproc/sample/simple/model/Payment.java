package org.sqlproc.sample.simple.model;
	
import java.sql.Timestamp;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class Payment extends BaseModelImpl implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ORDER_BY_ID = 1;
	public static final int ORDER_BY_BILLING_DETAILS = 2;
	
	public Payment() {
	}
		
	public Payment(BillingDetails billingDetails, Timestamp paid) {
		this.billingDetails = billingDetails;
		this.paid = paid;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Payment _setId(Long id) {
		this.id = id;
		return this;
	}

	private BillingDetails billingDetails;

	public BillingDetails getBillingDetails() {
		return billingDetails;
	}

	public void setBillingDetails(BillingDetails billingDetails) {
		this.billingDetails = billingDetails;
	}

	public Payment _setBillingDetails(BillingDetails billingDetails) {
		this.billingDetails = billingDetails;
		return this;
	}

	private Timestamp paid;

	public Timestamp getPaid() {
		return paid;
	}

	public void setPaid(Timestamp paid) {
		this.paid = paid;
	}

	public Payment _setPaid(Timestamp paid) {
		this.paid = paid;
		return this;
	}

	private Integer version = 0;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Payment _setVersion(Integer version) {
		this.version = version;
		return this;
	}

	public enum Association {
		billingDetails
	}

	private Set<String> initAssociations = new HashSet<String>();

	public void setInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.add(association.name());
	}
	
	public Payment	_setInit(Association... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.remove(association.name());
	}

	public Payment _clearInit(Association... associations) {
		clearInit(associations);
		return this;
	}

	public void setInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.add(association);
	}

	public Payment _setInit(String... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.remove(association);
	}

	public Payment _clearInit(String... associations) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
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
		return "Payment [id=" + id + ", paid=" + paid + ", version=" + version + "]";
	}

	public String toStringFull() {
		return "Payment [id=" + id + ", billingDetails=" + billingDetails + ", paid=" + paid + ", version=" + version + "]";
	}
}
