package org.sqlproc.sample.catalog.wicket;

import java.util.Iterator;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.image.NonCachingImage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.PackageResourceReference;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.service.ItemService;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemList extends BasePage {

    private static final int ROWS_PER_PAGE = 5;

    @SpringBean(name = "itemService")
    ItemService itemService;

    public ItemList(final ItemForm searchForm) {
        createPage(searchForm);
    }

    public ItemList(final PageParameters parameters) {
        createPage(new ItemForm());
    }

    private void createPage(final ItemForm searchForm) {

        // create a Data Provider
        IDataProvider<ItemTO> itemDataProvider = new IDataProvider<ItemTO>() {

            @Override
            public Iterator<ItemTO> iterator(int first, int count) {
                searchForm.setFirst(first);
                searchForm.setCount(count);
                searchForm.setOrder(1);
                return itemService.find(searchForm).iterator();
            }

            @Override
            public int size() {
                return itemService.findCount(searchForm);
            }

            @Override
            public IModel<ItemTO> model(final ItemTO object) {
                return new LoadableDetachableModel<ItemTO>() {

                    @Override
                    protected ItemTO load() {
                        return object;
                    }
                };
            }

            @Override
            public void detach() {
            }
        };

        DataView<ItemTO> dataView = new DataView<ItemTO>("rows", itemDataProvider, ROWS_PER_PAGE) {

            @Override
            protected void populateItem(Item<ItemTO> repItem) {
                final ItemTO item = repItem.getModelObject();
                repItem.setModel(new CompoundPropertyModel<ItemTO>(item));
                repItem.add(link("details", item));

                if (item.getImagethumb() != null && item.getImagethumb().length > 0) {
                    repItem.add(new NonCachingImage("imagethumb", new AbstractReadOnlyModel() {
                        @Override
                        public Object getObject() {
                            return new ImageResource(item.getImagethumb(), "jpg");
                        }
                    }));
                } else {
                    repItem.add(new Image("imagethumb", new PackageResourceReference(this.getClass(),
                            "images/cat-s.png")));
                }

                repItem.add(new Label("price"));

            }
        };
        add(dataView);
        PagingNavigator pager = new PagingNavigator("pager", dataView);
        add(pager);

        final Form<Item> form = new Form<Item>("listForm");
        add(form);
        form.add(new Button("doNew") {

            @Override
            public void onSubmit() {

                setResponsePage(new ItemEdit(null, ItemList.this));
            }
        });
        form.add(new Button("doSearch") {

            @Override
            public void onSubmit() {

                setResponsePage(ItemSearch.class);
            }
        });
    }

    public static BookmarkablePageLink<Void> link(final String name, final ItemTO item) {

        final BookmarkablePageLink<Void> link = new BookmarkablePageLink<Void>(name, ItemDetails.class);

        if (item != null) {
            link.setParameter("itemid", item.getItemid());
            link.add(new Label("name", item.getName()));
        }

        return link;
    }
}
