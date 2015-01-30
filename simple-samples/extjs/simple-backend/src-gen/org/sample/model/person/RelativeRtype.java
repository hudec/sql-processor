package org.sample.model.person;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum RelativeRtype implements Serializable {

	FATHER("F"), MOTHER("M"), SON("S"), DAUGHTER("D"), HUSBAND("H"), WIFE("W"), BROTHER("B"), SISTER("I");
		
	private static final long serialVersionUID = 1L;
	
	private static Map<String, RelativeRtype> identifierMap = new HashMap<String, RelativeRtype>();

	static {
		for (RelativeRtype value : RelativeRtype.values()) {
			identifierMap.put(value.getValue(), value);
		}
	}

	private String value;

	private RelativeRtype(String value) {
		this.value = value;
	}

	public static RelativeRtype fromValue(String value) {
		RelativeRtype result = identifierMap.get(value);
		if (result == null) {
			throw new IllegalArgumentException("No RelativeRtype for value: " + value);
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
