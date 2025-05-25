package org.sqlproc.engine.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum for Country
 */
public enum Country {
    SWEDEN("SE", "SWE", 752), NORWAY("NO", "NOR", 578), DENMARK("DK", "DNK", 208), UNITED_STATES("US", "USA", 840), UNITED_KINGDOM(
            "GB", "GBR", 826), FRANCE("FR", "FRA", 250), CZECH_REPUBLIC("CZ", "CZE", 203);
    private static Map<String, Country> identifierMap = new HashMap<String, Country>();

    static {
        for (Country value : Country.values()) {
            identifierMap.put(value.getAlpha2(), value);
        }
    }

    private String alpha2;
    private String alpha3;
    private int numeric;

    private Country(String alpha2, String alpha3, int numeric) {
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.numeric = numeric;
    }

    public static Country fromAlpha2(String alpha2) {
        Country result = identifierMap.get(alpha2);
        if (result == null) {
            throw new IllegalArgumentException("No Country for alpha2: " + alpha2);
        }
        return result;
    }

    public static Country fromValue(String alpha2) {
        Country result = identifierMap.get(alpha2.toUpperCase());
        if (result == null) {
            throw new IllegalArgumentException("No Country for alpha2: " + alpha2);
        }
        return result;
    }

    public String getValue() {
        return alpha2;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public int getNumeric() {
        return numeric;
    }

    public String getName() {
        return name();
    }
}
