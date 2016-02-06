package org.sample;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.sample.model.Contact;
import org.sample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.plugin.SqlProcessingIdPlugin;

public class SampleSqlProcessingIdPlugin implements SqlProcessingIdPlugin {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Map<String, String> processingIds = new ConcurrentHashMap<>();
    private final MethodHandles.Lookup lookup = MethodHandles.lookup();
    private final MethodType mt = MethodType.methodType(String.class, Object[].class);

    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl) {

        String processingId = sqlControl != null ? sqlControl.getProcessingId() : null;

        logger.info(">>> name {}, id provided {}, input {}", name, processingId,
                (dynamicInputValues != null ? dynamicInputValues.getClass() : null));

        if (processingId != null) {

            try {
                MethodHandle mh = lookup.findVirtual(dynamicInputValues.getClass(), "getProcessingId", mt);
                String dynProcessingId = null;
                dynProcessingId = (String) mh.invoke(dynamicInputValues, getProcessingId(sqlControl));
                if (dynProcessingId != null) {
                    String cachedProcessingId = processingIds.get(processingId);
                    if (cachedProcessingId == null)
                        cachedProcessingId = processingIds.put(processingId, dynProcessingId);
                    if (cachedProcessingId != null) {
                        if (!cachedProcessingId.equals(dynProcessingId))
                            throw new RuntimeException(
                                    "nutno prozkoumat " + cachedProcessingId + " <> " + dynProcessingId);
                    }
                }
            } catch (NoSuchMethodException | IllegalAccessException e) {
                logger.error("getProcessingId", e);
            } catch (Throwable e) {
                logger.error("getProcessingId", e);
            }
        } else {
            if (name.toUpperCase().startsWith("INSERT")) {
                processingId = name;
            } else if (dynamicInputValues instanceof Person) {
                processingId = ((Person) dynamicInputValues).getProcessingId(getProcessingId(sqlControl));
            } else if (dynamicInputValues instanceof Contact) {
                processingId = ((Contact) dynamicInputValues).getProcessingId(getProcessingId(sqlControl));
            }
        }

        logger.info("<<< name {}, id {}", name, processingId);
        return processingId;
    }

    String getProcessingId(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        StringBuilder result = new StringBuilder("SQLC:");
        if (sqlControl.getFirstResult() != null)
            result.append("FST").append(sqlControl.getFirstResult()).append("@");
        if (sqlControl.getMaxResults() != null)
            result.append("MAX").append(sqlControl.getMaxResults()).append("@");
        if (sqlControl.getOrder() != null)
            result.append(sqlControl.getOrder().toString());
        return result.toString();
    }
}
