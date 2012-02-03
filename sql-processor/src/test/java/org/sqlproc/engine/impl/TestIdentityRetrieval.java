package org.sqlproc.engine.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestIdentityRetrieval extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    @Test
    public void testGenIdSeparateStatementsReturnsNull() throws SQLException {
        if (!"mssql".equalsIgnoreCase(dbType))
            return;

        final Connection connection = this.session.getConnection();
        final String sql = "insert into PERSON (SSN_NUMBER, SSN_COUNTRY, NAME_FIRST, NAME_LAST, BIRTHDATE, SEX, VERSION) "
                + "values ('123', '', 'Test name', 'Test last', '1969-04-21', 'M', '1')";

        logger.info(sql);

        final String identSql = "select scope_identity()";

        PreparedStatement statement = null;
        PreparedStatement statementIdent = null;
        ResultSet rs = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.execute();
            assertEquals(1, statement.getUpdateCount());

            statementIdent = connection.prepareStatement(identSql);
            rs = statementIdent.executeQuery();

            Object idValue = null;
            while (rs.next()) {
                idValue = rs.getObject(1);
                logger.info("new id: " + idValue);
                assertNull(idValue);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (statementIdent != null) {
                statementIdent.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }

    @Test
    public void testGenIdSameStatement() throws SQLException {
        if (!"mssql".equalsIgnoreCase(dbType))
            return;

        final Connection connection = this.session.getConnection();
        final String sql = "insert into PERSON (SSN_NUMBER, SSN_COUNTRY, NAME_FIRST, NAME_LAST, BIRTHDATE, SEX, VERSION) "
                + "values ('123', '', 'Test name', 'Test last', '1969-04-21', 'M', '1')";

        logger.info(sql);

        final String identSql = "select scope_identity()";

        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = connection.createStatement();
            statement.execute(sql);
            assertEquals(1, statement.getUpdateCount());

            rs = statement.executeQuery(identSql);

            Object idValue = null;
            while (rs.next()) {
                idValue = rs.getObject(1);
                logger.info("new id: " + idValue);
                assertNotNull(idValue);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }

    @Test
    public void testGenIdFromResultSet() throws SQLException {
        if (!"mssql".equalsIgnoreCase(dbType))
            return;

        final Connection connection = this.session.getConnection();
        final String sql = "insert into PERSON (SSN_NUMBER, SSN_COUNTRY, NAME_FIRST, NAME_LAST, BIRTHDATE, SEX, VERSION) "
                + "values ('123', '', 'Test name', 'Test last', '1969-04-21', 'M', '1')";

        logger.info(sql);

        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = connection.createStatement();
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
            assertEquals(1, statement.getUpdateCount());

            rs = statement.getGeneratedKeys();

            Object idValue = null;
            while (rs.next()) {
                idValue = rs.getObject(1);
                logger.info("new id: " + idValue);
                assertNotNull(idValue);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }

}
