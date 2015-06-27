package org.sqlproc.engine.config.store;

import java.util.Set;

/**
 * Definice typu položky pro serializaci/deserializaci položek ze setu pomoci JAXB.
 * 
 * @author Albert Sputa
 * 
 */
public class SetEntryType {
    /**
     * Klíč k obsahu mapy
     */
    public String key;
    /**
     * Položky mapy, které už JAXB umí serializovat/deserializovat
     */
    public Set<Object> value;

    /**
     * Defaultní konstruktor, pro volání z JAXB
     */
    public SetEntryType() {
    }
}
