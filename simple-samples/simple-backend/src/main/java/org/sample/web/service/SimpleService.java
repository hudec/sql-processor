package org.sample.web.service;

import java.util.List;

import javax.validation.Valid;

import org.sample.model.Contact;
import org.sample.model.Country;
import org.sample.model.Person;
import org.sample.web.app.ContactService;
import org.sample.web.app.CountryService;
import org.sample.web.app.PersonService;
import org.sample.web.form.CountHolder;
import org.sample.web.form.PersonForm;
import org.sample.web.util.BeanExtJsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.sqlproc.engine.impl.SqlStandardControl;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;
import ch.ralscha.extdirectspring.bean.ExtDirectFormPostResult;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadRequest;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadResult;

@Service
public class SimpleService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected ContactService contactService;
    protected PersonService personService;
    protected CountryService countryService;
    protected BeanExtJsUtils beanUtils;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Person> loadPeople(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("listPeople -> " + request);

        PersonForm form = beanUtils.buildFormFromParams(request.getParams(), PersonForm.class);
        SqlStandardControl sqlControl = (form.getId() == null) ? beanUtils.buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null)
            beanUtils.buildSortFromParams(Person.class, sqlControl, request.getSorters());
        logger.info("loadPeople control " + sqlControl);

        CountHolder count = new CountHolder();
        List<Person> people = personService.listPeople(form, sqlControl, count);

        ExtDirectStoreReadResult<Person> result = new ExtDirectStoreReadResult<Person>(new Long(count.getCount()),
                people, true);
        logger.info("listPeople <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult createPerson(@Valid Person person, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        Person resultPerson = null;
        if (!result.hasErrors()) {
            resultPerson = personService.insertPerson(person);
        }
        if (resultPerson != null) {
            postResult.addResultProperty("id", resultPerson.getId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult updatePerson(@Valid Person person, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        Person resultPerson = null;

        if (!result.hasErrors()) {
            person.setNull(Person.Attribute.ssn);
            person.setNull(Person.Attribute.dateOfBirth);
            resultPerson = personService.updatePerson(person);

            if (resultPerson == null)
                throw new RuntimeException("The record has been in the meantime modified");

            postResult.addResultProperty("id", resultPerson.getId());
            postResult.addResultProperty("version", resultPerson.getVersion());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult deletePerson(Person person, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        Person resultPerson = null;

        if (!result.hasErrors()) {
            if (person.getId() != null) {
                resultPerson = personService.deletePerson(person);
                if (resultPerson == null)
                    throw new RuntimeException("The record has been in the meantime modified");
                postResult.addResultProperty("id", resultPerson.getId());
            }
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Contact> loadContacts(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("loadContacts -> " + request);

        Contact form = beanUtils.buildFormFromParams(request.getParams(), Contact.class);
        SqlStandardControl sqlControl = (form.getId() == null) ? beanUtils.buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null)
            beanUtils.buildSortFromParams(Contact.class, sqlControl, request.getSorters());
        logger.info("loadContacts control " + sqlControl);

        CountHolder count = new CountHolder();
        List<Contact> contacts = contactService.listContacts(form, sqlControl, count);

        ExtDirectStoreReadResult<Contact> result = new ExtDirectStoreReadResult<Contact>(new Long(count.getCount()),
                contacts, true);
        logger.info("loadContacts <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult createContact(@Valid Contact contact, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        Contact resultContact = null;
        if (!result.hasErrors()) {
            resultContact = contactService.insertContact(contact);
        }
        if (resultContact != null) {
            postResult.addResultProperty("id", resultContact.getId());
            postResult.addResultProperty("personId", contact.getPersonId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult updateContact(@Valid Contact contact, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        Contact resultContact = null;
        if (!result.hasErrors()) {
            contact.setNull(Contact.Attribute.phoneNumber);
            resultContact = contactService.updateContact(contact);

            if (resultContact == null)
                throw new RuntimeException("The record has been in the meantime modified");

            postResult.addResultProperty("id", resultContact.getId());
            postResult.addResultProperty("version", resultContact.getVersion());
            postResult.addResultProperty("personId", contact.getPersonId());

        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult deleteContact(Contact contact, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        Contact resultContact = null;
        if (!result.hasErrors()) {
            if (contact.getId() != null) {
                resultContact = contactService.deleteContact(contact);
                postResult.addResultProperty("id", resultContact.getId());
                postResult.addResultProperty("personId", contact.getPersonId());
            }
            if (resultContact == null)
                throw new RuntimeException("The record has been in the meantime modified");
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Country> loadCountries(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("loadCountries -> " + request);

        Country form = beanUtils.buildFormFromParams(request.getParams(), Country.class);
        SqlStandardControl sqlControl = (form.getId() == null) ? beanUtils.buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null)
            beanUtils.buildSortFromParams(Country.class, sqlControl, request.getSorters());
        logger.info("loadCountries control " + sqlControl);

        CountHolder count = new CountHolder();
        List<Country> contacts = countryService.listCountries(form, sqlControl, count);

        ExtDirectStoreReadResult<Country> result = new ExtDirectStoreReadResult<Country>(new Long(count.getCount()),
                contacts, true);
        logger.info("loadCountries <- " + result);
        return result;
    }

    @Required
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @Required
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Required
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @Required
    public void setBeanUtils(BeanExtJsUtils beanUtils) {
        this.beanUtils = beanUtils;
    }

}
