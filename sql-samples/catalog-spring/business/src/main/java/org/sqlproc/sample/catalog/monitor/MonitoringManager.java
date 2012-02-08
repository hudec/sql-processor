package org.sqlproc.sample.catalog.monitor;

import org.javasimon.Manager;
import org.javasimon.SwitchingManager;
import org.javasimon.jmx.JmxRegisterCallback;

public class MonitoringManager {

    Manager manager = new SwitchingManager();

    JmxRegisterCallback jmxRegisterCallback;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public JmxRegisterCallback getJmxRegisterCallback() {
        return jmxRegisterCallback;
    }

    public void setJmxRegisterCallback(JmxRegisterCallback jmxRegisterCallback) {
        this.jmxRegisterCallback = jmxRegisterCallback;
        if (jmxRegisterCallback != null) {
            manager.callback().addCallback(jmxRegisterCallback);
        }
    }
}
