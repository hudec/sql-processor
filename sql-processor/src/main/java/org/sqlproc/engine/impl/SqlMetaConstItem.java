package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element. A partial item for a {@link org.sqlproc.engine.impl.SqlMetaConst}. It represents the name of
 * an attribute in the input class (the static parameters class). In case there're more names, the input classes are
 * embedded one in other.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaConstItem {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The enumeration of types of this sub-element.
     */
    static enum Type {
        /**
         * The related attribute represents an embedded class.
         */
        REF,
        /**
         * The related attribute represents a leaf attribute.
         */
        VAL
    };

    /**
     * The name of related attribute.
     */
    private String name;
    /**
     * The type if this sub-element, which represents an embedded class or a leaf attribute.
     */
    private Type type;

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param name
     *            the name of related attribute
     * @param type
     *            the type if this sub-element, which represents an embedded class or a leaf attribute
     */
    SqlMetaConstItem(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Sets the type if this sub-element, which represents an embedded class or a leaf attribute.
     * 
     * @param type
     *            the type if this sub-element
     */
    void setType(Type type) {
        this.type = type;
    }

    /**
     * Returns the name of related attribute.
     * 
     * @return the name of related attribute
     */
    String getName() {
        return name;
    }
}
