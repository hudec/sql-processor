package org.sqlproc.engine.impl;

/**
 * The mapping rule sub-element for one output attribute. It's related to a partial attribute name in the sequence of
 * the attribute names. It can also encompass the modifiers to identify an identity or the partial attribute META type.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMappingAttribute {

    /**
     * The pointer back to the parent.
     */
    private SqlMappingItem parent;
    /**
     * The full name of an attribute in the result class.
     */
    private String fullName;
    /**
     * The partial name of an attribute in the result class.
     */
    private String name;

    /**
     * Creates a new instance.
     * 
     * @param parent
     *            the pointer back to the owner
     * @param fullName
     *            the full name of an attribute in the result class
     * @param name
     *            the partial name of an attribute in the result class
     */
    SqlMappingAttribute(SqlMappingItem parent, String fullName, String name) {
        this.parent = parent;
        this.fullName = fullName;
        this.name = name;
    }

    /**
     * Sets the modifiers. They are used to identify an identity column or the partial attribute type.
     * 
     * @param value
     *            the value for a special treatment, might be an identifier of value2
     * @param value2
     *            the value for a special treatment, might be an attribute type
     */
    void setValues(String value, String value2) {
        parent.setValues(fullName, value, value2);
    }

    /**
     * Returns the partial name of an attribute.
     * 
     * @return the partial name of an attribute
     */
    String getName() {
        return name;
    }

    /**
     * Sets the partial name of an attribute.
     * 
     * @param name
     *            the partial name of an attribute
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the full name of an attribute.
     * 
     * @return the full name of an attribute
     */
    String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of an attribute.
     * 
     * @param fullName
     *            the full name of an attribute
     */
    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Returns the pointer back to the parent.
     * 
     * @return the pointer back to the parent
     */
    SqlMappingItem getParent() {
        return parent;
    }

    /**
     * Sets the pointer back to the parent.
     * 
     * @param parent
     *            the pointer back to the parent
     */
    void setParent(SqlMappingItem parent) {
        this.parent = parent;
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    @Override
    public String toString() {
        return "SqlMappingAttribute [parent=" + ((parent != null) ? parent.getDbName() : "null") + ", name=" + name
                + ", fullName=" + fullName + "]";
    }
}