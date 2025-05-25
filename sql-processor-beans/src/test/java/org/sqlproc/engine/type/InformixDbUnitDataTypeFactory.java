package org.sqlproc.engine.type;

import java.util.Arrays;
import java.util.Collection;

import org.dbunit.dataset.datatype.DefaultDataTypeFactory;

/**
 * Specialized DbUnit data type factory that recognizes Informix data types.
 * 
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondrej Kotek</a>
 */
public class InformixDbUnitDataTypeFactory extends DefaultDataTypeFactory {

    /**
     * Database product names supported.
     */
    private static final Collection<String> DATABASE_PRODUCTS = Arrays.asList(new String[] { "informix dynamic server" });

    /**
     * @see org.dbunit.dataset.datatype.IDbProductRelatable#getValidDbProducts()
     */
    public Collection<String> getValidDbProducts() {
        return DATABASE_PRODUCTS;
    }
}
