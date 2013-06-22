package org.sample.web.app.auth;

import java.util.List;

import org.sample.auth.dao.AuthRoleDao;
import org.sample.auth.model.AuthRole;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class AuthRoleService {

    protected AuthRoleDao authroleDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<AuthRole> listAuthRoles(AuthRole form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listAuthRoles -> " + form + ", " + sqlControl);

        List<AuthRole> authroles = authroleDao.list(form, sqlControl);
        form.clearAllInit();
        int count = authroleDao.count(form);
        logger.info("listAuthRoles <- " + authroles);
        countHolder.setCount(count);
        return authroles;
    }

    @Transactional
    public AuthRole insertAuthRole(AuthRole authrole) {
        logger.info("insertAuthRole -> " + authrole);
        AuthRole c = authroleDao.insert(authrole);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertAuthRole <- " + c);
        return c;
    }

    @Transactional
    public AuthRole updateAuthRole(AuthRole authrole) {
        logger.info("updateAuthRole -> " + authrole);
        int numUpdated = authroleDao.update(authrole);
        logger.info("updateAuthRole <- " + numUpdated);
        return (numUpdated > 0) ? authrole : null;
    }

    @Transactional
    public AuthRole deleteAuthRole(AuthRole authrole) {
        logger.info("deleteAuthRole -> " + authrole);
        int numDeleted = authroleDao.delete(authrole);
        logger.info("deleteAuthRole -> ok");
        return (numDeleted > 0) ? authrole : null;
    }

    @Required
    public void setAuthRoleDao(AuthRoleDao authroleDao) {
        this.authroleDao = authroleDao;
    }
}
