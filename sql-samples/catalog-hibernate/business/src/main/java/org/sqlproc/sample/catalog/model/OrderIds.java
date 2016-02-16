package org.sqlproc.sample.catalog.model;

import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class OrderIds {

    public final static String NAME = "NAME";
    public final static String PRICE = "PRICE";

    public final static SqlOrder ASC_NAME = SqlOrder.getAscOrder(NAME);
    public final static SqlOrder ASC_PRICE = SqlOrder.getAscOrder(PRICE);
    public final static SqlOrder DESC_NAME = SqlOrder.getDescOrder(NAME);
    public final static SqlOrder DESC_PRICE = SqlOrder.getDescOrder(PRICE);

    public static SqlOrder getOrder(int order) {
        if (order == 1)
            return OrderIds.ASC_NAME;
        if (order == 2)
            return OrderIds.ASC_PRICE;
        if (order == -1)
            return OrderIds.DESC_NAME;
        if (order == -2)
            return OrderIds.DESC_PRICE;
        return SqlQueryEngine.NO_ORDER;
    }
}
