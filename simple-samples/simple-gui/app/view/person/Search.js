Ext.define('SimpleWeb.view.person.Search', {
	extend : 'Ext.window.Window',
	alias : 'widget.personsearch',

	title : 'Search Person',
	layout : 'fit',
	autoShow : true,
	resizable : false,
	modal: true,

	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			padding : '5 5 0 5',
			border : false,
			style : 'background-color: #fff;',
			defaults : {
				width: 400,
				msgTarget: 'side'
			},
			items : [ {
				xtype : 'textfield',
				name : 'firstName',
				fieldLabel : 'First Name',
				allowBlank: true
			}, {
				xtype : 'textfield',
				name : 'lastName',
				fieldLabel : 'Last Name',
				allowBlank: true
			}, {
				xtype : 'textfield',
				name : 'gender',
				fieldLabel : 'Gender',
				allowBlank: true
			}, {
				xtype : 'textfield',
				name : 'ssn',
				fieldLabel : 'SSN',
				allowBlank: true
			}, {
				xtype : 'datefield',
				type: 'date',
				format: 'd.m.Y',
				name : 'dateOfBirthFrom',
				fieldLabel : 'Date of birth from',
				allowBlank: true
			}, {
				xtype : 'datefield',
				type: 'date',
				format: 'd.m.Y',
				name : 'dateOfBirthTo',
				fieldLabel : 'Date of birth to',
				allowBlank: true
			} ]
		} ];

		this.buttons = [ {
			text : 'Search',
			action : 'search'
		}, {
			text : 'Cancel',
			scope : this,
			handler : this.close
		} ];

		this.callParent(arguments);
	}
});
