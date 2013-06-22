package org.sample.web.app.auth;

import java.util.Calendar;
import java.util.List;

import org.sample.auth.dao.UserSessionDao;
import org.sample.auth.model.UserSession;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class UserSessionService {

    protected UserSessionDao userSessionDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<UserSession> listUserSessions(UserSession form, SqlControl sqlControl, CountHolder countHolder)
            throws Exception {
        logger.info("listUserSessions -> " + form + ", " + sqlControl);

        List<UserSession> sessions = userSessionDao.list(form, sqlControl);
        form.clearAllInit();
        int count = userSessionDao.count(form);
        logger.info("listUserSessions <- " + sessions);
        countHolder.setCount(count);
        return sessions;
    }

    @Transactional
    public UserSession insertUserSession(UserSession session) {
        logger.info("insertUserSession -> " + session);
        UserSession c = userSessionDao.insert(session);
        logger.info("insertUserSession <- " + c);
        return c;
    }

    @Transactional
    public UserSession updateUserSession(UserSession session) {
        logger.info("updateUserSession -> " + session);
        // current data and time
        session.setLastAccess(Calendar.getInstance().getTime());
        int numUpdated = userSessionDao.update(session);
        logger.info("updateUserSession <- " + numUpdated);
        return (numUpdated > 0) ? session : null;
    }

    @Transactional
    public UserSession deleteUserSession(UserSession session) {
        logger.info("deleteUserSession -> " + session);
        int numDeleted = userSessionDao.delete(session);
        logger.info("deleteUserSession -> ok");
        return (numDeleted > 0) ? session : null;
    }

    @Required
    public void setUserSessionDao(UserSessionDao sessionDao) {
        this.userSessionDao = sessionDao;
    }

}
