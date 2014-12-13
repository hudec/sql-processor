package org.sample.web.app.person;

import java.util.List;

import org.sample.dao.person.PersonDao;
import org.sample.dao.person.RelativeDao;
import org.sample.model.person.Person;
import org.sample.model.person.Relative;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class RelativeService {

    protected RelativeDao relativeDao;
    protected PersonDao personDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Relative> listRelatives(Relative form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listRelatives -> " + form + ", " + sqlControl);

        form.setInit(Relative.Association.relPerson.name());
        List<Relative> relatives = relativeDao.list(form, sqlControl);
        form.clearAllInit();
        int count = relativeDao.count(form);
        logger.info("listRelatives <- " + relatives);
        countHolder.setCount(count);
        return relatives;
    }

    @Transactional
    public Relative insertRelative(Relative relative) {
        logger.info("insertRelative -> " + relative);
        // control of version on Person
        Person person = new Person();
        person.setId(relative.getPersonId());
        person.setVersion(relative.getVersion());
        logger.info(" - updatePerson -> " + person);
        int numUpdated = personDao.update(person);
        logger.info(" - updatePerson -> ok");
        if (numUpdated == 0) {
            return null; // is old version
        }
        relative.setVersion(person.getVersion());
        Relative r = relativeDao.insert(relative);
        logger.info("insertRelative <-" + r);
        return r;
    }

    @Transactional
    public Relative deleteRelative(Relative relative) {
        logger.info("deleteRelative -> " + relative);
        // control of version on Person
        Person person = new Person();
        person.setId(relative.getPersonId());
        person.setVersion(relative.getVersion());
        logger.info(" - updatePerson -> " + person);
        int numUpdated = personDao.update(person);
        logger.info(" - updatePerson -> ok");
        if (numUpdated == 0) {
            return null; // is old version
        }
        relative.setVersion(person.getVersion());
        int numDeleted = relativeDao.delete(relative);
        logger.info("deleteRelative <-" + numDeleted);
        return (numDeleted > 0) ? relative : null;
    }

    @Transactional
    public Relative updateRelative(Relative relative) {
        logger.info("updateRelative -> " + relative);
        // control of version on Person
        Person person = new Person();
        person.setId(relative.getPersonId());
        person.setVersion(relative.getVersion());
        logger.info(" - updatePerson -> " + person);
        int numUpdated = personDao.update(person);
        logger.info(" - updatePerson <-" + numUpdated);
        if (numUpdated == 0)
            return null; // is old version
        relative.setVersion(person.getVersion());
        numUpdated = relativeDao.update(relative);
        logger.info("updateRelative <-" + numUpdated);
        return (numUpdated > 0) ? relative : null;
    }

    @Required
    public void setRelativeDao(RelativeDao relativeDao) {
        this.relativeDao = relativeDao;
    }

    @Required
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

}
