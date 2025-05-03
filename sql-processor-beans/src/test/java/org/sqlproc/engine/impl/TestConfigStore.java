package org.sqlproc.engine.impl;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.xml.bind.JAXBException;

import junit.framework.TestCase;

import org.junit.Test;
import org.sqlproc.engine.config.SqlEngineConfiguration;

public class TestConfigStore extends TestCase {

    @Test
    public void testStore() throws IOException, JAXBException {

        SqlEngineConfiguration config = new SqlEngineConfiguration("/tmp", "sqlp-config.xml");
        config.addQueryEngine("QE1");
        config.addCrudEngine("CE1");
        config.addProcedureEngine("PE1");
        config.addQueryEngine("QE2");
        config.addCrudEngine("CE2");
        config.addProcedureEngine("PE2");
        config.addDynamicQueryEngine("QE1", "sql1");
        config.addDynamicCrudEngine("CE1", "sql2");
        config.addDynamicProcedureEngine("PE1", "sql3");
        config.addDynamicQueryEngine("QE3", "sql4");
        config.addDynamicCrudEngine("CE3", "sql5");
        config.addDynamicProcedureEngine("PE3", "sql6");
        config.setInitTreshold(2);
        config.store();

        SqlEngineConfiguration config2 = new SqlEngineConfiguration("/tmp", "sqlp-config.xml");
        config2.load();
        assertEquals(3, config2.getQueryEngines().size());
        AtomicInteger usage = config2.getQueryEngines().get("QE1");
        assertNotNull(usage);
        assertEquals(2, usage.get());
        assertEquals(3, config2.getCrudEngines().size());
        usage = config2.getCrudEngines().get("CE1");
        assertNotNull(usage);
        assertEquals(2, usage.get());
        assertEquals(3, config2.getProcedureEngines().size());
        usage = config2.getProcedureEngines().get("PE1");
        assertNotNull(usage);
        assertEquals(2, usage.get());

        assertEquals(2, config2.getDynamicQueryEngines().size());
        String sql = config2.getDynamicQueryEngines().get("QE3");
        assertEquals("sql4", sql);
        assertEquals(2, config2.getDynamicCrudEngines().size());
        sql = config2.getDynamicCrudEngines().get("CE3");
        assertEquals("sql5", sql);
        assertEquals(2, config2.getDynamicProcedureEngines().size());
        sql = config2.getDynamicProcedureEngines().get("PE3");
        assertEquals("sql6", sql);

        assertNotNull(config2.getInitTreshold());
        assertEquals(2, config2.getInitTreshold().intValue());

        SqlEngineConfiguration config3 = new SqlEngineConfiguration("/tmp", "sqlp-config.xml");
        config3.load();
        assertEquals(1, config3.getQueryEnginesToInit(2).size());
        assertEquals(1, config3.getCrudEnginesToInit(2).size());
        assertEquals(1, config3.getProcedureEnginesToInit(2).size());
    }
}
