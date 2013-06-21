package org.sample.web.auth.app;

import java.util.List;

import org.sample.auth.dao.AuthroleDao;
import org.sample.auth.model.Authrole;
import org.sample.web.form.CountHolder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class AuthroleService {
	
	protected AuthroleDao authroleDao;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Authrole> listAuthroles(Authrole form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listAuthroles -> " + form + ", " + sqlControl);
        
        List<Authrole> authroles = authroleDao.list(form, sqlControl);
        form.clearAllInit();
        int count = authroleDao.count(form);
        logger.info("listAuthroles <- " + authroles);
        countHolder.setCount(count);
        return authroles;
    }
	
    @Transactional
    public Authrole insertAuthrole(Authrole authrole) {
        logger.info("insertAuthrole -> " + authrole);
        Authrole c = authroleDao.insert(authrole);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertAuthrole <- " + c);
        return c;
    }

    @Transactional
    public Authrole updateAuthrole(Authrole authrole) {
        logger.info("updateAuthrole -> " + authrole);
        int numUpdated = authroleDao.update(authrole);
        logger.info("updateAuthrole <- " + numUpdated);
        return (numUpdated > 0) ? authrole : null;
    }

    @Transactional
    public Authrole deleteAuthrole(Authrole authrole) {
        logger.info("deleteAuthrole -> " + authrole);
        int numDeleted = authroleDao.delete(authrole);
        logger.info("deleteAuthrole -> ok");
        return (numDeleted > 0) ? authrole : null;
    }
	
	@Required
    public void setAuthroleDao(AuthroleDao authroleDao) {
        this.authroleDao = authroleDao;
    }
}
