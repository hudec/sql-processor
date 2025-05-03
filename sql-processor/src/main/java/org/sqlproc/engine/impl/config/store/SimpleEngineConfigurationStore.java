package org.sqlproc.engine.impl.config.store;

import java.io.IOException;

import jakarta.xml.bind.JAXBException;

import org.sqlproc.engine.config.SqlEngineConfiguration;
import org.sqlproc.engine.config.store.SqlEngineConfigurationStore;
import org.sqlproc.engine.config.store.XmlEngineConfiguration;

/**
 * This class is used only for the SQL Processor dynamic configuration serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SimpleEngineConfigurationStore extends SimpleJaxbStore implements SqlEngineConfigurationStore {

    public SimpleEngineConfigurationStore(String directory, String fileName, Class<?>... jaxbClasses)
            throws IOException, JAXBException {
        super(directory, fileName, jaxbClasses);
    }

    @Override
    public boolean writeConfig(SqlEngineConfiguration config) {
        XmlEngineConfiguration xml = new XmlEngineConfiguration(config);
        return writeXml(xml);
    }

    @Override
    public boolean readConfig(SqlEngineConfiguration config) {
        Object xml = readXml();
        if (xml == null)
            return false;
        ((XmlEngineConfiguration) xml).toConfig(config);
        return true;
    }
}
