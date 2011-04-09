package org.sqlproc.engine.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum Size implements Serializable {
    SMALL(0), MIDDLE(1), BIG(2);
    private static Map<Integer, Size> identifierMap = new HashMap<Integer, Size>();

    static {
        for (Size value : Size.values()) {
            identifierMap.put(value.getValue(), value);
        }
    }

    private Integer value;

    private Size(Integer value) {
        this.value = value;
    }

    public static Size fromValue(Integer value) {
        Size result = identifierMap.get(value);
        if (result == null) {
            throw new IllegalArgumentException("No Gender for value: " + value);
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
