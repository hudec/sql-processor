package org.sample.web.app;

import java.util.List;

import org.sample.dao.PersonDao;
import org.sample.model.Person;
import org.sample.web.form.PersonForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class PersonService {

    protected PersonDao personDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Person> listPeople(PersonForm form, SqlControl sqlControl) throws Exception {
        logger.info("listPeople -> " + form + ", " + sqlControl);

        List<Person> people = personDao.list(form);
        for (Person p : people) {
            logger.info("listPeople <- " + p);
            logger.info("listPeople <- " + p.getContacts());
        }
        return people;
    }

    @Transactional
    public Person insertPerson(Person person) {
        logger.info("insertPerson -> " + person);
        Person p = personDao.insert(person);
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
    public void deletePerson(Person person) {
        logger.info("deletePerson -> " + person);
        personDao.delete(person);
        logger.info("deletePerson -> ok");
    }

    @Required
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

}
