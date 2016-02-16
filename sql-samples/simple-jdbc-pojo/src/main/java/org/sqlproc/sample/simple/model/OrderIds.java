package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class OrderIds {

    public final static String ID = "ID";
    public final static String NAME = "NAME";
    public final static String NAME_ADDRESS = "NAME_ADDRESS";
    public final static String NAME_TITLE = "NAME_TITLE";

    public final static SqlOrder ASC_ID = SqlOrder.getAscOrder(ID);
    public final static SqlOrder DESC_NAME = SqlOrder.getDescOrder(NAME);
    public final static SqlOrder ASC_NAME_ADDRESS = SqlOrder.getAscOrder(NAME_ADDRESS);
    public final static SqlOrder ASC_NAME_TITLE = SqlOrder.getAscOrder(NAME_TITLE);
}
