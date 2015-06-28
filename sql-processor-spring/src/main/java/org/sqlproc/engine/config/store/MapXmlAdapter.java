package org.sqlproc.engine.config.store;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * The JAXB serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class MapXmlAdapter extends XmlAdapter<MapType, Map<String, Map<String, Object>>> {

    @Override
    public MapType marshal(Map<String, Map<String, Object>> v) throws Exception {
        if (v == null || v.isEmpty())
            return null;
        MapType mapType = new MapType();
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
        for (MapEntryType e : v.list) {
            map.put(e.key, e.value);
        }
        return map;
    }
}
