package org.sqlproc.engine.config.store;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Implementace {@link XmlAdapter}, která serializuje a deserializuje dva krát vnořenou mapu do a z XML pomoci JAXB.
 * 
 * @author Juraj Basista
 * 
 */
public class MapXmlAdapter extends XmlAdapter<MapType, Map<String, Map<String, Object>>> {

    @Override
    public MapType marshal(Map<String, Map<String, Object>> v) throws Exception {
        if (v == null || v.isEmpty())
            return null;
        MapType mapType = new MapType();
        // vytvoření seznamu z mapy
        for (String key : v.keySet()) {
            MapEntryType e = new MapEntryType();
            e.key = key;
            e.value = v.get(key);
            mapType.list.add(e);
        }
        return mapType;
    }

    @Override
    public Map<String, Map<String, Object>> unmarshal(MapType v) throws Exception {
        if (v.list != null && v.list.isEmpty())
            return null;
        Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>(v.list.size());
        // opětovné naplnění mapy ze seznamu
        for (MapEntryType e : v.list) {
            map.put(e.key, e.value);
        }
        return map;
    }
}
