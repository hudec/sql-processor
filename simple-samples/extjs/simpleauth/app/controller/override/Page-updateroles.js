//TODO: reset selection on load (reload record)

Ext.define("Ext.grid.column.Text", {
    override: "Ext.grid.column.Column",
    /*
    alias: ['widget.textcolumn'],
    alternateClassName: 'Ext.grid.TextColumn',
    */

    defaultRenderer: function(value) {
        return Ext.String.htmlEncode(value);
    }
});

/**
 * Match two fields (passwords)
 */
Ext.apply(Ext.form.VTypes, {
    matchText: "Confirmation does not match intial value",
    match: function(value, field) {
        var field1 = field.up("form").getForm().findField(field.matchFieldName);
        return field1 && field1 != field ? field1.getValue() == value : true;
    }
});

// Mark invalid fields...
//proc to sakra funguje i bez initializace? ...isEnabled() = false
//Ext.QuickTips.init();

Ext.define('Simpleauth.controller.override.Page', {
    override: 'Simpleauth.controller.Page',

    init: function(application) {

        // Document title
        document.title = document.defaultTitle
                = application.title + " " + application.version;

        // Handle application events
        application.on({
            quit: function() {
                var msg = "Do you really want to quit " + application.title + " application?";
                Ext.MessageBox.confirm("Quit Application", msg, function(response) {
                    if (response == "yes") {
                        Ext.getCmp("Page").destroy();
                        document.title = "";
                        window.close();
                    }
                });
            }
        });

        // Handle view events
        this.control({
            "combobox": {
                blur: function(component, e, eOpts) {
                    this.resetComboboxFilter.call(component);
                }
            },
            "#dialog": {
                beforehide: function(component, eOpts) {
                    var form = component.down("form");
                    component.focus(); //blur fields...
                    if (form) {
                        form = form.getForm();
                        form.clearInvalid();
                        form.getFields().each(this.resetComboboxFilter);
                    }
                },
                afterrender: function(component, eOpts) {
                    var form = component.down("form").getForm();
                    component.getEl().on("keyup", function(e) { //submit on ctrl-enter
                        if (e.ctrlKey && e.getKey() == e.ENTER) {
                            if (form.isValid()) {
                                var msg = "Are you sure you are ready to submit this request?";
                                Ext.MessageBox.confirm("Submit request", msg, function(response) {
                                    if (response == "yes") {
                                        form.submit(); 
                                    }
                                });
                            }
                        }
                    });
                }
            },
            "#dialog form": {
                validitychange: function(basic, valid, eOpts) {
//TODO
                },
                beforeaction: function(basic, action, eOpts) {
                    if (!action.form.isValid()) { //stop action...
                        return false;
                    }
                    var dialog = action.form.owner.up("#dialog");
                    dialog.mask("Processing...");
                },
                actioncomplete: function(basic, action, eOpts) {
                    var dialog = action.form.owner.up("#dialog");
                    if (dialog.store) { //reload assigned store...
                        dialog.store.reload();
                    }
                    dialog.unmask();
                    dialog.close();
                },
                actionfailed: function(basic, action, eOpts) {
                    var dialog = action.form.owner.up("#dialog");
                    dialog.unmask();
                }
            },
            "#dialog button[action=submit]": {
                click: function(target, e, eOpts) {
                    target.up("window").down("form").getForm().submit();
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
            "menuitem[action=quit]": {
                click: function(item, e, eOpts) {
                    application.fireEvent("quit");
                }
            },
            "grid button[action=create]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid");
                    grid.fireEvent(target.action, grid);
                }
            },
            "grid button[action=update], grid button[action=delete]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid"),
                            record = grid.getSelectionModel().getSelection()[0];
                    if (record) {
                        grid.fireEvent(target.action, grid, record);
                    }
                }
            },
            "grid tool[type=refresh]": {
                click: function(tool, e, eOpts) {
                    var grid = tool.up("grid"), store = grid.getStore();
                    if (store.proxy.extraParams && store.proxy.extraParams.authUserId > -1) {
                        store.reload();
                    }
                }
            },
            "grid": {
                beforerender: function(component, eOpts) {
                    component.store.on({
                        load: function() {
                            var args = [component].concat([].slice.call(arguments));
                            component.fireEventArgs("load", args);
                        }
                    });
                }
            },
            "#Users": {
                create: function(grid, record) {
                    return this.dialog("UserCreate", grid, record);
                },
                update: function(grid, record) {
                    record = record.copy(); //empty password (keep current)
                    record.set("password", "");
                    record.commit();
                    return this.dialog("UserUpdate", grid, record);
                },
                "delete": function(grid, record) {
                    return this.dialog("UserDelete", grid, record);
                },
                selectionchange: function(view, selections, options) {
                    this.loadUserRoles(selections[0]);
                },
                load: function(grid) {
                    this.loadUserRoles(grid.getSelectionModel().getSelection()[0]);
                }
            },
            "#UserRoleList button[action=updateroles]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid");
                            params = grid.store.proxy.extraParams;
                    if (params.authUserId != undefined) {
                        grid.fireEvent(target.action, grid, params);
                    }
                }
            },
            "#UserRoleList": {
                updateroles: function(grid, params) {
                    return this.dialog("UserRolesUpdate", grid, params);
                },
            },
            "#Roles": {
                create: function(grid, record) {
                    return this.dialog("RoleCreate", grid, record);
                },
                update: function(grid, record) {
                    return this.dialog("RoleUpdate", grid, record);
                },
                "delete": function(grid, record) {
                    return this.dialog("RoleDelete", grid, record);
                },
                load: function() {
                    Ext.getCmp("UserRoleList").store.reload();
                }
            }
        });
    },

    loadUserRoles: function(selected) {
        if (selected && selected.data) {
            var store = Ext.getCmp("UserRoleList").getStore();
            store.proxy.extraParams.authUserId = selected.data.id;
            store.load();
        }
    },

    resetComboboxFilter: function() {
        if (this.is("combobox")) {
            var value = this.getValue();
            this.reset();
            this.setValue(value);
        }
    },

    dialog: function(name, grid, record) {
        var dialog = Ext.getCmp(name);
        if (!dialog) { //create dialog...
            dialog = Ext.create("Simpleauth.view." + name);
        }
        if (grid) { //assign store
            dialog.store = grid.getStore();
        }
        if (record) { //load record
            dialog.down("form").loadRecord(record);
        }
        dialog.show();
    }
});

