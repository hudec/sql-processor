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
 * Třída obsahuje způsob uložení a znovu načtení hodnot z nastavení JMX do/z externího úložiště. V tomto případe se
 * jedná o uložení do XML prostřednictvím JAXB do souboru, který se nastaví parametrem store {@link Resource}.
 * <p/>
 * Třída obsahuje i kopii původního, defaultního nastavení (stav po inicializaci spring kontextu). Pomoci metody reset
 * je možné vrátit připadané změny nastavení do původního defaultního stavu.
 * 
 * @author Juraj Basista
 * @author Tomas Hudec
 */
public class PersistentStore {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * From/Where will be files with methods read/write read/saved
     */
    public final String EXTERNAL_RESOURCE_PREFIX = "file:./";

    /**
     * Kopie původní nastavení objektu (stav po inicializaci spring kontextu)
     */
    private Object objectDefault;
    /**
     * Zda je objekt ve stavu, kdy je možné provádět uložení
     */
    private boolean readyToStore;
    /**
     * true když se provádí reset objektu do původního stavu
     */
    private boolean resetInProgress;
    /**
     * Úložiště natavení.
     */
    private Resource store;
    /**
     * Reference objektu určeného k uložení stavu.
     */
    private PersistentObject objectToStore;

    /**
     * true když ukládat objekt to úložiště
     */
    private boolean saveToStore;

    /**
     * Inicializace objektu, následuje po inicializaci spring kontextem. Nejdříve zkopíruje nastavení objectToStore do
     * objectDefault, když existuje soubor s nastavením, tak se pokusí nastavit objectToStore do stavu, který je v
     * úložišti.
     */
    public void init() {
        init(store, false);
    }

