package org.sample.model.person;

import java.util.Map;

@SuppressWarnings("all")
public enum RelativeRtype {
  FATHER("F"),
  
  MOTHER("M"),
  
  SON("S"),
  
  DAUGHTER("D"),
  
  HUSBAND("H"),
  
  WIFE("W"),
  
  BROTHER("B"),
  
  SISTER("I");
  private static Map<String, RelativeRtype> identifierMap =  identifierMapBuild();
  
  public static Map<String, RelativeRtype> identifierMapBuild() {
    Map<String, RelativeRtype> _identifierMap = new java.util.HashMap<String, RelativeRtype>();
    for (RelativeRtype value : RelativeRtype.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private RelativeRtype(final String value) {
    this.value = value;
  }
  
  public static RelativeRtype fromValue(final String value) {
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
