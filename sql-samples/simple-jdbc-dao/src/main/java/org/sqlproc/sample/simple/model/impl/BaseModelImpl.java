package org.sqlproc.sample.simple.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.beanutils.MethodUtils;

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

    public Boolean isDef(String attrName) {
        if (attrName == null)
            throw new IllegalArgumentException();
        if (nullValues.contains(attrName))
            return true;
        try {
            Object result = MethodUtils.invokeMethod(this,
                    "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
            return (result != null) ? true : false;
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        try {
            Object result = MethodUtils.invokeMethod(this,
                    "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
            return (result != null) ? true : false;
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
