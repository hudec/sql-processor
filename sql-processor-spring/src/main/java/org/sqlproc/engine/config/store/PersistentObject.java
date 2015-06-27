package org.sqlproc.engine.config.store;

/**
 * Rozhraní tříd, kterých stav je možné ukládat do externího úložiště.
 * 
 * @author Vladimír Hudec
 * 
 */
public interface PersistentObject {

    /**
     * Vrací typ třídy pro uložení.
     * 
     * @return
     */
    public Class<?> getType();

    /**
     * Dopočtení kešovaných hodnot.
     */
    public void init();

    /**
     * Empty all properties
     */
    public void empty();

}
