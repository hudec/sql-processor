package org.sqlproc.sample.catalog.to;

import java.io.Serializable;
import java.math.BigDecimal;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class ItemTO implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public ItemTO() {
  }
  
  public ItemTO(final BigDecimal price) {
    super();
    setPrice(price);
  }
  
  private Long itemid;
  
  public Long getItemid() {
    return this.itemid;
  }
  
  public void setItemid(final Long itemid) {
    this.itemid = itemid;
  }
  
  public ItemTO _setItemid(final Long itemid) {
    this.itemid = itemid;
    return this;
  }
  
  private String productid;
  
  public String getProductid() {
    return this.productid;
  }
  
  public void setProductid(final String productid) {
    this.productid = productid;
  }
  
  public ItemTO _setProductid(final String productid) {
    this.productid = productid;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public ItemTO _setName(final String name) {
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
  
  public ItemTO _setDescription(final String description) {
    this.description = description;
    return this;
  }
  
  private String imageurl;
  
  public String getImageurl() {
    return this.imageurl;
  }
  
  public void setImageurl(final String imageurl) {
    this.imageurl = imageurl;
  }
  
  public ItemTO _setImageurl(final String imageurl) {
    this.imageurl = imageurl;
    return this;
  }
  
  private String imagethumburl;
  
  public String getImagethumburl() {
    return this.imagethumburl;
  }
  
  public void setImagethumburl(final String imagethumburl) {
    this.imagethumburl = imagethumburl;
  }
  
  public ItemTO _setImagethumburl(final String imagethumburl) {
    this.imagethumburl = imagethumburl;
    return this;
  }
  
  private byte[] image;
  
  public byte[] getImage() {
    return this.image;
  }
  
  public void setImage(final byte[] image) {
    this.image = image;
  }
  
  public ItemTO _setImage(final byte[] image) {
    this.image = image;
    return this;
  }
  
  private byte[] imagethumb;
  
  public byte[] getImagethumb() {
    return this.imagethumb;
  }
  
  public void setImagethumb(final byte[] imagethumb) {
    this.imagethumb = imagethumb;
  }
  
  public ItemTO _setImagethumb(final byte[] imagethumb) {
    this.imagethumb = imagethumb;
    return this;
  }
  
  private BigDecimal price;
  
  public BigDecimal getPrice() {
    return this.price;
  }
  
  public void setPrice(final BigDecimal price) {
    this.price = price;
  }
  
  public ItemTO _setPrice(final BigDecimal price) {
    this.price = price;
    return this;
  }
  
  @Override
  public String toString() {
    return "ItemTO [price=" + price + ", productid=" + productid + ", description=" + description + ", name=" + name + ", image=" + image + ", imagethumburl=" + imagethumburl + ", itemid=" + itemid + ", imageurl=" + imageurl + ", imagethumb=" + imagethumb + "]";
  }
  
  public String toStringFull() {
    return "ItemTO [itemid=" + itemid + ", productid=" + productid + ", name=" + name + ", description=" + description + ", imageurl=" + imageurl + ", imagethumburl=" + imagethumburl + ", image=" + image + ", imagethumb=" + imagethumb + ", price=" + price + "]";
  }
}
