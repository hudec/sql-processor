package org.sqlproc.sample.catalog.model;
  
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "ITEM")
@SequenceGenerator(name = "seq_item", sequenceName = "ITEM_SEQ", initialValue = 100)
public class Item implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public Item() {
  }
  
  public Item(Long itemid, String productid, String name, String description, BigDecimal price) {
    this.itemid = itemid;
    this.productid = productid;
    this.name = name;
    this.description = description;
    this.price = price;
  }
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_item")
  @Column(name = "ITEMID")
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
  
  @Basic(optional = false)
  @Column(name = "PRODUCTID")
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
  
  @Basic(optional = false)
  @Column(name = "NAME", unique = true)
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
  
  @Basic(optional = false)
  @Column(name = "DESCRIPTION")
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
  
  @Column(name = "IMAGEURL")
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
  
  @Column(name = "IMAGETHUMBURL")
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
  
  @Column(name = "IMAGE", columnDefinition = "LONGVARBINARY")
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
  
  @Column(name = "IMAGETHUMB", columnDefinition = "LONGVARBINARY")
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
  
  @Basic(optional = false)
  @Column(name = "PRICE")
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
    if (!productid.equals(other.productid))
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + productid.hashCode();
    return result;
  }  
  
  @Override
  public String toString() {
    return "Item [price=" + price + ", productid=" + productid + ", description=" + description + ", name=" + name + ", image=" + image + ", imagethumburl=" + imagethumburl + ", itemid=" + itemid + ", imageurl=" + imageurl + ", imagethumb=" + imagethumb + "]";
  }
  
  public String toStringFull() {
    return "Item [price=" + price + ", productid=" + productid + ", description=" + description + ", name=" + name + ", image=" + image + ", imagethumburl=" + imagethumburl + ", itemid=" + itemid + ", imageurl=" + imageurl + ", imagethumb=" + imagethumb + "]";
  }
}
