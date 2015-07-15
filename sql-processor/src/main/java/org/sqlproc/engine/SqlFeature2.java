package org.sqlproc.engine;

import java.util.HashMap;
import java.util.Map;

public enum SqlFeature2 {
    /**
     * The filter for Oracle devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    ORACLE,
    /**
     * The filter for HSQLDB devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    HSQLDB,
    /**
     * The filter for MySQL devoted optional features. It can be used for the construction of {@link SqlProcessorLoader}
     * .
     */
    MYSQL,
    /**
     * The filter for PostgreSQL devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader} .
     */
    POSTGRESQL,
    /**
     * The filter for Informix devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader} .
     */
    INFORMIX,
    /**
     * The filter for MS SQL Server devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    MSSQL,
    /**
     * The filter for DB2 Server devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    DB2,

    /**
     * <code>WILDCARD_CHARACTER</code> is the key for the wildcard character for the SQL <code>like</code> command.
     */
    WILDCARD_CHARACTER("%"),
    /**
     * <code>SURROUND_QUERY_LIKE</code> is the key for the special SQL Processor behavior. In the case the value of this
     * property is <code>true</code>, the SQL Processor sets the wildcard character as a prefix and postfix for all
     * string values related to the SQL command <code>like</code>. These string values should have to have the minimal
     * length greater or equal to <code>SURROUND_QUERY_MIN_LEN</code>. The default value related to this key is
     * <code>false</code>.
     */
    SURROUND_QUERY_LIKE_FULL,
    /**
     * <code>SURROUND_QUERY_LIKE_PARTIAL</code> is the key for the special SQL Processor behavior. In the case the value
     * of this property is <code>true</code>, the SQL Processor sets the wildcard character as a postfix for all string
     * values related to the SQL command <code>like</code>. These string values should have to have the minimal length
     * greater or equal to <code>SURROUND_QUERY_MIN_LEN</code>. The default value related to this key is
     * <code>false</code>.
     */
    SURROUND_QUERY_LIKE_PARTIAL,
    /**
     * <code>SURROUND_QUERY_MIN_LEN</code> is the minimal length of the string input values for the SQL
     * <code>like</code> command to switch on the SQL Processor special behavior described above in the runtime.
     */
    SURROUND_QUERY_MIN_LEN(2),
    /**
     * <code>LIKE_STRING</code> is the key for the SQL command <code>like</code>. For example for the Informix database
     * it can be <code>matches</code>.
     */
    LIKE_STRING("like"),
    /**
     * <code>REPLACE_LIKE_STRING</code> is the key for the special SQL Processor behavior related to the SQL command
     * <code>like</code>. The supplied value is going to be used as the final LIKE_STRING.
     */
    REPLACE_LIKE_STRING("REPLACE_LIKE_STRING"),
    /**
     * <code>REPLACE_LIKE_CHARS</code> is the key for the special SQL Processor behavior related to the SQL command
     * <code>like</code>. The feature pattern is <code>['c1':'r1', 'c2':'r2', ...]</code>, where <code>c1,c2,...</code>
     * is a set of characters to be replaced with the characters <code>r1,r2,...</code>. For example to use the wildcard
     * characters <code>*</code> and <code>?</code> instead of <code>%</code> <code>_</code>, use
     * <code>['*':'%', '?':'_']</code>.
     */
    REPLACE_LIKE_CHARS("REPLACE_LIKE_CHARS"),
    /**
     * <code>METHODS_ENUM_IN</code> lists the methods used in the translation from a Java type to a JDBC datatype for
     * enumerations based input values.
     */
    METHODS_ENUM_IN(new String[] { "getCode", "getValue", "getName", "name" }),
    /**
     * <code>METHODS_ENUM_OUT</code> lists the methods used in the translation from a JDBC datatype to a Java type for
     * enumerations based output values.
     */
    METHODS_ENUM_OUT(new String[] { "fromCode", "fromValue", "valueOf" }),
    /**
     * <code>ID</code> is the key for the identity columns. In the case it's values is defined, all columns with this
     * name are implicitly treated as an identifier.
     */
    ID,
    /**
     * <code>IGNORE_INPROPER_IN</code> is the key for special handling of input/output values. In the case it's value is
     * defined as true, in the case of any problems with input values the SqlRuntimeException is not thrown, only the
     * related error is logged.
     */
    IGNORE_INPROPER_IN,
    /**
     * <code>IGNORE_INPROPER_OUT</code> is the key for special handling of input/output values. In the case it's value
     * is defined as true, in the case of any problems with output values the SqlRuntimeException is not thrown, only
     * the related error is logged.
     */
    IGNORE_INPROPER_OUT,
    /**
     * <code>JDBC</code> is the key for the raw JDBC stack usage. In this SQL Processor version the next stacks can be
     * used:
     * <ul>
     * <li>raw JDBC</li>
     * <li>Hibernate</li>
     * <li>Spring DAO</li>
     * </ul>
     * The default value related to this key is <code>false</code>.
     */
    JDBC,
    /**
     * <code>LIMIT_FROM_TO</code> is the key for the SQL query pattern used to limit the query results. This pattern has
     * to be combined with the original SQL query, the limit and the offset in the next way:
     * <ul>
     * <li>$S is the full original query</li>
     * <li>$s is the original query without the token <code>select</code></li>
     * <li>$F is 1-based from rowid (=offset)</li>
     * <li>$f is 0-based from rowid (offset)</li>
     * <li>$M is the max number of returned rows</li>
     * <li>$m is the max rowid of returned rows</li>
     * </ul>
     */
    LIMIT_FROM_TO(new HashMap<SqlFeature2, String>()),
    /**
     * <code>LIMIT_FROM_TO_ORDERED</code> is the key for the SQL query pattern used to limit the query results in the
     * case the query output is sorted. Right now it's used only for HSQLDB.
     */
    LIMIT_FROM_TO_ORDERED(new HashMap<SqlFeature2, String>()),
    /**
     * <code>LIMIT_TO</code> is the key for the SQL query pattern used to limit the query results. This pattern has to
     * be combined with the original SQL query and the limit in the next way:
     * <ul>
     * <li>$S is the full original query</li>
     * <li>$s is the original query without the token <code>select</code></li>
     * <li>$F is 1-based from rowid (=offset)</li>
     * <li>$f is 0-based from rowid (offset)</li>
     * </ul>
     */
    LIMIT_TO(new HashMap<SqlFeature2, String>()),
    /**
     * <code>LIMIT_TO_ORDERED</code> is the key for the SQL query pattern used to limit the query results in the case
     * the query output is sorted. Right now it's used only for HSQLDB.
     */
    LIMIT_TO_ORDERED(new HashMap<SqlFeature2, String>()),
    /**
     * <code>SEQ</code> is the key for the SQL query pattern used for the sequences. This pattern can be combined with
     * the sequence name used in the META SQL query in the next way:
     * <ul>
     * <li>$n is the name of the sequence from the META SQL query</li>
     * </ul>
     */
    SEQ(new HashMap<SqlFeature2, String>()),
    /**
     * <code>SEQ_NAME</code> is the sequence name.
     */
    SEQ_NAME("SQLPROC_SEQUENCE"),
    /**
     * <code>IDSEL</code> is the key for the SQL query pattern used to obtain the value of identities after the INSERT
     * command.
     */
    IDSEL(new HashMap<SqlFeature2, String>()),
    /**
     * <code>IDSEL_JDBC</code> is the special value related to the key <code>IDSEL</code> indicating that the generated
     * identity value is determined using JDBC capabilities to return generated keys for SQL statement. This feature
     * requires that both the database and the JDBC driver support it.
     */
    IDSEL_JDBC,
    /**
     * <code>DEFAULT_VERSION_COLUMN</code> is the default name of the column devoted to the optimistic locking.
     */
    VERSION_COLUMN("version"),
    /**
     * <code>EMPTY_FOR_NULL</code> is indicator that the NULL values are always empty. It has meaning for the UPDATE
     * statements, where the standard handling is to treat any values as not empty.
     */
    EMPTY_FOR_NULL,
    /**
     * <code>EMPTY_USE_METHOD_IS_NULL</code> is indicator that the non-emptiness depends the special isNull method. It
     * has meaning for the UPDATE statements, where the standard handling is to treat any values as not empty.
     */
    EMPTY_USE_METHOD_IS_NULL,
    /**
     * <code>OPERATOR_ATTRIBUTE</code> is the operator atribute name suffix.
     */
    OPERATOR_ATTRIBUTE("Op"),
    /**
     * <code>OPERATOR_ATTRIBUTE_IN_MAP</code> is the map name of the operators name suffix.
     */
    OPERATOR_ATTRIBUTE_IN_MAP("operators"),
    /**
     * <code>LOG_SQL_COMMAND_FOR_EXCEPTION</code> is the indicator that in the case of an SQLException the related SQL
     * command should be logged.
     */
    LOG_SQL_COMMAND_FOR_EXCEPTION(true);

