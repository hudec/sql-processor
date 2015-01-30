package org.sample.model.auth;
	
import java.util.Date;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

public class UserSession implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ORDER_BY_ID = 1;
	public static final int ORDER_BY_AUTH_USER_ID = 3;
	
	public UserSession() {
	}
		
	public UserSession(Long authUserId, Date lastAccess) {
		this.authUserId = authUserId;
		this.lastAccess = lastAccess;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserSession _setId(Long id) {
		this.id = id;
		return this;
	}

	private Long authUserId;

	public Long getAuthUserId() {
		return authUserId;
	}

	public void setAuthUserId(Long authUserId) {
		this.authUserId = authUserId;
	}

	public UserSession _setAuthUserId(Long authUserId) {
		this.authUserId = authUserId;
		return this;
	}

	private Date lastAccess;

	public Date getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	public UserSession _setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSession other = (UserSession) obj;
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
		return "UserSession [id=" + id + ", authUserId=" + authUserId + ", lastAccess=" + lastAccess + "]";
	}

	public String toStringFull() {
		return "UserSession [id=" + id + ", authUserId=" + authUserId + ", lastAccess=" + lastAccess + "]";
	}

	public enum OpAttribute {
		id, authUserId, lastAccess
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

	public UserSession _setOp(String operator, OpAttribute... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.remove(attribute.name());
	}

	public UserSession _clearOp(OpAttribute... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setOp(String operator, String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, operator);
	}

	public UserSession _setOp(String operator, String... attributes) {
		setOp(operator, attributes);
		return this;
	}

	public void clearOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.remove(attribute);
	}

	public UserSession _clearOp(String... attributes) {
		clearOp(attributes);
		return this;
	}

	public void setNullOp(OpAttribute... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (OpAttribute attribute : attributes)
			operators.put(attribute.name(), "is null");
	}

	public UserSession _setNullOp(OpAttribute... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void setNullOp(String... attributes) {
		if (attributes == null)
			throw new IllegalArgumentException();
		for (String attribute : attributes)
			operators.put(attribute, "is null");
	}

	public UserSession _setNullOp(String... attributes) {
		setNullOp(attributes);
		return this;
	}

	public void clearAllOps() {
		operators = new HashMap<String, String>();
	}
}
