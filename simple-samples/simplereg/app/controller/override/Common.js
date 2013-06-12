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
            "#reload": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("page").reload();
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
            "#people #open-person": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("person-select").openSelected();
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
                    Ext.getCmp("contact-create").show();
                }
            },
            "#update-contact": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("contact-update").show();
                }
            },
            "#delete-contact": {
                click: function(button, e, eOpts) {
                    Ext.getCmp("contact-delete").show();
                }
            }
        });
    }
});
