Ext.define('SimpleWeb.view.person.Search', {
	extend : 'Ext.window.Window',
	alias : 'widget.personsearch',

        id: 'PersonSearch',
	title : 'Search Person',
	layout : 'fit',
	//autoShow : true,
	resizable : false,
	modal: true,
        closeAction: 'hide',

	initComponent : function() {
            var me = this;
            Ext.applyIf(me, {
                items: [ {
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
				id : 'firstName',
				fieldLabel : 'First Name',
				allowBlank: true
			}, {
				xtype : 'textfield',
				name : 'lastName',
				id : 'lastName',
				fieldLabel : 'Last Name',
				allowBlank: true
			}, {
				xtype : 'combo',
				name : 'gender',
				id : 'gender',
				fieldLabel : 'Gender',
				allowBlank: true,
				store:['','MALE','FEMALE']
			}, {
				xtype : 'textfield',
				name : 'ssn',
				id : 'ssn',
				fieldLabel : 'SSN',
				allowBlank: true
			}, {
				xtype : 'datefield',
				type: 'date',
				format: 'd.m.Y',
				name : 'dateOfBirthFrom',
				id : 'dateOfBirthFrom',
				fieldLabel : 'Date of birth from',
				allowBlank: true
			}, {
				xtype : 'datefield',
				type: 'date',
				format: 'd.m.Y',
				name : 'dateOfBirthTo',
				id : 'dateOfBirthTo',
				fieldLabel : 'Date of birth to',
				allowBlank: true
			} ]
		} ],

		buttons: [ {
			text : 'Search',
			action : 'search'
		}, {
			text : 'Cancel',
			scope : this,
			handler : this.close
		} ]
            });

            me.callParent(arguments);
	}
});
