Ext.define('SimpleWeb.view.person.List', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.personlist',
	store : 'People',
	
	title : 'Person list',

	columns : [{
		header : 'ID',
		dataIndex : 'id',
		width : 50,
		sortable : false
    }, {
		header : 'First Name',
		dataIndex : 'firstName',
		flex : 1
	}, {
		header : 'Last Name',
		dataIndex : 'lastName',
		flex : 1
	}, {
		header : 'SSN',
		dataIndex : 'ssn',
		flex : 1
	}, {
		header : 'Date of birth',
		dataIndex : 'dateOfBirth',
		renderer : Ext.util.Format.dateRenderer('d.m.Y'),
		flex : 1
	} ],

	dockedItems : [ {
		xtype : 'toolbar',
		dock : 'top',
		items : [ {
			text : 'New Person',
			disabled : false,
			action : 'add',
			iconCls : 'icon-add'
		}, {
			text : 'Delete Person',
			disabled : true,
			action : 'delete',
			iconCls : 'icon-delete'
		}, {
			text : 'Edit Person',
			disabled : true,
			action : 'edit'
		} ]
	}, {
		xtype : 'pagingtoolbar',
		dock : 'bottom',
		store : 'People',
		displayInfo : true,
		displayMsg : 'Displaying People {0} - {1} of {2}',
		emptyMsg : 'No People to display'
	} ]

});
