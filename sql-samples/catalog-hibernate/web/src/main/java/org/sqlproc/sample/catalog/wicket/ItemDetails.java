package org.sqlproc.sample.catalog.wicket;

import org.apache.wicket.behavior.SimpleAttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.image.NonCachingImage;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.PackageResourceReference;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.service.ItemService;

public class ItemDetails extends BasePage {

    @SpringBean(name = "itemService")
    ItemService itemService;

    public ItemDetails() {
        createPage(new Item());
    }

    public ItemDetails(PageParameters params) {
        Item item = itemService.findById(params.get("itemid").toLong());
        createPage(item);
    }

    private void createPage(final Item item) {

        add(new Label("name", item.getName()));
        add(new Label("description", item.getDescription()));

        if (item.getImage() != null && item.getImage().length > 0) {
            add(new NonCachingImage("image", new AbstractReadOnlyModel() {
                @Override
                public Object getObject() {
                    return new ImageResource(item.getImage(), "jpg");
                }
            }));
        } else {
            add(new Image("image", new PackageResourceReference(this.getClass(), "images/cat.png")));
        }

        final Form<Item> form = new Form<Item>("detailsForm", new CompoundPropertyModel<Item>(item));
        add(form);
        form.add(new Button("doEdit") {

            @Override
            public void onSubmit() {

                Item item = form.getModelObject();
                setResponsePage(new ItemEdit(item.getItemid(), null));
            }
        });
        form.add(new Button("doDelete") {

            @Override
            public void onSubmit() {

                Item item = form.getModelObject();
                itemService.delete(item.getItemid());
                setResponsePage(ItemList.class);
            }
        }.add(new SimpleAttributeModifier("onclick", "return confirm('Are you sure?');")));
        form.add(new Button("doList") {

            @Override
            public void onSubmit() {

                setResponsePage(ItemList.class);
            }
        });
        form.add(new Button("doSearch") {

            @Override
            public void onSubmit() {

                setResponsePage(ItemSearch.class);
            }
        });
    }
}
