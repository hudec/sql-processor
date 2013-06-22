package org.sample.web.app.auth;

import java.util.List;

import org.sample.auth.dao.AuthUserDao;
import org.sample.auth.model.AuthUser;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class AuthUserService {

    protected AuthUserDao authuserDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<AuthUser> listAuthUsers(AuthUser form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listAuthUsers -> " + form + ", " + sqlControl);

        List<AuthUser> authusers = authuserDao.list(form, sqlControl);
        form.clearAllInit();
        int count = authuserDao.count(form);
        logger.info("listAuthUsers <- " + authusers);
        countHolder.setCount(count);
        return authusers;
    }

    @Transactional
    public AuthUser insertAuthUser(AuthUser authuser) {
        logger.info("insertAuthUser -> " + authuser);
        AuthUser c = authuserDao.insert(authuser);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertAuthUser <- " + c);
        return c;
    }

    @Transactional
    public AuthUser updateAuthUser(AuthUser authuser) {
        logger.info("updateAuthUser -> " + authuser);
        int numUpdated = authuserDao.update(authuser);
        logger.info("updateAuthUser <- " + numUpdated);
        return (numUpdated > 0) ? authuser : null;
    }

    @Transactional
    public AuthUser deleteAuthUser(AuthUser authuser) {
        logger.info("deleteAuthUser -> " + authuser);
        int numDeleted = authuserDao.delete(authuser);
        logger.info("deleteAuthUser -> ok");
        return (numDeleted > 0) ? authuser : null;
    }

    @Required
    public void setAuthUserDao(AuthUserDao AuthUserDao) {
        this.authuserDao = AuthUserDao;
    }
}
