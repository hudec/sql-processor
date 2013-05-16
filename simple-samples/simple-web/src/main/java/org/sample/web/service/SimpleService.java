package org.sample.web.service;

import java.util.List;

import org.sample.dao.ContactDao;
import org.sample.dao.PersonDao;
import org.sample.model.Contact;
import org.sample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadRequest;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadResult;

@Service
public class SimpleService {

    protected ContactDao contactDao;
    protected PersonDao personDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "catalog")
    @Transactional(readOnly = true)
    public ExtDirectStoreReadResult<Person> loadPeople(ExtDirectStoreReadRequest request) {
        List<Person> people = personDao.list(new Person());
        return new ExtDirectStoreReadResult<Person>(people.size(), people, true);
    }

    @Transactional(readOnly = true)
    public Contact getContact(Contact contact) {
        return contactDao.get(contact);
    }

    @Transactional
    public Contact createContact(Contact contact) {
        return contactDao.insert(contact);
    }

    @Transactional
    public int updateContact(Contact contact) {
        return contactDao.update(contact);
    }

    @Transactional
    public int deleteContact(Contact contact) {
        return contactDao.delete(contact);
    }

    @Transactional(readOnly = true)
    public List<Contact> findContacts(Contact contact) {
        return contactDao.list(contact);
    }

    @Transactional(readOnly = true)
    public Person getPerson(Person person) {
        return personDao.get(person);
    }

    @Transactional
    public Person createPerson(Person person) {
        return personDao.insert(person);
    }

    @Transactional
    public int updatePerson(Person person) {
        return personDao.update(person);
    }

    @Transactional
    public void deletePerson(Person person) {
        personDao.delete(person);
    }

    @Transactional(readOnly = true)
    public List<Person> findPeople(Person person) {
        return personDao.list(person);
    }

    @Required
    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Required
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
