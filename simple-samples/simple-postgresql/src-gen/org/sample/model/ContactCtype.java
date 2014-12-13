package org.sample.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum ContactCtype implements Serializable {

	HOME(0), BUSINESS(1), ABROAD(2);
		
	private static final long serialVersionUID = 1L;
	
	private static Map<Integer, ContactCtype> identifierMap = new HashMap<Integer, ContactCtype>();

	static {
		for (ContactCtype value : ContactCtype.values()) {
			identifierMap.put(value.getValue(), value);
		}
	}

	private Integer value;

	private ContactCtype(Integer value) {
		this.value = value;
	}

	public static ContactCtype fromValue(Integer value) {
		ContactCtype result = identifierMap.get(value);
		if (result == null) {
			throw new IllegalArgumentException("No ContactCtype for value: " + value);
		}
		return result;
	}

	public Integer getValue() {
		return value;
	}

	public String getName() {
		return name();
	}
}
