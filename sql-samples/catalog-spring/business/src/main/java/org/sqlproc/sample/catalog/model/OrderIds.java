package org.sqlproc.sample.catalog.model;

import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class OrderIds {

    public final static String NAME = "NAME";
    public final static String PRICE = "PRICE";

    public final static SqlOrder ASC_NAME = SqlQueryEngine.ASC_ORDER(NAME);
    public final static SqlOrder ASC_PRICE = SqlQueryEngine.ASC_ORDER(PRICE);
}
