package org.sqlproc.sample.catalog.form;

import java.io.Serializable;
import java.math.BigDecimal;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class ItemForm implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Long itemid;
  
  public Long getItemid() {
    return this.itemid;
  }
  
  public void setItemid(final Long itemid) {
    this.itemid = itemid;
  }
  
  public ItemForm withItemid(final Long itemid) {
    this.itemid = itemid;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public ItemForm withName(final String name) {
    this.name = name;
    return this;
  }
  
  private String description;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(final String description) {
    this.description = description;
  }
  
  public ItemForm withDescription(final String description) {
    this.description = description;
    return this;
  }
  
  private BigDecimal priceFrom;
  
  public BigDecimal getPriceFrom() {
    return this.priceFrom;
  }
  
  public void setPriceFrom(final BigDecimal priceFrom) {
    this.priceFrom = priceFrom;
  }
  
  public ItemForm withPriceFrom(final BigDecimal priceFrom) {
    this.priceFrom = priceFrom;
    return this;
  }
  
  private BigDecimal priceTo;
  
  public BigDecimal getPriceTo() {
    return this.priceTo;
  }
  
  public void setPriceTo(final BigDecimal priceTo) {
    this.priceTo = priceTo;
  }
  
  public ItemForm withPriceTo(final BigDecimal priceTo) {
    this.priceTo = priceTo;
    return this;
  }
  
  private int first;
  
  public int getFirst() {
    return this.first;
  }
  
  public void setFirst(final int first) {
    this.first = first;
  }
  
  public ItemForm withFirst(final int first) {
    this.first = first;
    return this;
  }
  
  private int count;
  
  public int getCount() {
    return this.count;
  }
  
  public void setCount(final int count) {
    this.count = count;
  }
  
  public ItemForm withCount(final int count) {
    this.count = count;
    return this;
  }
  
  private int order;
  
  public int getOrder() {
    return this.order;
  }
  
  public void setOrder(final int order) {
    this.order = order;
  }
  
  public ItemForm withOrder(final int order) {
    this.order = order;
    return this;
  }
  
  @Override
  public String toString() {
    return "ItemForm [itemid=" + itemid + ", name=" + name + ", description=" + description + ", priceFrom=" + priceFrom + ", priceTo=" + priceTo + "]";
  }
  
  public String toStringFull() {
    return "ItemForm [itemid=" + itemid + ", name=" + name + ", description=" + description + ", priceFrom=" + priceFrom + ", priceTo=" + priceTo + ", first=" + first + ", count=" + count + ", order=" + order + "]";
  }
}
