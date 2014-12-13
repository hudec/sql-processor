package org.sqlproc.engine.impl;

import java.util.List;

import org.sqlproc.engine.SqlExtendedMonitor;

/**
 * The empty implementation of {@link org.sqlproc.engine.SqlMonitor} interface.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlEmptyMonitor implements SqlExtendedMonitor {

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <E> List<E> runList(Runner runner, Class<E> resultClass) {

        return (List<E>) runner.run();
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <E> E run(Runner runner, Class<E> resultClass) {
        return (E) runner.run();
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <E> List<E> runListSql(Runner runner, Class<E> resultClass) {

        return (List<E>) runner.run();
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <E> E runSql(Runner runner, Class<E> resultClass) {
        return (E) runner.run();
    }
}
