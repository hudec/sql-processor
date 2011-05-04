/**
 * The adapters and proxies for the Spring stack.
 * 
 * The simple usage can be the next one:
 * 
 * <pre>
 * // by default it loads &quot;queries.properties&quot; file
 * SqlEngineFactory sqlFactory = new JdbcEngineFactory();
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the Spring stack
 * ApplicationContext context = new ClassPathXmlApplicationContext(&quot;applicationContext.xml&quot;);
 * JdbcTemplate jdbcTemplate = context.getBean(&quot;jdbcTemplate&quot;, JdbcTemplate.class);
 * SqlSession session = new SpringSimpleSession(jdbcTemplate);
 * 
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
package org.sqlproc.engine.spring;

