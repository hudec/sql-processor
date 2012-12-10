package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.Person;

public class ContactDao extends BaseDao {

    public ContactDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Person insertPersonContacts(Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertContact = getCrudEngine("INSERT_CONTACT");
        if (contacts != null) {
            for (Contact contact : contacts) {
                contact.setPerson(person);
                int count = sqlInsertContact.insert(session, contact);
                logger.info("insert contact: " + count + ": " + contact);
                if (count > 0)
                    person.getContacts().add(contact);
            }
        }
        return person;
    }

    public Contact getContact(Contact contact) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_CONTACT");
        Contact c = sqlEngine.get(session, Contact.class, contact);
        logger.info("get contact: " + c);
        return c;
    }

    public Contact updateContact(Contact contact) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_CONTACT");
        int count = sqlEngine.update(session, contact);
        logger.info("update contact: " + count);
        return (count > 0) ? contact : null;
    }

    public boolean deleteContact(Contact contact) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_CONTACT");
        int count = sqlEngine.delete(session, contact);
        logger.info("delete contact: " + count);
        return (count > 0);
    }
}
