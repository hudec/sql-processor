package org.sqlproc.engine.impl;

import static org.sqlproc.engine.SqlFeature.DB2;
import static org.sqlproc.engine.SqlFeature.HSQLDB;
import static org.sqlproc.engine.SqlFeature.IDSEL;
import static org.sqlproc.engine.SqlFeature.IDSEL_Integer;
import static org.sqlproc.engine.SqlFeature.IDSEL_JDBC;
import static org.sqlproc.engine.SqlFeature.IDSEL_Long;
import static org.sqlproc.engine.SqlFeature.INFORMIX;
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

/**
 * The default optional features.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlDefaultFeatures {

    public static final Map<String, Object> FEATURES = new HashMap<String, Object>();
    public static final Map<String, Map<String, Object>> FILTERED_FEATURES = new HashMap<String, Map<String, Object>>();

    static {
        FILTERED_FEATURES.put(ORACLE, new HashMap<String, Object>());
        FILTERED_FEATURES.put(HSQLDB, new HashMap<String, Object>());
        FILTERED_FEATURES.put(MYSQL, new HashMap<String, Object>());
        FILTERED_FEATURES.put(POSTGRESQL, new HashMap<String, Object>());
        FILTERED_FEATURES.put(INFORMIX, new HashMap<String, Object>());
        FILTERED_FEATURES.put(MSSQL, new HashMap<String, Object>());
        FILTERED_FEATURES.put(DB2, new HashMap<String, Object>());
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
        FILTERED_FEATURES.get(HSQLDB).put(LIMIT_FROM_TO, "$S offset $F limit $M");
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_FROM_TO_ORDERED</code> is the default value related to the key
         * <code>LIMIT_FROM_TO_ORDERED</code> in the case the filter value <code>HSQLDB</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB).put(LIMIT_FROM_TO_ORDERED, "$S offset $F limit $M using index");
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>HSQLDB_DEFAULT_LIMIT_TO_ORDERED</code> is the default value related to the key
         * <code>LIMIT_TO_ORDERED</code> in the case the filter value <code>HSQLDB</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB).put(LIMIT_TO_ORDERED, "$S limit $M using index");
        /**
         * <code>ORACLE_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code>
         * in the case the filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance
         * creation.
         */
        FILTERED_FEATURES.get(ORACLE).put(LIMIT_FROM_TO,
                "select * from ( select row_.*, rownum rownum_ from ($S) row_ where rownum <= $m) where rownum_ > $F");
        /**
         * <code>ORACLE_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(ORACLE).put(LIMIT_TO, "select * from ($S) where rownum <= $m");
        /**
         * <code>MYSQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code>
         * in the case the filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MYSQL).put(LIMIT_FROM_TO, "$S limit $F, $M");
        /**
         * <code>MYSQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MYSQL).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>POSTGRESQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key
         * <code>LIMIT_FROM_TO</code> in the case the filter value <code>POSTGRESQL</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(POSTGRESQL).put(LIMIT_FROM_TO, "$S limit $M offset $F");
        /**
         * <code>POSTGRESQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(POSTGRESQL).put(LIMIT_TO, "$S limit $M");
        /**
         * <code>INFORMIX_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key
         * <code>LIMIT_FROM_TO</code> in the case the filter value <code>INFORMIX</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX).put(LIMIT_FROM_TO, "select skip $F first $M $s");
        /**
         * <code>INFORMIX_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
         * case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX).put(LIMIT_TO, "select first $M $s");
        /**
         * Version for MS SQL Server 2012: <code>MSSQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the
         * key <code>LIMIT_FROM_TO</code> in the case the filter value <code>MSSQL</code> is used for the
         * {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MSSQL).put(LIMIT_FROM_TO, "$S OFFSET ($F) ROWS FETCH NEXT ($M) ROWS ONLY");
        /**
         * <code>MSSQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MSSQL).put(LIMIT_TO, "select top ($M) $s");
        /**
         * <code>DB2_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
         * the case the filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES
                .get(DB2)
                .put(LIMIT_FROM_TO,
                        "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m and rownum_ > $F");
        /**
         * <code>DB2_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
         * the filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2).put(LIMIT_TO,
                "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m");
        /**
         * <code>HSQLDB_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB).put(SEQ, "call next value for $n");
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
        FILTERED_FEATURES.get(ORACLE).put(SEQ, "select $n.nextval from dual");
        /**
         * <code>POSTGRESQL_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(POSTGRESQL).put(SEQ, "select nextval('$n')");
        /**
         * <code>INFORMIX_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
         * filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX).put(SEQ, "SELECT FIRST 1 $n.NEXTVAL FROM systables");
        /**
         * <code>DB2_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
         * value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2).put(SEQ, "values nextval for $n");
        /**
         * <code>DEFAULT_SEQ_NAME</code> is the default sequence name.
         */
        FEATURES.put(SEQ_NAME, "SQLPROC_SEQUENCE");
        /**
         * <code>HSQLDB_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(HSQLDB).put(IDSEL, "call identity()");
        /**
         * <code>MYSQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(MYSQL).put(IDSEL, "select last_insert_id()");
        /**
         * <code>POSTGRESQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case
         * the filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        // TODO $t - table name, $c - column name
        FILTERED_FEATURES.get(POSTGRESQL).put(IDSEL, "select currval(pg_get_serial_sequence('$t','$c'))");
        /**
         * <code>INFORMIX_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case
         * the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX).put(IDSEL, "SELECT FIRST 1 dbinfo('bigserial') FROM systables");
        /**
         * <code>INFORMIX_DEFAULT_IDSEL_Long</code> is the default value related to the key <code>IDSEL</code> in the
         * case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        // public static final String INFORMIX_DEFAULT_IDSEL_Long,
        // "select dbinfo('serial8') from informix.systables where tabid=1");
        FILTERED_FEATURES.get(INFORMIX).put(IDSEL_Long,
                "select dbinfo('bigserial') from informix.systables where tabid=1");
        /**
         * <code>INFORMIX_DEFAULT_IDSEL_Integer</code> is the default value related to the key <code>IDSEL</code> in the
         * case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(INFORMIX).put(IDSEL_Integer,
                "select dbinfo('sqlca.sqlerrd1') from informix.systables where tabid=1");
        /**
         * <code>MSSQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
         * <p/>
         * The default value is {@link #IDSEL_JDBC}.
         */
        FILTERED_FEATURES.get(MSSQL).put(IDSEL, IDSEL_JDBC);
        /**
         * /** <code>DB2_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
         * filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
         */
        FILTERED_FEATURES.get(DB2).put(IDSEL, "SELECT identity_val_local() FROM SYSIBM.DUAL");
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
}
