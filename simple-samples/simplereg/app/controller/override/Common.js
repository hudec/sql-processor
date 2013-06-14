/**
 * Get plain HTML form...
 */
Ext.form.Panel.prototype.getInputForm = function() {
    var values = this.getValues(), name, field,
            form = document.createElement("form");
    for (name in values) {
        field = document.createElement("input");
        field.name = name;
        field.value = values[name];
        form.appendChild(field);
    }
    return form;
};

Ext.define("Simplereg.controller.override.Common", {
    override: "Simplereg.controller.Common",

    resetComboboxFilter: function() {
        if (this.is("combobox")) {
            this.lastQuery = null;
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
                    manager.unregister(component.id + "-detail");
                    manager.unregister(component.id + "-contacts");
                }
            },
            "combobox": {
                blur: function(component, e, eOpts) {
                    this.resetComboboxFilter.call(component);
                },
                beforequery: function(queryPlan, eOpts) {
                    if (queryPlan.query == "") { //allow leave empty...
                        queryPlan.combo.setValue("");
                    }
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
            "#reload": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").reload();
                }
            },
            "#dialog": {
                beforeshow: function(component, eOpts) {
                    var form = component.down("form");
                    if (form) {
                        form = form.getForm(), fields = form.getFields();
                        form.clearInvalid();

                        fields.each(this.resetComboboxFilter);
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
                    //TODO
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
                itemdblclick: function(button, e, eOpts) {
                    var record = button.up("#people").getSelectionModel().getSelection()[0],
                            page = Ext.getCmp("page");
                    page.openPersonDetail(record.data.id, record);
                }
            },
            "#contacts": {
                itemdblclick: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("contact-update"),
                            record = button.up("#contacts").getSelectionModel().getSelection()[0];
                    dialog.down("form").loadRecord(record);
                    dialog.show();
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
                    var dialog = Ext.getCmp("person-update"),
                            record = button.up("persondetail").record;
                    dialog.down("form").loadRecord(record);
                    dialog.show();
                }
            },
            "#delete-person": {
                click: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("person-delete"),
                            record = button.up("persondetail").record;
                    dialog.down("form").loadRecord(record);
                    dialog.show();
                }
            },
            "#create-contact": {
                click: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("contact-create"),
                            id = button.up("persondetail").record.data.id;
//TODO: better way, but record create fails :(
                    dialog.down("#reset").personId = id;
                    dialog.down("form").getForm().findField("personId").setValue(id);
                    /*
                    record = Ext.data.Record.create([{ name: "personId", defaultValue: id }]);
                    dialog.down("form").loadRecord(record);
                    */
                    dialog.show();
                }
            },
            "#contacts #update-contact": {
                click: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("contact-update"),
                            record = button.up("#contacts").getSelectionModel().getSelection()[0];
                    if (record) {
                        dialog.down("form").loadRecord(record);
                        dialog.show();
                    }
                }
            },
            "#contacts #delete-contact": {
                click: function(button, e, eOpts) {
                    var dialog = Ext.getCmp("contact-delete"),
                            record = button.up("#contacts").getSelectionModel().getSelection()[0];
                    if (record) {
                        dialog.down("form").loadRecord(record);
                        dialog.show();
                    }
                }
            }
        });
    }
});
