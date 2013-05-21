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
		Ext.widget('personsearch');
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
		var values = form.getValues()
		console.log(values)

		if (form.getForm().isValid()) {
			Ext.Ajax.request({
						waitMsg : 'Searching...',
						method : 'POST',
						url : 'index.html',
						params : {
							searchData : form.getValues()
						},
						scope : this,
						success : this.onSearchSuccess,
						failure : this.onSearchFailure
					});
		}
		this.getPersonSearchWindow().close();

	},

	onSearchSuccess : function(response, page) {
		// console.log(response)
		var values = page.params.searchData
		console.log(page.params.searchData)
		// var a = simpleService.findPeople(values)
		console.log(this.getStore("People") + "cccccccccccccccc");
	
		var store = this.getStore("People")
		
		var searchingPeople = simpleService.findPeople(values, function(result,
						event) {
					console.log(Ext.encode(result) + "aaaa" + event)

					store.loadData(Ext.encode(result));
				});
		console.log(searchingPeople + "aaaaabbbbb")

		// var gData = Ext.JSON.decode(response.responseText);
		// var grid = Ext.widget('infolist'); //not working -need help
		// this.getInfoStore().load(gData);
		// Ext.getCmp().setActiveItem('infolist'); //not working-need help
		// this.getViewport().getLayout().setActiveItem('infolist'); //not
		// working need help
		// Ext.MessageBox.alert("XXXXX", response.responseText); // works
	},

	onSearchFailure : function(err) {
		Ext.MessageBox.alert('Status', 'Error occured during searching...');
	},

	doGridRefresh : function() {
		this.getPersonList().down('pagingtoolbar').doRefresh();
	}

});
