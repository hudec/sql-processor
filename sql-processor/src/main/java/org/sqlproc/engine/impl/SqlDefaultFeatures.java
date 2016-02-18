package org.sqlproc.engine.impl;

import static org.sqlproc.engine.SqlFeature.DB2;
import static org.sqlproc.engine.SqlFeature.H2;
import static org.sqlproc.engine.SqlFeature.HSQLDB;
import static org.sqlproc.engine.SqlFeature.IDSEL;
import static org.sqlproc.engine.SqlFeature.IDSEL_Integer;
import static org.sqlproc.engine.SqlFeature.IDSEL_Long;
import static org.sqlproc.engine.SqlFeature.INFORMIX;
import static org.sqlproc.engine.SqlFeature.JDBC;
import static org.sqlproc.engine.SqlFeature.LIKE_STRING;
import static org.sqlproc.engine.SqlFeature.LIMIT_FROM_TO;
import static org.sqlproc.engine.SqlFeature.LIMIT_FROM_TO_ORDERED;
import static org.sqlproc.engine.SqlFeature.LIMIT_TO;
import static org.sqlproc.engine.SqlFeature.LIMIT_TO_ORDERED;
import static org.sqlproc.engine.SqlFeature.LOG_SQL_COMMAND_FOR_EXCEPTION;
import static org.sqlproc.engine.SqlFeature.METHODS_ENUM_IN;
import static org.sqlproc.engine.SqlFeature.METHODS_ENUM_OUT;
import static org.sqlproc.engine.SqlFeature.MSSQL;
import static org.sqlproc.engine.SqlFeature.MYSQL;
import static org.sqlproc.engine.SqlFeature.OPERATOR_ATTRIBUTE;
import static org.sqlproc.engine.SqlFeature.OPERATOR_ATTRIBUTE_IN_MAP;
import static org.sqlproc.engine.SqlFeature.ORACLE;
import static org.sqlproc.engine.SqlFeature.POSTGRESQL;
import static org.sqlproc.engine.SqlFeature.SEQ;
import static org.sqlproc.engine.SqlFeature.SEQ_NAME;
import static org.sqlproc.engine.SqlFeature.SURROUND_QUERY_LIKE_PARTIAL;
import static org.sqlproc.engine.SqlFeature.SURROUND_QUERY_MIN_LEN;
import static org.sqlproc.engine.SqlFeature.VERSION_COLUMN;
import static org.sqlproc.engine.SqlFeature.WILDCARD_CHARACTER;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.sqlproc.engine.SqlFeature;

