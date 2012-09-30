package org.sqlproc.dsl.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier1;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier2;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.PojoPropertyModifier;

public class Utils {

    public static String resourceDir(Resource resource) {
        String uri = (resource.getURI() != null) ? resource.getURI().toString() : null;
        String dir = null;
        if (uri != null) {
            dir = uri;
            int ix = uri.lastIndexOf("/");
            if (ix > 0)
                dir = uri.substring(0, ix);
        }
        return dir;
    }

    public static boolean isRequired(PojoProperty f) {
        if (f.getModifiers() == null || f.getModifiers().isEmpty())
            return false;
        for (PojoPropertyModifier modifier : f.getModifiers()) {
            if (modifier.isRequired())
                return true;
        }
        return false;
    }

    public static boolean isDiscriminator(PojoProperty f) {
        if (f.getModifiers() == null || f.getModifiers().isEmpty())
            return false;
        for (PojoPropertyModifier modifier : f.getModifiers()) {
            if (modifier.isDiscriminator())
                return true;
        }
        return false;
    }

    public static boolean isPrimaryKey(PojoProperty f) {
        if (f.getModifiers() == null || f.getModifiers().isEmpty())
            return false;
        for (PojoPropertyModifier modifier : f.getModifiers()) {
            if (modifier.isPrimaryKey())
                return true;
        }
        return false;
    }

    public static boolean isAbstract(PojoEntity e) {
        if (e.getModifiers1() == null || e.getModifiers1().isEmpty())
            return false;
        for (PojoEntityModifier1 modifier : e.getModifiers1()) {
            if (modifier.isAbstract())
                return true;
        }
        return false;
    }

    public static boolean isFinal(PojoEntity e) {
        if (e.getModifiers1() == null || e.getModifiers1().isEmpty())
            return false;
        for (PojoEntityModifier1 modifier : e.getModifiers1()) {
            if (modifier.isFinal())
                return true;
        }
        return false;
    }

    public static PojoEntity getSuperType(PojoEntity e) {
        if (e.getModifiers2() == null || e.getModifiers2().isEmpty())
            return null;
        for (PojoEntityModifier2 modifier : e.getModifiers2()) {
            if (modifier.getSuperType() != null)
                return modifier.getSuperType();
        }
        return null;
    }

    public static String getDiscriminator(PojoEntity e) {
        if (e.getModifiers2() == null || e.getModifiers2().isEmpty())
            return null;
        for (PojoEntityModifier2 modifier : e.getModifiers2()) {
            if (modifier.getDiscriminator() != null)
                return modifier.getDiscriminator();
        }
        return null;
    }

    public static String getSernum(PojoEntity e) {
        if (e.getModifiers2() == null || e.getModifiers2().isEmpty())
            return null;
        for (PojoEntityModifier2 modifier : e.getModifiers2()) {
            if (modifier.getSernum() != null)
                return modifier.getSernum();
        }
        return null;
    }

    public static List<PojoProperty> requiredFeatures(PojoEntity e) {
        List<PojoProperty> features = new ArrayList<PojoProperty>();
        if (e == null || e.getFeatures() == null)
            return features;
        for (PojoProperty f : e.getFeatures()) {
            if (isRequired(f))
                features.add(f);
        }
        PojoEntity s = getSuperType(e);
        if (s == null)
            return features;
        requiredFeatures(s).addAll(features);
        return features;
    }
}
