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
public class MapMapXmlAdapter extends XmlAdapter<MapMapType, Map<String, Map<String, Map<String, Object>>>> {

    @Override
    public MapMapType marshal(Map<String, Map<String, Map<String, Object>>> v) throws Exception {
        if (v == null || v.isEmpty())
            return null;
        MapMapType ret = new MapMapType();
        for (String key1 : v.keySet()) {
            Map<String, Map<String, Object>> map = v.get(key1);
            MapType mapType = new MapType();
            for (String key2 : map.keySet()) {
                MapEntryType e = new MapEntryType();
                e.key = key2;
                e.value = map.get(key2);
                mapType.list.add(e);
            }
            mapType.key = key1;
            ret.list.add(mapType);
        }
        return ret;
    }

    @Override
    public Map<String, Map<String, Map<String, Object>>> unmarshal(MapMapType v) throws Exception {
        if (v == null)
            return null;
        Map<String, Map<String, Map<String, Object>>> ret = new HashMap<String, Map<String, Map<String, Object>>>();
        for (MapType mapType : v.list) {
            Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
            for (MapEntryType e : mapType.list) {
                map.put(e.key, e.value);
            }
            ret.put(mapType.key, map);
        }
        return ret;
    }
}
