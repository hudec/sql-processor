package org.sqlproc.sample.simple.model;

import java.util.List;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class Person {

    private Long id;
    private String name;
    private List<Contact> contacts;
    private List<Media> library;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Media> getLibrary() {
        return library;
    }

    public void setLibrary(List<Media> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", contacts=" + contacts + ", library=" + library + "]";
    }
}
