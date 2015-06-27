package org.sqlproc.engine.config.store;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Definice typu pro JAXB, který obsahuje tři krát vnořenou mapu.
 * 
 * např:
 * 
 * <pre>
 *  @XmlJavaTypeAdapter(MapMapXmlAdapter.class)
 *  public Map<String, Map<String, Map<String, Map<String, String>>>> getSmerovani()
 * </pre>
 * 
 * @author Juraj Basista
 * 
 */
public class MapMapType {
    /**
     * Položky vnější mapy
     */
    @XmlElement(name = "entry")
    List<MapType> list;

    /**
     * Inicializace seznamu, položek mapy
     */
    public MapMapType() {
        list = new ArrayList<MapType>();
    }
}
