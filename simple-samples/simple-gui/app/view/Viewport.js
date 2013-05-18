Ext.define('SimpleWeb.view.Viewport', {
	extend : 'Ext.Viewport',
	id : 'viewport',

	layout : 'fit',

	initComponent : function() {
		this.items = [ {
			xtype : 'personlist'
		} ];

		this.callParent(arguments);
	}

});
