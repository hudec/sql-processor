package org.sample.web.auth.app;

import java.util.List;

import org.sample.auth.dao.UserRoleDao;
import org.sample.auth.model.UserRole;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class UserRoleService {

    protected UserRoleDao userroleDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<UserRole> listUserRoles(UserRole form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listUserRoles -> " + form + ", " + sqlControl);

        form.setInit(UserRole.Association.authRole.name());
        List<UserRole> userroles = userroleDao.list(form, sqlControl);
        form.clearAllInit();
        int count = userroleDao.count(form);
        logger.info("listUserRoles <- " + userroles);
        countHolder.setCount(count);
        return userroles;
    }

    @Transactional
    public UserRole insertUserRole(UserRole userrole) {
        logger.info("insertUserRole -> " + userrole);
        UserRole c = userroleDao.insert(userrole);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertUserRole <- " + c);
        return c;
    }

    @Transactional
    public UserRole updateUserRole(UserRole userrole) {
        logger.info("updateUserRole -> " + userrole);
        int numUpdated = userroleDao.update(userrole);
        logger.info("updateUserRole <- " + numUpdated);
        return (numUpdated > 0) ? userrole : null;
    }

    @Transactional
    public UserRole deleteUserRole(UserRole userrole) {
        logger.info("deleteUserRole -> " + userrole);
        int numDeleted = userroleDao.delete(userrole);
        logger.info("deleteUserRole -> ok");
        return (numDeleted > 0) ? userrole : null;
    }

    @Required
    public void setUserRoleDao(UserRoleDao userroleDao) {
        this.userroleDao = userroleDao;
    }
}
