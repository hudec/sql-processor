package org.sqlproc.sample.catalog.wicket;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.upload.FileUpload;
import org.apache.wicket.markup.html.form.upload.FileUploadField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.service.ItemService;

public class ItemEdit extends BasePage {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @SpringBean(name = "itemService")
    ItemService itemService;

    final WebPage previousPage;
    FileUploadField imageUploadField;
    FileUploadField imagethumbUploadField;

    public ItemEdit(Long itemid, WebPage previousPage) {
        this.previousPage = previousPage;

        final Item item = (itemid != null) ? itemService.findById(itemid) : new Item();

        final Form<Item> form = new StatelessForm<Item>("editForm", new CompoundPropertyModel<Item>(item));
        logger.info("ItemEdit.init " + item.toDebugString());

        form.setMultiPart(true);
        add(form);

        form.add(new FeedbackPanel("feedback"));

        form.add(new TextField("productid").setRequired(true));
        form.add(new TextField("name").setRequired(true));
        form.add(new TextArea("description").setRequired(true));

        form.add(new FileUploadField("image", new IModel<FileUpload>() {
            @Override
            public void detach() {
            }

            @Override
            public FileUpload getObject() {
                return null;
            }

            @Override
            public void setObject(FileUpload imageUpload) {
                if (imageUpload != null) {
                    item.setImageurl(imageUpload.getClientFileName());
                    item.setImage(imageUpload.getBytes());
                }
            }
        }));
        form.add(new Label("imageurl", item.getImageurl()));

        form.add(new FileUploadField("imagethumb", new IModel<FileUpload>() {
            @Override
            public void detach() {
            }

            @Override
            public FileUpload getObject() {
                return null;
            }

            @Override
            public void setObject(FileUpload imagethumbUpload) {
                if (imagethumbUpload != null) {
                    item.setImagethumburl(imagethumbUpload.getClientFileName());
                    item.setImagethumb(imagethumbUpload.getBytes());
                }
            }
        }));
        form.add(new Label("imagethumburl", item.getImagethumburl()));

        form.add(new TextField("price").setRequired(true));

        form.add(new Button("doSave") {

            @Override
            public void onSubmit() {

                Item item = form.getModelObject();
                logger.info("ItemEdit.doSave " + item.toDebugString());
                Long itemid = (item.getItemid() != null) ? itemService.update(item) : itemService.create(item);
                PageParameters pp = new PageParameters();
                pp.put("itemid", itemid);
                setResponsePage(ItemDetails.class, pp);
            }
        });
        form.add(new Button("doRemoveImage") {

            @Override
            public void onSubmit() {

                Item item = form.getModelObject();
                logger.info("ItemEdit.doRemoveImage " + item.toDebugString());
                item.setImage(null);
                item.setImageurl(null);
                itemService.update(item);
                PageParameters pp = new PageParameters();
                pp.put("itemid", item.getItemid());
                setResponsePage(ItemDetails.class, pp);
            }
        }.setVisibilityAllowed(item.getItemid() != null));
        form.add(new Button("doRemoveImagethumb") {

            @Override
            public void onSubmit() {

                Item item = form.getModelObject();
                logger.info("ItemEdit.doRemoveImagethumb " + item.toDebugString());
                item.setImagethumb(null);
                item.setImagethumburl(null);
                itemService.update(item);
                PageParameters pp = new PageParameters();
                pp.put("itemid", item.getItemid());
                setResponsePage(ItemDetails.class, pp);
            }
        }.setVisibilityAllowed(item.getItemid() != null));

        form.add(new Link("doCancel") {

            @Override
            public void onClick() {
                Item item = form.getModelObject();
                logger.info("ItemEdit.doCancel " + item.toDebugString());
                if (item.getItemid() == null) {
                    if (ItemEdit.this.previousPage != null)
                        setResponsePage(ItemEdit.this.previousPage);
                    else
                        setResponsePage(ItemList.class);
                } else {
                    PageParameters pp = new PageParameters();
                    pp.put("itemid", item.getItemid());
                    setResponsePage(ItemDetails.class, pp);
                }
            }
        });
    }
}
