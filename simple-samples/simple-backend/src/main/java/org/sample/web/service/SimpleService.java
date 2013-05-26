package org.sample.web.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.converters.DateConverter;
import org.sample.dao.ContactDao;
import org.sample.dao.PersonDao;
import org.sample.model.Contact;
import org.sample.model.Person;
import org.sample.web.form.PersonForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadRequest;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadResult;
import ch.ralscha.extdirectspring.filter.Filter;
import ch.ralscha.extdirectspring.filter.StringFilter;

@Service
public class SimpleService {

    protected ContactDao contactDao;
    protected PersonDao personDao;
    protected BeanUtilsBean beanUtilsBean;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public SimpleService() {
        beanUtilsBean = new BeanUtilsBean(new ConvertUtilsBean() {

            @Override
            public Object convert(String value, Class clazz) {
                if (clazz.isEnum()) {
                    if (value == null || value.isEmpty()) {
                        return null;
                    }
                    return Enum.valueOf(clazz, value);

                } else {
                    return super.convert(value, clazz);
                }
            }
        });

        DateConverter dateConverter = new DateConverter(null);
        dateConverter.setPattern("yyyy-MM-dd'T'HH:mm:ss");
        beanUtilsBean.getConvertUtils().register(dateConverter, Date.class);

    }

    @Transactional(readOnly = true)
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Person> loadPeople(ExtDirectStoreReadRequest request) throws Exception {

        PersonForm form = personFormFromParams(request.getParams());

        logger.info("BBB " + form);
        List<Person> people = personDao.list(form);

        // TODO - rewrite
        int totalSize = people.size();
        if (request.getPage() != null && request.getLimit() != null) {
            int start = (request.getPage() - 1) * request.getLimit();
            int end = Math.min(totalSize, start + request.getLimit());
        }

        return new ExtDirectStoreReadResult<Person>(totalSize, people, true);
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public Person createPerson(Person person) {
        return personDao.insert(person);
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public Person updatePerson(Person person) {
        int numUpdated = personDao.update(person);
        return (numUpdated > 0) ? person : null;
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public void deletePerson(Person person) {
        personDao.delete(person);
    }

    @Transactional(readOnly = true)
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Contact> loadContacts(ExtDirectStoreReadRequest request) throws Exception {

        Contact form = contactFormFromParams(request.getParams());

        logger.info("BBB " + form);
        List<Contact> contacts = contactDao.list(form);

        // TODO - rewrite
        int totalSize = contacts.size();
        if (request.getPage() != null && request.getLimit() != null) {
            int start = (request.getPage() - 1) * request.getLimit();
            int end = Math.min(totalSize, start + request.getLimit());
        }

        return new ExtDirectStoreReadResult<Contact>(totalSize, contacts, true);
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public Contact createContact(Contact contact) {
        return contactDao.insert(contact);
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public Contact updateContact(Contact contact) {
        int numUpdated = contactDao.update(contact);
        return (numUpdated > 0) ? contact : null;
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public void deleteContact(Contact contact) {
        contactDao.delete(contact);
    }

    private PersonForm personFormFromFilters(List<Filter> filters) throws Exception {

        PersonForm form = new PersonForm();

        for (Filter filter : filters) {
            String value = ((StringFilter) filter).getValue();
            String key = filter.getField();
            logger.info("personFormFromFilters '" + key + "' '" + value + "'");
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    private PersonForm personFormFromParams(Map<String, Object> params) throws Exception {

        PersonForm form = new PersonForm();

        for (Entry<String, Object> p : params.entrySet()) {
            String key = p.getKey();
            Object value = p.getValue();
            if (value == null || ((value instanceof String) && ((String) value).length() == 0))
                continue;
            logger.info("personFormFromParams '" + key + "' '" + value + "' '" + value.getClass() + "'");
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    private Contact contactFormFromFilters(List<Filter> filters) throws Exception {

        Contact form = new Contact();

        for (Filter filter : filters) {
            String value = ((StringFilter) filter).getValue();
            String key = filter.getField();
            logger.info("personFormFromFilters '" + key + "' '" + value + "'");
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    private Contact contactFormFromParams(Map<String, Object> params) throws Exception {

        Contact form = new Contact();

        for (Entry<String, Object> p : params.entrySet()) {
            String key = p.getKey();
            Object value = p.getValue();
            if (value == null || ((value instanceof String) && ((String) value).length() == 0))
                continue;
            logger.info("personFormFromParams '" + key + "' '" + value + "' '" + value.getClass() + "'");
            if ("personId".equals(key)) {
                form.setPerson(new Person());
                beanUtilsBean.setProperty(form.getPerson(), "id", value);
            } else {
                beanUtilsBean.setProperty(form, key, value);
            }
        }

        return form;
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
