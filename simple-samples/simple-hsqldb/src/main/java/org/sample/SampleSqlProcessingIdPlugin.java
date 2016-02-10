package org.sample;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.plugin.SqlProcessingIdPlugin;

public class SampleSqlProcessingIdPlugin implements SqlProcessingIdPlugin {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Set<String> skipProcessingIds = new HashSet<>();
    private final ConcurrentHashMap<String, String> staticProcessingIds = new ConcurrentHashMap<>();
    private final Set<String> staticProcessingIdsNoCache = new HashSet<>();
    private final ConcurrentHashMap<String, String> dynamicProcessingIds = new ConcurrentHashMap<>();
    private final Set<String> dynamicProcessingIdsNoCache = new HashSet<>();
    private final MethodHandles.Lookup lookup = MethodHandles.lookup();
    private final MethodType mt = MethodType.methodType(String.class, String[].class);
    // pokud budou problemy, dat true
    private boolean skip = false;
    // docasna pomucka
    private boolean sysout = true;

    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl,
            Boolean useDynamicProcessingCache) {

        String processingId = sqlControl != null ? sqlControl.getProcessingId() : null;
        String pIdSqlc = getProcessingId(sqlControl);

        if (sysout)
            System.out.println(">>> " + name + ", id " + processingId + ", input "
                    + (dynamicInputValues != null ? dynamicInputValues.getClass() : null));
        else
            logger.info(">>> {}, id {}, input {}", name, processingId,
                    (dynamicInputValues != null ? dynamicInputValues.getClass() : null));
        // zatim jenom kontrola, jestli je cachovani korektne pouzito

        if (skip)
            return null;

        boolean isStatic = processingId != null ? true : false;
        if (processingId == null)
            processingId = name;
        boolean doit = true;

        if (!isStatic && (useDynamicProcessingCache == null || !useDynamicProcessingCache)) {
            doit = false;
        } else if (skipProcessingIds.contains(processingId)) {
            doit = false;
        } else if (sqlControl != null && sqlControl.getDynamicUpdateValues() != null) {
            if (sysout)
                System.out.println("UUU " + name + ", dynamicUpdateValues " + sqlControl.getDynamicUpdateValues());
            else
                logger.warn("UUU {}, dynamicUpdateValues {}", name, sqlControl.getDynamicUpdateValues());
            skipProcessingIds.add(processingId);
            doit = false;
        } else if (sqlControl != null && sqlControl.getStaticInputValues() != null) {
            MethodHandle mh;
            try {
                mh = lookup.findVirtual(sqlControl.getStaticInputValues().getClass(), "getProcessingId", mt);
                pIdSqlc = pIdSqlc + "," + mh.invoke(sqlControl.getStaticInputValues());
            } catch (NoSuchMethodException | IllegalAccessException e) {
                doit = false;
            } catch (Throwable e) {
                logger.error(name, e);
                doit = false;
            }
            if (!doit) {
                if (sysout)
                    System.out.println("QQQ " + name + ", StaticInputValues " + sqlControl.getStaticInputValues());
                else
                    logger.warn("QQQ {}, StaticInputValues {}", name, sqlControl.getStaticInputValues());
                skipProcessingIds.add(processingId);
            }
        }

        if (doit) {
            processingId = analyze(name, dynamicInputValues, processingId, pIdSqlc, isStatic);
        } else {
            processingId = null;
        }

        if (sysout)
            System.out.println("<<< " + name + ", id " + processingId);
        else
            logger.info("<<< {}, id {}", name, processingId);
        return processingId;
    }

    String analyze(String name, Object dynamicInputValues, String processingId, String pIdSqlc, boolean isStatic) {
        ConcurrentHashMap<String, String> processingIds = isStatic ? staticProcessingIds : dynamicProcessingIds;
        Set<String> processingIdsNoCache = isStatic ? staticProcessingIdsNoCache : dynamicProcessingIdsNoCache;

        try {
            if (processingIdsNoCache.contains(name) && isStatic)
                return null;

            String dynProcessingId;
            if (dynamicInputValues == null) {
                dynProcessingId = pIdSqlc != null ? processingId + "@" + pIdSqlc : processingId;
            } else {
                MethodHandle mh = lookup.findVirtual(dynamicInputValues.getClass(), "getProcessingId", mt);
                dynProcessingId = (String) (pIdSqlc != null ? mh.invoke(dynamicInputValues, pIdSqlc)
                        : mh.invoke(dynamicInputValues));
            }
            if (sysout)
                System.out.println("=== " + name + ", id " + dynProcessingId);
            else
                logger.info("=== {}, id {}", name, dynProcessingId);
            if (dynProcessingId == null)
                return null;
            if (processingIdsNoCache.contains(name) && !isStatic)
                return dynProcessingId;
            boolean badCachedValue = false;
            String cachedProcessingId = processingIds.get(processingId);
            if (cachedProcessingId != null) {
                if (!cachedProcessingId.equals(dynProcessingId))
                    badCachedValue = true;
            } else {
                cachedProcessingId = processingIds.putIfAbsent(processingId, dynProcessingId);
                if (cachedProcessingId != null) {
                    if (!cachedProcessingId.equals(dynProcessingId))
                        badCachedValue = true;
                }
            }
            if (badCachedValue) {
                if (sysout)
                    System.out.println((isStatic ? "SSS" : "DDD") + " " + name + ", nutno prozkoumat "
                            + cachedProcessingId + " <> " + dynProcessingId);
                else
                    logger.error("{} {}, nutno prozkoumat {}  <> {}", (isStatic ? "SSS" : "DDD"), name,
                            cachedProcessingId, dynProcessingId);
                processingIdsNoCache.add(name);
                if (isStatic)
                    return null;
                else
                    return dynProcessingId;
            }
        } catch (NoSuchMethodException |

        IllegalAccessException e)

        {
            if (sysout)
                System.out.println("??? " + name + ", chybi getProcessingId");
            else
                logger.warn("??? {}, chybi getProcessingId", name);
            skipProcessingIds.add(processingId);
            return null;
        } catch (

        Throwable e)

        {
            logger.error(name, e);
            return null;
        }
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
