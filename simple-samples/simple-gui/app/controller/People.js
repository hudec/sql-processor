Ext.define('SimpleWeb.controller.People', {
    extend : 'Ext.app.Controller',

    views : [ 'person.Edit', 'person.Details', 'person.Search' ],
    stores : [ 'People', 'Contacts' ],
    models : [ 'Person' ],

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
        var view, panel = Ext.getCmp("PersonRegistry"), store, title, id = "person" + record.data.id;

        // Get tab
        view = panel.child("#" + id);
        if (!view) {
            view = Ext.create("SimpleWeb.view.person.Details");
            view.closable = true;
            view.itemId = id;
            panel.add(view);
        }

        // Set title
        title = record.data.firstName + " " + record.data.lastName;
        if (record.data.ssn)
            title += " | " + record.data.ssn;
        view.setTitle(title);

        // Set data
        SimpleWeb.controller.People.setData(record, view);

        // Reference...
        view.record = record;

        // Filter contacts
        store = view.down("#contact_list").getStore();
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
        var dialog = Ext.getCmp("PersonModify"), el = button;
        var form = dialog.down("form");
        console.log("kk");
        console.log(form);
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
        var record = form.getRecord();
        var values = form.getValues();

        if (form.getForm().isValid()) {
            console.log("modify");
            console.log(values);
            console.log(record);
            record.set(values);
            record.save();
            dialog.close();
            var panel = Ext.getCmp("PersonRegistry");
            var id = "person" + record.data.id;
            var view = panel.child("#" + id);
            SimpleWeb.controller.People.setData(record, view);
        }
    },

    createPerson : function() {
        Ext.widget('personedit');
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
            console.log(record);
            record.save();
            dialog.close();
            var panel = Ext.getCmp("PersonRegistry");
            var id = "person" + record.data.id;
            var view = panel.child("#" + id);
            SimpleWeb.controller.People.setData(record, view);
        }
    },

    deletePerson : function(button) {
        var record = this.getPersonList().getSelectionModel().getSelection()[0];

        if (record) {
            this.getPeopleStore().remove(record);
            this.doGridRefresh();
            this.toggleDeleteButton(false);
        }
    },

    enableDeleteEdit : function(button, record) {
        this.toggleDeleteButton(true);
        this.toggleEditButton(true);
    },

    toggleEditButton : function(enable) {
        var button = this.getPersonList().down('button[action=edit]');
        if (enable) {
            button.enable();
        } else {
            button.disable();
        }
    },

    toggleDeleteButton : function(enable) {
        var button = this.getPersonList().down('button[action=delete]');
        if (enable) {
            button.enable();
        } else {
            button.disable();
        }
    },

    doGridRefresh : function() {
        this.getPersonList().down('pagingtoolbar').doRefresh();
    },

    onSearchPersonClick : function() {
        // Ext.widget('personsearch');
        Ext.getCmp("PersonSearch").show();
    },

    onAcceptSearchClick : function(button) {
        // var form = this.getPersonSearchForm();
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
        // this.getPersonSearchWindow().close();
        dialog.close();
        // this.doGridRefresh();
    }
});
