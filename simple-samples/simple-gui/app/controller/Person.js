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
            "#accept_modify" : {
                click : this.onAcceptModifyClick
            },
            "#add_person" : {
                click : this.onAddPersonClick
            },
            "#accept_add" : {
                click : this.onAcceptAddClick
            },
            "#delete_person" : {
                click : this.onDeletePersonClick
            },
            "#accept_delete" : {
                click : this.onAcceptDeleteClick
            },
            "#search_person" : {
                click : this.onSearchPersonClick
            },
            "#accept_search" : {
                click : this.onAcceptSearchClick
            },
        });
    },

    onCancelDialogClick : function(button, e, eOpts) {
        button.up("window").close();
    },

    onPersonListDblClick : function(dataview, record, item, index, e, eOpts) {
        var panel = Ext.getCmp("PersonRegistry");
        var store = this.getStore("Contacts");
        var id = "person" + record.data.id;

        // Get tab
        var view = panel.child("#" + id);
        if (!view) {
            view = Ext.create("SimpleWeb.view.person.Details");
            view.closable = true;
            view.itemId = id;
            panel.add(view);
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

        // Filter contacts
        store.load({
            params : {
                personId : record.data.id
            },
            callback : function(records, operation, success) {
                console.log("onPersonListDblClick");
                console.log(records);
            },
            scope : this
        });

        // Finish
        panel.setActiveTab(view);
    },

    onModifyPersonClick : function(button, e, eOpts) {
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

    onAcceptModifyClick : function(button, e, eOpts) {
        var dialog = Ext.getCmp("PersonModify");
        var form = dialog.down("form");
        var person = form.getRecord();
        var values = form.getValues();

        if (form.getForm().isValid()) {
            console.log("modify");
            console.log(values);
            person.set(values);
            person.save();
            console.log(person);
            var panel = Ext.getCmp("PersonRegistry");
            var id = "person" + record.data.id;
            var view = panel.child("#" + id);
            SimpleWeb.controller.Person.setData(record, view);
        }
    },

    onAddPersonClick : function(button, e, eOpts) {
        Ext.getCmp("PersonAdd").show();
    },

    onAcceptAddClick : function(button, e, eOpts) {
        var dialog = Ext.getCmp("PersonAdd");
        var form = dialog.down("form");
        var values = form.getValues();

        if (form.getForm().isValid()) {
            console.log("add");
            console.log(values);
            var newPerson = this.getModel("Person").create(values);
            newPerson.save();
            console.log(newPerson);
            this.doGridRefresh();
            dialog.close();
            this.onPersonListDblClick(null, newPerson, null, null, null, {});
        }
    },

    onDeletePersonClick : function(button, e, eOpts) {
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

    onAcceptDeleteClick : function(button, e, eOpts) {
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
        Ext.getCmp("PersonSearch").show();
    },

    onAcceptSearchClick : function(button) {
        var dialog = Ext.getCmp("PersonSearch");
        var form = dialog.down('form');
        var store = this.getStore("People");

        store.load({
            params : form.getValues(),
            callback : function(records, operation, success) {
                console.log("onAcceptSearchClick");
                console.log(records);
            },
            scope : this
        });
        dialog.close();
        // this.doGridRefresh();
    },

    doGridRefresh : function() {
        var panel = Ext.getCmp("PersonRegistry");
        var list = panel.down('pagingtoolbar');
        list.doRefresh();
    }
});
