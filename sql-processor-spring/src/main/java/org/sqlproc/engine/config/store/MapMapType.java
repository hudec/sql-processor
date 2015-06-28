package org.sqlproc.engine.config.store;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * The type for JAXB serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class MapMapType {

    @XmlElement(name = "entry")
    List<MapType> list;

    public MapMapType() {
        list = new ArrayList<MapType>();
    }
}