/**
 * The default optional features.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlDefaultFeatures {

    public static final Map<SqlFeature, Object> FEATURES = new HashMap<SqlFeature, Object>();
    public static final Map<String, Map<SqlFeature, Object>> FILTERED_FEATURES = new HashMap<String, Map<SqlFeature, Object>>();

    static {
        FILTERED_FEATURES.put(ORACLE.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(HSQLDB.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(H2.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(MYSQL.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(POSTGRESQL.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(INFORMIX.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(MSSQL.name(), new HashMap<SqlFeature, Object>());
        FILTERED_FEATURES.put(DB2.name(), new HashMap<SqlFeature, Object>());
    }

    static {
        /**
         * This is the default value related to the key <code>WILDCARD_CHARACTER</code> .
         */
        FEATURES.put(WILDCARD_CHARACTER, "%");
        /**
         * This is the default value related to the key <code>SURROUND_QUERY_LIKE_PARTIAL</code> .
         */
        FEATURES.put(SURROUND_QUERY_LIKE_PARTIAL, Boolean.TRUE);
        /**
         * This is the default value related to the key <code>SURROUND_QUERY_MIN_LEN</code>.
         */
        FEATURES.put(SURROUND_QUERY_MIN_LEN, 2);
        /**
         * This is the default value related to the key <code>LIKE_STRING</code>.
         */
        FEATURES.put(LIKE_STRING, "like");
        /**
         * This is the default value related to the key <code>METHODS_ENUM_IN</code>. It is list of the next methods:
         * <ul>
         * <li>getCode</li>
         * <li>getValue</li>
         * <li>getName</li>
         * <li>name</li>
         * </ul>
         */
        FEATURES.put(METHODS_ENUM_IN, new String[] { "getCode", "getValue", "getName", "name" });
        /**
         * This is the default value related to the key <code>METHODS_ENUM_OUT</code>. It is list of the next methods:
         * <ul>
         * <li>fromCode</li>
         * <li>fromValue</li>
         * <li>valueOf</li>
         * </ul>
         */
        FEATURES.put(METHODS_ENUM_OUT, new String[] { "fromCode", "fromValue", "valueOf" });
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code>
         * in the case the filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance
         * creation.
         */
        FILTERED_FEATURES.get(HSQLDB.name()).put(LIMIT_FROM_TO, "$S offset $F limit $M");
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_FROM_TO_ORDERED</code> is the default value related to the key
         * <code>LIMIT_FROM_TO_ORDERED</code> in the case the filter value <code>HSQLDB</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB.name()).put(LIMIT_FROM_TO_ORDERED, "$S offset $F limit $M using index");
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB.name()).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_TO_ORDERED</code> is the default value related to the key
         * <code>LIMIT_TO_ORDERED</code> in the case the filter value <code>HSQLDB</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB.name()).put(LIMIT_TO_ORDERED, "$S limit $M using index");
        /**
         * <code>H2_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
         * the case the filter value <code>H2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(H2.name()).put(LIMIT_FROM_TO, "$S limit $M offset $F");
        /**
         * <code>H2_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>H2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(H2.name()).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>ORACLE_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code>
         * in the case the filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance
         * creation.
         */
        FILTERED_FEATURES.get(ORACLE.name()).put(LIMIT_FROM_TO,
                "select * from ( select row_.*, rownum rownum_ from ($S) row_ where rownum <= $m) where rownum_ > $F");
        /**
         * <code>ORACLE_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(ORACLE.name()).put(LIMIT_TO, "select * from ($S) where rownum <= $m");
        /**
         * <code>MYSQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code>
         * in the case the filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MYSQL.name()).put(LIMIT_FROM_TO, "$S limit $F, $M");
        /**
         * <code>MYSQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MYSQL.name()).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>POSTGRESQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key
         * <code>LIMIT_FROM_TO</code> in the case the filter value <code>POSTGRESQL</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(POSTGRESQL.name()).put(LIMIT_FROM_TO, "$S limit $M offset $F");
        /**
         * <code>POSTGRESQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(POSTGRESQL.name()).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>INFORMIX_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key
         * <code>LIMIT_FROM_TO</code> in the case the filter value <code>INFORMIX</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX.name()).put(LIMIT_FROM_TO, "select skip $F first $M $s");
        /**
         * <code>INFORMIX_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX.name()).put(LIMIT_TO, "select first $M $s");
        /**
         * Version for MS SQL Server 2012: <code>MSSQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the
         * key <code>LIMIT_FROM_TO</code> in the case the filter value <code>MSSQL</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MSSQL.name()).put(LIMIT_FROM_TO, "$S OFFSET ($F) ROWS FETCH NEXT ($M) ROWS ONLY");
        /**
         * <code>MSSQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MSSQL.name()).put(LIMIT_TO, "select top ($M) $s");
        /**
         * <code>DB2_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
         * the case the filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2.name()).put(LIMIT_FROM_TO,
                "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m and rownum_ > $F");
        /**
         * <code>DB2_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2.name()).put(LIMIT_TO,
                "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m");
        /**
         * <code>HSQLDB_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB.name()).put(SEQ, "call next value for $n");
        /**
         * <code>H2_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
         * value <code>H2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(H2.name()).put(SEQ, "call next value for $n");
        /**
         * <code>MYSQL_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        // TODO $t - table name
        // public static final String MYSQL_DEFAULT_SEQ,
        // "select auto_increment from information_schema.tables where table_name, '$t'");
        /**
         * <code>ORACLE_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(ORACLE.name()).put(SEQ, "select $n.nextval from dual");
        /**
         * <code>POSTGRESQL_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(POSTGRESQL.name()).put(SEQ, "select nextval('$n')");
        /**
         * <code>INFORMIX_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX.name()).put(SEQ, "SELECT FIRST 1 $n.NEXTVAL FROM systables");
        /**
         * <code>DB2_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
         * value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2.name()).put(SEQ, "values nextval for $n");
        /**
         * <code>DEFAULT_SEQ_NAME</code> is the default sequence name.
         */
        FEATURES.put(SEQ_NAME, "SQLPROC_SEQUENCE");
        /**
         * <code>HSQLDB_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB.name()).put(IDSEL, "call identity()");
        /**
         * <code>H2_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>H2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(H2.name()).put(IDSEL, "call identity()");
        /**
         * <code>MYSQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MYSQL.name()).put(IDSEL, "select last_insert_id()");
        /**
         * <code>POSTGRESQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case
         * the filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        // TODO $t - table name, $c - column name
        FILTERED_FEATURES.get(POSTGRESQL.name()).put(IDSEL, "select currval(pg_get_serial_sequence('$t','$c'))");
        /**
         * <code>INFORMIX_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case
         * the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX.name()).put(IDSEL, "SELECT FIRST 1 dbinfo('bigserial') FROM systables");
        /**
         * <code>INFORMIX_DEFAULT_IDSEL_Long</code> is the default value related to the key <code>IDSEL</code> in the
         * case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        // public static final String INFORMIX_DEFAULT_IDSEL_Long,
        // "select dbinfo('serial8') from informix.systables where tabid=1");
        FILTERED_FEATURES.get(INFORMIX.name()).put(IDSEL_Long,
                "select dbinfo('bigserial') from informix.systables where tabid=1");
        /**
         * <code>INFORMIX_DEFAULT_IDSEL_Integer</code> is the default value related to the key <code>IDSEL</code> in the
         * case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX.name()).put(IDSEL_Integer,
                "select dbinfo('sqlca.sqlerrd1') from informix.systables where tabid=1");
        /**
         * <code>MSSQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         * <p/>
         * The default value is {@link #IDSEL_JDBC}.
         */
        FILTERED_FEATURES.get(MSSQL.name()).put(IDSEL, JDBC.name());
        /**
         * /** <code>DB2_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2.name()).put(IDSEL, "SELECT identity_val_local() FROM SYSIBM.DUAL");
        /**
         * <code>DEFAULT_VERSION_COLUMN</code> is the default name of the column devoted to the optimistic locking.
         */
        FEATURES.put(VERSION_COLUMN, "version");
        /**
         * This is the default value related to the key <code>OPERATOR_ATTRIBUTE</code>.
         */
        FEATURES.put(OPERATOR_ATTRIBUTE, "Op");
        /**
         * This is the default value related to the key <code>OPERATOR_ATTRIBUTE_IN_MAP</code>.
         */
        FEATURES.put(OPERATOR_ATTRIBUTE_IN_MAP, "operators");
        /**
         * This is the default value related to the key <code>LOG_SQL_COMMAND_FOR_EXCEPTION</code> .
         */
        FEATURES.put(LOG_SQL_COMMAND_FOR_EXCEPTION, Boolean.FALSE);
    }

    /**
     * Returns filtered features. For example the features can be specific ones for given database.
     * 
     * @param filter
     *            the filter (for example the database name)
     * @return the specific features
     */
    public static Map<String, Object> getFilteredFeatures(String filter) {
        Map<String, Object> features = new HashMap<String, Object>();

        for (Entry<SqlFeature, Object> entry : SqlDefaultFeatures.FEATURES.entrySet()) {
            features.put(entry.getKey().name(), entry.getValue());
        }
        if (filter != null) {
            Map<SqlFeature, Object> filteredFeatures = SqlDefaultFeatures.FILTERED_FEATURES.get(filter);
            if (filteredFeatures != null) {
                for (Entry<SqlFeature, Object> entry : filteredFeatures.entrySet()) {
                    features.put(entry.getKey().name(), entry.getValue());
                }
            }
        }

        return features;
    }
}
