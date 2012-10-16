package org.sqlproc.sample.catalog.wicket;

import java.awt.image.BufferedImage;

import org.apache.wicket.request.resource.DynamicImageResource;
import org.apache.wicket.request.resource.IResource.Attributes;

public class ImageResource extends DynamicImageResource {

    // has to save this. or get the image another way!
    private byte[] image;

    public ImageResource(byte[] image, String format) {
        this.image = image;
        setFormat(format);
    }

    public ImageResource(BufferedImage image) {
        this.image = toImageData(image);
    }

    @Override
    protected byte[] getImageData(Attributes attributes) {
        if (image != null) {
            return image;
        } else {
            return new byte[0];
        }
    }
}
