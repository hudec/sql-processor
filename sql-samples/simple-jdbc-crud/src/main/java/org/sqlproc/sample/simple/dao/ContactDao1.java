package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.Person;

public class ContactDao1 extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Person insertPersonContacts(Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertContact = getCrudEngine("INSERT_CONTACT");
        if (contacts != null) {
            for (Contact contact : contacts) {
                contact.setPerson(person);
                int count = sqlInsertContact.insert(getSqlSession(), contact);
                logger.info("insert contact: " + count + ": " + contact);
                if (count > 0)
                    person.getContacts().add(contact);
            }
        }
        return person;
    }

    public Contact getContact(Contact contact) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_CONTACT");
        Contact c = sqlEngine.get(getSqlSession(), Contact.class, contact);
        logger.info("get contact: " + c);
        return c;
    }

    public Contact updateContact(Contact contact) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_CONTACT");
        int count = sqlEngine.update(getSqlSession(), contact);
        logger.info("update contact: " + count);
        return (count > 0) ? contact : null;
    }

    public boolean deleteContact(Contact contact) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_CONTACT");
        int count = sqlEngine.delete(getSqlSession(), contact);
        logger.info("delete contact: " + count);
        return (count > 0);
    }
}
