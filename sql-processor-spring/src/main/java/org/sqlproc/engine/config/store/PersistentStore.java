package org.sqlproc.engine.config.store;

import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.Assert;

/**
 * The persistemcy logic devoted to SQL Processor dynamic configuration.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class PersistentStore {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public final String EXTERNAL_RESOURCE_PREFIX = "file:./";

    private Object objectDefault;

    private boolean readyToStore;

    private boolean resetInProgress;

    private Resource store;

    private PersistentObject objectToStore;

    private boolean saveToStore;

    public void init() {
        init(store, false);
    }

    public void init(Resource store, boolean merge) {
        if (logger.isTraceEnabled()) {
            logger.trace(">> init, store=" + store + ", merge=" + merge + ", objectToStore=" + objectToStore);
        }
        objectDefault = BeanUtils.instantiate(objectToStore.getType());
        copyProperties(objectToStore, objectDefault, objectToStore.getType(), false);
        if (logger.isTraceEnabled()) {
            logger.trace(">> init, objectDefault=" + objectDefault);
        }
        try {
            if (store != null && store.isReadable() && store.exists()) {
                Object pom = loadFromXML(store, objectToStore.getType());
                copyProperties(pom, objectToStore, objectToStore.getType(), merge);
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        initObjectToStore();
        readyToStore = true;
        if (logger.isTraceEnabled()) {
            logger.trace("<< init, objectToStore=" + objectToStore);
        }
    }

    public synchronized void reset() throws IOException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> reset, objectToStore=" + objectToStore);
        }
        try {
            resetInProgress = true;
            copyProperties(objectDefault, objectToStore, objectToStore.getType());
        } finally {
            resetInProgress = false;
        }
        File xmlFile = store.getFile();
        String xmlAbsolutePath = xmlFile.getAbsolutePath();
        if (xmlFile.exists()) {
            if (!xmlFile.delete()) {
                logger.error("!! reset, the file can't be deleted: " + xmlAbsolutePath);
                return;
            } else {
                if (logger.isTraceEnabled()) {
                    logger.trace("== reset, deleted file: " + xmlAbsolutePath);
                }
            }
        }
        initObjectToStore();
        if (logger.isTraceEnabled()) {
            logger.trace("<< reset, objectToStore=" + objectToStore);
        }
    }

    public synchronized void empty() {
        if (logger.isTraceEnabled()) {
            logger.trace(">> empty, objectToStore=" + objectToStore);
        }
        try {
            resetInProgress = true;

            if (logger.isDebugEnabled()) {
                logger.info("Cleaning up routing configuration");
            }

            if (objectToStore != null) {
                objectToStore.empty();
            }

        } finally {
            resetInProgress = false;
        }
        if (logger.isTraceEnabled()) {
            logger.trace("<< empty, objectToStore=" + objectToStore);
        }
    }

    public synchronized void read(String filename, boolean merge) {
        if (logger.isTraceEnabled()) {
            logger.trace(">> read, filename=" + filename + ", merge=" + merge);
        }
        checkFilename(filename);
        try {
            Resource res = new UrlResource(EXTERNAL_RESOURCE_PREFIX + filename);
            init(res, merge);
        } catch (MalformedURLException e) {
            logger.error("!! read, problem reading external configuration: " + e.getMessage(), e);
        }
        if (logger.isTraceEnabled()) {
            logger.trace("<< read, objectToStore=" + objectToStore);
        }
    }

    public synchronized void write(String filename, boolean overwrite) throws IOException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> write, filename=" + filename + ", overwrite=" + overwrite);
        }
        checkFilename(filename);
        try {
            Resource res = new UrlResource(EXTERNAL_RESOURCE_PREFIX + filename);

            if (res.exists()) {
                if (overwrite) {
                    logger.warn("!! write, overwiting existing configuration file, The file: " + filename
                            + " already exists");
                } else {
                    throw new IOException("File " + filename + " already exists");
                }
            }
            store(res);
        } catch (MalformedURLException e) {
            logger.error("!! write, problem writing external configuration: " + e.getMessage(), e);
        }
        if (logger.isTraceEnabled()) {
            logger.trace("<< write, filename=" + filename);
        }
    }

    protected synchronized void store(Resource store) throws IOException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> store, store=" + store + ", readyToStore=" + readyToStore + ", resetInProgress="
                    + resetInProgress);
        }
        if (store == null || !readyToStore || resetInProgress) {
            return;
        }
        if (logger.isDebugEnabled()) {
            logger.debug("== store, going to persist objectToStore: " + objectToStore);
        }
        File xmlFile = store.getFile();
        String xmlAbsolutePath = xmlFile.getAbsolutePath();
        if (!xmlFile.exists() && !xmlFile.createNewFile()) {
            logger.error("!! store, the file " + xmlAbsolutePath + " can't be created");
            return;
        }
        if (xmlFile.canWrite()) {
            try {
                Object pom = BeanUtils.instantiate(objectToStore.getType());
                copyProperties(objectToStore, pom, objectToStore.getType());
                JAXB.marshal(pom, xmlFile);
                if (logger.isDebugEnabled()) {
                    logger.debug("== store, persisted into: " + xmlAbsolutePath);
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        } else {
            xmlFile.delete();
            logger.error("!! store, can't write into the file " + xmlAbsolutePath);
        }
        if (logger.isTraceEnabled()) {
            logger.trace("<< store, xmlAbsolutePath=" + xmlAbsolutePath);
        }
    }

    public void store() throws IOException {
        store(store);
    }

    @SuppressWarnings({ "unchecked" })
    protected <T> T loadFromXML(Resource store, Class<T> targetClass) throws IOException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> loadFromXML, store=" + store + ", targetClass=" + targetClass);
        }
        if (store != null && store.isReadable() && store.exists()) {
            if (logger.isDebugEnabled()) {
                logger.debug("== loadFromXML, going to load from: " + store.getURL());
            }
            Object pom = JAXB.unmarshal(store.getInputStream(), targetClass);
            if (logger.isTraceEnabled()) {
                logger.trace("<< loadFromXML");
            }
            return (T) pom;
        } else {
            logger.warn("!! loadFromXML, can't read from: " + store);
            throw new IOException("Can't read from: " + store);
        }
    }

    private void copyProperties(Object source, Object target, Class<?> editable) throws BeansException {
        copyProperties(source, target, editable, false);
    }

    @SuppressWarnings("rawtypes")
    private void copyProperties(Object source, Object target, Class<?> editable, boolean merge) throws BeansException {
        Assert.notNull(source);
        Assert.notNull(target);

        Class<?> actualEditable = target.getClass();
        if (editable != null) {
            if (!editable.isInstance(target)) {
                throw new IllegalArgumentException("Target class  [" + target.getClass().getName()
                        + "] isn't compatible with [" + editable.getName() + "]");
            }
            actualEditable = editable;
        }
        PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(actualEditable);

        for (PropertyDescriptor targetPd : targetPds) {
            if (targetPd.getWriteMethod() != null) {
                PropertyDescriptor sourcePd = BeanUtils.getPropertyDescriptor(source.getClass(), targetPd.getName());
                if (sourcePd != null && sourcePd.getReadMethod() != null) {
                    try {
                        Method readMethod = sourcePd.getReadMethod();
                        if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                            readMethod.setAccessible(true);
                        }
                        Object value = readMethod.invoke(source);
                        Method writeMethod = targetPd.getWriteMethod();
                        if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                            writeMethod.setAccessible(true);
                        }
                        Method targetReadMethod = targetPd.getReadMethod();
                        boolean propertyCopied = false;
                        if (targetReadMethod != null) {
                            if (targetReadMethod.isAnnotationPresent(XmlTransient.class)) {
                                continue;
                            }
                            if (value != null) {
                                if (isInterface(targetReadMethod.getReturnType(), PersistentObject.class)) {
                                    Object targetBean = targetReadMethod.invoke(target);
                                    if (targetBean == null) {
                                        targetBean = BeanUtils.instantiate(targetReadMethod.getReturnType());
                                        writeMethod.invoke(target, targetBean);
                                    }
                                    copyProperties(value, targetBean, targetReadMethod.getReturnType(), merge);
                                    propertyCopied = true;
                                } else if (targetReadMethod.getReturnType().equals(Map.class)) {
                                    Method readMethod2 = targetPd.getReadMethod();
                                    Map destMap = (Map) readMethod2.invoke(target);
                                    Map sourceMap = (Map) readMethod.invoke(source);
                                    destMap = copy(sourceMap, destMap, merge);
                                    Object targetBean = targetReadMethod.invoke(target);
                                    if (targetBean == null) {
                                        writeMethod.invoke(target, destMap);
                                    }
                                    propertyCopied = true;
                                } else if (targetReadMethod.getReturnType().equals(Set.class)) {
                                    Method readMethod2 = targetPd.getReadMethod();
                                    Set destSet = (Set) readMethod2.invoke(target);
                                    Set sourceSet = (Set) readMethod.invoke(source);
                                    destSet = copy(sourceSet, destSet, merge);
                                    Object targetBean = targetReadMethod.invoke(target);
                                    if (targetBean == null) {
                                        writeMethod.invoke(target, destSet);
                                    }
                                    propertyCopied = true;
                                }
                            }
                        }
                        if (!propertyCopied) {
                            writeMethod.invoke(target, value);
                        }

                    } catch (Throwable ex) {
                        throw new FatalBeanException("There's problem with object construction", ex);
                    }
                }
            }
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Map copy(Map source, Map dest, boolean merge) {
        if (dest == null)
            dest = BeanUtils.instantiate(source.getClass());

        if (!merge) {
            dest.clear();
        }

        for (Object key : source.keySet()) {
            Object value = source.get(key);
            if (value instanceof Map) {
                dest.put(key, copy((Map) value, (Map) null, merge));
            } else {
                dest.put(key, value);
            }
        }
        return dest;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Set copy(Set source, Set dest, boolean merge) {
        if (dest == null)
            dest = BeanUtils.instantiate(source.getClass());

        if (!merge) {
            dest.clear();
        }

        dest.addAll(source);
        return dest;
    }

    private void initObjectToStore() {
        if (objectToStore != null)
            objectToStore.init();
    }

    private boolean isInterface(Class<?> clazz, Class<?> clazzInterface) {
        if (clazz.getInterfaces() != null) {
            for (Class<?> clazz1 : clazz.getInterfaces()) {
                if (clazz1.isAssignableFrom(clazzInterface))
                    return true;
            }
        }
        return false;
    }

    public void checkFilename(String filename) {
        if (filename == null)
            throw new IllegalArgumentException(filename);
        if (!filename.matches("([A-Za-z-\\._0-9]+)\\.(xml)$"))
            throw new IllegalArgumentException(filename);
    }

    @Required
    public void setStore(Resource store) {
        this.store = store;
    }

    @Required
    public void setObjectToStore(PersistentObject objectToStore) {
        this.objectToStore = objectToStore;
    }

    public boolean isSaveToStore() {
        return saveToStore;
    }

    public void setSaveToStore(boolean saveToStore) {
        this.saveToStore = saveToStore;
    }
}
