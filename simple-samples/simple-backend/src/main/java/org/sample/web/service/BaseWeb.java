package org.sample.web.service;

import org.sample.web.util.BeanExtJsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Service
public class BaseWeb {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected BeanExtJsUtils beanUtils;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @Required
    public void setBeanUtils(BeanExtJsUtils beanUtils) {
        this.beanUtils = beanUtils;
    }

}
