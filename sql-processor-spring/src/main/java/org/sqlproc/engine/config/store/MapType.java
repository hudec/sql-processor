package org.sqlproc.engine.config.store;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Definice typu pro JAXB, který obsahuje dva krát vnořenou mapu.
 * 
 * např:
 * 
 * <pre>
 *  @XmlJavaTypeAdapter(MapMapXmlAdapter.class)
 *  public Map<String, Map<String, Map<String, String>>> getSmerovaniPodleModu()
 * </pre>
 * 
 * @author Juraj Basista
 * 
 */
public class MapType {
    /**
     * Klíč vnořené mapy
     */
    @XmlElement
    String key;
    /**
     * Položky mapy
     */
    @XmlElement(name = "entry")
    List<MapEntryType> list;

    /**
     * Inicializace seznamu, položek mapy
     */
    public MapType() {
        list = new ArrayList<MapEntryType>();
    }
}
