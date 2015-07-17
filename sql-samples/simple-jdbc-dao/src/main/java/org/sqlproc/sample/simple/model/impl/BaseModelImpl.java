package org.sqlproc.sample.simple.model.impl;

import java.util.HashSet;
import java.util.Set;

public class BaseModelImpl {

    private Set<String> initAssociations = new HashSet<String>();

    public void setInit(String... associations) {
        if (associations == null)
            throw new IllegalArgumentException();
        for (String association : associations)
            initAssociations.add(association);
    }

    public void clearInit(String... associations) {
        if (associations == null)
            throw new IllegalArgumentException();
        for (String association : associations)
            initAssociations.remove(association);
    }

    public Boolean toInit(String association) {
        if (association == null)
            throw new IllegalArgumentException();
        return initAssociations.contains(association);
    }

    public void clearAllInit() {
        initAssociations = new HashSet<String>();
    }

    private Set<String> nullValues = new HashSet<String>();

    public Boolean isNull(String attrName) {
        if (attrName == null)
            throw new IllegalArgumentException();
        return nullValues.contains(attrName);
    }

    public Boolean isDef(final String attrName, final Boolean isAttrNotNull) {
        if (attrName == null)
            throw new IllegalArgumentException();
        if (nullValues.contains(attrName))
            return true;
        if (isAttrNotNull != null)
            return isAttrNotNull;
        return false;
    }
}
