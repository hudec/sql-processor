package org.sqlproc.sample.catalog.to;
  
import java.math.BigDecimal;

import java.io.Serializable;

public class ItemTO implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public ItemTO() {
  }
  
  public ItemTO(BigDecimal price) {
    this.price = price;
  }
  
  private Long itemid;
  
  public Long getItemid() {
    return itemid;
  }
  
  public void setItemid(Long itemid) {
    this.itemid = itemid;
  }
  
  public ItemTO _setItemid(Long itemid) {
    this.itemid = itemid;
    return this;
  }
  
  private String productid;
  
  public String getProductid() {
    return productid;
  }
  
  public void setProductid(String productid) {
    this.productid = productid;
  }
  
  public ItemTO _setProductid(String productid) {
    this.productid = productid;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public ItemTO _setName(String name) {
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
  
  public ItemTO _setDescription(String description) {
    this.description = description;
    return this;
  }
  
  private String imageurl;
  
  public String getImageurl() {
    return imageurl;
  }
  
  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }
  
  public ItemTO _setImageurl(String imageurl) {
    this.imageurl = imageurl;
    return this;
  }
  
  private String imagethumburl;
  
  public String getImagethumburl() {
    return imagethumburl;
  }
  
  public void setImagethumburl(String imagethumburl) {
    this.imagethumburl = imagethumburl;
  }
  
  public ItemTO _setImagethumburl(String imagethumburl) {
    this.imagethumburl = imagethumburl;
    return this;
  }
  
  private byte[] image;
  
  public byte[] getImage() {
    return image;
  }
  
  public void setImage(byte[] image) {
    this.image = image;
  }
  
  public ItemTO _setImage(byte[] image) {
    this.image = image;
    return this;
  }
  
  private byte[] imagethumb;
  
  public byte[] getImagethumb() {
    return imagethumb;
  }
  
  public void setImagethumb(byte[] imagethumb) {
    this.imagethumb = imagethumb;
  }
  
  public ItemTO _setImagethumb(byte[] imagethumb) {
    this.imagethumb = imagethumb;
    return this;
  }
  
  private BigDecimal price;
  
  public BigDecimal getPrice() {
    return price;
  }
  
  public void setPrice(BigDecimal price) {
    this.price = price;
  }
  
  public ItemTO _setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }
  
  @Override
  public String toString() {
    return "ItemTO [price=" + price + ", productid=" + productid + ", description=" + description + ", name=" + name + ", image=" + image + ", imagethumburl=" + imagethumburl + ", itemid=" + itemid + ", imageurl=" + imageurl + ", imagethumb=" + imagethumb + "]";
  }
  
  public String toStringFull() {
    return "ItemTO [price=" + price + ", productid=" + productid + ", description=" + description + ", name=" + name + ", image=" + image + ", imagethumburl=" + imagethumburl + ", itemid=" + itemid + ", imageurl=" + imageurl + ", imagethumb=" + imagethumb + "]";
  }
}
