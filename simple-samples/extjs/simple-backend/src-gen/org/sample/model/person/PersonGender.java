package org.sample.model.person;

import java.util.Map;

@SuppressWarnings("all")
public enum PersonGender {
  FEMALE("F"),
  
  MALE("M"),
  
  UNKNOWN("0");
  private static Map<String, PersonGender> identifierMap =  identifierMapBuild();
  
  public static Map<String, PersonGender> identifierMapBuild() {
    Map<String, PersonGender> _identifierMap = new java.util.HashMap<String, PersonGender>();
    for (PersonGender value : PersonGender.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private PersonGender(final String value) {
    this.value = value;
  }
  
  public static PersonGender fromValue(final String value) {
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
