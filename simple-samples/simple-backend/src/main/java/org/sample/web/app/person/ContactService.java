package org.sample.web.app.person;

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

        form.setInit(Contact.Association.country.name());
        List<Contact> contacts = contactDao.list(form, sqlControl);
        form.clearAllInit();
        int count = contactDao.count(form);
        logger.info("listContacts <- " + contacts);
        countHolder.setCount(count);
        return contacts;
    }

    @Transactional
    public Contact insertContact(Contact contact) {
        logger.info("insertContact -> " + contact);
        Contact c = contactDao.insert(contact);
        c.setVersion(0); // in other case the record should be reread
        logger.info("insertContact <- " + c);
        return c;
    }

    @Transactional
    public Contact updateContact(Contact contact) {
        logger.info("updateContact -> " + contact);
        int numUpdated = contactDao.update(contact);
        logger.info("updateContact <- " + numUpdated);
        return (numUpdated > 0) ? contact : null;
    }

    @Transactional
    public Contact deleteContact(Contact contact) {
        logger.info("deleteContact -> " + contact);
        int numDeleted = contactDao.delete(contact);
        logger.info("deleteContact -> ok");
        return (numDeleted > 0) ? contact : null;
    }

    @Required
    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

}
