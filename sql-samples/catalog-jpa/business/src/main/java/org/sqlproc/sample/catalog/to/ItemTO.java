package org.sqlproc.sample.catalog.to;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemTO implements Serializable {

    private Long itemid;
    private String productid;
    private String name;
    private String description;
    private String imageurl;
    private String imagethumburl;
    private byte[] image;
    private byte[] imagethumb;
    private BigDecimal price;

    public ItemTO() {
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        return sb.toString();
    }
}
