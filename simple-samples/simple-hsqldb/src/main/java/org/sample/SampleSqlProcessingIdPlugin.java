package org.sample;

import org.sample.model.Contact;
import org.sample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.plugin.SqlProcessingIdPlugin;

public class SampleSqlProcessingIdPlugin implements SqlProcessingIdPlugin {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl) {
        Integer[] firstMax = { (sqlControl != null ? sqlControl.getFirstResult() : null),
                (sqlControl != null ? sqlControl.getMaxResults() : null) };
        String processingId = null;
        if (dynamicInputValues instanceof Contact)
            processingId = ((Contact) dynamicInputValues).getProcessingId(firstMax);
        else if (dynamicInputValues instanceof Person)
            processingId = ((Person) dynamicInputValues).getProcessingId(firstMax);
        else if (sqlControl != null)
            processingId = sqlControl.getProcessingId();
        if ("BASE:28629151,IDS:1045631,DEF:961,ASSOC:961,OPER:-1796951359,MORE:961".equals(processingId))
            logger.warn("AHA");
        logger.info("name {}, id {}, input {}, sqlcid {}", name, processingId,
                (dynamicInputValues != null ? dynamicInputValues.getClass() : null),
                (sqlControl != null ? sqlControl.getProcessingId() : null));
        return processingId;
    }

}
