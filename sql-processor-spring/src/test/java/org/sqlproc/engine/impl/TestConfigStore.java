package org.sqlproc.engine.impl;

import java.io.IOException;

import org.junit.Test;
import org.sqlproc.engine.config.SqlEngineConfiguration;

public class TestConfigStore {

    @Test
    public void testStore() throws IOException {
        SqlEngineConfiguration config = new SqlEngineConfiguration();
        config.addQueryEngine("QE1");
        config.addCrudEngine("CE1");
        config.addProcedureEngine("PE1");
        config.setInitTreshold(2);

        // PersistentStore store = new PersistentStore();
        // store.setStore(new FileSystemResource("/tmp/sqlp-config.xml"));
        // store.setObjectToStore(config);
        // store.setSaveToStore(true);
        // store.init();
        // store.store();
    }
}
