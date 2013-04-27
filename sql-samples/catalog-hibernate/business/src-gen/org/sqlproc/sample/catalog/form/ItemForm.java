package org.sqlproc.sample.catalog.form;
  
import java.math.BigDecimal;

import java.io.Serializable;

public class ItemForm implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public ItemForm() {
  }
  
  private Long itemid;
    
  public Long getItemid() {
    return itemid;
  }
    
  public void setItemid(Long itemid) {
    this.itemid = itemid;
  }
    
  public ItemForm _setItemid(Long itemid) {
    this.itemid = itemid;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
    
  public ItemForm _setName(String name) {
    this.name = name;
    return this;
  }
  
  private String description;
    
  public String getDescription() {
    return description;
  }
    
  public void setDescription(String description) {
    this.description = description;
  }
    
  public ItemForm _setDescription(String description) {
    this.description = description;
    return this;
  }
  
  private BigDecimal priceFrom;
    
  public BigDecimal getPriceFrom() {
    return priceFrom;
  }
    
  public void setPriceFrom(BigDecimal priceFrom) {
    this.priceFrom = priceFrom;
  }
    
  public ItemForm _setPriceFrom(BigDecimal priceFrom) {
    this.priceFrom = priceFrom;
    return this;
  }
  
  private BigDecimal priceTo;
    
  public BigDecimal getPriceTo() {
    return priceTo;
  }
    
  public void setPriceTo(BigDecimal priceTo) {
    this.priceTo = priceTo;
  }
    
  public ItemForm _setPriceTo(BigDecimal priceTo) {
    this.priceTo = priceTo;
    return this;
  }
  
  private int first;
    
  public int getFirst() {
    return first;
  }
    
  public void setFirst(int first) {
    this.first = first;
  }
    
  public ItemForm _setFirst(int first) {
    this.first = first;
    return this;
  }
  
  private int count;
    
  public int getCount() {
    return count;
  }
    
  public void setCount(int count) {
    this.count = count;
  }
    
  public ItemForm _setCount(int count) {
    this.count = count;
    return this;
  }
  
  private int order;
    
  public int getOrder() {
    return order;
  }
    
  public void setOrder(int order) {
    this.order = order;
  }
    
  public ItemForm _setOrder(int order) {
    this.order = order;
    return this;
  }
  
  @Override
  public String toString() {
    return "ItemForm [itemid=" + itemid + ", name=" + name + ", description=" + description + ", priceFrom=" + priceFrom + ", priceTo=" + priceTo + "]";
  }
  
  public String toStringFull() {
    return "ItemForm [itemid=" + itemid + ", name=" + name + ", description=" + description + ", priceFrom=" + priceFrom + ", priceTo=" + priceTo + "]";
  }
}
