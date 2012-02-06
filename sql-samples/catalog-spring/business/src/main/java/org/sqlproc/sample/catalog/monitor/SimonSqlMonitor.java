package org.sqlproc.sample.catalog.monitor;

import java.util.List;

import org.javasimon.Counter;
import org.javasimon.SimonException;
import org.javasimon.Split;
import org.javasimon.Stopwatch;
import org.javasimon.utils.SimonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlMonitor;

public class SimonSqlMonitor implements SqlMonitor {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private String sqlName;
    private MonitoringManager manager;
    private String monitorName;

    @SuppressWarnings("unchecked")
    @Override
    public <E> List<E> runList(Runner runner, Class<E> resultClass) {

        Split split = getSplit();

        try {
            return (List<E>) runner.run();
        } catch (RuntimeException ex) {
            String name = split.getStopwatch().getName() + "." + sqlName + ".ERROR";
            incCounter(name);
            throw ex;
        } finally {
            if (split != null) {
                split.stop();

                if (logger.isDebugEnabled()) {
                    logger.debug("SQL " + sqlName + ", running for " + SimonUtils.presentNanoTime(split.runningFor()));
                }

                String name = split.getStopwatch().getName() + "." + sqlName;
                incStopwatch(name, split.runningFor());
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <E> E run(Runner runner, Class<E> resultClass) {

        Split split = getSplit();

        try {
            return (E) runner.run();
        } catch (RuntimeException ex) {
            String name = split.getStopwatch().getName() + "." + sqlName + ".ERROR";
            incCounter(name);
            throw ex;
        } finally {
            if (split != null) {
                split.stop();

                if (logger.isDebugEnabled()) {
                    logger.debug("SQL " + sqlName + ", running for " + SimonUtils.presentNanoTime(split.runningFor()));
                }

                String name = split.getStopwatch().getName() + "." + sqlName;
                incStopwatch(name, split.runningFor());
            }
        }
    }

    public SimonSqlMonitor(String sqlName, MonitoringManager manager, String monitorName) {
        super();
        this.sqlName = sqlName;
        this.manager = manager;
        this.monitorName = monitorName;
    }

    private Split getSplit() {
        if (monitorName != null && manager != null) {
            try {
                return manager.getManager().getStopwatch(monitorName).start();
            } catch (SimonException se) {
                logger.error("It's not possible to create simon '" + monitorName + "'", se);
            }
        }
        return null;
    }

    private Stopwatch incStopwatch(String name, long runningFor) {
        try {
            Stopwatch stopwatch = manager.getManager().getStopwatch(name);
            return stopwatch.addTime(runningFor);
        } catch (SimonException se) {
            logger.error("It's not possible to create simon '" + name + "'", se);
            return null;
        }
    }

    private Counter incCounter(String name) {
        return incCounter(name, 1);
    }

    private Counter incCounter(String name, long inc) {
        try {
            Counter counter = manager.getManager().getCounter(name);
            return counter.increase(inc);
        } catch (SimonException se) {
            logger.error("It's not possible to create simon '" + name + "'", se);
            return null;
        }
    }
}
