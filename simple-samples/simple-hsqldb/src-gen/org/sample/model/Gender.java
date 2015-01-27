package org.sample.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum Gender implements Serializable {

	MALE("M"), FEMALE("F"), UNKNOWN("0");
		
	private static final long serialVersionUID = 1L;
	
	private static Map<String, Gender> identifierMap = new HashMap<String, Gender>();

	static {
		for (Gender value : Gender.values()) {
			identifierMap.put(value.getValue(), value);
		}
	}

	private String value;

	private Gender(String value) {
		this.value = value;
	}

	public static Gender fromValue(String value) {
		Gender result = identifierMap.get(value);
		if (result == null) {
			throw new IllegalArgumentException("No Gender for value: " + value);
		}
		return result;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return name();
	}
}
