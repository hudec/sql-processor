/**
 * The adapters and proxies for the Hibernate stack.
 * 
 * The simple usage can be the next one:
 * 
 * <pre>
 * HibernateEngineFactory sqlFactory = new HibernateEngineFactory();
 * sqlFactory.setMetaFilesNames(&quot;statements.qry&quot;); // the meta statements file
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the Hibernate stack
 * Configuration configuration = new Configuration().configure(&quot;hibernate.cfg.xml&quot;);
 * SqlSessionFactory sessionFactory = new HibernateSessionFactory(configuration.buildSessionFactory());
 * SqlSession session = sessionFactory.getSqlSession();
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

