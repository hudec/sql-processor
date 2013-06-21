package org.sample.web.auth.app;

import java.util.List;

import org.sample.auth.dao.UserroleDao;
import org.sample.auth.model.Userrole;
import org.sample.web.form.CountHolder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class UserroleService {
	
	protected UserroleDao userroleDao;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Userrole> listUserroles(Userrole form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listUserroles -> " + form + ", " + sqlControl);
        
        form.setInit(Userrole.Association.authrole.name());
        List<Userrole> userroles = userroleDao.list(form, sqlControl);
        form.clearAllInit();
        int count = userroleDao.count(form);
        logger.info("listUserroles <- " + userroles);
        countHolder.setCount(count);
        return userroles;
    }
	
    @Transactional
    public Userrole insertUserrole(Userrole userrole) {
        logger.info("insertUserrole -> " + userrole);
        Userrole c = userroleDao.insert(userrole);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertUserrole <- " + c);
        return c;
    }

    @Transactional
    public Userrole updateUserrole(Userrole userrole) {
        logger.info("updateUserrole -> " + userrole);
        int numUpdated = userroleDao.update(userrole);
        logger.info("updateUserrole <- " + numUpdated);
        return (numUpdated > 0) ? userrole : null;
    }

    @Transactional
    public Userrole deleteUserrole(Userrole userrole) {
        logger.info("deleteUserrole -> " + userrole);
        int numDeleted = userroleDao.delete(userrole);
        logger.info("deleteUserrole -> ok");
        return (numDeleted > 0) ? userrole : null;
    }
	
	@Required
    public void setUserroleDao(UserroleDao userroleDao) {
        this.userroleDao = userroleDao;
    }
}
