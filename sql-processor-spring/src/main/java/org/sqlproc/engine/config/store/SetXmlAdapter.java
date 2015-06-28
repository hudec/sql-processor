package org.sqlproc.engine.config.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * The JAXB serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SetXmlAdapter extends XmlAdapter<SetType, Map<String, Set<Object>>> {

    @Override
    public SetType marshal(Map<String, Set<Object>> v) throws Exception {
        if (v == null || v.isEmpty())
            return null;
        SetType setType = new SetType();
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
        for (SetEntryType e : v.list) {
            map.put(e.key, e.value);
        }
        return map;
    }
}
