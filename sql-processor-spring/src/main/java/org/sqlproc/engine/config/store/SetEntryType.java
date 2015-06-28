package org.sqlproc.engine.config.store;

import java.util.Set;

/**
 * The type for JAXB serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SetEntryType {

    public String key;

    public Set<Object> value;

    public SetEntryType() {
    }
}
