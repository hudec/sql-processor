package org.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.plugin.SqlProcessingIdPlugin;

public class SampleSqlProcessingIdPlugin implements SqlProcessingIdPlugin {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl) {
        String processingId = null;
        if (sqlControl != null)
            processingId = sqlControl.getProcessingId();
        logger.info("name {}, id {}, input {}, sqlcid {}", name, processingId,
                (dynamicInputValues != null ? dynamicInputValues.getClass() : null),
                (sqlControl != null ? sqlControl.getProcessingId() : null));
        return processingId;
    }

}
