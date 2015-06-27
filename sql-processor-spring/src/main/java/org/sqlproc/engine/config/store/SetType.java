package org.sqlproc.engine.config.store;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Definice typu pro JAXB, který obsahuje set vnořený v mapě.
 * 
 * např:
 * 
 * <pre>
 *  @XmlJavaTypeAdapter(SetXmlAdapter.class)
 *  public Map<String, Set<String>> getSmerovaniDatabase()
 * </pre>
 * 
 * @author Albert Sputa
 * 
 */
public class SetType {
    /**
     * Klíč vnořené mapy
     */
    @XmlElement
    String key;
    /**
     * Položky mapy
     */
    @XmlElement(name = "entry")
    List<SetEntryType> list;

    /**
     * Inicializace seznamu, položek mapy
     */
    public SetType() {
        list = new ArrayList<SetEntryType>();
    }

}
