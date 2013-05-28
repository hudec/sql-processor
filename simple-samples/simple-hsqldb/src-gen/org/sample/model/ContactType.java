package org.sample.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum ContactType implements Serializable {

  HOME(0), BUSINESS(1), ABROAD(2);
  
  private static final long serialVersionUID = 1L;
  
  private static Map<Integer, ContactType> identifierMap = new HashMap<Integer, ContactType>();

    static {
        for (ContactType value : ContactType.values()) {
            identifierMap.put(value.getValue(), value);
        }
    }

    private Integer value;

    private ContactType(Integer value) {
        this.value = value;
    }

    public static ContactType fromValue(Integer value) {
        ContactType result = identifierMap.get(value);
        if (result == null) {
            throw new IllegalArgumentException("No ContactType for value: " + value);
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
