package org.sqlproc.engine;

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
     * <code>SURROUND_QUERY_MIN_LEN</code> is the minimal length of the string input values for the SQL
     * <code>like</code> command to switch on the SQL Processor special behavior described above in the runtime.
     */
    public static final String SURROUND_QUERY_MIN_LEN = "SURROUND_QUERY_MIN_LEN";
    /**
     * <code>LIKE_STRING</code> is the key for the SQL command <code>like</code>. For example for the Informix database
     * it can be <code>matches</code>.
     */
    public static final String LIKE_STRING = "LIKE_STRING";
    /**
     * <code>REPLACE_LIKE_STRING</code> is the key for the special SQL Processor behavior related to the SQL command
     * <code>like</code>. The supplied value is going to be used as the final LIKE_STRING.
     */
    public static final String REPLACE_LIKE_STRING = "REPLACE_LIKE_STRING";
    /**
     * <code>REPLACE_LIKE_CHARS</code> is the key for the special SQL Processor behavior related to the SQL command
     * <code>like</code>. The feature pattern is <code>['c1':'r1', 'c2':'r2', ...]</code>, where <code>c1,c2,...</code>
     * is a set of characters to be replaced with the characters <code>r1,r2,...</code>. For example to use the wildcard
     * characters <code>*</code> and <code>?</code> instead of <code>%</code> <code>_</code>, use
     * <code>['*':'%', '?':'_']</code>.
     */
    public static final String REPLACE_LIKE_CHARS = "REPLACE_LIKE_CHARS";
    /**
     * <code>METHODS_ENUM_IN</code> lists the methods used in the translation from a Java type to a JDBC datatype for
     * enumerations based input values.
     */
    public static final String METHODS_ENUM_IN = "METHODS_ENUM_IN";
    /**
     * <code>METHODS_ENUM_OUT</code> lists the methods used in the translation from a JDBC datatype to a Java type for
     * enumerations based output values.
     */
    public static final String METHODS_ENUM_OUT = "METHODS_ENUM_OUT";
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
     * <code>SEQ</code> is the key for the SQL query pattern used for the sequences. This pattern can be combined with
     * the sequence name used in the META SQL query in the next way:
     * <ul>
     * <li>$n is the name of the sequence from the META SQL query</li>
     * </ul>
     */
    public static final String SEQ = "SEQ";
    /**
     * <code>SEQ_NAME</code> is the key for the sequence name.
     */
    public static final String SEQ_NAME = "SEQ_NAME";
    /**
     * <code>IDSEL</code> is the key for the SQL query pattern used to obtain the value of identities after the INSERT
     * command.
     */
    public static final String IDSEL = "IDSEL";
    /**
     * <code>IDSEL_Long</code> is the key for the SQL query pattern used to obtain the value of identities after the
     * INSERT command.
     */
    public static final String IDSEL_Long = "IDSEL_Long";
    /**
     * <code>IDSEL_Integer</code> is the key for the SQL query pattern used to obtain the value of identities after the
     * INSERT command.
     */
    public static final String IDSEL_Integer = "IDSEL_Integer";
    /**
     * <code>IDGEN</code> is the key for the SQL query pattern used to obtain the value of identities or sequences.
     */
    public static final String IDGEN = "IDGEN";
    /**
     * <code>VERSION_COLUMN</code> is the key for the version column name.
     */
    public static final String VERSION_COLUMN = "VERSION_COLUMN";
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
    /**
     * <code>OPERATOR_ATTRIBUTE</code> is the operator atribute name suffix.
     */
    public static final String OPERATOR_ATTRIBUTE = "OPERATOR_ATTRIBUTE";
    /**
     * <code>OPERATOR_ATTRIBUTE_IN_MAP</code> is the map name of the operators name suffix.
     */
    public static final String OPERATOR_ATTRIBUTE_IN_MAP = "OPERATOR_ATTRIBUTE_IN_MAP";
    /**
     * <code>LOG_SQL_COMMAND_FOR_EXCEPTION</code> is the indicator that in the case of an SQLException the related SQL
     * command should be logged.
     */
    public static final String LOG_SQL_COMMAND_FOR_EXCEPTION = "LOG_SQL_COMMAND_FOR_EXCEPTION";

    /**
     * <code>IDSEL_JDBC</code> is the special value related to the key <code>IDSEL</code> indicating that the generated
     * identity value is determined using JDBC capabilities to return generated keys for SQL statement. This feature
     * requires that both the database and the JDBC driver support it.
     */
    public static final String IDSEL_JDBC = "JDBC";
}
