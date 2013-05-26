Ext.define('SimpleWeb.controller.People', {
	extend : 'Ext.app.Controller',

	views : ['person.List', 'person.Edit', 'person.Details', 'person.Search'],
	stores : ['People'],
	models : ['Person'],
	refs : [{
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
			}],

	init : function() {

                Ext.create("SimpleWeb.view.person.Search");

		this.control({
					'personlist' : {
						itemdblclick : this.personDetails,
						itemclick : this.enableDeleteEdit
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
					'personlist button[action=search]' : {
						click : this.showSearchForm
					},
					'personsearch button[action=search]' : {
						click : this.searchPerson
					}
				});
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

	showSearchForm : function() {
		//Ext.widget('personsearch');
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

	searchPerson : function(button) {
		var form = this.getPersonSearchForm();
		var values = form.getValues();
                console.log(values);
		var store = this.getStore("People");
/*
		store.filters.clear();

		var gender = Ext.getCmp("gender").getValue()
		if (gender == null) {
			gender = ""
		}
		var dateOfBirthFrom = Ext.getCmp("dateOfBirthFrom").getValue()
		if (dateOfBirthFrom == null) {
			dateOfBirthFrom = ""
		}
		var dateOfBirthTo = Ext.getCmp("dateOfBirthTo").getValue()
		if (dateOfBirthTo == null) {
			dateOfBirthTo = ""
		}

		store.filter([{
					property : "firstName",
					value : Ext.getCmp("firstName").getValue()
				}, {
					property : "lastName",
					value : Ext.getCmp("lastName").getValue()
				}, {
					property : "gender",
					value : gender
				}, {
					property : "ssn",
					value : Ext.getCmp("ssn").getValue()
				}, {
					property : "dateOfBirthFrom",
					value : dateOfBirthFrom
				}, {
					property : "dateOfBirthTo",
					value : dateOfBirthTo
				}]);
*/
		 store.load({ 
                          params : form.getValues(), 
                          //baseParams : form.getValues(), 
                          callback : function(records, operation, success) { console.log(records); }, 
                          scope : this 
                });
		this.getPersonSearchWindow().close();
		//this.doGridRefresh();
	},

	onSearchFailure : function(err) {
		Ext.MessageBox.alert('Status', 'Error occured during searching...');
	},

	doGridRefresh : function() {
		this.getPersonList().down('pagingtoolbar').doRefresh();
	}

});
