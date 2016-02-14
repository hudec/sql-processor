package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class OrderIds {

    public final static String ID = "ID";
    public final static String NAME = "NAME";
    public final static String NAME_ADDRESS = "NAME_ADDRESS";
    public final static String NAME_TITLE = "NAME_TITLE";

    public final static SqlOrder ASC_ID = SqlQueryEngine.ASC_ORDER(ID);
    public final static SqlOrder DESC_NAME = SqlQueryEngine.DESC_ORDER(NAME);
    public final static SqlOrder ASC_NAME_ADDRESS = SqlQueryEngine.ASC_ORDER(NAME_ADDRESS);
    public final static SqlOrder ASC_NAME_TITLE = SqlQueryEngine.ASC_ORDER(NAME_TITLE);
}