    /**
     * Inicializace objektu, následuje po inicializaci spring kontextem. Nejdříve zkopíruje nastavení objectToStore do
     * objectDefault, když existuje soubor s nastavením, tak se pokusí nastavit objectToStore do stavu, který je v
     * úložišti.
     * 
     * @param store
     *            {@link org.springframework.core.io.Resource Configuration file} to be configuration initialized from
     * @param merge
     *            Should have configuration been merged with previous state?
     */
    public void init(Resource store, boolean merge) {
        objectDefault = BeanUtils.instantiate(objectToStore.getType());
        copyProperties(objectToStore, objectDefault, objectToStore.getType(), false);
        if (logger.isDebugEnabled()) {
            logger.debug("Standardní hodnoty: " + objectDefault);
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
    }

    /**
     * Reset hodnot do původního stavu. Po nastavení hodnot se metoda pokusí vymazat úložiště.
     * 
     * @throws IOException
     *             když úložiště neexistuje
     */
    public synchronized void reset() throws IOException {
        // dump("4 default ", objectDefault);
        // dump("4 store ", objectToStore);
        if (logger.isDebugEnabled()) {
            logger.debug("Nahrávám standardní hodnoty: " + objectDefault);
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
                logger.error("Nelze vymazat soubor: " + xmlAbsolutePath);
                return;
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug("Vymazán soubor: " + xmlAbsolutePath);
                }
            }
        }
        initObjectToStore();
    }

    /**
     * Empty all properties on Persistent object (requieres own implementation on implementing class)
     */
    public synchronized void empty() {
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
    }

    /**
     * Method reads configuration from given xml-file. As <code>filename</code> should be used name without path
     * definition. Configuration is immediatelly saved into main config file (specified in parameter <code>store</code>
     * ).
     * <p/>
     * For security purposes there is not possible to enter path in filename therefore in filename are allowed only
     * letters, digits and some special characters such as period (.), dash (-)
     * <p/>
     * When parameter <code>merge</code> is <code>true</code> configuration in memory is merged with actual
     * configuration otherwise is rewritten by configuration from file.
     * 
     * @param filename
     *            Name of file from which configuration will be read
     * @param merge
     *            If <code>true</code> loaded configuration will be merged with actual configuration in memory
     * @throws java.lang.IllegalArgumentException
     *             when given filename is wrong (see
     *             {@link cz.isvs.reg.ws.common.config.store.PersistentStore#checkFilename(String)} )
     */
    public synchronized void read(String filename, boolean merge) {
        if (!checkFilename(filename)) {
            throw new IllegalArgumentException("Wrong filename");
        }
        try {
            Resource res = new UrlResource(EXTERNAL_RESOURCE_PREFIX + filename);
            init(res, merge);
        } catch (MalformedURLException e) {
            logger.error("Problem reading external configuration: " + e.getMessage(), e);
        }
    }

    /**
     * Method will write configuration into given xml-file. As <code>filename</code> should be used name without path
     * definition.
     * <p/>
     * For security purposes there is not possible to enter path in filename therefore in filename are allowed only
     * letters, digits and some special characters such as period (.), dash (-)
     * <p/>
     * When parameter <code>overwrite</code> is <code>true</code> target file is overwritten otherwise
     * 
     * @param filename
     *            Name of file from which configuration will be read
     * @param overwrite
     *            If <code>true</code> existing file wil be overwriten
     * @throws java.lang.IllegalArgumentException
     *             when given filename is wrong (see
     *             {@link cz.isvs.reg.ws.common.config.store.PersistentStore#checkFilename(String)} )
     * @throws IOException
     *             Is thrown when given file already exist and flag overwrite is <code>false</code>
     */
    public synchronized void write(String filename, boolean overwrite) throws IOException {
        logger.info("Saving configuration into external file " + filename);
        if (!checkFilename(filename)) {
            throw new IllegalArgumentException("Wrong filename");
        }
        try {
            Resource res = new UrlResource(EXTERNAL_RESOURCE_PREFIX + filename);

            if (res.exists()) {
                if (overwrite) {
                    logger.warn("Overwiting existing configuration file - file: " + filename + " already exists");
                } else {
                    throw new IOException("File " + filename + " already exists");
                }
            }
            store(res);
        } catch (MalformedURLException e) {
            logger.error("Problem writing external configuration: " + e.getMessage(), e);
        }
    }

    /**
     * Method check given filename if the name of file doesn't contain some forbidden characters. Filename could contaim
     * only name (without path) and must end with <code>.xml</code>
     * 
     * @param filename
     *            Filename to check
     * @return Returns <code>true</code> when filename is correct and <code>false</code> when is wrong
     */
    public boolean checkFilename(String filename) {
        if (filename == null) {
            logger.warn("Filename is null");
            return false;
        }
        return filename.matches("([A-Za-z-\\._0-9]+)\\.(xml)$");
    }

    /**
     * This metod will save configuration into file specified by {@link org.springframework.core.io.Resource}
     * 
     * @param store
     *            Pointer to {@link org.springframework.core.io.Resource file} to be saved to
     * @throws IOException
     *             When some IO problem occurs
     */
    protected synchronized void store(Resource store) throws IOException {
        if (store == null || !readyToStore || resetInProgress) {
            return;
        }
        // dump("6 default ", objectDefault);
        // dump("6 store ", objectToStore);
        if (logger.isDebugEnabled()) {
            logger.debug("Ukladam aktualni hodnoty: " + objectToStore);
        }
        File xmlFile = store.getFile();
        String xmlAbsolutePath = xmlFile.getAbsolutePath();
        // zjisti zda soubor existuje
        if (!xmlFile.exists() && !xmlFile.createNewFile()) {
            logger.error("Nelze vytvořit soubor: " + xmlAbsolutePath);
            return;
        }
        // zjisti zda je možné do souboru zapisovat
        if (xmlFile.canWrite()) {
            try {
                Object pom = BeanUtils.instantiate(objectToStore.getType());
                copyProperties(objectToStore, pom, objectToStore.getType());
                JAXB.marshal(pom, xmlFile);
                if (logger.isDebugEnabled()) {
                    logger.debug("Aktualni hodnoty zapsany do souboru: " + xmlAbsolutePath);
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        } else {
            xmlFile.delete();
            logger.error("Nelze zapisovat do souboru: " + xmlAbsolutePath);
        }
    }

    /**
     * This metod will save configuration into file specified by public property
     * {@link org.springframework.core.io.Resource store}
     * 
     * @throws IOException
     *             When some IO problem occurs
     * @see cz.isvs.reg.ws.common.config.store.PersistentStore#setStore(org.springframework.core.io.Resource)
     */
    public void store() throws IOException {
        store(store);
    }

    /**
     * Method creates bean instance of given class from {@link org.springframework.core.io.Resource XML file}
     * <p/>
     * <strong>Note:</strong> Method has suppressed warnings for unchecked class cast because implementation of JAXB
     * doesn't support generics
     * 
     * @param store
     *            From what file will be bean loaded
     * @param targetClass
     *            Target class type to be loaded
     * @return Instance of loaded object
     * @throws java.io.IOException
     *             When some IO problem occurs
     */
    @SuppressWarnings({ "unchecked" })
    protected <T> T loadFromXML(Resource store, Class<T> targetClass) throws IOException {
        if (store != null && store.isReadable() && store.exists()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Loading configuration from: " + store.getURL());
            }
            // deserializace nastavení do pomocného objektu
            Object pom = JAXB.unmarshal(store.getInputStream(), targetClass);
            return (T) pom;
        } else {
            logger.warn("Error loading XML configuration - given store doesn't exist or isn't readable");
            throw new IOException("Error loading configuration (store is not ready)");
        }

    }

    /**
     * Kopírování hodnot ze zdrojového objektu do cílového. Cílová třída musí byt typu zdrojové třídy.
     * <ul>
     * <li>Když je položka ve třídě označená jako {@link XmlTransient}, tak se přeskakuje.</li>
     * <li>Když položka je typu {@link PersistentObject} a cílová položka není null, tak je metoda copyProperties
     * rekurzivně spuštěna nad těmito hodnotami</li>
     * <li>Jinak se provádí kopírování položky stylem <code>target.setXXX(source.getXXX())</code></li>
     * <li>Pokud je nastaveny priznak <code>merge</code> jednotlive {@link java.util.Map mapy} a {@link java.util.Set
     * sety} boudou spojeny</li>
     * </ul>
     * 
     * @param source
     *            zdrojový objekt
     * @param target
     *            cílový objekt
     * @param editable
     *            typ objektu
     * @throws BeansException
     *             když není možné získat informace o třídách cílového a zdrojového objektu
     */
    private void copyProperties(Object source, Object target, Class<?> editable) throws BeansException {
        copyProperties(source, target, editable, false);
    }

    /**
     * Kopírování hodnot ze zdrojového objektu do cílového. Cílová třída musí byt typu zdrojové třídy.
     * <ul>
     * <li>Když je položka ve třídě označená jako {@link XmlTransient}, tak se přeskakuje.</li>
     * <li>Když položka je typu {@link PersistentObject} a cílová položka není null, tak je metoda copyProperties
     * rekurzivně spuštěna nad těmito hodnotami</li>
     * <li>Jinak se provádí kopírování položky stylem <code>target.setXXX(source.getXXX())</code></li>
     * <li>Pokud je nastaveny priznak <code>merge</code> jednotlive {@link java.util.Map mapy} a {@link java.util.Set
     * sety} boudou spojeny</li>
     * </ul>
     * 
     * @param source
     *            zdrojový objekt
     * @param target
     *            cílový objekt
     * @param editable
     *            typ objektu
     * @param merge
     *            priznak, zda se maji data mergeovat
     * @throws BeansException
     *             když není možné získat informace o třídách cílového a zdrojového objektu
     */
    @SuppressWarnings("rawtypes")
    private void copyProperties(Object source, Object target, Class<?> editable, boolean merge) throws BeansException {

        Assert.notNull(source, "Zdroj nesmí být null");
        Assert.notNull(target, "Cíl nesmí být null");

        Class<?> actualEditable = target.getClass();
        if (editable != null) {
            if (!editable.isInstance(target)) {
                throw new IllegalArgumentException("Cílová třída  [" + target.getClass().getName()
                        + "] není převoditelná na třídu [" + editable.getName() + "]");
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
                        throw new FatalBeanException("Není možné zkopírovat proměnné do cílové třídy.", ex);
                    }
                }
            }
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Map copy(Map source, Map dest, boolean merge) {
        // TODO - neřeší to mapy map
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

    /**
     * Kontrola zda třída clazz implementuje interface clazzInterface.
     * 
     * @param clazz
     * @param clazzInterface
     * @return
     * @see org.springframework.util.TypeUtils zda nedela to same
     */
    private boolean isInterface(Class<?> clazz, Class<?> clazzInterface) {
        if (clazz.getInterfaces() != null) {
            for (Class<?> clazz1 : clazz.getInterfaces()) {
                if (clazz1.isAssignableFrom(clazzInterface))
                    return true;
            }
        }
        return false;
    }

    @Required
    public void setStore(Resource store) {
        this.store = store;
    }

    @Required
    public void setObjectToStore(PersistentObject objectToStore) {
        this.objectToStore = objectToStore;
    }

    /**
     * @return the saveToStore
     */
    public boolean isSaveToStore() {
        return saveToStore;
    }

    /**
     * @param saveToStore
     *            the saveToStore to set
     */
    public void setSaveToStore(boolean saveToStore) {
        this.saveToStore = saveToStore;
    }
}
