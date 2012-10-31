package org.sqlproc.engine.hibernate;

import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlProcessorLoader;
import org.sqlproc.engine.SqlSimpleFactory;
import org.sqlproc.engine.hibernate.type.HibernateTypeFactory;

/**
 * The implementation of the {@link SqlEngineFactory} optimized for the Hibernate stack.
 * 
 * <p>
 * It's suitable mainly for the Spring DI based configuration, like the next one for the new loader
 * {@link SqlProcessorLoader}:<br>
 * 
 * <pre>
 * &lt;beans ...&gt;
 *   ...
 *   &lt;bean id="sqlFactory" class="org.sqlproc.engine.hibernate.HibernateEngineFactory" init-method="init"&gt;
 *     &lt;property name="metaFilesNames">
 *       &lt;list>
 *         &lt;value>statements.qry&lt;/value>
 *       &lt;/list>
 *     &lt;/property>
 *   &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * and use the next code to obtain an instance of the SQL Query engine
 * 
 * <pre>
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * or the next code to obtain an instance of the SQL CRUD engine
 * 
 * <pre>
 * SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateEngineFactory extends SqlSimpleFactory {

    /**
     * Creates a new instance with default values for the Hibernate stack.
     */
    public HibernateEngineFactory() {
        super();
        setJdbc(false);
        setTypeFactory(HibernateTypeFactory.getInstance());
    }
}
