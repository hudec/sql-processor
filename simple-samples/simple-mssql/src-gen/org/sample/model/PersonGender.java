package org.sample.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum PersonGender implements Serializable {

  UNKNOWN("0"), FEMALE("F"), MALE("M");
  
  private static final long serialVersionUID = 1L;
  
  private static Map<String, PersonGender> identifierMap = new HashMap<String, PersonGender>();

    static {
        for (PersonGender value : PersonGender.values()) {
            identifierMap.put(value.getValue(), value);
        }
    }

    private String value;

    private PersonGender(String value) {
        this.value = value;
    }

    public static PersonGender fromValue(String value) {
        PersonGender result = identifierMap.get(value);
        if (result == null) {
            throw new IllegalArgumentException("No PersonGender for value: " + value);
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
