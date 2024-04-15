package org.sample.model;

import java.util.Map;

@SuppressWarnings("all")
public enum ContactCtype {
  ABROAD(2),

  BUSINESS(1),

  HOME(0);
  private static Map<Integer, ContactCtype> identifierMap =  identifierMapBuild();

  public static Map<Integer, ContactCtype> identifierMapBuild() {
    Map<Integer, ContactCtype> _identifierMap = new java.util.HashMap<Integer, ContactCtype>();
    for (ContactCtype value : ContactCtype.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }

  private Integer value;

  private ContactCtype(final Integer value) {
    this.value = value;
  }

  public static ContactCtype fromValue(final Integer value) {
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
