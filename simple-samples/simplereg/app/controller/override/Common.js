/**
 * Static application methods
 */
Ext.ns("Simplereg");

Ext.applyIf(Simplereg, {

    /**
     * Person title (name, date...)
     */
    getPersonTitle: function(record, prefix) {
        if (record && record.data) {
            var text = [], value;
            prefix = prefix || "";
            text.push(record.data[prefix + "firstName"] + " " + record.data[prefix + "lastName"]);
            if (value = record.data[prefix + "ssn"]) {
                text.push(value);
            }
            else if (value = record.data[prefix + "dateOfBirth"]) {
                text.push(Ext.util.Format.date(value, "d.m.Y"));
            }
            return text.join(", ");
        }
    },

    /**
     * Contact title (address, country...)
     */
    getContactTitle: function(record) {
        if (record && record.data) {
            var text = [];
            text.push(record.data.address);
            text.push(record.data.countryCode);
            return text.join(", ");
        }
    }
});

/**
 * Get plain HTML form...
 */
Ext.override(Ext.form.Panel, {
    getPlainForm: function() {
        var values = this.getValues(), name, field,
                form = document.createElement("form");
        for (name in values) {
            field = document.createElement("input");
            field.name = name;
            field.value = values[name];
            form.appendChild(field);
        }
        return form;
    }
});

