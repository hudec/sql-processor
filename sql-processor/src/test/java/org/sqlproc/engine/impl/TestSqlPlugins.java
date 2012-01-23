package org.sqlproc.engine.impl;

import org.junit.Ignore;
import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.plugin.CustomizedSqlPlugins;
import org.sqlproc.engine.plugin.SimpleSqlPluginFactory;

public class TestSqlPlugins extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    @Ignore
    public void testIsEmptyPlugin() {
        final SimpleSqlPluginFactory sqlPluginFactory = (SimpleSqlPluginFactory) SimpleSqlPluginFactory.getInstance();
        sqlPluginFactory.setIsEmptyPlugin(new CustomizedSqlPlugins());

        final SqlQueryEngine sqlEngine = getQueryEngine("PLUGIN_IS_EMPTY", sqlPluginFactory);

        final PersonForm personForm = new PersonForm();
        personForm.setId(10L);
        personForm.setCreatedBy("0");

        final String sql = sqlEngine.getSql(personForm, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.CREATED_BY =");
    }

    @Test
    public void testIsTruePlugin() {
        final SimpleSqlPluginFactory sqlPluginFactory = (SimpleSqlPluginFactory) SimpleSqlPluginFactory.getInstance();
        sqlPluginFactory.setIsTruePlugin(new CustomizedSqlPlugins());

        final SqlQueryEngine sqlEngine = getQueryEngine("PLUGIN_IS_TRUE", sqlPluginFactory);

        final PersonForm personForm = new PersonForm();
        personForm.setCreatedBy("0");

        final String sql = sqlEngine.getSql(personForm, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "WHERE p.ID is null");
        assertContains(sql, "AND p.CREATED_BY is null");
    }
}
