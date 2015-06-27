/*
 * Created on Sep 17, 2010
 * (C) 2010 ICZ, a.s.
 */

package org.sqlproc.engine.config.store.jmx;

import java.io.IOException;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.sqlproc.engine.config.store.PersistentStore;

/**
 * JMX beana, která umožňuje reset nastavení do stavu po inicializaci spring contextem.
 * 
 * @author Vladimír Hudec
 */
@ManagedResource(objectName = "sql-processor:type=Config", description = "Úložiště základní systémová a provozní konfigurace AIS3")
public class PersistentStoreJmx extends PersistentStore {

    @Override
    @ManagedOperation(description = "Reset do počátečního stavu.")
    public void reset() throws IOException {
        super.reset();
    }

    /**
     * Empty all properties on Persistent object (requieres own implementation on implementing class)
     */
    @Override
    @ManagedOperation(description = "Vyprazdneni vsech atributu.")
    public void empty() {
        super.empty();
    }

    /**
     * Method reads configuration from given xml-file. As <code>filename</code> should be used name without path
     * definition. Configuration is immediatelly saved into main config file (specified in parameter <code>store</code>
     * ).
     * <p/>
     * For security purposes there is not possible to enter path in filename therefore in filename are allowed only
     * letters, digits and some special characters such as period (.), dash (-)
     * <p/>
     * When parameter <code>merge</code> is <code>true</code> configuration in memory is merged with actual
     * configuration otherwise is rewritten by configuration from file.
     * 
     * @param filename
     *            Name of file from which configuration will be read
     * @param merge
     *            If <code>true</code> loaded configuration will be merged with actual configuration in memory
     * @throws IllegalArgumentException
     *             when given filename is wrong (see
     *             {@link cz.isvs.reg.ws.common.config.store.PersistentStore#checkFilename(String)})
     */
    @Override
    @ManagedOperation(description = "Nacteni konfigurace ze souboru")
    public void read(String filename, boolean merge) {
        super.read(filename, merge);
    }

    /**
     * Method will write configuration into given xml-file. As <code>filename</code> should be used name without path
     * definition.
     * <p/>
     * For security purposes there is not possible to enter path in filename therefore in filename are allowed only
     * letters, digits and some special characters such as period (.), dash (-)
     * <p/>
     * When parameter <code>overwrite</code> is <code>true</code> target file is overwritten otherwise
     * 
     * @param filename
     *            Name of file from which configuration will be read
     * @param overwrite
     *            If <code>true</code> existing file wil be overwriten
     * @throws IllegalArgumentException
     *             when given filename is wrong (see
     *             {@link cz.isvs.reg.ws.common.config.store.PersistentStore#checkFilename(String)})
     * @throws java.io.IOException
     *             Is thrown when given file already exist and flag overwrite is <code>false</code>
     */
    @Override
    @ManagedOperation(description = "Ulozeni aktualni konfigurace do souboru")
    public void write(String filename, boolean overwrite) throws IOException {
        super.write(filename, overwrite);
    }
}
