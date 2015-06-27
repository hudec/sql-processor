package org.sqlproc.engine.config.store;

import java.util.Map;

/**
 * Definice typu položky pro serializaci/deserializaci položek z map pomoci JAXB.
 * 
 * @author Juraj Basista
 * 
 */
public class MapEntryType {
    /**
     * Klíč k obsahu mapy
     */
    public String key;
    /**
     * Položky mapy, které už JAXB umí serializovat/deserializovat
     */
    public Map<String, Object> value;

    /**
     * Defaultní konstruktor, pro volání z JAXB
     */
    public MapEntryType() {
    }
}
