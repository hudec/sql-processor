package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * The list of ordering directives for the SQL Processor queries execution.
 * 
 * The class layout is based on the Composite design pattern. Instances of this class can be obtained only using one of
 * the factory methods.
 * 
 * <p>
 * For example there's a table PERSON with two columns - ID and NAME. The META SQL query can be the next one:
 * 
 * <pre>
 * ALL_PEOPLE(QRY)=
 *   select ID @id, NAME @name
 *   from PERSON
 *   {= where
 *    {& id=:id}
 *    {& UPPER(name)=:+name}
 *   }
 *   {#1 order by ID}
 *   {#2 order by NAME}
 * ;
 * </pre>
 * 
 * <p>
 * In the case of the SQL Processor invocation
 * 
 * <pre>
 * SqlEngine sqlEngine = sqlLoader.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlOrder.getAscOrder(1));
 * </pre>
 * 
 * the output list is sorted in ascending order based on the column ID.
 * 
 * <p>
 * In the case of the SQL Processor invocation
 * 
 * <pre>
 * SqlEngine sqlEngine = sqlLoader.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, new Object(), SqlOrder.getDescOrder(2));
 * </pre>
 * 
 * the output list is sorted in descending order based on the column NAME.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlOrder {

    /**
     * The enumeration for the ordering directives.
     */
    public static enum Order {
        /**
         * no ordering
         */
        NONE,
        /**
         * ascending ordering
         */
        ASC,
        /**
         * descending ordering
         */
        DESC,
        /**
         * ascending ordering, NULL values should be returned before non-NULL values
         */
        ASC_NULLS_FIRST,
        /**
         * ascending ordering, NULL values should be returned after non-NULL values
         */
        ASC_NULLS_LAST,
        /**
         * descending ordering, NULL values should be returned before non-NULL values
         */
        DESC_NULLS_FIRST,
        /**
         * descending ordering, NULL values should be returned after non-NULL values
         */
        DESC_NULLS_LAST
    }

    /**
     * The ordering id. This value should correspond to the order number in the META SQL query {#NNN order by ...}.
     */
    private String orderId;
    /**
     * The ordering direction (no ordering, ascending or descending).
     */
    private Order orderDirection;
    /**
     * The list of all ordering directives.
     */
    private List<SqlOrder> orders;

    /**
     * The factory method.
     * 
     * @return the empty ordering directive list
     */
    public static SqlOrder getOrder() {
        return new SqlOrder();
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one ascending ordering directive
     */
    public static SqlOrder getAscOrder(int orderId) {
        return new SqlOrder().addAscOrder(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one ascending ordering directive
     */
    public static SqlOrder getAscOrderNullsLast(int orderId) {
        return new SqlOrder().addAscOrderNullsLast(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one ascending ordering directive
     */
    public static SqlOrder getAscOrder(String orderId) {
        return new SqlOrder().addAscOrder(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one ascending ordering directive
     */
    public static SqlOrder getAscOrderNullsLast(String orderId) {
        return new SqlOrder().addAscOrderNullsLast(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one descending ordering directive
     */
    public static SqlOrder getDescOrder(int orderId) {
        return new SqlOrder().addDescOrder(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one descending ordering directive
     */
    public static SqlOrder getDescOrderNullsFirst(int orderId) {
        return new SqlOrder().addDescOrderNullsFirst(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one descending ordering directive
     */
    public static SqlOrder getDescOrder(String orderId) {
        return new SqlOrder().addDescOrder(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id
     * @return the ordering directive list with one descending ordering directive
     */
    public static SqlOrder getDescOrderNullsFirst(String orderId) {
        return new SqlOrder().addDescOrderNullsFirst(orderId);
    }

    /**
     * The factory method.
     * 
     * @param orderId
     *            the ordering id. Can be a negative one for a descending ordering directive.
     * @return the ordering directive list with one ascending or descending ordering directive
     */
    public static SqlOrder getOrder(int orderId) {
        if (orderId > 0)
            return new SqlOrder().addAscOrder(orderId);
        else if (orderId < 0)
            return new SqlOrder().addDescOrder(-orderId);
        else
            return null;
    }

    /**
     * Adds one more ascending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addAscOrder(int orderId) {
        orders.add(new SqlOrder("" + orderId, Order.ASC));
        return this;
    }

    /**
     * Adds one more ascending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addAscOrderNullsLast(int orderId) {
        orders.add(new SqlOrder("" + orderId, Order.ASC_NULLS_LAST));
        return this;
    }

    /**
     * Adds one more ascending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addAscOrder(String orderId) {
        orders.add(new SqlOrder(orderId, Order.ASC));
        return this;
    }

    /**
     * Adds one more ascending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addAscOrderNullsLast(String orderId) {
        orders.add(new SqlOrder(orderId, Order.ASC_NULLS_LAST));
        return this;
    }

    /**
     * Adds one more descending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addDescOrder(int orderId) {
        orders.add(new SqlOrder("" + orderId, Order.DESC));
        return this;
    }

    /**
     * Adds one more descending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addDescOrderNullsFirst(int orderId) {
        orders.add(new SqlOrder("" + orderId, Order.DESC_NULLS_FIRST));
        return this;
    }

    /**
     * Adds one more descending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addDescOrder(String orderId) {
        orders.add(new SqlOrder(orderId, Order.DESC));
        return this;
    }

    /**
     * Adds one more descending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id
     * @return the updated ordering directive list
     */
    public SqlOrder addDescOrderNullsFirst(String orderId) {
        orders.add(new SqlOrder(orderId, Order.DESC_NULLS_FIRST));
        return this;
    }

    /**
     * Adds one more ascending or descending ordering directive into the list of ordering directives.
     * 
     * @param orderId
     *            the ordering id. Can be a negative one for a descending ordering directive.
     * @return the updated ordering directive list
     */
    public SqlOrder addOrder(int orderId) {
        if (orderId > 0)
            orders.add(new SqlOrder("" + orderId, Order.ASC));
        else if (orderId < 0)
            orders.add(new SqlOrder("" + (-orderId), Order.DESC));
        return this;
    }

    /**
     * Creates a new empty ordering directive list. This constructor is a private one to prevent an instantiation
     * without the help of factory methods.
     */
    private SqlOrder() {
        orders = new ArrayList<SqlOrder>();
    }

    /**
     * Creates a new ordering directive list. This constructor is a private one to prevent an instantiation without the
     * help of factory methods.
     * 
     * @param orderId
     *            the ordering id
     * @param orderDirection
     *            the ordering direction
     */
    private SqlOrder(String orderId, Order orderDirection) {
        this.orderId = orderId;
        this.orderDirection = orderDirection;
    }

    /**
     * Returns the ordering id. This value should correspond to the order number in the META SQL query {#NNN order by
     * ...}.
     * 
     * @return the ordering id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Returns the ordering direction (no ordering, ascending or descending).
     * 
     * @return the ordering direction
     */
    public Order getOrderDirection() {
        return orderDirection;
    }

    /**
     * Returns the list of ordering directives.
     * 
     * @return the list of ordering directives
     */
    public List<SqlOrder> getOrders() {
        return orders;
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlOrder[");
        sb.append("id=").append(orderId);
        sb.append(", direction=").append(orderDirection);
        sb.append(", orders=").append((orders != null) ? orders.toString() : null);
        return sb.append("]").toString();
    }
}
