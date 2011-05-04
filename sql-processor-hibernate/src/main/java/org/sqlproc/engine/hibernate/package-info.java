/**
 * The adapters and proxies for the Hibernate stack.
 * 
 * The simple usage can be the next one:
 * 
 * <pre>
 * // by default it loads &quot;queries.properties&quot; file
 * SqlEngineFactory sqlFactory = new HibernateEngineFactory();
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the Hibernate stack
 * Configuration configuration = new Configuration().configure(&quot;hibernate.cfg.xml&quot;);
 * SessionFactory sessionFactory = configuration.buildSessionFactory();
 * SqlSession session = HibernateSession.generateProxy(sessionFactory.openSession());
 * 
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
package org.sqlproc.engine.hibernate;

