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
    public static final String MODIFIER_NOTEMPTY = "notempty";

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
     * The modifier used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String MODIFIER_EMPTY = "empty";

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

    /**
     * The modifier used to detect the empty value and true value for the collections. For the usage please see the Wiki
     * Tutorials.
     */
    public static final String MODIFIER_ANYSET = "anyset";

    /**
     * The modifier used to detect the primary key in the SQL command execution output.
     */
    static final String MODIFIER_ID = "id";

    /**
     * The modifier used to detect the generic type of the embedded attribute in a result class. It's used mainly in the
     * case the embedded attribute is a collection of abstract type.
     */
    static final String MODIFIER_GTYPE = "gtype";

    /**
     * The modifier used to detect the dynamic type of the embedded attribute in a result class. It's used mainly in the
     * case the embedded attribute is of collection type.
     */
    static final String MODIFIER_TYPE = "type";

    /**
     * The modifier used to detect the discriminator column/attribute. It's used mainly in the inheritance handling.
     */
    static final String MODIFIER_DISCRIMINATOR = "discr";
}
