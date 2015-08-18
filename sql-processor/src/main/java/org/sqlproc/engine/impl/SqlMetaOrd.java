package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlOrder;

/**
 * A META SQL sub-element. It represents the ORDER command of the final ANSI SQL.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaOrd
 *     SqlMetaText
 *     SqlMetaIdent
 *     SqlMetaConst
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaOrd implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The list of sub-elements based on ANTLR grammar.
     */
    List<SqlMetaSimple> elements;
    /**
     * The ordering id. This value should correspond to the order number in META SQL {#NNN order by ...}.
     */
    String id = null;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param id
     *            the ordering id, which corresponds to the order number in META SQL {#NNN order by ...}
     */
    SqlMetaOrd(String id) {
        this.elements = new ArrayList<SqlMetaSimple>();
        this.id = id;
    }

    /**
     * Adds a new sub-element. It's used from inside ANTLR parser.
     * 
     * @param element
     *            new sub-element, based on ANTLR grammar
     */
    void addElement(SqlMetaSimple element) {
        elements.add(element);
    }

    /**
     * Returns ANSI SQL ORDER command for one ordering rule.
     * 
     * @param sql
     *            the cumulative fragment of the final ordering command
     * @param orderDirrection
     *            the ASC or DESC ordering direction
     * @return the cumulative fragment of the final ordering command
     */
    private StringBuilder process(StringBuilder sql, SqlOrder.Order orderDirrection) {
        String ss = sql.toString().trim();
        if (ss.toUpperCase().startsWith("ORDER"))
            ss = ss.substring(5).trim();
        if (ss.toUpperCase().startsWith("BY"))
            ss = ss.substring(2).trim();
        if (orderDirrection == SqlOrder.Order.ASC)
            return new StringBuilder(ss).append(" ASC");
        else if (orderDirrection == SqlOrder.Order.DESC)
            return new StringBuilder(ss).append(" DESC");
        else
            return new StringBuilder(ss);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult(ctx);
        int orderIndex = ctx.getOrderIndex(this.id);
        if (orderIndex != -1) {
            result.addTrue();
            result.setOrderIndex(orderIndex);
            StringBuilder s = new StringBuilder();
            for (SqlMetaSimple item : this.elements) {
                SqlProcessResult itemResult = item.process(ctx);
                if (itemResult.isAdd()) {
                    s.append(itemResult.getSql());
                    result.addInputValues(itemResult.getInputValues());
                    result.addMappedInputValues(itemResult.getMappedInputValues());
                } else
                    result.addFalse();
            }
            result.setSql(process(s, ctx.getOrder(orderIndex)));
        } else
            result.addFalse();
        return result;
    }
}
