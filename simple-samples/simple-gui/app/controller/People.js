Ext.define('SimpleWeb.controller.People', {
    extend : 'Ext.app.Controller',

    views : [ 'person.List', 'person.Edit', 'person.Details', 'person.Search' ],
    stores : [ 'People', 'Contacts' ],
    models : [ 'Person' ],

    refs : [ {
        ref : 'personList',
        selector : 'personlist'
    }, {
        ref : 'personEditForm',
        selector : 'personedit form'
    }, {
        ref : 'personEditWindow',
        selector : 'personedit'
    }, {
        ref : 'personSearchForm',
        selector : 'personsearch form'
    }, {
        ref : 'personSearchWindow',
        selector : 'personsearch'
    }, {
        ref : 'personDetailsForm',
        selector : 'personedit form'
    }, {
        ref : 'personDetailsWindow',
        selector : 'personedit'
    } ],

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

        this.control({
            "#cancel_dialog" : {
                click : this.onCancelDialogClick
            },
            "#person_list" : {
                itemdblclick : this.onPersonListDblClick
            },
            'personlist button[action=edit]' : {
                click : this.editPerson
            },
            'personedit button[action=save]' : {
                click : this.updatePerson
            },
            'personlist button[action=add]' : {
                click : this.createPerson
            },
            'personlist button[action=delete]' : {
                click : this.deletePerson
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
            console.log("aa");
            view = Ext.create("SimpleWeb.view.person.Details");
            console.log("xx");
            console.log(view);
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
        Simplereg.controller.Person.setData(record, view);

        // Reference...
        view.record = record;

        // Filter contacts
        store = view.down("#contact_list").getStore();
        store.clearFilter();
        store.filterBy(function(item) {
            return item.get("personId") == record.data.id;
        });

        // Finish
        panel.setActiveTab(view);
    },

    personDetails : function(grid, record) {
        var view = Ext.widget('persondetails');
        view.down('form').loadRecord(record);
    },

    editPerson : function(button) {
        var record = this.getPersonList().getSelectionModel().getSelection()[0];
        var view = Ext.widget('personedit');
        view.down('form').loadRecord(record);
    },

    createPerson : function() {
        Ext.widget('personedit');
    },

    onSearchPersonClick : function() {
        // Ext.widget('personsearch');
        Ext.getCmp("PersonSearch").show();
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

    updatePerson : function(button) {
        var form = this.getPersonEditForm();
        var record = form.getRecord();
        var values = form.getValues();

        if (form.getForm().isValid()) {
            if (record) {
                record.set(values);
                record.save();
            } else {
                var newPerson = this.getPersonModel().create(values);
                newPerson.save();
                // this.getUsersStore().add(newUser);
                this.doGridRefresh();
            }
            this.getPersonEditWindow().close();
        }
    },

    onAcceptSearchClick : function(button) {
        // var form = this.getPersonSearchForm();
        var dialog = Ext.getCmp("PersonSearch");
        var form = dialog.down('form');
        var store = this.getStore("People");

        store.load({
            params : form.getValues(),
            callback : function(records, operation, success) {
                console.log(records);
            },
            scope : this
        });
        // this.getPersonSearchWindow().close();
        dialog.close();
        // this.doGridRefresh();
    },

    onSearchFailure : function(err) {
        Ext.MessageBox.alert('Status', 'Error occured during searching...');
    },

    doGridRefresh : function() {
        this.getPersonList().down('pagingtoolbar').doRefresh();
    }

});
