package org.sqlproc.sample.catalog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class Item implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ITEMID = "1";
  
  public Item() {
  }
  
  public Item(final String productid, final String name, final String description, final BigDecimal price) {
    super();
    setProductid(productid);
    setName(name);
    setDescription(description);
    setPrice(price);
  }
  
  private Long itemid;
  
  public Long getItemid() {
    return this.itemid;
  }
  
  public void setItemid(final Long itemid) {
    this.itemid = itemid;
  }
  
  public Item withItemid(final Long itemid) {
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
  
  public Item withProductid(final String productid) {
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
  
  public Item withName(final String name) {
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
  
  public Item withDescription(final String description) {
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
  
  public Item withImageurl(final String imageurl) {
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
  
  public Item withImagethumburl(final String imagethumburl) {
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
  
  public Item withImage(final byte[] image) {
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
  
  public Item withImagethumb(final byte[] imagethumb) {
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
  
  public Item withPrice(final BigDecimal price) {
    this.price = price;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
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
    return java.util.Objects.hash(itemid);
  }
  
  @Override
  public String toString() {
    return "Item [itemid=" + itemid + ", productid=" + productid + ", name=" + name + ", description=" + description + ", imageurl=" + imageurl + ", imagethumburl=" + imagethumburl + ", image=" + image + ", imagethumb=" + imagethumb + ", price=" + price + "]";
  }
  
  public String toStringFull() {
    return "Item [itemid=" + itemid + ", productid=" + productid + ", name=" + name + ", description=" + description + ", imageurl=" + imageurl + ", imagethumburl=" + imagethumburl + ", image=" + image + ", imagethumb=" + imagethumb + ", price=" + price + "]";
  }
}
