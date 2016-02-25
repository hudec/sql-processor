package org.sample.model;

import java.util.Map;

@SuppressWarnings("all")
public enum ContactType {
  BUSINESS(1),
  
  HOME(0);
  private static Map<Integer, ContactType> identifierMap =  identifierMapBuild();
  
  public static Map<Integer, ContactType> identifierMapBuild() {
    Map<Integer, ContactType> _identifierMap = new java.util.HashMap<Integer, ContactType>();
    for (ContactType value : ContactType.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private Integer value;
  
  private ContactType(final Integer value) {
    this.value = value;
  }
  
  public static ContactType fromValue(final Integer value) {
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
