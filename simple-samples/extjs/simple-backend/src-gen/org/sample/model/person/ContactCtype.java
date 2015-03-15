package org.sample.model.person;

import java.util.Map;

@SuppressWarnings("all")
public enum ContactCtype {
  HOME("0"),
  
  BUSINESS("1"),
  
  ABROAD("2");
  private static Map<String, ContactCtype> identifierMap =  identifierMapBuild();
  
  public static Map<String, ContactCtype> identifierMapBuild() {
    Map<String, ContactCtype> _identifierMap = new java.util.HashMap<String, ContactCtype>();
    for (ContactCtype value : ContactCtype.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private ContactCtype(final String value) {
    this.value = value;
  }
  
  public static ContactCtype fromValue(final String value) {
    ContactCtype result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No ContactCtype for value: " + value);
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
