package org.sqlproc.dsl.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.sqlproc.dsl.processorDsl.AbstractPojoEntity;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.ExtendedColumn;
import org.sqlproc.dsl.processorDsl.ExtendedMappingItem;
import org.sqlproc.dsl.processorDsl.FunctionDefinition;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.PackageDeclaration;
import org.sqlproc.dsl.processorDsl.PojoDao;
import org.sqlproc.dsl.processorDsl.PojoDaoModifier;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier1;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier2;
import org.sqlproc.dsl.processorDsl.PojoMethod;
import org.sqlproc.dsl.processorDsl.PojoMethodArg;
import org.sqlproc.dsl.processorDsl.PojoMethodModifier;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.PojoPropertyModifier;
import org.sqlproc.dsl.processorDsl.ProcedureDefinition;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.ToInitMethod;

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

    public static boolean isList(PojoProperty f) {
        if (f.getType() == null)
            return false;
        if (f.getType().getSimpleName().equals("List"))
            return true;
        return false;
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

    public static boolean isAttribute(PojoProperty f) {
        if (f.getAttrs() == null || f.getAttrs().isEmpty())
            return true;
        return false;
    }

    public static String getIndex(PojoProperty f) {
        if (f.getModifiers() == null || f.getModifiers().isEmpty())
            return null;
        for (PojoPropertyModifier modifier : f.getModifiers()) {
            if (modifier.getIndex() != null)
                return modifier.getIndex();
        }
        return null;
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

    public static boolean isOptLock(PojoProperty f) {
        if (f.getModifiers() == null || f.getModifiers().isEmpty())
            return false;
        for (PojoPropertyModifier modifier : f.getModifiers()) {
            if (modifier.isVersion())
                return true;
        }
        return false;
    }

    public static boolean isAbstract(PojoDao e) {
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

    public static boolean isFinal(PojoDao d) {
        if (d.getModifiers1() == null || d.getModifiers1().isEmpty())
            return false;
        for (PojoEntityModifier1 modifier : d.getModifiers1()) {
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

    public static PojoDao getSuperType(PojoDao e) {
        if (e.getModifiers2() == null || e.getModifiers2().isEmpty())
            return null;
        for (PojoDaoModifier modifier : e.getModifiers2()) {
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

    public static String getSernum(PojoDao e) {
        if (e.getModifiers2() == null || e.getModifiers2().isEmpty())
            return null;
        for (PojoDaoModifier modifier : e.getModifiers2()) {
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
        features.addAll(requiredFeatures(s));
        return features;
    }

    public static List<PojoProperty> attributes(PojoEntity e) {
        List<PojoProperty> features = new ArrayList<PojoProperty>();
        if (e == null || e.getFeatures() == null)
            return features;
        for (PojoProperty f : e.getFeatures()) {
            if (isAttribute(f))
                features.add(f);
        }
        PojoEntity s = getSuperType(e);
        if (s == null)
            return features;
        features.addAll(attributes(s));
        return features;
    }

    public static boolean hasName(PojoProperty f, String name) {
        if (f.getName().equals(name))
            return true;
        return false;
    }

    public static String getTokenFromModifier(MetaStatement statement, String tokenName) {
        if (statement.getModifiers() == null || statement.getModifiers().isEmpty()) {
            return null;
        }
        for (String filter : statement.getModifiers()) {
            int ix = filter.indexOf('=');
            if (ix <= 0)
                continue;
            String key = filter.substring(0, ix);
            String val = filter.substring(ix + 1);
            if (key.equals(tokenName)) {
                return val;
            }
        }
        return null;
    }

    public static String getTokenFromModifier(MappingRule rule, String tokenName) {
        if (rule.getModifiers() == null || rule.getModifiers().isEmpty()) {
            return null;
        }
        for (String filter : rule.getModifiers()) {
            int ix = filter.indexOf('=');
            if (ix <= 0)
                continue;
            String key = filter.substring(0, ix);
            String val = filter.substring(ix + 1);
            if (key.equals(tokenName)) {
                return val;
            }
        }
        return null;
    }

    public static String getTokenFromModifier(MetaStatement statement, String tokenName, String tokenSuffix) {
        if (statement.getModifiers() == null || statement.getModifiers().isEmpty()) {
            return null;
        }
        for (String filter : statement.getModifiers()) {
            int ix = filter.indexOf('=');
            if (ix <= 0)
                continue;
            String key = filter.substring(0, ix);
            String val = filter.substring(ix + 1);
            if (tokenSuffix != null) {
                int ix2 = val.indexOf('=');
                if (ix2 <= 0)
                    continue;
                if (!tokenSuffix.equals(val.substring(ix2 + 1)))
                    continue;
                val = val.substring(0, ix2);
            }
            if (key.equals(tokenName)) {
                return val;
            }
        }
        return null;
    }

    public static List<String> getTokensFromModifier(MetaStatement statement, String tokenName) {
        List<String> result = new ArrayList<String>();
        if (statement.getModifiers() == null || statement.getModifiers().isEmpty()) {
            return result;
        }
        for (String filter : statement.getModifiers()) {
            int ix = filter.indexOf('=');
            if (ix <= 0)
                continue;
            String key = filter.substring(0, ix);
            String val = filter.substring(ix + 1);
            int ix2 = val.indexOf('=');
            // String val2 = (ix2 > 0) ? val.substring(ix2 + 1) : null;
            val = (ix2 > 0) ? val.substring(0, ix2) : val;
            if (key.equals(tokenName)) {
                result.add(val);
            }
        }
        return result;
    }

    public static PojoEntity findEntity(IQualifiedNameConverter qualifiedNameConverter, Artifacts artifacts,
            IScope scope, String name) {
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            PackageDeclaration packageDeclaration = (PackageDeclaration) artifacts.eResource().getResourceSet()
                    .getEObject(description.getEObjectURI(), true);
            for (AbstractPojoEntity aEntity : packageDeclaration.getElements()) {
                if (aEntity instanceof PojoEntity) {
                    PojoEntity entity = (PojoEntity) aEntity;
                    if (name.equals(entity.getName())) {
                        return entity;
                    }
                }
            }
        }
        return null;
    }

    public static PojoDefinition findPojo(IQualifiedNameConverter qualifiedNameConverter, Artifacts artifacts,
            IScope scope, String name) {
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if ((qualifiedNameConverter != null && qualifiedNameConverter.toQualifiedName(name).equals(
                    description.getName()))
                    || name.equals(description.getName().toString())) {
                return (PojoDefinition) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
            }
        }
        return null;
    }

    public static TableDefinition findTable(IQualifiedNameConverter qualifiedNameConverter, Artifacts artifacts,
            IScope scope, String name) {
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if ((qualifiedNameConverter != null && qualifiedNameConverter.toQualifiedName(name).equals(
                    description.getName()))
                    || name.equals(description.getName().toString())) {
                return (TableDefinition) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
            }
        }
        return null;
    }

    public static List<String> findTables(IQualifiedNameConverter qualifiedNameConverter, Artifacts artifacts,
            IScope scope) {
        List<String> names = new ArrayList<String>();
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            EObject obj = artifacts.eResource().getResourceSet().getEObject(description.getEObjectURI(), true);
            if (obj instanceof TableDefinition)
                names.add(((TableDefinition) obj).getTable());
        }
        return names;
    }

    public static List<String> findFunctions(IQualifiedNameConverter qualifiedNameConverter, Artifacts artifacts,
            IScope scope) {
        List<String> names = new ArrayList<String>();
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            EObject obj = artifacts.eResource().getResourceSet().getEObject(description.getEObjectURI(), true);
            if (obj instanceof FunctionDefinition)
                names.add(((FunctionDefinition) obj).getTable());
        }
        return names;
    }

    public static List<String> findProcedures(IQualifiedNameConverter qualifiedNameConverter, Artifacts artifacts,
            IScope scope) {
        List<String> names = new ArrayList<String>();
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            EObject obj = artifacts.eResource().getResourceSet().getEObject(description.getEObjectURI(), true);
            if (obj instanceof ProcedureDefinition)
                names.add(((ProcedureDefinition) obj).getTable());
        }
        return names;
    }

    public static String constName(PojoProperty f) {
        return constName(f.getName());
    }

    public static String constName2(PojoProperty f) {
        StringBuilder result = new StringBuilder("");
        boolean first = true;
        for (PojoProperty p : f.getAttrs()) {
            if (first)
                first = false;
            else
                result.append("_");
            result.append(constName(p.getName()));
        }
        return result.toString();
    }

    public static String constName(String name) {
        String result = "";
        int last = 0;
        for (int i = 0, l = name.length(); i < l; i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                result = result + name.substring(last, i).toUpperCase() + "_";
                last = i;
            }
        }
        if (last < name.length())
            result = result + name.substring(last).toUpperCase();
        return result;
    }

    public static String dbName(PojoEntity e) {
        String result = "";
        int last = 0;
        for (int i = 0, l = e.getName().length(); i < l; i++) {
            if (Character.isUpperCase(e.getName().charAt(i))) {
                result = result + e.getName().substring(last, i).toUpperCase() + "_";
                last = i;
            }
        }
        if (last < e.getName().length())
            result = result + e.getName().substring(last).toUpperCase();
        return result.startsWith("_") ? result.substring(1) : result;
    }

    public static String dbName(PojoMethod e) {
        String result = "";
        int last = 0;
        for (int i = 0, l = e.getName().length(); i < l; i++) {
            if (Character.isUpperCase(e.getName().charAt(i))) {
                result = result + e.getName().substring(last, i).toUpperCase() + "_";
                last = i;
            }
        }
        if (last < e.getName().length())
            result = result + e.getName().substring(last).toUpperCase();
        return result.startsWith("_") ? result.substring(1) : result;
    }

    public static String getPackage(PojoEntity e) {
        PackageDeclaration packageDeclaration = EcoreUtil2.getContainerOfType(e, PackageDeclaration.class);
        return packageDeclaration.getName();
    }

    public static Map<String, List<PojoMethodArg>> getToInits(PojoDao d) {
        Map<String, List<PojoMethodArg>> result = new LinkedHashMap<String, List<PojoMethodArg>>();
        for (ToInitMethod m : d.getToInits()) {
            if (m.getArgs() != null && !m.getArgs().isEmpty()) {
                result.put(m.getName(), new ArrayList<PojoMethodArg>());
                for (PojoMethodArg a : m.getArgs()) {
                    result.get(m.getName()).add(a);
                }
            }
        }
        return result;
    }

    public static PojoEntity getParent(PojoEntity e) {
        if (getDiscriminator(e) != null)
            return null;
        PojoEntity e2 = getSuperType(e);
        return e2;
    }

    public static boolean isFinal(MetaStatement m) {
        String finalToken = getTokenFromModifier(m, "final");
        if (finalToken != null)
            return true;
        return false;
    }

    public static PojoProperty getOptLock(PojoEntity e) {
        if (e == null || e.getFeatures() == null)
            return null;
        for (PojoProperty f : e.getFeatures()) {
            if (isOptLock(f))
                return f;
        }
        PojoEntity s = getSuperType(e);
        if (s == null)
            return null;
        return getOptLock(s);
    }

    // public static String getName(Identifier identifier) {
    // StringBuilder sb = new StringBuilder();
    // boolean first = true;
    // for (ExtendedIdentifier ei : identifier.getIdentifiers()) {
    // if (first)
    // first = false;
    // else
    // sb.append(".");
    // sb.append(ei.getName());
    // }
    // return sb.toString();
    // }

    public static String getName(Column column) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (ExtendedColumn ei : column.getColumns()) {
            if (first)
                first = false;
            else
                sb.append(".");
            sb.append(ei.getCol().getName());
        }
        return sb.toString();
    }

    public static String getName(MappingColumn column) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (ExtendedMappingItem ei : column.getItems()) {
            if (first)
                first = false;
            else
                sb.append(".");
            sb.append(ei.getAttr().getName());
        }
        return sb.toString();
    }

    public static boolean isNumber(String s) {
        if (s == null)
            return false;
        s = s.trim();
        for (int i = 0, l = s.length(); i < l; i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static boolean isCallUpdate(PojoMethod f) {
        if (f.getModifiers1() == null || f.getModifiers1().isEmpty())
            return false;
        for (PojoMethodModifier modifier : f.getModifiers1()) {
            if (modifier.isCallUpdate())
                return true;
        }
        return false;
    }

    public static boolean isCallFunction(PojoMethod f) {
        if (f.getModifiers1() == null || f.getModifiers1().isEmpty())
            return false;
        for (PojoMethodModifier modifier : f.getModifiers1()) {
            if (modifier.isCallFunction())
                return true;
        }
        return false;
    }

    public static boolean isCallQuery(PojoMethod f) {
        if (f.getModifiers1() == null || f.getModifiers1().isEmpty())
            return false;
        for (PojoMethodModifier modifier : f.getModifiers1()) {
            if (modifier.isCallQuery())
                return true;
        }
        return false;
    }

    public static boolean isCallQueryFunction(PojoMethod f) {
        if (f.getModifiers1() == null || f.getModifiers1().isEmpty())
            return false;
        for (PojoMethodModifier modifier : f.getModifiers1()) {
            if (modifier.isCallQueryFunction())
                return true;
        }
        return false;
    }

    public static boolean isCallSelectFunction(PojoMethod f) {
        if (f.getModifiers1() == null || f.getModifiers1().isEmpty())
            return false;
        for (PojoMethodModifier modifier : f.getModifiers1()) {
            if (modifier.isCallSelectFunction())
                return true;
        }
        return false;
    }

    public static JvmType pojoMethod2jvmType(final PojoEntity e) {
        return new JvmType() {

            @Override
            public String getIdentifier() {
                return e.getName();
            }

            @Override
            public String getSimpleName() {
                return e.getName();
            }

            @Override
            public String getQualifiedName() {
                return getPackage(e) + "." + e.getName();
            }

            @Override
            public String getQualifiedName(char innerClassDelimiter) {
                return getPackage(e) + "." + e.getName();
            }

            @Override
            public EClass eClass() {
                return e.eClass();
            }

            @Override
            public Resource eResource() {
                return e.eResource();
            }

            @Override
            public EObject eContainer() {
                return e.eContainer();
            }

            @Override
            public EStructuralFeature eContainingFeature() {
                return e.eContainingFeature();
            }

            @Override
            public EReference eContainmentFeature() {
                return e.eContainmentFeature();
            }

            @Override
            public EList<EObject> eContents() {
                return e.eContents();
            }

            @Override
            public TreeIterator<EObject> eAllContents() {
                return e.eAllContents();
            }

            @Override
            public boolean eIsProxy() {
                return e.eIsProxy();
            }

            @Override
            public EList<EObject> eCrossReferences() {
                return e.eCrossReferences();
            }

            @Override
            public Object eGet(EStructuralFeature feature) {
                return e.eGet(feature);
            }

            @Override
            public Object eGet(EStructuralFeature feature, boolean resolve) {
                return e.eGet(feature, resolve);
            }

            @Override
            public void eSet(EStructuralFeature feature, Object newValue) {
                e.eSet(feature, newValue);
            }

            @Override
            public boolean eIsSet(EStructuralFeature feature) {
                return e.eIsSet(feature);
            }

            @Override
            public void eUnset(EStructuralFeature feature) {
                e.eUnset(feature);
            }

            @Override
            public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
                return e.eInvoke(operation, arguments);
            }

            @Override
            public EList<Adapter> eAdapters() {
                return e.eAdapters();
            }

            @Override
            public boolean eDeliver() {
                return e.eDeliver();
            }

            @Override
            public void eSetDeliver(boolean deliver) {
                e.eSetDeliver(deliver);
            }

            @Override
            public void eNotify(Notification notification) {
                e.eNotify(notification);
            }

        };
    }
}
