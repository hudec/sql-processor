package org.sample.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.converters.DateConverter;
import org.sample.model.Contact;
import org.sample.model.Person;
import org.sample.web.app.ContactService;
import org.sample.web.app.PersonService;
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

    protected ContactService contactService;
    protected PersonService personService;
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
        dateConverter.setPattern("dd.MM.yyyy");
        beanUtilsBean.getConvertUtils().register(dateConverter, Date.class);

    }

    @Transactional(readOnly = true)
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Person> loadPeople(ExtDirectStoreReadRequest request) throws Exception {

        PersonForm form = personFormFromParams(request.getParams());

        // TODO - build SqlControl for paging
        List<Person> people = personService.listPeople(form, null);

        int totalSize = people.size();
        if (request.getPage() != null && request.getLimit() != null) {
            int start = (request.getPage() - 1) * request.getLimit();
            int end = Math.min(totalSize, start + request.getLimit());
        }

        return new ExtDirectStoreReadResult<Person>(totalSize, people, true);
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Person> createPerson(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            Person p = personService.insertPerson(person);
            if (p != null)
                result.add(p);
        }
        return result;
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Person> updatePerson(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            Person p = personService.updatePerson(person);
            if (p != null)
                result.add(p);
        }
        return result;
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public void deletePerson(List<Person> people) {
        for (Person person : people) {
            personService.deletePerson(person);
        }
    }

    @Transactional(readOnly = true)
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Contact> loadContacts(ExtDirectStoreReadRequest request) throws Exception {

        Contact form = contactFormFromParams(request.getParams());

        // TODO - build SqlControl for paging
        List<Contact> contacts = contactService.listContacts(form, null);

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
    public List<Contact> createContact(List<Contact> contacts) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            Contact c = contactService.insertContact(contact);
            if (c != null)
                result.add(c);
        }
        return result;
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Contact> updateContact(List<Contact> contacts) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            Contact c = contactService.updateContact(contact);
            if (c != null)
                result.add(c);
        }
        return result;
    }

    @Transactional
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public void deleteContact(List<Contact> contacts) {
        for (Contact contact : contacts) {
            contactService.deleteContact(contact);
        }
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
            if ("contacts".equals(key) && value instanceof Boolean && ((Boolean) value))
                form.setInit(Person.Association.contacts);
            else
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
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @Required
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
