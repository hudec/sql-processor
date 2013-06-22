package org.sample.web.app.person;

import java.util.List;

import org.sample.dao.CountryDao;
import org.sample.model.Country;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class CountryService {

    protected CountryDao countryDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Country> listCountries(Country form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listCountries -> " + form + ", " + sqlControl);

        List<Country> countrys = countryDao.list(form, sqlControl);
        form.clearAllInit();
        int count = countryDao.count(form);
        logger.info("listCountries <- " + countrys);
        countHolder.setCount(count);
        return countrys;
    }

    @Required
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }
}
