package org.sample.web.auth.app;

import java.util.List;
import java.util.Calendar;

import org.sample.auth.dao.SessionDao;
import org.sample.auth.model.Session;
import org.sample.web.form.CountHolder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class SessionService {
	
	protected SessionDao sessionDao;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Session> listSessions(Session form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listSessions -> " + form + ", " + sqlControl);
        
        List<Session> sessions = sessionDao.list(form, sqlControl);
        form.clearAllInit();
        int count = sessionDao.count(form);
        logger.info("listSessions <- " + sessions);
        countHolder.setCount(count);
        return sessions;
    }
	
    @Transactional
    public Session insertSession(Session session) {
        logger.info("insertSession -> " + session);
        Session c = sessionDao.insert(session);        
        logger.info("insertSession <- " + c);
        return c;
    }

    @Transactional
    public Session updateSession(Session session) {
        logger.info("updateSession -> " + session);
        // current data and time
        session.setLastAccess(Calendar.getInstance().getTime());        
        int numUpdated = sessionDao.update(session);
        logger.info("updateSession <- " + numUpdated);
        return (numUpdated > 0) ? session : null;
    }

    @Transactional
    public Session deleteSession(Session session) {
        logger.info("deleteSession -> " + session);
        int numDeleted = sessionDao.delete(session);
        logger.info("deleteSession -> ok");
        return (numDeleted > 0) ? session : null;
    }
	
	@Required
    public void setSessionDao(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }
	
}
