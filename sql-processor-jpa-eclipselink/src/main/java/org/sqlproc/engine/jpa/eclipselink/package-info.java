/**
 * The adapters and proxies for the JPA 2 over EclipseLink stack obtaining the database access from
 * the {@link javax.persistence.EntityManager}.
 * 
 * The simple usage can be the next one:
 * 
 * <pre>
 * JpaEngineFactory sqlFactory = new JpaEngineFactory();
 * sqlFactory.setMetaFilesNames(&quot;statements.qry&quot;); // the meta statements file
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the EclipseLink stack in Java EE managed environment, just use the injected EntityManager
 * SqlSession session = new JpaSimpleSession(entityManager);
 * 
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
 *
 * // in the case of non-managed environment, you can construct the EntityManager as follows:  
 * EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
 * EntityManager entityManager = entityManagerFactory.createEntityManager();
 * JpaSimpleSession session = new JpaSimpleSession(entityManager);
 * 
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
 *
 * entityManager.close();
 * entityManagerFactory.close();
 * 
 * </pre>
 * It is strongly recommended that the EntityManager instance used to create the SqlSession instance should be used
 * exclusively by the SQL Processor, i.e. it should NOT be used for querying/persisting entities,
 * construction of JPQL or native SQL queries, etc.
 * <p/>
 * Also note, that when the EntityManager is bound to a transaction, so are the SQL Processor operations using
 * the {@link org.sqlproc.engine.SqlSession} constructed from this EntityManager. 
 * <p/>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:winkler.marek@gmail.com">Marek Winkler</a>
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondrej Kotek</a>
 */
package org.sqlproc.engine.jpa.eclipselink;

