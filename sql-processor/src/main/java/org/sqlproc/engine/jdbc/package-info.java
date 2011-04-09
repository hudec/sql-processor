/**
 * The adapters and proxies for the JDBC stack.
 * 
 * The simple usage can be the next one:
 * 
 * <pre>
 * // by default it loads &quot;queries.properties&quot; file
 * SqlEngineFactory sqlFactory = new JdbcEngineFactory();
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the JDBC stack
 * Connection connection = DriverManager.getConnection(&quot;jdbc:hsqldb:mem:sqlproc&quot;, &quot;sa&quot;, &quot;&quot;);
 * SqlSession session = new JdbcSimpleSession(connection);
 * 
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
 * </pre>
 * 
 * <p>
 * For more info please see the Reference Guide or the <a href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
package org.sqlproc.engine.jdbc;