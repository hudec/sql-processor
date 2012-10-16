package org.sqlproc.sample.catalog.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.IExceptionSettings;
import org.apache.wicket.settings.IMarkupSettings;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.time.Duration;

public class Application extends WebApplication {

    boolean isInitialized = false;

    public Application() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return ItemSearch.class;
    }

    private void addListeners() {
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }

    private void initConfiguration() {
        if (org.apache.wicket.RuntimeConfigurationType.DEPLOYMENT.equals(getConfigurationType())) {
            getMarkupSettings().setStripWicketTags(true);
            getMarkupSettings().setCompressWhitespace(true);
        } else {
            getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);
        }

        // getMarkupSettings().setAutomaticLinking(true);
        getMarkupSettings().setDefaultAfterDisabledLink("");

        getExceptionSettings().setUnexpectedExceptionDisplay(IExceptionSettings.SHOW_INTERNAL_ERROR_PAGE);

        // UTF-8 setting
        getMarkupSettings().setDefaultMarkupEncoding("UTF-8");
        getRequestCycleSettings().setResponseRequestEncoding("UTF-8");
    }

    @Override
    protected void init() {
        if (!isInitialized) {
            super.init();
            addListeners();
            Injector.get().inject(this);
            initConfiguration();
            // mountPages();
            IMarkupSettings markupSettings = getMarkupSettings();
            markupSettings.setStripWicketTags(true);
            isInitialized = true;
        }
    }
}
