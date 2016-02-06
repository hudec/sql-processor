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
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.plugin.SqlProcessingIdPlugin;

public class SampleSqlProcessingIdPlugin implements SqlProcessingIdPlugin {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Map<String, String> processingIds = new ConcurrentHashMap<>();
    private final MethodHandles.Lookup lookup = MethodHandles.lookup();
    private final MethodType mt = MethodType.methodType(String.class, String[].class);

    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl) {

        String processingId = sqlControl != null ? sqlControl.getProcessingId() : null;
        String pIdSqlc = getProcessingId(sqlControl);

        logger.info(">>> name {}, id provided {}, input {}", name, processingId,
                (dynamicInputValues != null ? dynamicInputValues.getClass() : null));

        if (processingId != null) {

            try {
                MethodHandle mh = lookup.findVirtual(dynamicInputValues.getClass(), "getProcessingId", mt);
                String dynProcessingId = (String) (pIdSqlc != null ? mh.invoke(dynamicInputValues, pIdSqlc)
                        : mh.invoke(dynamicInputValues));
                if (dynProcessingId != null) {
                    logger.info("=== name {}, id {}", name, dynProcessingId);
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
                processingId = pIdSqlc != null ? ((Person) dynamicInputValues).getProcessingId(pIdSqlc)
                        : ((Person) dynamicInputValues).getProcessingId();
            } else if (dynamicInputValues instanceof Contact) {
                processingId = pIdSqlc != null ? ((Contact) dynamicInputValues).getProcessingId(pIdSqlc)
                        : ((Contact) dynamicInputValues).getProcessingId();
            }
        }

        logger.info("<<< name {}, id {}", name, processingId);
        return processingId;
    }

    String getProcessingId(SqlControl sqlControl) {
        if (sqlControl == null || (sqlControl.getFirstResult() == null && sqlControl.getMaxResults() == null
                && sqlControl.getOrder() == null))
            return null;
        StringBuilder result = new StringBuilder("SQLC:");
        boolean first = true;
        if (sqlControl.getFirstResult() != null) {
            result.append("FST").append("@").append(sqlControl.getFirstResult());
            first = false;
        }
        if (sqlControl.getMaxResults() != null) {
            if (!first)
                result.append(",");
            result.append("MAX").append("@").append(sqlControl.getMaxResults());
            first = false;
        }
        if (sqlControl.getOrder() != null) {
            if (!first)
                result.append(",");
            result.append("ORD");
            for (SqlOrder order : sqlControl.getOrder().getOrders())
                result.append("@").append(order.getOrderId()).append(":").append(order.getOrderDirection());
            first = false;
        }
        return result.toString();
    }
}
