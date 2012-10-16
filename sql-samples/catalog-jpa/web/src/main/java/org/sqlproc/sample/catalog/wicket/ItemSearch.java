package org.sqlproc.sample.catalog.wicket;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.sqlproc.sample.catalog.form.ItemForm;

public class ItemSearch extends BasePage {

    public ItemSearch(PageParameters params) {

        final ItemForm searchForm = new ItemForm();
        final Form form = new StatelessForm("searchForm", new CompoundPropertyModel(searchForm));
        add(form);

        form.add(new TextField("name"));
        form.add(new TextField("description"));
        form.add(new TextField("priceFrom"));
        form.add(new TextField("priceTo"));

        form.add(new Button("findItems") {

            @Override
            public void onSubmit() {

                setResponsePage(new ItemList(searchForm));
            }
        });
        form.add(new Link("doNew") {

            @Override
            public void onClick() {

                setResponsePage(new ItemEdit(null, ItemSearch.this));
            }
        });
    }
}
