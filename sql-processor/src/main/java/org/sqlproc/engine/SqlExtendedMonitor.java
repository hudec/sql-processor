package org.sqlproc.engine;

import java.util.List;

/**
 * The vehicle interface definition, which can be used to monitor the duration of all SQL queries execution.
 * 
 * <p>
 * The implementation can be based for example on the Javasimon library. The standard implementation is an empty one,
 * which just delegates the execution to the runner, for example
 * 
 * <pre>
 * public &lt;E&gt; List&lt;E&gt; runList(Runner runner, Class&lt;E&gt; resultClass) {
 *     return (List&lt;E&gt;) runner.run();
 * }
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlExtendedMonitor extends SqlMonitor {

    /**
     * The SQLMonitor visitor method called from inside the main execution methods in {@link SqlQueryEngine} devoted
     * only to SQL statement execution.
     * 
     * @param runner
     *            the anonymous instance of {@link SqlExtendedMonitor.Runner}, which encapsulates the query execution
     * @param resultClass
     *            the class used for the return values of the query execution output
     * @return the list of the resultClass instances
     */
    public <E> List<E> runListSql(Runner runner, Class<E> resultClass);

    /**
     * The SQLMonitor visitor method called from inside the main execution methods in {@link SqlCrudEngine} and
     * {@link SqlCrudEngine} devoted only to SQL statement execution..
     * 
     * @param runner
     *            the anonymous instance of {@link SqlExtendedMonitor.Runner}, which encapsulates the query execution
     * @param resultClass
     *            the class used for the return value of the query execution output
     * @return the instance of the resultClass
     */
    public <E> E runSql(Runner runner, Class<E> resultClass);
}
