package org.sqlproc.sample.catalog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Item implements Serializable {

    private Long itemid;
    private String productid;
    private String name;
    private String description;
    private String imageurl;
    private String imagethumburl;
    private byte[] image;
    private byte[] imagethumb;
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

    public void setItemid(BigInteger itemid) {
        if (itemid != null)
            this.itemid = itemid.longValue();
        else
            this.itemid = null;
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

    public String toDebugString() {
        return "Item [itemid=" + itemid + ", productid=" + productid + ", name=" + name + ", description="
                + description + ", imageurl=" + imageurl + ", imagethumburl=" + imagethumburl + ", image=" + image
                + ", imagethumb=" + imagethumb + ", price=" + price + "]";
    }

    @Override
    public String toString() {
        return name;
    }

}
