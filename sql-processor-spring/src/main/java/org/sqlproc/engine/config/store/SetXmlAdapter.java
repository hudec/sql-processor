package org.sqlproc.engine.config.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Implementace {@link XmlAdapter}, která serializuje a deserializuje set vnořený v mapě do a z XML pomoci JAXB.
 * 
 * @author Albert Sputa
 * 
 */
public class SetXmlAdapter extends XmlAdapter<SetType, Map<String, Set<Object>>> {

    @Override
    public SetType marshal(Map<String, Set<Object>> v) throws Exception {
        if (v == null || v.isEmpty())
            return null;
        SetType setType = new SetType();
        // vytvoření seznamu z mapy
        for (String key : v.keySet()) {
            SetEntryType e = new SetEntryType();
            e.key = key;
            e.value = v.get(key);
            setType.list.add(e);
        }
        return setType;
    }

    @Override
    public Map<String, Set<Object>> unmarshal(SetType v) throws Exception {
        if (v.list != null && v.list.isEmpty())
            return null;
        Map<String, Set<Object>> map = new HashMap<String, Set<Object>>(v.list.size());
        // opětovné naplnění mapy ze seznamu
        for (SetEntryType e : v.list) {
            map.put(e.key, e.value);
        }
        return map;
    }
}
