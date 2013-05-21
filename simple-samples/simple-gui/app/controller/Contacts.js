Ext.define('SimpleWeb.controller.People', {
	extend : 'Ext.app.Controller',

	views : ['person.Details'],
	stores : ['Contacts'],
	models : ['Contact'],
	refs : [{
				ref : 'personDetailsForm',
				selector : 'personedit form'
			}, {
				ref : 'personDetailsWindow',
				selector : 'personedit'
			}]
});
