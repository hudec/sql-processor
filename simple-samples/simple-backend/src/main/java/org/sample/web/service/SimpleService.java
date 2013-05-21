package org.sample.web.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

@Service
public class SimpleService {

    protected ContactDao contactDao;
    protected PersonDao personDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Person> loadPeople(ExtDirectStoreReadRequest request) throws Exception {

        PersonForm form = new PersonForm();
        Map<String, Object> parameters = request.getParams();

        BeanUtilsBean beanUtilsBean = new BeanUtilsBean(new ConvertUtilsBean() {
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

        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            beanUtilsBean.setProperty(form, entry.getKey(), entry.getValue());
        }

        List<Person> people = personDao.list(form);
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
