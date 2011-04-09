package org.sqlproc.engine.type;

/**
 * The helper contract implemented by SqlInputValue to support the auto-generated identities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface IdentitySetter {

    /**
     * Sets the result of select command for the generated identity value.
     * 
     * @param identity
     *            the generated identity value
     */
    void setIdentity(Object identity);

    /**
     * Returns the select command used to obtain the generated identity value.
     */
    String getIdentitySelect();
}
