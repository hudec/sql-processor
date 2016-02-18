package org.sample.model;

import java.util.Map;

@SuppressWarnings("all")
public enum PersonDetailType {
  I0(0),
  
  I1(1),
  
  I2(2),
  
  I3(3),
  
  I4(4);
  private static Map<Integer, PersonDetailType> identifierMap =  identifierMapBuild();
  
  public static Map<Integer, PersonDetailType> identifierMapBuild() {
    Map<Integer, PersonDetailType> _identifierMap = new java.util.HashMap<Integer, PersonDetailType>();
    for (PersonDetailType value : PersonDetailType.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private Integer value;
  
  private PersonDetailType(final Integer value) {
    this.value = value;
  }
  
  public static PersonDetailType fromValue(final Integer value) {
    PersonDetailType result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No PersonDetailType for value: " + value);
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
