package org.sqlproc.engine;

/**
 * The factory definition, which can be used to construct the {@link SqlSession} instances.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlSessionFactory {

    /**
     * The main contract of this factory.
     * 
     * @return the instance of the SqlSession
     */
    SqlSession getSqlSession();
}
