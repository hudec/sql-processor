Ext.define('SimpleWeb.view.person.Details', {
			extend : 'Ext.window.Window',
			alias : 'widget.persondetails',

			title : 'Person details',
			layout : 'fit',
			autoShow : true,
			resizable : false,
			modal : true,

			initComponent : function() {
				this.items = [{
							xtype : 'form',
							padding : '5 5 0 5',
							border : false,
							style : 'background-color: #fff;',
							defaults : {
								width : 400,
								msgTarget : 'side'
							},
							items : [{
										xtype : 'textfield',
										name : 'firstName',
										fieldLabel : 'First Name',
										allowBlank : false
									}, {
										xtype : 'textfield',
										name : 'lastName',
										fieldLabel : 'Last Name',
										allowBlank : false
									}, {
										xtype : 'textfield',
										name : 'ssn',
										fieldLabel : 'SSN',
										allowBlank : true
									}, {
										xtype : 'date',
										dateFormat : 'd.m.Y',
										name : 'dateOfBirth',
										fieldLabel : 'Date of birth',
										allowBlank : true
									}]
						}];

				this.buttons = [{
							text : 'Cancel',
							scope : this,
							handler : this.close
						}];

				this.callParent(arguments);
			}
		});
