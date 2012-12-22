package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlOrder;

public class DaoControl {

    int maxTimeout;
    int firstResult;
    int maxResults;
    SqlOrder order;

    public int getMaxTimeout() {
        return maxTimeout;
    }

    public DaoControl setMaxTimeout(int maxTimeout) {
        this.maxTimeout = maxTimeout;
        return this;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public DaoControl setFirstResult(int firstResult) {
        this.firstResult = firstResult;
        return this;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public DaoControl setMaxResults(int maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public SqlOrder getOrder() {
        return order;
    }

    public DaoControl setOrder(SqlOrder order) {
        this.order = order;
        return this;
    }

    public DaoControl setAscOrder(int order) {
        this.order = SqlOrder.getAscOrder(order);
        return this;
    }

    public DaoControl setDescOrder(int order) {
        this.order = SqlOrder.getDescOrder(order);
        return this;
    }
}
