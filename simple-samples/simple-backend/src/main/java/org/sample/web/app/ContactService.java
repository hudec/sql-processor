package org.sample.web.app;

import java.util.List;

import org.sample.dao.ContactDao;
import org.sample.model.Contact;
import org.sample.web.form.CountHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class ContactService {

    protected ContactDao contactDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public List<Contact> listContacts(Contact form, SqlControl sqlControl, CountHolder countHolder) throws Exception {
        logger.info("listContacts -> " + form + ", " + sqlControl);

        List<Contact> contacts = contactDao.list(form, sqlControl);
        int count = contactDao.count(null);
        logger.info("listContacts <- " + contacts);
        countHolder.setCount(count);
        return contacts;
    }

    @Transactional
    public Contact insertContact(Contact contact) {
        logger.info("insertContact -> " + contact);
        Contact p = contactDao.insert(contact);
        logger.info("insertContact <- " + p);
        return p;
    }

    @Transactional
    public Contact updateContact(Contact contact) {
        logger.info("updateContact -> " + contact);
        int numUpdated = contactDao.update(contact);
        logger.info("updateContact <- " + numUpdated);
        return (numUpdated > 0) ? contact : null;
    }

    @Transactional
    public void deleteContact(Contact contact) {
        logger.info("deleteContact -> " + contact);
        contactDao.delete(contact);
        logger.info("deleteContact -> ok");
    }

    @Required
    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

}
