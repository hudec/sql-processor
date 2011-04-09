package org.sqlproc.engine.impl;

import java.util.List;

import org.sqlproc.engine.SqlMonitor;

/**
 * The empty implementation of {@link org.sqlproc.engine.SqlMonitor} interface.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlEmptyMonitor implements SqlMonitor {

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> List<E> runList(Runner runner, Class<E> resultClass) {

        return (List<E>) runner.run();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> E run(Runner runner, Class<E> resultClass) {
        return (E) runner.run();
    }
}