    static {
        @SuppressWarnings("unchecked")
        Map<SqlFeature2, Object> limitFromToMap = (Map<SqlFeature2, Object>) LIMIT_FROM_TO.getDefaultValue();
        limitFromToMap.put(HSQLDB, "$S offset $F limit $M");
        limitFromToMap.put(ORACLE,
                "select * from ( select row_.*, rownum rownum_ from ($S) row_ where rownum <= $m) where rownum_ > $F");
        limitFromToMap.put(MYSQL, "$S limit $F, $M");
        limitFromToMap.put(POSTGRESQL, "$S limit $M offset $F");
        limitFromToMap.put(INFORMIX, "select skip $F first $M $s");
        limitFromToMap.put(MSSQL, "$S OFFSET ($F) ROWS FETCH NEXT ($M) ROWS ONLY");
        limitFromToMap
                .put(DB2,
                        "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m and rownum_ > $F");

        @SuppressWarnings("unchecked")
        Map<SqlFeature2, Object> limitFromToOrderedMap = (Map<SqlFeature2, Object>) LIMIT_FROM_TO_ORDERED
                .getDefaultValue();
        limitFromToOrderedMap.put(HSQLDB, "$S offset $F limit $M");

        @SuppressWarnings("unchecked")
        Map<SqlFeature2, Object> limitToMap = (Map<SqlFeature2, Object>) LIMIT_TO.getDefaultValue();
        limitToMap.put(HSQLDB, "$S limit $M");
        limitToMap.put(ORACLE, "select * from ($S) where rownum <= $m");
        limitToMap.put(MYSQL, "$S limit $M");
        limitToMap.put(POSTGRESQL, "$S limit $M");
        limitToMap.put(INFORMIX, "select first $M $s");
        limitToMap.put(MSSQL, "select top ($M) $s");
        limitToMap.put(DB2,
                "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m");

        @SuppressWarnings("unchecked")
        Map<SqlFeature2, Object> limitToOrderedMap = (Map<SqlFeature2, Object>) LIMIT_TO_ORDERED.getDefaultValue();
        limitToOrderedMap.put(HSQLDB, "$S limit $M using index");

        @SuppressWarnings("unchecked")
        Map<SqlFeature2, Object> seqMap = (Map<SqlFeature2, Object>) SEQ.getDefaultValue();
        seqMap.put(HSQLDB, "call next value for $n");
        seqMap.put(ORACLE, "select $n.nextval from dual");
        seqMap.put(POSTGRESQL, "select nextval('$n')");
        seqMap.put(INFORMIX, "SELECT FIRST 1 $n.NEXTVAL FROM systables");
        seqMap.put(DB2, "values nextval for $n");

        @SuppressWarnings("unchecked")
        Map<SqlFeature2, Object> idselMap = (Map<SqlFeature2, Object>) IDSEL.getDefaultValue();
        idselMap.put(HSQLDB, "call identity()");
        idselMap.put(MYSQL, "select last_insert_id()");
        idselMap.put(POSTGRESQL, "select currval(pg_get_serial_sequence('$t','$c'))");
        idselMap.put(INFORMIX, "SELECT FIRST 1 dbinfo('bigserial') FROM systables");
        // public static final String INFORMIX_DEFAULT_IDSEL_Long =
        // "select dbinfo('bigserial') from informix.systables where tabid=1";
        // public static final String INFORMIX_DEFAULT_IDSEL_Integer =
        // "select dbinfo('sqlca.sqlerrd1') from informix.systables where tabid=1";
        idselMap.put(MSSQL, IDSEL_JDBC);
        idselMap.put(DB2, "SELECT identity_val_local() FROM SYSIBM.DUAL");
    }

    // private static Map<String, SqlFeature2> identifierMap = identifierMapBuild();
    //
    // public static Map<String, SqlFeature2> identifierMapBuild() {
    // Map<String, SqlFeature2> _identifierMap = new java.util.HashMap<String, SqlFeature2>();
    // for (SqlFeature2 value : SqlFeature2.values()) {
    // _identifierMap.put(value.getValue(), value);
    // }
    // return _identifierMap;
    // }

    private Object defaultValue;

    private SqlFeature2() {
        this.defaultValue = null;
    }

    private SqlFeature2(final Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    // public static SqlFeature2 fromValue(final String value) {
    // SqlFeature2 result = identifierMap.get(value);
    // if (result == null) {
    // throw new IllegalArgumentException("No PersonGender for value: " + value);
    // }
    // return result;
    // }
    //
    public Object getDefaultValue() {
        return defaultValue;
    }

    public String getName() {
        return name();
    }
}
