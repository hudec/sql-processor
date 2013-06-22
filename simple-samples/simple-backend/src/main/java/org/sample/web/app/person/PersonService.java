package org.sample.web.app.person;

import java.util.List;

import org.sample.model.Person;
import org.sample.web.dao.person.PersonExtDao;
import org.sample.web.form.CountHolder;
import org.sample.web.form.PersonForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class PersonService {

    protected PersonExtDao personDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Person> listPeople(PersonForm form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listPeople -> " + form + ", " + sqlControl);

        List<Person> people = personDao.list(form, sqlControl);
        form.clearAllInit();
        int count = personDao.count(form, sqlControl);
        for (Person p : people) {
            logger.info("listPeople <- " + p);
            logger.info("listPeople <- " + p.getContacts());
        }
        countHolder.setCount(count);
        return people;
    }

    @Transactional
    public Person insertPerson(Person person) {
        logger.info("insertPerson -> " + person);
        Person p = personDao.insert(person);
        p.setVersion(0); // in other case the record should be reread
        logger.info("insertPerson <- " + p);
        return p;
    }

    @Transactional
    public Person updatePerson(Person person) {
        logger.info("updatePerson -> " + person);
        int numUpdated = personDao.update(person);
        logger.info("updatePerson <- " + numUpdated);
        return (numUpdated > 0) ? person : null;
    }

    @Transactional
    public Person deletePerson(Person person) {
        logger.info("deletePerson -> " + person);
        int numDeleted = personDao.delete(person);
        logger.info("deletePerson -> ok");
        return (numDeleted > 0) ? person : null;
    }

    @Required
    public void setPersonDao(PersonExtDao personDao) {
        this.personDao = personDao;
    }

}
