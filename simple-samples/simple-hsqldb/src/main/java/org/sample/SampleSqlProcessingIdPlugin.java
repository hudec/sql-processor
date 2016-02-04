package org.sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.beanutils.MethodUtils;
import org.sample.model.Contact;
import org.sample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.plugin.SqlProcessingIdPlugin;

public class SampleSqlProcessingIdPlugin implements SqlProcessingIdPlugin {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Map<String, String> processingIds = new ConcurrentHashMap<>();

    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl) {

        String processingId = sqlControl != null ? sqlControl.getProcessingId() : null;

        if (processingId != null) {
            logger.info("name {}, id provided {}, input {}", name, processingId,
                    (dynamicInputValues != null ? dynamicInputValues.getClass() : null));
            if (name.toUpperCase().startsWith("INSERT"))
                return processingId;

            // docasna kontrola, jestli skutecne je processingId korektne pouzit
            Method gpiMethod = MethodUtils.getAccessibleMethod(dynamicInputValues.getClass(), "getProcessingId",
                    new Class[] { Object[].class });

            if (gpiMethod != null) {
                Object[] firstMax = new Object[] {
                        new Integer[] { (sqlControl != null ? sqlControl.getFirstResult() : null),
                                (sqlControl != null ? sqlControl.getMaxResults() : null) } };
                try {
                    String dynProcessingId = (String) gpiMethod.invoke(dynamicInputValues, firstMax);
                    String cachedProcessingId = processingIds.get(processingId);
                    if (cachedProcessingId == null)
                        cachedProcessingId = processingIds.put(processingId, dynProcessingId);
                    if (cachedProcessingId != null) {
                        if (!cachedProcessingId.equals(dynProcessingId))
                            throw new RuntimeException(
                                    "nutno prozkoumat " + cachedProcessingId + "<>" + dynProcessingId);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    logger.error("getProcessingId", e);
                }
            } else {
                logger.warn("Neni getProcessingId pro " + dynamicInputValues);
            }

            return processingId;
        }

        Integer[] firstMax = { (sqlControl != null ? sqlControl.getFirstResult() : null),
                (sqlControl != null ? sqlControl.getMaxResults() : null) };
        if (dynamicInputValues instanceof Contact)
            processingId = ((Contact) dynamicInputValues).getProcessingId(firstMax);
        else if (dynamicInputValues instanceof Person)
            processingId = ((Person) dynamicInputValues).getProcessingId(firstMax);
        logger.info("name {}, id {}, input {}, sqlcid {}", name, processingId,
                (dynamicInputValues != null ? dynamicInputValues.getClass() : null),
                (sqlControl != null ? sqlControl.getProcessingId() : null));
        return processingId;
    }
}
