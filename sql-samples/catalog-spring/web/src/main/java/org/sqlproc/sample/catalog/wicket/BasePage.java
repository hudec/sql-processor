package org.sqlproc.sample.catalog.wicket;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.string.Strings;

public class BasePage extends WebPage {

    /**
     * Constructor
     */
    public BasePage() {
        this(null);
    }

    /**
     * Construct.
     * 
     * @param model
     */
    public BasePage(IModel<?> model) {
        super(model);
        // addMetaComponets();
        final String packageName = getClass().getPackage().getName();
        add(new HeaderPanel("mainNavigation", Strings.afterLast(packageName, '.')));
    }

    private void addMetaComponets() {
        WebMarkupContainer stylesheet = new WebMarkupContainer("stylesheet");
        stylesheet.add(new AttributeAppender("type", Model.of("text/css")));
        stylesheet.add(new AttributeAppender("href", Model.of("style.css")));
        stylesheet.add(new AttributeAppender("rel", Model.of("stylesheet")));
        add(stylesheet);
    }
}
