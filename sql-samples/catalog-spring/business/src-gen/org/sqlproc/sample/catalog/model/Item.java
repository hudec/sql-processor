package org.sqlproc.sample.catalog.model;
  
import java.math.BigDecimal;

import java.io.Serializable;

public class Item implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ITEMID = 1;
	
  public Item() {
  }
  
  public Item(String productid, String name, String description, BigDecimal price) {
    this.productid = productid;
    this.name = name;
    this.description = description;
    this.price = price;
  }
  
  private Long itemid;
  
  public Long getItemid() {
    return itemid;
  }
  
  public void setItemid(Long itemid) {
    this.itemid = itemid;
  }
  
  public Item _setItemid(Long itemid) {
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
  
  public Item _setProductid(String productid) {
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
  
  public Item _setName(String name) {
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
  
  public Item _setDescription(String description) {
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
  
  public Item _setImageurl(String imageurl) {
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
  
  public Item _setImagethumburl(String imagethumburl) {
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
  
  public Item _setImage(byte[] image) {
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
  
  public Item _setImagethumb(byte[] imagethumb) {
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
  
  public Item _setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Item other = (Item) obj;
    if (itemid == null || !itemid.equals(other.itemid))
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((itemid != null) ? itemid.hashCode() : 0);
    return result;
  }  
  
  @Override
  public String toString() {
    return "Item [price=" + price + ", productid=" + productid + ", description=" + description + ", name=" + name + ", image=" + image + ", imagethumburl=" + imagethumburl + ", itemid=" + itemid + ", imageurl=" + imageurl + ", imagethumb=" + imagethumb + "]";
  }
  
  public String toStringFull() {
    return "Item [itemid=" + itemid + ", productid=" + productid + ", name=" + name + ", description=" + description + ", imageurl=" + imageurl + ", imagethumburl=" + imagethumburl + ", image=" + image + ", imagethumb=" + imagethumb + ", price=" + price + "]";
  }
}
