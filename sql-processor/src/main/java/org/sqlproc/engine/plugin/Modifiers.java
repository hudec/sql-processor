package org.sqlproc.engine.plugin;

/**
 * The modifiers are used as the supplement values in the processing of the META SQL statements.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface Modifiers {

    /**
     * The modifier used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String MODIFIER_NOTNULL = "notnull";

    /**
     * The modifier used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String MODIFIER_ANY = "any";

    /**
     * The modifier used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String MODIFIER_NULL = "null";

    /**
     * The modifier used to detect the method call invoked on the parent object. For the usage please see the Wiki
     * Tutorials.
     */
    public static final String MODIFIER_CALL = "call";

    /**
     * The modifier used to detect the sequence usage.
     */
    static final String MODIFIER_SEQUENCE = "seq";

    /**
     * The modifier used to detect the identity selectusage.
     */
    static final String MODIFIER_IDENTITY_SELECT = "idsel";
}
