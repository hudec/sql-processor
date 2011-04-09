package org.sqlproc.sample.catalog.form;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemForm implements Serializable {
    private Long itemid;
    private String name;
    private String description;
    private BigDecimal priceFrom;
    private BigDecimal priceTo;

    public ItemForm() {
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(BigDecimal priceFrom) {
        this.priceFrom = priceFrom;
    }

    public BigDecimal getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(BigDecimal priceTo) {
        this.priceTo = priceTo;
    }

    int first;
    int count;
    int order;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "ItemForm [name=" + name + ", description=" + description + ", priceFrom=" + priceFrom + ", priceTo="
                + priceTo + ", first=" + first + ", count=" + count + ", order=" + order + "]";
    }
}
