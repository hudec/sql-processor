package org.sqlproc.sample.catalog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Entity
@Table(name = "ITEM")
@SequenceGenerator(name = "seq:item", sequenceName = "ITEM:SEQ", initialValue = 100)
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
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq:item")
  @Column(name = "ITEMID")
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
  
  @Basic(optional = false)
  @Column(name = "PRODUCTID")
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
  
  @Basic(optional = false)
  @Column(name = "NAME", unique = true)
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
  
  @Basic(optional = false)
  @Column(name = "DESCRIPTION")
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
  
  @Column(name = "IMAGEURL")
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
  
  @Column(name = "IMAGETHUMBURL")
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
  
  @Column(name = "IMAGE", columnDefinition = "LONGVARBINARY")
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
  
  @Column(name = "IMAGETHUMB", columnDefinition = "LONGVARBINARY")
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
  
  @Basic(optional = false)
  @Column(name = "PRICE")
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
