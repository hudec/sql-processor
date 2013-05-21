Ext.define('SimpleWeb.view.person.Details', {
	extend : 'Ext.window.Window',
	alias : 'widget.persondetails',

	title : 'Person details',
	layout : 'fit',
	autoShow : true,
	resizable : true,
	modal : true,

	initComponent : function() {
		this.items = [ {
			width : 500,
			xtype : 'panel',
			autoScroll : false,
			items : [ {
				xtype : 'form',
				padding : '5 5 0 5',
				border : false,
				style : 'background-color: #fff;',
				defaults : {
					width : 400,
					msgTarget : 'side'
				},
				items : [ {
					xtype : 'displayfield',
					name : 'firstName',
					fieldLabel : 'First Name',
					allowBlank : false
				}, {
					xtype : 'displayfield',
					name : 'lastName',
					fieldLabel : 'Last Name',
					allowBlank : false
				}, {
					xtype : 'displayfield',
					name : 'contacts.address',
					fieldLabel : 'Address',
					allowBlank : false
				} ]
			} /*
				 * , { xtype : 'gridpanel', itemId : 'contactGrid', store:
				 * Ext.data.StoreManager.lookup('Contacts'), columns : [ { text :
				 * 'Address', dataIndex : 'address', flex : 1 }, { text : 'a',
				 * dataIndex : 'a', flex : 1 } ] }
				 */]
		} ];

		this.buttons = [ {
			text : 'OK',
			scope : this,
			handler : this.close
		} ];

		this.callParent(arguments);
	}
});
