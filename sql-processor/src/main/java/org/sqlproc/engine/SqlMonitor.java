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
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlMonitor {

    /**
     * The SQLMonitor visitor method called from inside the main execution methods in {@link SqlQueryEngine}.
     * 
     * @param runner
     *            the anonymous instance of {@link SqlMonitor.Runner}, which encapsulates the query execution
     * @param resultClass
     *            the class used for the return values of the query execution output
     * @return the list of the resultClass instances
     */
    public <E> List<E> runList(Runner runner, Class<E> resultClass);

    /**
     * The SQLMonitor visitor method called from inside the main execution methods in {@link SqlCrudEngine} and
     * {@link SqlCrudEngine}.
     * 
     * @param runner
     *            the anonymous instance of {@link SqlMonitor.Runner}, which encapsulates the query execution
     * @param resultClass
     *            the class used for the return value of the query execution output
     * @return the instance of the resultClass
     */
    public <E> E run(Runner runner, Class<E> resultClass);

    /**
     * This interface is implemented in {@link SqlQueryEngine} and {@link SqlCrudEngine} main public methods. An
     * anonymous instance of this interface is used to encapsulate the SQL Processor application logic, and as a
     * parameter is propagated to the SQLMonitor instance. This gives the SQLMonitor the opportunity to surround the SQL
     * Processor execution with a duration tracking code.
     */
    public static interface Runner {
        /**
         * The main contract, which is invoked from inside SQLMonitor
         * 
         * @return the value depends on from which method this contract is invoked
         * @throws SqlProcessorException
         */
        Object run() throws SqlProcessorException;
    }
}
