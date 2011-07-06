package org.sqlproc.engine.spring;

import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlEngineLoader;
import org.sqlproc.engine.SqlProcessorLoader;
import org.sqlproc.engine.SqlSimpleFactory;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;

/**
 * The implementation of the {@link SqlEngineFactory} optimized for the Spring stack.
 * 
 * <p>
 * It's suitable mainly for the Spring DI based configuration, like the next one for the new loader
 * {@link SqlProcessorLoader}:<br>
 * 
 * <pre>
 * &lt;beans ...&gt;
 *   ...
 *   &lt;bean id="sqlFactory" class="org.sqlproc.engine.spring.SpringEngineFactory" init-method="init"&gt;
 *     <property name="metaFilesNames">
 *       <list>
 *         <value>statements.qry</value>
 *       </list>
 *     </property>
 *   &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * or like the next one for the old loader {@link SqlEngineLoader}:<br>
 * 
 * <pre>
 * &lt;beans ...&gt;
 *   ...
 *   &lt;bean id="sqlQueries" class="org.springframework.beans.factory.config.PropertiesFactoryBean"&gt;
 *     &lt;property name="location"&gt;
 *       &lt;value>classpath:queries.properties&lt;/value&gt;
 *     &lt;/property&gt;
 *   &lt;/bean&gt;
 *   
 *   &lt;bean id="sqlFactory" class="org.sqlproc.engine.spring.SpringEngineFactory" init-method="init"&gt;
 *     &lt;property name="metaProps" ref="sqlQueries" /&gt;
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
public class SpringEngineFactory extends SqlSimpleFactory {

    /**
     * Creates a new instance with default values for the Spring stack.
     */
    public SpringEngineFactory() {
        super();
        setJdbc(true);
        setTypeFactory(JdbcTypeFactory.getInstance());
    }
}
