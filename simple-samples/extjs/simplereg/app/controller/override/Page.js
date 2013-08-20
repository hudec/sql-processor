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
            value = record.data[prefix + "firstName"] + " " + record.data[prefix + "lastName"];
            text.push(value);
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

Ext.define("Simplereg.controller.override.Page", {
    override: "Simplereg.controller.Page",

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
            "tool[action=reload]": {
                click: function(tool, e, eOpts) {
                    var panel = tool.up("panel");
                    if (panel.reload) {
                        panel.reload();
                    }
                    return false;
                }
            },
            "#page button[action=reload]": {
                click: function(target, e, eOpts) {
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
                },
                show: function(component, eOpts) {
                    Ext.getCmp("page").windows.push(component);
                },
                hide: function(component, eOpts) {
                    Ext.getCmp("page").windows.pop();
                }
            },
            "#dialog button[action=reset]": {
                click: function(target, e, eOpts) {
                    target.up("window").down("form").getForm().reset();
                }
            },
            "#dialog button[action=cancel]": {
                click: function(target, e, eOpts) {
                    target.up("window").close();
                }
            },
            "#dialog button[action=accept]": {
                click: function(target, e, eOpts) {
                    target.up("window").submit(); //submit dialog window
                }
            },
            "menuitem[action=simpleauth]": {
                click: function(item, e, eOpts) {
                    var url = item.href || window.location.href.replace(/simple-gui/, "simple-auth");
                    window.open(url, item.hrefTarget);
                }
            },
            "menuitem[action=quit]": {
                click: function(item, e, eOpts) {
                    var msg = "Do you really want to quit " + application.title + " application?";
                    Ext.MessageBox.confirm("Quit Application", msg, function(response) {
                        if (response == "yes") {
                            Ext.getCmp("page").destroy();
                            document.title = "";
                            window.close();
                        }
                    });
                }
            },
            "button[action=close]": {
                click: function(target, e, eOpts) {
                    Ext.getCmp("page").closeActive();
                }
            },
            "button[action=close-all], menuitem[action=close-all]": {
                click: function(target, e, eOpts) {
                    Ext.getCmp("page").closeAll(true);
                }
            },
            "menuitem[action=close-other]": {
                click: function(target, e, eOpts) {
                    Ext.getCmp("page").closeAll(false);
                }
            },
            "button[action=search]": {
                click: function(target, e, eOpts) {
                    Ext.getCmp("person-search").show();
                }
            },
            "menuitem[action=search-all]": {
                click: function(target, e, eOpts) {
                    Ext.getCmp("person-select").search();
                }
            },
            "#people": {
                itemdblclick: function(dataview, record, item, index, e, eOpts) {
                    var page = Ext.getCmp("page");
                    page.openPersonDetail(record.data.id, record);
                }
            },
            "#main button[action=create]": {
                click: function(target, e, eOpts) {
                    Ext.getCmp("person-create").show();
                }
            },
            "#data button[action=update]": {
                click: function(target, e, eOpts) {
                    return this.managePerson("person-update", target, e, eOpts);
                }
            },
            "#main button[action=delete]": {
                click: function(target, e, eOpts) {
                    return this.managePerson("person-delete", target, e, eOpts);
                }
            },
            "#relatives": {
                itemdblclick: function(dataview, record, item, index, e, eOpts) {
                    var page = Ext.getCmp("page");
                    page.openPersonDetail(record.data["relPerson.id"]);
                }
            },
            "#relatives button[action=create]": {
                click: function(target, e, eOpts) {
                    var dialog = Ext.getCmp("relative-create"),
                            person = target.up("persondetail").record,
                            record = Ext.create("Simplereg.model.PersonIdentity", {
                                personId: person.data.id,
                                version: person.data.version
                            });
                    dialog.down("form").loadRecord(record);
                    dialog.show();
                }
            },
            "#relatives button[action=update]": {
                click: function(target, e, eOpts) {
                    return this.manageRelative("relative-update", target, e, eOpts);
                }
            },
            "#relatives button[action=delete]": {
                click: function(target, e, eOpts) {
                    return this.manageRelative("relative-delete", target, e, eOpts);
                }
            },
            /*
            "#contacts": {
                itemdblclick: function(dataview, record, item, index, e, eOpts) {
                    var dialog = Ext.getCmp("contact-update"),
                            form = dialog.down("form");
                    form.loadRecord(record);
                    dialog.show();
                }
            },
            */
            "#contacts button[action=create]": {
                click: function(target, e, eOpts) {
                    var dialog = Ext.getCmp("contact-create"),
                            person = target.up("persondetail").record,
                            record = Ext.create("Simplereg.model.PersonIdentity", {
                                personId: person.data.id
                            });
                    dialog.down("form").loadRecord(record);
                    dialog.show();
                }
            },
            "#contacts button[action=update]": {
                click: function(target, e, eOpts) {
                    return this.manageContact("contact-update", target, e, eOpts);
                }
            },
            "#contacts button[action=delete]": {
                click: function(target, e, eOpts) {
                    return this.manageContact("contact-delete", target, e, eOpts);
                }
            }
        });
    },

    /**
     * Update/delete person
     */
    managePerson: function(d, target, e, eOpts) {
        var dialog = Ext.getCmp(d),
                record = target.up("persondetail").record,
                form = dialog.down("form");
        form.loadRecord(record);
        dialog.show();
    },

    /**
     * Update/delete relative
     */
    manageRelative: function(d, target, e, eOpts) {
        var record = target.up("#relatives").getSelectionModel().getSelection()[0];
        if (record) {
            var dialog = Ext.getCmp(d),
                    person = target.up("persondetail").record,
                    form = dialog.down("form");

            // Use master person version
            record = record.copy();
            record.set("version", person.data.version);
            record.commit();

            form.loadRecord(record);
            dialog.show();
        }
    },

    /**
     * Update/delete contact
     */
    manageContact: function(d, target, e, eOpts) {
        var record = target.up("#contacts").getSelectionModel().getSelection()[0];
        if (record) {
            var dialog = Ext.getCmp(d),
                    form = dialog.down("form");
            form.loadRecord(record);
            dialog.show();
        }
    }
});
