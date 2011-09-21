package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * The identity related to one output attribute. To be more precise, it's related to one {@link SqlMappingAttribute}.
 * 
 * For the purpose of correct left join handling, the identities are identified. They are used to prevent the repeated
 * rows in the output result set. This is used for the associations (one-to-one, one-to-many and many-to-many).
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMappingIdentity {
    /**
     * The list of all alternative identities. More identities happen in the case of the result classes inheritance.
     * This version of SQL Processor supports table per subclass (represent is a (inheritance) relationships as has a
     * (foreign key) relationships).
     */
    List<Integer> identityIndexes;
    /**
     * The list of all parent alternative identities. More identities happen in the case of the result classes
     * inheritance. This version of SQL Processor supports table per subclass (represent is a (inheritance)
     * relationships as has a (foreign key) relationships).
     */
    List<List<Integer>> allIdentityIndexes;
    /**
     * The distance from the identity column.
     */
    Integer idenityDistance;
    /**
     * The related mapping rule element for one output attribute.
     */
    SqlMappingItem item;
    /**
     * The related mapping rule sub-element for one output attribute.
     */
    SqlMappingAttribute itemAttribute;

    /**
     * Creates a new instance.
     * 
     * @param item
     *            the related mapping rule element
     */
    SqlMappingIdentity(SqlMappingItem item) {
        this.item = item;
    }

    /**
     * Creates a new instance.
     * 
     * @param item
     *            the related mapping rule element
     * @param itemAttribute
     *            the related mapping rule sub-element
     */
    SqlMappingIdentity(SqlMappingItem item, SqlMappingAttribute itemAttribute) {
        this.item = item;
        this.itemAttribute = itemAttribute;
    }

    /**
     * Adds a new identity index.
     * 
     * @param identityIndex
     *            a new identity index
     * @param reset
     *            an indicator this is the only identity index
     */
    void addIdentityIndex(Integer identityIndex, boolean reset) {
        if (identityIndexes == null || reset)
            identityIndexes = new ArrayList<Integer>();
        identityIndexes.add(identityIndex);
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    @Override
    public String toString() {
        return "Attribute [identityIndexes=" + identityIndexes + ", idenityDistance=" + idenityDistance
                + ", allIdentityIndexes=" + allIdentityIndexes + ", item="
                + ((item != null) ? item.getFullName() : "null") + ", itemAttribute="
                + ((itemAttribute != null) ? itemAttribute.getFullName() : "null") + "]";
    }
}