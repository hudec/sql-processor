package org.sqlproc.sample.catalog.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
@SequenceGenerator(name = "seq_item", sequenceName = "ITEM_SEQ", initialValue = 100)
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_item")
    @Column(name = "ITEMID")
    private Long itemid;
    @Basic(optional = false)
    @Column(name = "PRODUCTID")
    private String productid;
    @Basic(optional = false)
    @Column(name = "NAME", unique = true)
    private String name;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IMAGEURL")
    private String imageurl;
    @Column(name = "IMAGETHUMBURL")
    private String imagethumburl;
    @Lob
    @Column(name = "IMAGE")
    private byte[] image;
    @Lob
    @Column(name = "IMAGETHUMB")
    private byte[] imagethumb;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private BigDecimal price;

    public Item() {
    }

    public Item(Long itemid) {
        this.itemid = itemid;
    }

    public Item(Long itemid, String productid, String name, String description, String imageurl, String imagethumburl,
            BigDecimal price) {
        this.itemid = itemid;
        this.productid = productid;
        this.name = name;
        this.description = description;
        this.imageurl = imageurl;
        this.imagethumburl = imagethumburl;
        this.price = price;
    }

    public Item(int itemid, String productid, String name, String description, String imageurl, String imagethumburl,
            double price) {
        this.itemid = new Long(itemid);
        this.productid = productid;
        this.name = name;
        this.description = description;
        this.imageurl = imageurl;
        this.imagethumburl = imagethumburl;
        this.price = new BigDecimal(price);
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
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

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImagethumburl() {
        return imagethumburl;
    }

    public void setImagethumburl(String imagethumburl) {
        this.imagethumburl = imagethumburl;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getImagethumb() {
        return imagethumb;
    }

    public void setImagethumb(byte[] imagethumb) {
        this.imagethumb = imagethumb;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are
        // not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

}
