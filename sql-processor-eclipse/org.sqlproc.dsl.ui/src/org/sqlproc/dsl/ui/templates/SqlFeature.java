package org.sqlproc.dsl.ui.templates;

/**
 * The optional features are used to alter the behavior of the SQL Processor. They can be activated in the process of
 * SQL Processor initialization.
 * 
 * <p>
 * The features can be incorporated into the meta statements file in the form of <code> name(OPT)=...;</code>.
 * 
 * <p>
 * For example the SQL Processor supports the special searching feature based on text fragments. Lets have a table
 * PERSON with two columns - ID and NAME. <br>
 * In the meta statements file statements.qry there's the next definition:
 * 
 * <pre>
 * LIKE_STRING(OPT)=like;
 * WILDCARD_CHARACTER(OPT)=%;
 * SURROUND_QUERY_LIKE_FULL(BOPT)=true;
 * SURROUND_QUERY_MIN_LEN(IOPT)=2;
 * 
 * LIKE_PEOPLE(QRY)=
 *   select p.ID @id, p.NAME @name
 *   from PERSON p
 *   {= where
 *    {& id=:id}
 *    {& UPPER(name) like :+name}
 *   }
 *   {#1 order by ID}
 *   {#2 order by NAME}
 * ;
 * </pre>
 * 
 * <p>
 * The special searching capability is activated with the key <code>SURROUND_QUERY_LIKE(BOPT)=true</code>. In this case
 * every query with the like keyword (defined with the key <code>LIKE_STRING</code>) is identified and any dynamic input
 * value, which belongs to this query condition, is handled in a special way. The value for this input value is
 * surrounded with wild-card character <code>%</code>. This character is defined with the key
 * <code>WILDCARD_CHARACTER</code>. In the runtime to activate this feature, the input value has to have the minimal
 * length = 2. This minimal length is defined with the key <code>SURROUND_QUERY_MIN_LEN</code>.
 * 
 * In the case of SQL Processor initialization
 * 
 * <pre>
 * JdbcEngineFactory sqlFactory = new JdbcEngineFactory();
 * sqlFactory.setMetaFilesNames(&quot;statements.qry&quot;); // the meta statements file
 * SqlEngine sqlEngine = sqlFactory.getSqlEngine(&quot;LIKE_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the JDBC stack
 * Connection connection = DriverManager.getConnection(&quot;jdbc:hsqldb:mem:sqlproc&quot;, &quot;sa&quot;, &quot;&quot;);
 * SqlSession session = new JdbcSimpleSession(connection);
 * </pre>
 * 
 * there's created an instance of SqlEngine with the name <code>LIKE_PEOPLE</code>.
 * 
 * <p>
 * Next there's an instance person of the class Person with the value <code>an</code> for the attribute name. The
 * invocation
 * 
 * <pre>
 * Person person = new Person();
 * person.setName(&quot;jan&quot;);
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
 * </pre>
 * 
 * produces the next SQL execution
 * 
 * <pre>
 * select p.ID id, p.NAME name from PERSON p where UPPER(name) like ? order by NAME DESC
 * </pre>
 * 
 * In the result list there are all table rows with name, which contains the text fragment <code>jan</code>.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlFeature {

    /**
     * The filter for Oracle devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    public static final String ORACLE = "ORACLE";
    /**
     * The filter for HSQLDB devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    public static final String HSQLDB = "HSQLDB";
    /**
     * The filter for MySQL devoted optional features. It can be used for the construction of {@link SqlProcessorLoader}
     * .
     */
    public static final String MYSQL = "MYSQL";
    /**
     * The filter for PostgreSQL devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader} .
     */
    public static final String POSTGRESQL = "POSTGRESQL";
    /**
     * The filter for Informix devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader} .
     */
    public static final String INFORMIX = "INFORMIX";
    /**
     * The filter for MS SQL Server devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    public static final String MSSQL = "MSSQL";
    /**
     * The filter for DB2 Server devoted optional features. It can be used for the construction of
     * {@link SqlProcessorLoader}.
     */
    public static final String DB2 = "DB2";
    /**
     * <code>WILDCARD_CHARACTER</code> is the key for the wildcard character for the SQL <code>like</code> command.
     */
    public static final String WILDCARD_CHARACTER = "WILDCARD_CHARACTER";
    /**
     * This is the default value related to the key <code>WILDCARD_CHARACTER</code> .
     */
    public static final String DEFAULT_WILDCARD_CHARACTER = "%";
    /**
     * <code>SURROUND_QUERY_LIKE</code> is the key for the special SQL Processor behavior. In the case the value of this
     * property is <code>true</code>, the SQL Processor sets the wildcard character as a prefix and postfix for all
     * string values related to the SQL command <code>like</code>. These string values should have to have the minimal
     * length greater or equal to <code>SURROUND_QUERY_MIN_LEN</code>. The default value related to this key is
     * <code>false</code>.
     */
    public static final String SURROUND_QUERY_LIKE_FULL = "SURROUND_QUERY_LIKE_FULL";
    /**
     * <code>SURROUND_QUERY_LIKE_PARTIAL</code> is the key for the special SQL Processor behavior. In the case the value
     * of this property is <code>true</code>, the SQL Processor sets the wildcard character as a postfix for all string
     * values related to the SQL command <code>like</code>. These string values should have to have the minimal length
     * greater or equal to <code>SURROUND_QUERY_MIN_LEN</code>. The default value related to this key is
     * <code>false</code>.
     */
    public static final String SURROUND_QUERY_LIKE_PARTIAL = "SURROUND_QUERY_LIKE_PARTIAL";
    /**
     * This is the default value related to the key <code>SURROUND_QUERY_LIKE_PARTIAL</code> .
     */
    public static final Boolean DEFAULT_SURROUND_QUERY_LIKE_PARTIAL = Boolean.TRUE;
    /**
     * <code>SURROUND_QUERY_MIN_LEN</code> is the minimal length of the string input values for the SQL
     * <code>like</code> command to switch on the SQL Processor special behavior described above in the runtime.
     */
    public static final String SURROUND_QUERY_MIN_LEN = "SURROUND_QUERY_MIN_LEN";
    /**
     * This is the default value related to the key <code>SURROUND_QUERY_MIN_LEN</code>.
     */
    public static final Integer DEFAULT_SURROUND_QUERY_MIN_LEN = 2;
    /**
     * <code>LIKE_STRING</code> is the key for the SQL command <code>like</code>. For example for the Informix database
     * it can be <code>matches</code>.
     */
    public static final String LIKE_STRING = "LIKE_STRING";
    /**
     * This is the default value related to the key <code>LIKE_STRING</code>.
     */
    public static final String DEFAULT_LIKE_STRING = "like";
    /**
     * <code>METHODS_ENUM_IN</code> lists the methods used in the translation from a Java type to a JDBC datatype for
     * enumerations based input values.
     */
    public static final String METHODS_ENUM_IN = "METHODS_ENUM_IN";
    /**
     * This is the default value related to the key <code>METHODS_ENUM_IN</code>. It is list of the next methods:
     * <ul>
     * <li>getCode</li>
     * <li>getValue</li>
     * <li>getName</li>
     * <li>name</li>
     * </ul>
     */
    public static final String[] DEFAULT_METHODS_ENUM_IN = new String[] { "getCode", "getValue", "getName", "name" };
    /**
     * <code>METHODS_ENUM_OUT</code> lists the methods used in the translation from a JDBC datatype to a Java type for
     * enumerations based output values.
     */
    public static final String METHODS_ENUM_OUT = "METHODS_ENUM_OUT";
    /**
     * This is the default value related to the key <code>METHODS_ENUM_OUT</code>. It is list of the next methods:
     * <ul>
     * <li>fromCode</li>
     * <li>fromValue</li>
     * <li>valueOf</li>
     * </ul>
     */
    public static final String[] DEFAULT_METHODS_ENUM_OUT = new String[] { "fromCode", "fromValue", "valueOf" };
    /**
     * <code>ID</code> is the key for the identity columns. In the case it's values is defined, all columns with this
     * name are implicitly treated as an identifier.
     */
    public static final String ID = "ID";
    /**
     * <code>IGNORE_INPROPER_IN</code> is the key for special handling of input/output values. In the case it's value is
     * defined as true, in the case of any problems with input values the SqlRuntimeException is not thrown, only the
     * related error is logged.
     */
    public static final String IGNORE_INPROPER_IN = "IGNORE_INPROPER_IN";
    /**
     * <code>IGNORE_INPROPER_OUT</code> is the key for special handling of input/output values. In the case it's value
     * is defined as true, in the case of any problems with output values the SqlRuntimeException is not thrown, only
     * the related error is logged.
     */
    public static final String IGNORE_INPROPER_OUT = "IGNORE_INPROPER_OUT";
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
    public static final String JDBC = "JDBC";
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
    public static final String LIMIT_FROM_TO = "LIMIT_FROM_TO";
    /**
     * <code>LIMIT_FROM_TO_ORDERED</code> is the key for the SQL query pattern used to limit the query results in the
     * case the query output is sorted. Right now it's used only for HSQLDB.
     */
    public static final String LIMIT_FROM_TO_ORDERED = "LIMIT_FROM_TO_ORDERED";
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
    public static final String LIMIT_TO = "LIMIT_TO";
    /**
     * <code>LIMIT_TO_ORDERED</code> is the key for the SQL query pattern used to limit the query results in the case
     * the query output is sorted. Right now it's used only for HSQLDB.
     */
    public static final String LIMIT_TO_ORDERED = "LIMIT_TO_ORDERED";
    /**
     * <code>HSQLDB_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
     * the case the filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String HSQLDB_DEFAULT_LIMIT_FROM_TO = "$S offset $F limit $M";
    /**
     * <code>HSQLDB_DEFAULT_LIMIT_FROM_TO_ORDERED</code> is the default value related to the key
     * <code>LIMIT_FROM_TO_ORDERED</code> in the case the filter value <code>HSQLDB</code> is used for the
     * {@link SqlProcessorLoader} instance creation.
     */
    public static final String HSQLDB_DEFAULT_LIMIT_FROM_TO_ORDERED = "$S offset $F limit $M using index";
    /**
     * <code>HSQLDB_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
     * the filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String HSQLDB_DEFAULT_LIMIT_TO = "$S limit $M";
    /**
     * <code>HSQLDB_DEFAULT_LIMIT_TO_ORDERED</code> is the default value related to the key
     * <code>LIMIT_TO_ORDERED</code> in the case the filter value <code>HSQLDB</code> is used for the
     * {@link SqlProcessorLoader} instance creation.
     */
    public static final String HSQLDB_DEFAULT_LIMIT_TO_ORDERED = "$S limit $M using index";
    /**
     * <code>ORACLE_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
     * the case the filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String ORACLE_DEFAULT_LIMIT_FROM_TO = "select * from ( select row_.*, rownum rownum_ from ($S) row_ where rownum <= $m) where rownum_ > $F";
    /**
     * <code>ORACLE_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
     * the filter value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String ORACLE_DEFAULT_LIMIT_TO = "select * from ($S) where rownum <= $m";
    /**
     * <code>MYSQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
     * the case the filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String MYSQL_DEFAULT_LIMIT_FROM_TO = "$S limit $F, $M";
    /**
     * <code>MYSQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case the
     * filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String MYSQL_DEFAULT_LIMIT_TO = "$S limit $M";
    /**
     * <code>POSTGRESQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code>
     * in the case the filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance
     * creation.
     */
    public static final String POSTGRESQL_DEFAULT_LIMIT_FROM_TO = "$S limit $M offset $F";
    /**
     * <code>POSTGRESQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the
     * case the filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String POSTGRESQL_DEFAULT_LIMIT_TO = "$S limit $M";
    /**
     * <code>INFORMIX_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
     * the case the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String INFORMIX_DEFAULT_LIMIT_FROM_TO = "select skip $F first $M $s";
    /**
     * <code>INFORMIX_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case
     * the filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String INFORMIX_DEFAULT_LIMIT_TO = "select first $M $s";
    /*
     * Unsupported now.
     * 
     * <code>MSSQL_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in
     * the case the filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    // version for MS SQL Server 2012:
    // public static final String MSSQL_DEFAULT_LIMIT_FROM_TO = "$S OFFSET ($F) ROWS FETCH NEXT ($M) ROWS ONLY";
    /**
     * <code>MSSQL_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case the
     * filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String MSSQL_DEFAULT_LIMIT_TO = "select top ($M) $s";
    /**
     * <code>DB2_DEFAULT_LIMIT_FROM_TO</code> is the default value related to the key <code>LIMIT_FROM_TO</code> in the
     * case the filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String DB2_DEFAULT_LIMIT_FROM_TO = "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m and rownum_ > $F";
    /**
     * <code>DB2_DEFAULT_LIMIT_TO</code> is the default value related to the key <code>LIMIT_TO</code> in the case the
     * filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String DB2_DEFAULT_LIMIT_TO = "select * from (select row_.*, rownumber() over() rownum_ from ($S) row_) where rownum_ <= $m";
    /**
     * <code>SEQ</code> is the key for the SQL query pattern used for the sequences. This pattern can be combined with
     * the sequence name used in the META SQL query in the next way:
     * <ul>
     * <li>$n is the name of the sequence from the META SQL query</li>
     * </ul>
     */
    public static final String SEQ = "SEQ";
    /**
     * <code>HSQLDB_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
     * value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String HSQLDB_DEFAULT_SEQ = "call next value for $n";
    /**
     * <code>ORACLE_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
     * value <code>ORACLE</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String ORACLE_DEFAULT_SEQ = "select $n.nextval from dual";
    /**
     * <code>MYSQL_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
     * value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String MYSQL_DEFAULT_SEQ = "select auto_increment from information_schema.tables where table_name = '$t'";
    /**
     * <code>POSTGRESQL_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the
     * filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String POSTGRESQL_DEFAULT_SEQ = "select nextval('$n')";
    /**
     * <code>INFORMIX_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
     * value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String INFORMIX_DEFAULT_SEQ = "SELECT FIRST 1 $n.NEXTVAL FROM systables";
    /**
     * <code>DB2_DEFAULT_SEQ</code> is the default value related to the key <code>SEQ</code> in the case the filter
     * value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String DB2_DEFAULT_SEQ = "values nextval for $n";

    /**
     * <code>DEFAULT_SEQ_NAME</code> is the default sequence name.
     */
    public static final String DEFAULT_SEQ_NAME = "SQLPROC_SEQUENCE";
    /**
     * <code>IDSEL</code> is the key for the SQL query pattern used to obtain the value of identities after the INSERT
     * command.
     */
    public static final String IDSEL = "IDSEL";
    /**
     * <code>IDSEL_JDBC</code> is the special value related to the key <code>IDSEL</code> indicating that the generated
     * identity value is determined using JDBC capabilities to return generated keys for SQL statement. This feature
     * requires that both the database and the JDBC driver support it.
     */
    public static final String IDSEL_JDBC = "JDBC";
    /**
     * <code>HSQLDB_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
     * filter value <code>HSQLDB</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String HSQLDB_DEFAULT_IDSEL = "call identity()";
    /**
     * <code>MYSQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
     * filter value <code>MYSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String MYSQL_DEFAULT_IDSEL = "select last_insert_id()";
    /**
     * <code>POSTGRESQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
     * filter value <code>POSTGRESQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String POSTGRESQL_DEFAULT_IDSEL = "select currval(pg_get_serial_sequence('$t','$c'))";
    /**
     * <code>INFORMIX_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
     * filter value <code>INFORMIX</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String INFORMIX_DEFAULT_IDSEL = "SELECT FIRST 1 dbinfo('bigserial') FROM systables";
    /**
     * <code>MSSQL_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
     * filter value <code>MSSQL</code> is used for the {@link SqlProcessorLoader} instance creation.
     * <p/>
     * The default value is {@link #IDSEL_JDBC}.
     */
    public static final String MSSQL_DEFAULT_IDSEL = IDSEL_JDBC;
    /**
     * /** <code>DB2_DEFAULT_IDSEL</code> is the default value related to the key <code>IDSEL</code> in the case the
     * filter value <code>DB2</code> is used for the {@link SqlProcessorLoader} instance creation.
     */
    public static final String DB2_DEFAULT_IDSEL = "SELECT identity_val_local() FROM SYSIBM.DUAL";
    /**
     * <code>DEFAULT_VERSION_COLUMN</code> is the default name of the column devoted to the optimistic locking.
     */
    public static final String DEFAULT_VERSION_COLUMN = "version";
    /**
     * <code>EMPTY_FOR_NULL</code> is indicator that the NULL values are always empty. It has meaning for the UPDATE
     * statements, where the standard handling is to treat any values as not empty.
     */
    public static final String EMPTY_FOR_NULL = "EMPTY_FOR_NULL";
    /**
     * <code>EMPTY_USE_METHOD_IS_NULL</code> is indicator that the non-emptiness depends the special isNull method. It
     * has meaning for the UPDATE statements, where the standard handling is to treat any values as not empty.
     */
    public static final String EMPTY_USE_METHOD_IS_NULL = "EMPTY_USE_METHOD_IS_NULL";
}
