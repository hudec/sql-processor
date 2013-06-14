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

    init: function(application) {
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
                }
            },
            "#country": {
                beforequery: function(queryPlan, eOpts) {
                    var value = queryPlan.query, field = queryPlan.combo,
                            name = value.length > 1 && value == value.toUpperCase() ? "code" : "name";
                    field.store.clearFilter();
                    field.store.filter(name, value);
                }
            },
            "#reload": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").reload();
                }
            },
            "window": {
                close: function(panel, eOpts) {
                    var form = panel.down("form");
                    if (form) {
                        form.getForm().clearInvalid();
//TODO: clear filter for all...
                        var field = form.down("#country");
                        if (field) {
                            field.store.clearFilter();
                        }
                    }
                }
            },
            "#reset": {
                click: function(button, e, eOpts) {
//TODO: exclude readonly fields from reset
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
                            record = button.up("persondetail").record;
                    dialog.down("form").getForm().findField("personId").setValue(record.data.id);
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
