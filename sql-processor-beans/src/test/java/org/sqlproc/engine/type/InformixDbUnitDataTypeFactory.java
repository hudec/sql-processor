package org.sqlproc.engine.type;

import java.util.Arrays;
import java.util.Collection;

import org.dbunit.dataset.datatype.DefaultDataTypeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Specialized DbUnit data type factory that recognizes Informix data types.
 * 
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondrej Kotek</a>
 */
public class InformixDbUnitDataTypeFactory extends DefaultDataTypeFactory {

    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(InformixDbUnitDataTypeFactory.class);

    /**
     * Database product names supported.
     */
    private static final Collection DATABASE_PRODUCTS = Arrays.asList(new String[] { "informix dynamic server" });

    /**
     * @see org.dbunit.dataset.datatype.IDbProductRelatable#getValidDbProducts()
     */
    public Collection getValidDbProducts() {
        return DATABASE_PRODUCTS;
    }
}
