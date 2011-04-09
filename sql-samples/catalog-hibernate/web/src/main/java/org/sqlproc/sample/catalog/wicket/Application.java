package org.sqlproc.sample.catalog.wicket;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.time.Duration;

public class Application extends WebApplication {

    public Application() {
    }

    public Class getHomePage() {
        return ItemSearch.class;
    }

    @Override
    protected void init() {
        super.init();
        addComponentInstantiationListener(new SpringComponentInjector(this));

        if (Application.DEPLOYMENT.equals(getConfigurationType())) {
            getMarkupSettings().setStripWicketTags(true);
            getMarkupSettings().setCompressWhitespace(true);
        } else {
            getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);
        }

        // getMarkupSettings().setAutomaticLinking(true);
        getMarkupSettings().setDefaultAfterDisabledLink("");
    }
}
