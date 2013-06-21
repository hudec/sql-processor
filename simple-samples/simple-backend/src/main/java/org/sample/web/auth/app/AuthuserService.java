package org.sample.web.auth.app;

import java.util.List;

import org.sample.auth.dao.AuthuserDao;
import org.sample.auth.model.Authuser;
import org.sample.web.form.CountHolder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class AuthuserService {
	
	protected AuthuserDao authuserDao;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Authuser> listAuthusers(Authuser form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listAuthusers -> " + form + ", " + sqlControl);
        
        List<Authuser> authusers = authuserDao.list(form, sqlControl);
        form.clearAllInit();
        int count = authuserDao.count(form);
        logger.info("listAuthusers <- " + authusers);
        countHolder.setCount(count);
        return authusers;
    }
	
    @Transactional
    public Authuser insertAuthuser(Authuser authuser) {
        logger.info("insertAuthuser -> " + authuser);
        Authuser c = authuserDao.insert(authuser);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertAuthuser <- " + c);
        return c;
    }

    @Transactional
    public Authuser updateAuthuser(Authuser authuser) {
        logger.info("updateAuthuser -> " + authuser);
        int numUpdated = authuserDao.update(authuser);
        logger.info("updateAuthuser <- " + numUpdated);
        return (numUpdated > 0) ? authuser : null;
    }

    @Transactional
    public Authuser deleteAuthuser(Authuser authuser) {
        logger.info("deleteAuthuser -> " + authuser);
        int numDeleted = authuserDao.delete(authuser);
        logger.info("deleteAuthuser -> ok");
        return (numDeleted > 0) ? authuser : null;
    }
	
	@Required
    public void setAuthuserDao(AuthuserDao AuthuserDao) {
        this.authuserDao = AuthuserDao;
    }
}