Ext.define("Simplereg.controller.override.Common", {
    override: "Simplereg.controller.Common",

//TODO: better/right way?
    resetComboboxFilter: function() {
        if (this.is("combobox")) {
            var value = this.getValue();
            this.reset();
            this.setValue(value);
        }
    },

    init: function(application) {

        // Document title
        document.defaultTitle = application.title + " " + application.version;
        document.title = document.defaultTitle;

        this.control({
            "#page": {
                beforerender: function(component, eOpts) {
                    component.init();
                }
            },
            "personselect": {
                beforerender: function(component, eOpts) {
                    component.init();
                }
            },
            "persondetail": {
                beforerender: function(component, eOpts) {
                    //component.init();
                },
                afterrender: function(component, eOpts) {
                    component.reload();
                },
                removed: function(component, ownerCmp, eOpts) {
                    var manager = Ext.data.StoreManager;
                    manager.unregister(component.id);
                    manager.unregister(component.id + "Relatives");
                    manager.unregister(component.id + "Contacts");
                }
            },
            "#date": {
//TODO: mixin formating date display field
                beforerender: function(component, eOpts) {
                    component.renderer = function(value) {
                        return Ext.util.Format.date(value, "d.m.Y");
                    };
                }
            },
            "combobox": {
                blur: function(component, e, eOpts) {
                    this.resetComboboxFilter.call(component);
                }
            },
            "#pages": {
                beforetabchange: function(tabPanel, newCard, oldCard, eOpts) {
                    if (newCard.is("persondetail")) {
                        document.title = newCard.title;
                    }
                    else {
                        document.title = document.defaultTitle;
                    }
                }
            },
            "tool#reload": {
                click: function(tool, e, eOpts) {
                    var panel = tool.up("panel");
                    if (panel.reload) {
                        panel.reload();
                    }
                    return false;
                }
            },
            "#reload": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").reload();
                }
            },
            "#dialog": {
                beforehide: function(component, eOpts) {
                    var form = component.down("form");
                    if (form) {
                        form = form.getForm();
                        form.clearInvalid();
                        form.getFields().each(this.resetComboboxFilter);
                    }
                }
            },
            "#reset": {
                click: function(button, e, eOpts) {
                    button.up("form").getForm().reset();
                }
            },
            "#cancel": {
                click: function(button, e, eOpts) {
                    button.up("window").close();
                }
            },
            "#submit": {
                click: function(button, e, eOpts) {
                    button.up("window").submit(); //submit dialog window
                }
            },
            "#close": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").closeActive();
                }
            },
            "#close-all": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").closeAll(true);
                }
            },
            "#close-other": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").closeAll(false);
                }
            },
            "#search-person": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("person-search").show();
                }
            },
            "#search-all-people": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("person-select").search();
                }
            },
            "#people": {
                itemdblclick: function(dataview, record, item, index, e, eOpts) {
                    var page = Ext.getCmp("page");
                    page.openPersonDetail(record.data.id, record);
                }
            },
            "#people #open": {
                click: function(button, e, eOpts) {
                    var record = button.up("#people").getSelectionModel().getSelection()[0];
                    if (record) {
                        var page = Ext.getCmp("page");
                        page.openPersonDetail(record.data.id, record);
                    }
                }
            },
            "#create-person": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("person-create").show();
                }
            },
            "#update-person": {
                click: function(button, e, eOpts) {
                    return this.managePerson("person-update", button, e, eOpts);
                }
            },
            "#delete-person": {
                click: function(button, e, eOpts) {
                    return this.managePerson("person-delete", button, e, eOpts);
                }
            },
            "#relatives": {
                itemdblclick: function(dataview, record, item, index, e, eOpts) {
                    var page = Ext.getCmp("page");
                    page.openPersonDetail(record.data["relPerson.id"]);
                }
            },
            "#relatives #open": {
                click: function(button, e, eOpts) {
                    var record = button.up("#relatives").getSelectionModel().getSelection()[0];
                    if (record) {
                        var page = Ext.getCmp("page");
                        page.openPersonDetail(record.data["relPerson.id"]);
                    }
                }
            },
            "#create-relative": {
                click: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("relative-create"),
                            person = button.up("persondetail").record,
                            record = Ext.create("Simplereg.model.PersonIdentity", {
                                personId: person.data.id,
                                version: person.data.version
                            });
                    dialog.down("form").loadRecord(record);
                    dialog.show();
                }
            },
            "#relatives #update-relative": {
                click: function(button, e, eOpts) {
                    return this.manageRelative("relative-update", button, e, eOpts);
                }
            },
            "#relatives #delete-relative": {
                click: function(button, e, eOpts) {
                    return this.manageRelative("relative-delete", button, e, eOpts);
                }
            },
            "#contacts": {
                itemdblclick: function(dataview, record, item, index, e, eOpts) {
                    var dialog = Ext.getCmp("contact-update"),
                            form = dialog.down("form");
                    form.loadRecord(record);
                    dialog.show();
                }
            },
            "#create-contact": {
                click: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("contact-create"),
                            person = button.up("persondetail").record,
                            record = Ext.create("Simplereg.model.PersonIdentity", {
                                personId: person.data.id
                            });
                    dialog.down("form").loadRecord(record);
                    dialog.show();
                }
            },
            "#contacts #update-contact": {
                click: function(button, e, eOpts) {
                    return this.manageContact("contact-update", button, e, eOpts);
                }
            },
            "#contacts #delete-contact": {
                click: function(button, e, eOpts) {
                    return this.manageContact("contact-delete", button, e, eOpts);
                }
            }
        });
    },

    /**
     * Update/delete person
     */
    managePerson: function(d, button, e, eOpts) {
        var dialog = Ext.getCmp(d),
                record = button.up("persondetail").record,
                form = dialog.down("form");
        form.loadRecord(record);
        dialog.show();
    },

    /**
     * Update/delete relative
     */
    manageRelative: function(d, button, e, eOpts) {
        var record = button.up("#relatives").getSelectionModel().getSelection()[0];
        if (record) {
            var dialog = Ext.getCmp(d),
                    form = dialog.down("form");
            form.loadRecord(record);
            dialog.show();
        }
    },

    /**
     * Update/delete contact
     */
    manageContact: function(d, button, e, eOpts) {
        var record = button.up("#contacts").getSelectionModel().getSelection()[0];
        if (record) {
            var dialog = Ext.getCmp(d),
                    form = dialog.down("form");
            form.loadRecord(record);
            dialog.show();
        }
    }
});
