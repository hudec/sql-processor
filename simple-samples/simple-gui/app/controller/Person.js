Ext.define('SimpleWeb.controller.Person', {
    extend : 'Ext.app.Controller',

    statics : {
        setData : function(record, view) {
            var key, field;
            for (key in record.data) {
                field = view.down("#" + key);
                if (field) {
                    field.setValue(record.data[key]);
                }
            }
        }
    },

    init : function() {

        Ext.create("SimpleWeb.view.person.Search");
        Ext.create("SimpleWeb.view.person.Edit");
        Ext.create("SimpleWeb.view.person.Add");
        Ext.create("SimpleWeb.view.person.Delete");
        Ext.create("SimpleWeb.view.contact.Add");

        this.control({
            "#cancel_dialog" : {
                click : this.onCancelDialogClick
            },
            "#person_list" : {
                itemdblclick : this.onPersonListDblClick
            },
            "#modify_person" : {
                click : this.onModifyPersonClick
            },
            "#accept_modify_person" : {
                click : this.onAcceptModifyPersonClick
            },
            "#add_person" : {
                click : this.onAddPersonClick
            },
            "#accept_add_person" : {
                click : this.onAcceptAddPersonClick
            },
            "#delete_person" : {
                click : this.onDeletePersonClick
            },
            "#accept_delete_person" : {
                click : this.onAcceptDeletePersonClick
            },
            "#search_person" : {
                click : this.onSearchPersonClick
            },
            "#accept_search_person" : {
                click : this.onAcceptSearchPersonClick
            },
            "#all_person" : {
                click : this.onAllPersonClick
            },
            "#add_contact" : {
                click : this.onAddContactClick
            },
            "#accept_add_contact" : {
                click : this.onAcceptAddContactClick
            },
            "#clear_dialog" : {
                click : this.onClearDialogClick
            },
            "#refresh_person" : {
                click : this.onRefreshPersonClick
            },
        });
    },

    onCancelDialogClick : function(button, e, eOpts) {
        console.log("onCancelDialogClick");
        button.up("window").close();
    },

    onPersonListDblClick : function(dataview, record, item, index, e, eOpts) {
        console.log("onPersonListDblClick");
        this.buildDetails(record);
    },

    buildDetails : function(record) {
        console.log("buildDetails");
        var panel = Ext.getCmp("PersonRegistry");
        var id = "person" + record.data.id;

        var uniqueStore = Ext.data.StoreManager.lookup(id);
        if (!uniqueStore) {
            uniqueStore = Ext.create("SimpleWeb.store.People", {
                storeId : id
            });
            console.log("new store");
            console.log(uniqueStore);
        } else {
            console.log("old store");
        }

        uniqueStore.load({
            params : {
                id : record.data.id,
                contacts : true
            },
            scope : this,
            callback : function(records, operation, success) {
                console.log(records);
                var person = records[0];
                console.log("loaded person");
                console.log(person);
                console.log(person.contacts());
                this.showDetails(id, person, panel);
            }
        });

    },

    showDetails : function(id, record, panel) {
        console.log("showDetails");
        // Get tab
        var view = panel.child("#" + id);
        if (!view) {
            console.log("new details");
            view = Ext.create("SimpleWeb.view.person.Details", {
                store : record.contacts(),
                itemId : id,
                closable : true
            });
            panel.add(view);
        } else {
            console.log("old details");
        }

        // Set title
        var title = record.data.firstName + " " + record.data.lastName;
        if (record.data.ssn)
            title += " | " + record.data.ssn;
        view.setTitle(title);

        // Set data
        SimpleWeb.controller.Person.setData(record, view);

        // Reference...
        view.record = record;
        // Finish
        panel.setActiveTab(view);
    },

    onModifyPersonClick : function(button, e, eOpts) {
        console.log("onModifyPersonClick");
        var dialog = Ext.getCmp("PersonModify");
        var form = dialog.down("form");
        var el = button;

        while (el = el.up()) {
            if (el.record) {
                form.loadRecord(el.record);
                dialog.show();
                break;
            }
        }
    },

    onAcceptModifyPersonClick : function(button, e, eOpts) {
        console.log("onAcceptModifyPersonClick");
        var dialog = Ext.getCmp("PersonModify");
        var form = dialog.down("form");
        var person = form.getRecord();
        var values = form.getValues();

        if (form.getForm().isValid()) {
            console.log("modify");
            console.log(values);
            person.set(values);
            person.save({
                scope : this,
                callback : function(record, operation, success) {
                    console.log(record);
                    this.doGridRefresh();
                    dialog.close();
                    var panel = Ext.getCmp("PersonRegistry");
                    var id = "person" + record.data.id;
                    var view = panel.child("#" + id);
                    SimpleWeb.controller.Person.setData(record, view);
                }
            });
        }
    },

    onAddPersonClick : function(button, e, eOpts) {
        console.log("onAddPersonClick");
        Ext.getCmp("PersonAdd").show();
    },

    onAcceptAddPersonClick : function(button, e, eOpts) {
        console.log("onAcceptAddPersonClick");
        var dialog = Ext.getCmp("PersonAdd");
        var form = dialog.down("form");
        var values = form.getValues();

        if (form.getForm().isValid()) {
            console.log("add, valid");
            console.log(values);
            var newPerson = this.getModel("Person").create(values);
            newPerson.save({
                scope : this,
                callback : function(record, operation, success) {
                    console.log(record);
                    this.doGridRefresh();
                    dialog.close();
                    this.buildDetails(record);
                }
            });
        }
    },

    onDeletePersonClick : function(button, e, eOpts) {
        console.log("onDeletePersonClick");
        var dialog = Ext.getCmp("PersonDelete");
        var form = dialog.down("form");
        var el = button;

        while (el = el.up()) {
            if (el.record) {
                form.loadRecord(el.record);
                dialog.show();
                break;
            }
        }
    },

    onAcceptDeletePersonClick : function(button, e, eOpts) {
        console.log("onAcceptDeletePersonClick");
        var dialog = Ext.getCmp("PersonDelete");
        var form = dialog.down("form");
        var person = form.getRecord();
        var id = "person" + person.data.id;
        var store = this.getStore("People");
        store.remove(person);
        this.doGridRefresh();
        dialog.close();
        var panel = Ext.getCmp("PersonRegistry");
        var view = panel.child("#" + id);
        view.close();
    },

    onSearchPersonClick : function() {
        console.log("onSearchPersonClick");
        Ext.getCmp("PersonSearch").show();
    },

    onAcceptSearchPersonClick : function(button) {
        console.log("onAcceptSearchPersonClick");
        var dialog = Ext.getCmp("PersonSearch");
        var form = dialog.down('form');
        var store = this.getStore("People");
        console.log(form.getValues());

        store.load({
            params : form.getValues(),
            callback : function(records, operation, success) {
                console.log("onAcceptSearchClick");
                console.log(records);
            },
            scope : this
        });
        dialog.close();
    },

    onAllPersonClick : function(button) {
        console.log("onAllPersonClick");
        var store = this.getStore("People");

        store.load({
            callback : function(records, operation, success) {
                console.log("onAcceptSearchClick");
                console.log(records);
            },
            scope : this
        });
    },

    doGridRefresh : function() {
        console.log("doGridRefresh");
        var panel = Ext.getCmp("PersonRegistry");
        var list = panel.down('pagingtoolbar');
        list.doRefresh();
    },

    onAddContactClick : function(button, e, eOpts) {
        console.log("onAddContactClick");
        var dialog = Ext.getCmp("ContactAdd");
        var panel = button.up('panel').up('panel');
        console.log(panel);
        if (panel) {
            var storeId = panel.getItemId();
            console.log(storeId);
            dialog.down("#person_id").setValue(storeId);
            dialog.show();
        }
    },

    onAcceptAddContactClick : function(button, e, eOpts) {
        console.log("onAcceptAddContactClick");
        var dialog = Ext.getCmp("ContactAdd");
        var form = dialog.down("form");
        var values = form.getValues();

        if (form.getForm().isValid()) {
            console.log("add, valid");
            console.log(values);
            var newContact = this.getModel("Contact").create(values);
            console.log(newContact);
            var storeId = dialog.down("#person_id").getValue();
            var store = Ext.data.StoreManager.lookup(storeId);
            console.log(store);
            var person = store.first();
            person.contacts().add(newContact);
            console.log(person);
            person.save({
                scope : this,
                callback : function(record, operation, success) {
                    console.log(record);
                    dialog.close();
                }
            });
            //newContact.setPerson(person);
//            newContact.save({
//                scope : this,
//                callback : function(record, operation, success) {
//                    console.log(record);
//                    dialog.close();
//                }
//            });
        }
    },
    
    onClearDialogClick : function(button, e, eOpts) {
        console.log("onClearDialogClick");
        button.up("window").down("form").getForm().reset();
    },
    
    
    onRefreshPersonClick : function(button, e, eOpts) {
        console.log("onRefreshPersonClick");
        var dialog = Ext.getCmp("PersonSearch");
        var form = dialog.down('form');
        var store = this.getStore("People");
        console.log(form.getValues());

        store.load({
            params : form.getValues(),
            callback : function(records, operation, success) {
                console.log("onRefreshPersonClick");
                console.log(records);
            },
            scope : this
        });
        dialog.close();
    }
});
