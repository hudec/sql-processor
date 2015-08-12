package org.sqlproc.engine.config.store;

import org.sqlproc.engine.config.SqlEngineConfiguration;

/**
 * This class is used only for the SQL Processor dynamic configuration serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlEngineConfigurationStore {

    public boolean writeConfig(SqlEngineConfiguration config);

    public boolean readConfig(SqlEngineConfiguration config);
}
